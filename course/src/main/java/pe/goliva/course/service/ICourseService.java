package pe.goliva.course.service;

import pe.goliva.course.model.Course;

import java.util.List;

public interface ICourseService {

    Course createCourse(Course course);

    Course findById(int course_id);

    List<Course> findAll();



}
