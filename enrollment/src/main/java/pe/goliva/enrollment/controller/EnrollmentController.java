package pe.goliva.enrollment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.goliva.enrollment.feign.ICourseFeignService;
import pe.goliva.enrollment.feign.IStudentFeignService;
import pe.goliva.enrollment.model.*;
import pe.goliva.enrollment.service.IEnrollmentService;

import java.util.List;
//
@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final IEnrollmentService enrollmentService;
    private final IStudentFeignService studentFeign;
    private final ICourseFeignService courseFeign;
    private static final Logger log = LoggerFactory.getLogger(EnrollmentController.class);

    EnrollmentController(IEnrollmentService enrollmentService, IStudentFeignService studentFeign, ICourseFeignService courseFeign){
        this.enrollmentService = enrollmentService;
        this.studentFeign = studentFeign;
        this.courseFeign = courseFeign;
    }


    @GetMapping
    public ResponseEntity<List<Enrollment>> listOfEnrollments(){
        log.info("find Enrollments");
        return ResponseEntity.ok(enrollmentService.findAll());
    }

    @GetMapping("/{enrollment_id}")
    public ResponseEntity<Enrollment> findEnrollment(@PathVariable int enrollment_id){
        log.info("Find Enroll");
        Enrollment enroll = enrollmentService.findById(enrollment_id);
        if(enroll != null) {
            log.info("Existing enrollment");
            return ResponseEntity.ok(enroll);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/full/{enrollment_id}")
    public ResponseEntity<EnrollmentResponseDTO> findEnrollmentWithStudent(@PathVariable int enrollment_id){
        log.info("Find Enrollment with Students and Courses");
        List<StudentDTO> students = null;
        CourseDTO course = null;

        Enrollment enro = enrollmentService.findById(enrollment_id);
        if (enro != null) {
            log.info("enrollment existing find courses and students");
            log.info(enro.toString());
            try {
                students = studentFeign.findStudentsByIds(enro.getStudents_id());
            } catch(feign.FeignException e){
                log.error("Error al comunicarse con el servicio: student-service : {}", e.status());
            }
            try{
                course = courseFeign.findCourse(enro.getCourse_id());
            } catch(feign.FeignException e){
                log.error("Error al comunicarse con el servicio: course-service : {}", e.status());
            }

            if (students != null && course != null){
                log.info("students and couse existing, generating response");
                EnrollmentResponseDTO res = new EnrollmentResponseDTO(enro.getEnrollment_id(), students,course);
                return ResponseEntity.ok(res);
            } else {
                log.warn("errrrrr -> ");
                return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
            }
        }
        //EnrollmentStudentDTO esDTO = new EnrollmentStudentDTO(enro.getEnrollment_id(),enro.getCourse_name(),students);
        log.info("unexists enrollment_id");
        return ResponseEntity.notFound().build();
    }

}
