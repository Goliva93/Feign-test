package pe.goliva.enrollment.model;

import java.util.List;

public class Enrollment {
    private int enrollment_id;
    private List<Integer> students_id;
    private int course_id;

    public Enrollment() {
    }

    public Enrollment(int enrollment_id, List<Integer> students_id, int course_id) {
        this.enrollment_id = enrollment_id;
        this.students_id = students_id;
        this.course_id = course_id;
    }

    public int getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(int enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public List<Integer> getStudents_id() {
        return students_id;
    }

    public void setStudents_id(List<Integer> students_id) {
        this.students_id = students_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Enrollment{");
        sb.append("enrollment_id=").append(enrollment_id);
        sb.append(", students_id=").append(students_id);
        sb.append(", course_id=").append(course_id);
        sb.append('}');
        return sb.toString();
    }
}
