package pe.goliva.student.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.goliva.student.model.Student;
import pe.goliva.student.service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {


    private final IStudentService service;
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    StudentController(IStudentService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
       log.info("findAll Students");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{student_id}")
    public ResponseEntity<Student> findStudent(@PathVariable int student_id){
        log.info("Find Specific Student");
        Student student = service.findById(student_id);
        if(student != null) {
            log.info("Student -> {}", student.toString());
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<Student>> listStudentWithId(@RequestParam List<Integer> ids){
        log.info("find Students with Ids");
        List<Student> students = service.findByIds(ids);

        if(!students.isEmpty()) {
            log.info("existing students");
            log.info(students.toString());
            return ResponseEntity.ok(students);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        log.info("Create Student -> {}", student.toString());
        return new ResponseEntity<>(service.createStudent(student), HttpStatus.CREATED);
    }




}
