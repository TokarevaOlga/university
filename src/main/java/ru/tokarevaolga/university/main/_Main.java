package ru.tokarevaolga.university.main;

import ru.tokarevaolga.university.entity.Student;
import ru.tokarevaolga.university.entity.Teacher;
import ru.tokarevaolga.university.entity.University;
import ru.tokarevaolga.university.util.ExamOrganizer;
import ru.tokarevaolga.university.util.StudyOrganizer;
import ru.tokarevaolga.university.util.TeachOrganizer;

public class _Main {
    public static void main(String[] args) {

        University university1 = new University("Университет программирования", "Москва");
        university1.printUniversityInfo();//вызывать печать не у класса, а у экземпляра
        Teacher teacher1 = new Teacher("Роман", "Андреев", 10, university1);
        teacher1.printTeacherInfo();//вызывать печать не у класса, а у экземпляра
        Student student1 = new Student("Иван", "Петров", 25, teacher1);
        student1.printStudentInfo();//вызывать печать не у класса, а у экземпляра
        StudyOrganizer studyOrganizer1 = new StudyOrganizer();
        studyOrganizer1.studyActivities(student1);
        TeachOrganizer teachOrganizer1 = new TeachOrganizer();
        teachOrganizer1.teachActivities(teacher1);
        System.out.println("Экзамен - важная часть обучения.");
        ExamOrganizer examOrganizer1 = new ExamOrganizer();
        examOrganizer1.organizeExam(student1);
        examOrganizer1.organizeExam(teacher1);
    }
}
