package pe.goliva.student.model;

public class Student {
    private int student_id;
    private String name;
    private String lastname;
    private int phone;

    public Student() {
    }

    public Student(int student_id, String name, String lastname, int phone) {
        this.student_id = student_id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("student_id=").append(student_id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }
}
