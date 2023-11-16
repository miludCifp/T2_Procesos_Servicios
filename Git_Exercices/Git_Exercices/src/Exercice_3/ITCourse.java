package Exercice_3;

import java.util.Objects;

public class ITCourse extends OnlineCourse{
    private Especializacion especializacion;

    public ITCourse(String courseName, String id, int duration, String teacher, Especializacion especializacion) {
        super(courseName, id, duration, teacher);
        this.especializacion = especializacion;
    }

    public ITCourse(ITCourse itCouseCopy){
        super(itCouseCopy);
    }

    @Override
    public String toString() {
        return "ITCourse{" +
                "especializacion=" + especializacion +", "+
                super.toString() +
                '}';
    }

    @Override
    public ITCourse clone() {
        return new ITCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ITCourse itCourse = (ITCourse) o;
        return especializacion == itCourse.especializacion;
    }

}
