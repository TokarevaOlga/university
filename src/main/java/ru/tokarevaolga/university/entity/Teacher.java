package ru.tokarevaolga.university.entity;

public class Teacher implements Examable, Teach {

    private String teacherName;
    private String teacherSurname;
    private int teacherExperience;
    private University job;
    private Student student;

    public Teacher() {
    }

    public Teacher(String teacherName, String teacherSurname, int teacherExperience, University job, Student student) {
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherExperience = teacherExperience;
        this.job = job;
        this.student = student;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public int getTeacherExperience() {
        return teacherExperience;
    }

    public void setTeacherExperience(int teacherExperience) {
        this.teacherExperience = teacherExperience;
    }

    public University getJob() {
        return job;
    }

    public void setJob(University job) {
        this.job = job;
    }

    public Student getStudentSurname() {
        return student;
    }

    public void setStudent(Student studentSurname) {
        this.student = studentSurname;
    }


   /* public void printTeacherInfo() {
        System.out.println("Привет! Я преподаватель " + teacherName + " " + teacherSurname + ". Мой стаж работы :" +
                teacherExperience + ". Моё место работы: " + job.universityName + ". У меня учится студент " + student.studentSurname);
    }
*/

    @Override
    public void visitExam() {
        // askQuestions();
        System.out.println("Я преподаватель и я принимаю экзамен");
    }

   /* private void askQuestions() {
        System.out.println("Я преподаватель и я задаю вопросы");
    }
    */

    @Override
    public void workAtTheUniversity() {
        System.out.println("Я преподаватель " + getTeacherName() + " " + getTeacherSurname() + ". Мой стаж работы: "
                + getTeacherExperience() + " лет. Моё место работы " + job.getUniversityName() + ". Я должен проводить " +
                "лекции и семинары, задавать домашние задания, проверять курсовые работы. " +
                "У меня учится студент " + student.getStudentSurname());
    }
}
