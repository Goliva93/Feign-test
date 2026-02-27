package pe.goliva.enrollment.model;

import java.util.List;

public class EnrollmentResponseDTO {
    private int enrollment_id;
    private List<StudentDTO> student;
    private CourseDTO course;

    public EnrollmentResponseDTO() {
    }

    public EnrollmentResponseDTO(int enrollment_id, List<StudentDTO> student, CourseDTO course) {
        this.enrollment_id = enrollment_id;
        this.student = student;
        this.course = course;
    }

    public int getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(int enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public List<StudentDTO> getStudent() {
        return student;
    }

    public void setStudent(List<StudentDTO> student) {
        this.student = student;
    }

    public CourseDTO getCourse() {
        return course;
    }

    public void setCourse(CourseDTO course) {
        this.course = course;
    }


}
