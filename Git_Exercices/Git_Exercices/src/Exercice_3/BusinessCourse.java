package Exercice_3;

import java.util.Objects;

public class BusinessCourse extends OnlineCourse{
    private int durationBCourse;
    private int internshipDuration;

    public BusinessCourse(int durationBCourse, int internshipDuration) {
        this.durationBCourse = durationBCourse;
        this.internshipDuration = internshipDuration;
    }

    public BusinessCourse(String courseName, String id, int duration, String teacher, int durationBCourse, int internshipDuration) {
        super(courseName, id, duration, teacher);
        if(durationBCourse <= duration){
            this.durationBCourse = durationBCourse;
        }
        if(internshipDuration <= duration){
            this.internshipDuration = internshipDuration;
        }
    }

    public BusinessCourse(BusinessCourse bcCopy){
        super(bcCopy);
        this.durationBCourse = bcCopy.durationBCourse;;
        this.internshipDuration = bcCopy.internshipDuration;
    }

    @Override
    public String toString() {
        return "BusinessCourse{" +
                "durationBCourse=" + durationBCourse +
                ", internshipDuration=" + internshipDuration + ", "
                + super.toString() +
                '}';
    }

    @Override
    public BusinessCourse clone() {
        return new BusinessCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessCourse that = (BusinessCourse) o;
        return durationBCourse == that.durationBCourse && internshipDuration == that.internshipDuration;
    }

}
