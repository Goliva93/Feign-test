package pe.goliva.course.model;

public class Course {
    private int course_id;
    private String name;
    private String teacher;
    private int credits;

    public Course() {
    }

    public Course(int course_id, String name, String teacher, int credits) {
        this.course_id = course_id;
        this.name = name;
        this.teacher = teacher;
        this.credits = credits;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Course{");
        sb.append("course_id=").append(course_id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", teacher='").append(teacher).append('\'');
        sb.append(", credits=").append(credits);
        sb.append('}');
        return sb.toString();
    }
}
