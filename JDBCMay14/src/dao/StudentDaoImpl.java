package dao;

import database.DatabaseConnectionManager;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private final DatabaseConnectionManager dcm;

    public StudentDaoImpl() {
        final String URL = "jdbc:postgresql://localhost:4000/schools";
        final String USER = "postgres";
        final String PASSWORD = "ponnie";

        this.dcm = new DatabaseConnectionManager(URL, USER, PASSWORD);
    }

    @Override
    public Student create(Student student) {
        String sql = "INSERT INTO students (first_name, last_name, grade) VALUES (?, ?, ?)";
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getGrade());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return student;
    }

    @Override
    public Student findById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getInt("id"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getInt("grade"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection con = dcm.getConnection(); Statement st = con.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getInt("grade")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return students;
    }

    @Override
    public Student update(Student student) {
        String sql = "UPDATE students SET first_name = ?, last_name = ?, grade = ? WHERE id = ?";
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getGrade());
            ps.setInt(4, student.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return student;
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
