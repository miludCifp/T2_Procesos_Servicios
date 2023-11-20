package Exercice_3;

import java.util.Objects;

public abstract class OnlineCourse {
    private String courseName;
    private String id;
    private int duration;
    private String teacher;

    public OnlineCourse() {
    }

    public OnlineCourse(String courseName, String id, int duration, String teacher) {
        this.courseName = courseName;
        this.id = id;
        this.duration = duration;
        this.teacher = teacher;
    }

    public OnlineCourse(OnlineCourse ocCopy){
        this.courseName = ocCopy.courseName;
        this.id = ocCopy.id;
        this.duration = ocCopy.duration;;
        this.teacher = ocCopy.teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName.length()>4){
            this.courseName = courseName;
        }
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher.trim().replace(" ",", ");
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "couseName ='" + courseName + '\'' +
                ", id='" + id + '\'' +
                ", duration=" + duration +
                ", teacher='" + teacher + '\'' +
                '}';
    }
    /*
    @Override
    public OnlineCourse clone() {
        return new OnlineCourse(this);
    }

     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineCourse that = (OnlineCourse) o;
        return duration == that.duration && Objects.equals(courseName, that.courseName) && Objects.equals(id, that.id) && Objects.equals(teacher, that.teacher);
    }

}
