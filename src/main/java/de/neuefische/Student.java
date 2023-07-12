package de.neuefische;

import java.util.Objects;

public class Student {
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Student(){
    }

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student studentDB = (Student) o;
        return id == studentDB.id && Objects.equals(name, studentDB.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

}
