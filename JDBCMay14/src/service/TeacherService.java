package service;

import dao.SubjectDao;
import dao.TeacherDao;
import model.Subject;
import model.Teacher;

public class TeacherService {
    private final TeacherDao teacherDao;
    private final SubjectDao subjectDao;

    public TeacherService(TeacherDao teacherDao, SubjectDao subjectDao) {
        this.teacherDao = teacherDao;
        this.subjectDao = subjectDao;
    }

    public String getSubjectByTeacherId(int teacherId) {
        Teacher teacher = teacherDao.findById(teacherId);
        if (teacher == null) return "Teacher not found";

        Subject subject = subjectDao.findById(teacher.getSubjectId());
        return subject != null ? subject.getSubjectName() : "Subject not found";
    }
}
