package Exercice_10;

import Exercice_3.OnlineCourse;

import java.util.Objects;

public class Student extends Person{
    private OnlineCourse studentCourse;

    public Student(){}

    public Student(Student s){
        super(s);
        this.studentCourse = s.studentCourse;
    }

    public Student(String name, String surname, String email, OnlineCourse studentCourse) {
        super(name, surname, email);
        this.studentCourse = studentCourse;
    }

    public OnlineCourse getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(OnlineCourse studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCourse=" + studentCourse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(studentCourse, student.studentCourse);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(this);
    }
}
