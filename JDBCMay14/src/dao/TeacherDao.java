package dao;

import model.Teacher;
import java.util.List;

public interface TeacherDao {
    Teacher create(Teacher teacher);
    Teacher findById(int id);
    List<Teacher> findAll();
    Teacher update(Teacher teacher);
    void deleteById(int id);
}
