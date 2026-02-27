package pe.goliva.enrollment.model;

public class CourseDTO {
    private int course_id;
    private String name;
    private String teacher;

    public CourseDTO() {
    }

    public CourseDTO(int course_id, String name, String teacher) {
        this.course_id = course_id;
        this.name = name;
        this.teacher = teacher;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
