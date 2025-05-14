package main;

import dao.SubjectDao;
import dao.SubjectDaoImpl;
import dao.TeacherDao;
import dao.TeacherDaoImpl;
import model.Teacher;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDaoImpl();
        SubjectDao subjectDao = new SubjectDaoImpl();

        TeacherService teacherService = new TeacherService(teacherDao, subjectDao);

        if (subjectDao.findAll().isEmpty()) {
            subjectDao.create(new model.Subject(0, "Math"));
        }

        if (teacherDao.findAll().isEmpty()) {
            teacherDao.create(new Teacher(0, "Givi", "Gio", 1, 1222.99));
        }

        String subjectName = teacherService.getSubjectByTeacherId(1);
        System.out.println("Subject: " + subjectName);


    }
}
