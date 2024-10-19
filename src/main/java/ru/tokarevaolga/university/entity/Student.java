package ru.tokarevaolga.university.entity;

public class Student implements Examable, Study {

    String studentName;
    String studentSurname;
    int studentAge;
    Teacher teacherOfStudent;

    public Student(String studentName, String studentSurname, int studentAge, Teacher teacherOfStudent) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
        this.teacherOfStudent = teacherOfStudent;
    }

    public void printStudentInfo() {
        System.out.println("Привет! Я студент " + studentName + " " + studentSurname + ". Мне " + studentAge +
                " лет. Мой преподаватель: " + teacherOfStudent.teacherSurname);
    }

    @Override
    public void visitExam() {
        answerQuestions();
        System.out.println("Я студент и я сдаю экзамен");
    }

    private void answerQuestions() {
        System.out.println("Я студент и я отвечаю на вопросы");
    }

    @Override
    public void studyInTheUniversity() {
        System.out.println("Я студент, я должен посещать лекции и семинары, делать домашние задания, проходить " +
                "практику, писать курсовые работы.");
    }
}
