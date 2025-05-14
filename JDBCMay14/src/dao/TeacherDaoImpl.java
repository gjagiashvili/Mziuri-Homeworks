package dao;

import database.DatabaseConnectionManager;
import model.Teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
    private final DatabaseConnectionManager dcm;

    private static final String INSERT_TEACHER = "INSERT INTO teachers (first_name, last_name, subject, salary) VALUES (?, ?, ?, ?)";
    private static final String FIND_BY_ID = "SELECT * FROM teachers WHERE id = ?";
    private static final String FIND_ALL = "SELECT * FROM teachers";
    private static final String UPDATE_TEACHER = "UPDATE teachers SET first_name = ?, last_name = ?, subject = ?, salary = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM teachers WHERE id = ?";

    public TeacherDaoImpl() {
        final String URL = "jdbc:postgresql://localhost:4000/schools";
        final String USER = "postgres";
        final String PASSWORD = "ponnie";

        this.dcm = new DatabaseConnectionManager(URL, USER, PASSWORD);
    }

    @Override
    public Teacher create(Teacher teacher) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_TEACHER)) {
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getLastName());
            ps.setInt(3, teacher.getSubjectId());
            ps.setDouble(4, teacher.getSalary());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return teacher;
    }

    @Override
    public Teacher findById(int id) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject"),
                        rs.getDouble("salary")
                );
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> teachers = new ArrayList<>();
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(FIND_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                teachers.add(new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject"),
                        rs.getDouble("salary")
                ));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return teachers;
    }

    @Override
    public Teacher update(Teacher teacher) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(UPDATE_TEACHER)) {
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getLastName());
            ps.setInt(3, teacher.getSubjectId());
            ps.setDouble(4, teacher.getSalary());
            ps.setInt(5, teacher.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return teacher;
    }

    @Override
    public void deleteById(int id) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(DELETE_BY_ID)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
