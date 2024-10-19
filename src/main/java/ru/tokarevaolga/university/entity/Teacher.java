package ru.tokarevaolga.university.entity;

public class Teacher implements Examable, Teach {

    String teacherName;
    String teacherSurname;
    int teacherExperience;
    University job;

    public Teacher(String teacherName, String teacherSurname, int teacherExperience, University job) {
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherExperience = teacherExperience;
        this.job = job;
    }

    public void printTeacherInfo() {
        System.out.println("Привет! Я преподаватель " + teacherName + " " + teacherSurname + ". Мой стаж работы :" +
                teacherExperience + ". Моё место работы: " + job.universityName);
    }

    @Override
    public void visitExam() {
        askQuestions();
        System.out.println("Я преподаватель и я принимаю экзамен");
    }

    private void askQuestions() {
        System.out.println("Я преподаватель и я задаю вопросы");
    }

    @Override
    public void workAtTheUniversity() {
        System.out.println("Я преподаватель. я должен проводить лекции и семинары, задавать и " +
                "проверять домашние задания, оценивать курсовые работы.");
    }
}
