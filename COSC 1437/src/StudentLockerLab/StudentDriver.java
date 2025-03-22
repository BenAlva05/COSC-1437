//************************************************************************
// Author: Benjamin Alva
// Date: 21 Mar 2025
// Language: Java
// Assignment: Module 4 Lab - Student Locker Lab
/* Description: A driver program that prints a list of students
*               with banner ID's and locker assignments*/
//************************************************************************

package StudentLockerLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class StudentDriver {

    public static void main(String[] args) {

        // Declare local vars
        ArrayList<Student> students;
        Iterator<Student> studentIterator;
        HashMap <String, String> lockerAssignments;
        Student student1;
        Student student2;
        Student student3;
        Student student4;
        Student student5;

        // Step 1: Create an ArrayList of Student objects
        students = new ArrayList<>();
        student1 = new Student("Kevin", "Roark", "901123456");
        student2 = new Student("Sarah", "Jones", "901456789");
        student3 = new Student("David", "Williams", "902123789");
        student4 = new Student("Emily", "Salinas", "902456123");
        student5 = new Student("Sam", "Read", "901456852");

        // Step 2: Display Program header
        Utility.printLine();
        Utility.printMessage("Alamo Student Listing");
        Utility.printLine();

        // Step 3: Add five students to the ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        // Step 4: Display the list of students
        System.out.print("List of Students:\n");

        // Create an iterator to traverse the ArrayList
        studentIterator = students.iterator();

        // Traverse the ArrayList and display each student
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        } // End while loop

        // Step 5: Display header for Locker List
        Utility.printLine();
        Utility.printMessage("Alamo Locker List");
        Utility.printLine();

        // Step 6: Populate a HashMap with locker assignments for each student
        System.out.print("Locker Assignments:\n");

        // Create a HashMap to store locker assignments
        lockerAssignments = new HashMap<>();

        // Populate the HashMap with locker assignments
        lockerAssignments.put("100", student1.getFirstName() + " " + student1.getLastName());
        lockerAssignments.put("101", student2.getFirstName() + " " + student2.getLastName());
        lockerAssignments.put("102", student3.getFirstName() + " " + student3.getLastName());
        lockerAssignments.put("103", student4.getFirstName() + " " + student4.getLastName());
        lockerAssignments.put("104", student5.getFirstName() + " " + student5.getLastName());

        // Step 7: Display the locker assignments
        for(String key : lockerAssignments.keySet()) {
            System.out.println("Locker Number: " + key + " - " + lockerAssignments.get(key));
        } // End for loop
    } // End of main method
} // End of StudentDriver class
