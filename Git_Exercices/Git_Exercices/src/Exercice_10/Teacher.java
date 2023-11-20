package Exercice_10;

import Exercice_3.OnlineCourse;

import java.util.ArrayList;
import java.util.Objects;

public class Teacher extends Person{
    private OnlineCourse teacherCourse;
    private ArrayList<Student> students;

    public Teacher() {
    }

    public Teacher(Teacher t){
        super(t);
        this.teacherCourse = t.teacherCourse;
        this.students = t.students;
    }

    public Teacher(String name, String surname, String email, OnlineCourse teacherCourse, ArrayList<Student> students) {
        super(name, surname, email);
        this.teacherCourse = teacherCourse;
        this.students = students;
    }

    public OnlineCourse getTeacherCourse() {
        return teacherCourse;
    }

    public void setTeacherCourse(OnlineCourse teacherCourse) {
        this.teacherCourse = teacherCourse;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherCourse=" + teacherCourse +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacherCourse, teacher.teacherCourse) && Objects.equals(students, teacher.students);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Teacher(this);
    }
}
