package pe.goliva.enrollment.model;

public class StudentDTO {

    private int student_id;
    private String name;
    private String lastname;

    public StudentDTO() {
    }

    public StudentDTO(int student_id, String name, String lastname) {
        this.student_id = student_id;
        this.name = name;
        this.lastname = lastname;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentDTO{");
        sb.append("student_id=").append(student_id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
