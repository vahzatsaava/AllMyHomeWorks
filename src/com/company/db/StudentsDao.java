package com.company.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsDao {

    public List<Student> getAllStudent() throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:8091/scheduler", "scheduler", "scheduler");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
        List<Student> studentList = new ArrayList<>();
        while (resultSet.next()) {
            studentList.add(new Student(resultSet.getString("name"), resultSet.getInt("id")));
        }
        statement.close();
        connection.close();

        return studentList;
    }


    public Student getStudentById(int id) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:8091/scheduler", "scheduler", "scheduler");
        Statement statement = connection.createStatement();
        String sql = String.format("SELECT * FROM students WHERE id = %d", id);
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        Student student = new Student(resultSet.getString("name"),resultSet.getInt("id"));
        connection.close();
        statement.close();
        return student;
    }


    public void addStudent (String name,int id) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:8091/scheduler", "scheduler", "scheduler");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO students  VALUES (?,?)");
        statement.setInt(1,id);
        statement.setString(2,name);
        statement.executeUpdate();
        connection.close();
        statement.close();
    }


}
