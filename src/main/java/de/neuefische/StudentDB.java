package de.neuefische;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

public class StudentDB {
    private HashMap<Integer, Student> students;

    public StudentDB(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public Student findById(int id) {
        if (!students.containsKey(id)) {
            System.out.println();
            throw new NoSuchElementException("No Element found with id");
        } else {
            return students.get(id);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Objects.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }


}