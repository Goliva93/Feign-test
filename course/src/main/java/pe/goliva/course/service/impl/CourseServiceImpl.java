package pe.goliva.course.service.impl;

import org.springframework.stereotype.Service;
import pe.goliva.course.model.Course;
import pe.goliva.course.service.ICourseService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    private List<Course> courses;

    public CourseServiceImpl(){
        courses = new ArrayList<>();
        Course course1 = new Course(1,"Microservices","Joaquin Cervantes", 5);
        Course course2 = new Course(2,"Android","Profesor2", 5);
        Course course3 = new Course(3,"Secutiry Information","Profesor3", 5);
        Course course4 = new Course(4,"Project Management","Profesor4", 10);
        this.courses.addAll(Arrays.asList(course1,course2,course3,course4));
    }

    @Override
    public Course createCourse(Course course) {
        this.courses.add(course);
        return course;
    }

    @Override
    public Course findById(int course_id) {
        return this.courses.stream().filter(u -> u.getCourse_id() == course_id).findFirst().orElse(null);
    }

    @Override
    public List<Course> findAll() {
        return this.courses;
    }
}
