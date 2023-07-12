package de.neuefische;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Objekte der Klasse Student erstellt
        Student newStudent1 = new Student("René", 1);
        Student newStudent2 = new Student("Sunny", 2);
        Student newStudent3 = new Student("Harald", 3);

        // Student-Array erstellt, in dem 3 Students-Objekte enthalten sind
        HashMap<Integer,Student> StudentArray1 = new HashMap<Integer, Student>();
        StudentArray1.put(1, newStudent1);
        StudentArray1.put(2, newStudent2);
        StudentArray1.put(3, newStudent3);


        //StudentDB-Objekt erzeugt, in dem der Student-Array enthalten ist
        StudentDB newStudentDB1 = new StudentDB(StudentArray1);

        //Aufgabe 3: Studenten als Array zurückgeben
//        System.out.println(newStudentDB1.toString());
//        // Aufgabe 4: Alle Studenten als String zurückgeben
//        System.out.println(StudentArray1.toString());



        System.out.println(newStudentDB1.findById(1));
        System.out.println(newStudentDB1.findById(2));
        System.out.println(newStudentDB1.findById(3));
        System.out.println(newStudentDB1.findById(4));



    }
}