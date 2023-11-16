package Exercice_3;

import java.util.ArrayList;
import java.util.Objects;

public class AdminCourse extends OnlineCourse{
    private ArrayList<String> documents;
    private int durationAdCourse;

    public AdminCourse(String courseName, String id, int duration, String teacher, ArrayList<String> documents, int durationAdCourse) {
        super(courseName, id, duration, teacher);
        this.documents = documents;
        if(durationAdCourse <= duration) {
            this.durationAdCourse = durationAdCourse;
        }
    }

    public AdminCourse(AdminCourse acCopy){
        this.documents = acCopy.documents;
        this.durationAdCourse = acCopy.durationAdCourse;
    }

    @Override
    public String toString() {
        return "AdminCourse{" +
                "documents=" + documents +
                ", durationAdCourse=" + durationAdCourse +
                ", " +super.toString() +
                '}';
    }

    @Override
    public AdminCourse clone() {
        return new AdminCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdminCourse that = (AdminCourse) o;
        return durationAdCourse == that.durationAdCourse && Objects.equals(documents, that.documents);
    }



    private void addDocument(String documentName){
        documents.add(documentName);
    }
    public ArrayList<String> getDocument(){
        return documents;
    }

}
