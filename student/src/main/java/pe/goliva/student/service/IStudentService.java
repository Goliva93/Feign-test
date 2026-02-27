package pe.goliva.student.service;

import pe.goliva.student.model.Student;

import java.util.List;

public interface IStudentService {

    Student createStudent(Student student);

    List<Student> findAll();

    Student findById(int student_id);

    List<Student> findByIds(List<Integer> ids);
}
