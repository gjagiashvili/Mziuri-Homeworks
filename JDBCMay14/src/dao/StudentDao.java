package dao;

import model.Student;
import java.util.List;

public interface StudentDao {
    Student create(Student student);
    Student findById(int id);
    List<Student> findAll();
    Student update(Student student);
    void deleteById(int id);
}
