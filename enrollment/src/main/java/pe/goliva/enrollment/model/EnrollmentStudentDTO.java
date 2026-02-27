package pe.goliva.enrollment.model;

import java.util.List;

public class EnrollmentStudentDTO {
    private int enrollment_id;
    private String course_name;
    private List<StudentDTO> students;

    public EnrollmentStudentDTO() {
    }

    public EnrollmentStudentDTO(int enrollment_id, String course_name, List<StudentDTO> students) {
        this.enrollment_id = enrollment_id;
        this.course_name = course_name;
        this.students = students;
    }

    public int getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(int enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }
}
