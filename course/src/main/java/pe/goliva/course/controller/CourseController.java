package pe.goliva.course.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.goliva.course.model.Course;
import pe.goliva.course.service.ICourseService;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final ICourseService service;
    private static final Logger log = LoggerFactory.getLogger(CourseController.class);

    public CourseController(ICourseService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Course>> courseList(){
        log.info("findAll Courses");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{course_id}")
    public ResponseEntity<Course> findCourse(@PathVariable int course_id){
        log.info("Find Specific course");
        Course course = service.findById(course_id);

        if(course != null) {
            log.info(course.toString());
            return ResponseEntity.ok(course);
        }

        return ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        log.info("Create course -> {}", course.toString());
        return new ResponseEntity<>(service.createCourse(course),HttpStatus.CREATED);
    }

}
