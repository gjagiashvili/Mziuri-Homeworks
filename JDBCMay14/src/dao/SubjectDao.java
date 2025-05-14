package dao;

import model.Subject;
import java.util.List;

public interface SubjectDao {
    Subject create(Subject subject);
    Subject findById(int id);
    List<Subject> findAll();
    Subject update(Subject subject);
    void deleteById(int id);
}
