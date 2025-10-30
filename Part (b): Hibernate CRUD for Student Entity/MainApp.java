package com.example.hibernate;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        Student s1 = new Student();
        s1.setName("John");
        s1.setEmail("john@example.com");
        dao.saveStudent(s1);

        // Read
        Student s = dao.getStudent(s1.getId());
        System.out.println("Fetched: " + s);

        // Update
        s.setEmail("john.doe@gmail.com");
        dao.updateStudent(s);

        // Delete
        dao.deleteStudent(s.getId());
    }
}
