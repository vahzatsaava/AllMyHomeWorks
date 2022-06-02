package com.company.db;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        StudentsDao studentsDao = new StudentsDao();
        try {
            studentsDao.addStudent("')",3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            studentsDao.getAllStudent();
            System.out.println(studentsDao.getAllStudent());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            studentsDao.getStudentById(2);
            System.out.println(studentsDao.getStudentById(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
