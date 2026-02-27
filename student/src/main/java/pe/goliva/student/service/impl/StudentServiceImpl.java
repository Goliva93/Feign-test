package pe.goliva.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.goliva.student.model.Student;
import pe.goliva.student.service.IStudentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements IStudentService {

    private List<Student> students;

    public StudentServiceImpl() {
        this.students = new ArrayList<>();
        Student stu1 = new Student(1,"Giomar","Oliva",959385263);
        Student stu2 = new Student(2,"Luis","Oliva",987654321);
        Student stu3 = new Student(3,"Nombre3","Apellido3",978456123);
        Student stu4 = new Student(4,"Nombre4","Apellido4",978456123);
        Student stu5 = new Student(5,"Nombre5","Apellido5",978456123);
        this.students.addAll(Arrays.asList(stu1, stu2, stu3, stu4, stu5));
    }

    @Override
    public Student createStudent(Student student) {
        this.students.add(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }

    @Override
    public Student findById(int student_id) {
        return this.students.stream().filter(u -> u.getStudent_id() == student_id).findFirst().orElse(null);
    }

    @Override
    public List<Student> findByIds(List<Integer> ids) {
        return this.students.stream().filter(u -> ids.contains(u.getStudent_id())).collect(Collectors.toList());
    }
}
