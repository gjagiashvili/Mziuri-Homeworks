package dao;

import database.DatabaseConnectionManager;
import model.Subject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl implements SubjectDao {
    private final DatabaseConnectionManager dcm;

    private static final String INSERT_SUBJECT = "INSERT INTO subjects (subject_name) VALUES (?)";
    private static final String FIND_BY_ID = "SELECT * FROM subjects WHERE id = ?";
    private static final String FIND_ALL = "SELECT * FROM subjects";
    private static final String UPDATE_SUBJECT = "UPDATE subjects SET subject_name = ? WHERE id = ?";
    private static final String DELETE_BY_ID = "DELETE FROM subjects WHERE id = ?";

    public SubjectDaoImpl() {
        final String URL = "jdbc:postgresql://localhost:4000/schools";
        final String USER = "postgres";
        final String PASSWORD = "ponnie";

        this.dcm = new DatabaseConnectionManager(URL, USER, PASSWORD);
    }

    @Override
    public Subject create(Subject subject) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_SUBJECT)) {
            ps.setString(1, subject.getSubjectName());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return subject;
    }

    @Override
    public Subject findById(int id) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(FIND_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Subject(rs.getInt("id"), rs.getString("subject_name"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Subject> findAll() {
        List<Subject> subjects = new ArrayList<>();
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(FIND_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                subjects.add(new Subject(rs.getInt("id"), rs.getString("subject_name")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return subjects;
    }

    @Override
    public Subject update(Subject subject) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(UPDATE_SUBJECT)) {
            ps.setString(1, subject.getSubjectName());
            ps.setInt(2, subject.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return subject;
    }

    @Override
    public void deleteById(int id) {
        try (Connection con = dcm.getConnection(); PreparedStatement ps = con.prepareStatement(DELETE_BY_ID)) {
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
