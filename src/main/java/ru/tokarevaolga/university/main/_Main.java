package ru.tokarevaolga.university.main;

import ru.tokarevaolga.university.entity.Student;
import ru.tokarevaolga.university.entity.Teacher;
import ru.tokarevaolga.university.entity.University;
import ru.tokarevaolga.university.util.ExamOrganizer;
import ru.tokarevaolga.university.util.StudyOrganizer;
import ru.tokarevaolga.university.util.TeachOrganizer;

public class _Main {
    public static void main(String[] args) {

        University university1 = new University("Университет программирования");
        Student student1 = new Student();
        student1.setStudentName("Иван");
        student1.setStudentSurname("Петров");
        student1.setStudentAge(25);

        Teacher teacher1 = new Teacher("Роман", "Андреев", 10, university1, student1);

        student1.setTeacherName(teacher1);

        StudyOrganizer studyOrganizer1 = new StudyOrganizer();
        TeachOrganizer teachOrganizer1 = new TeachOrganizer();
        ExamOrganizer examOrganizer1 = new ExamOrganizer();

        studyOrganizer1.studyActivities(student1);
        teachOrganizer1.teachActivities(teacher1);
        examOrganizer1.organizeExam(teacher1);
        examOrganizer1.organizeExam(student1);
    }
}

