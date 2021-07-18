package com.company;
import java.util .Scanner ;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            System.out.println("enter student name ");
            String name = s.nextLine();
            System.out.println("enter student id ");
            String id = s.nextLine();
            System.out.println("enter student collage ");
            String collage = s.nextLine();
            Student t = new Student();
            t.name = name;
            t.collage = collage;
            t.id = id;
            students[i] = t;

        }
        for (Student a : students) {
            System.out.println("name: " + a.name +"\ncollege : "+a.collage + "\nid"+a.id);
        }
    }
    }