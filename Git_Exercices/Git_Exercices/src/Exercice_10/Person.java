package Exercice_10;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String email;

    public Person() {
    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Person(Person p){
        this.name = p.name;
        this.surname = p.surname;
        this.email = p.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=3){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.replace(" ","").toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@") && email.endsWith(".es") || email.endsWith(".com")){
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(this);
    }
}
