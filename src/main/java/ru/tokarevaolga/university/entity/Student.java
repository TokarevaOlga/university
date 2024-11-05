package ru.tokarevaolga.university.entity;

public class Student implements Examable, Study {

    private String studentName;
    private String studentSurname;
    private int studentAge;
    private Teacher teacher;

    public Student() {
    }

    public Student(String studentName, String studentSurname, int studentAge, Teacher teacher) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacherName(Teacher teacher) {
        this.teacher = teacher;
    }

    /*public void printStudentInfo() {
        System.out.println("Привет! Я студент " + studentName + " " + studentSurname + ". Мне " + studentAge +
                " лет. Мой преподаватель: " + teacher.teacherSurname);
    }
*/

    @Override
    public void visitExam() {
        //  answerQuestions();
        System.out.println("Я студент и я сдаю экзамен");
    }

    /*private void answerQuestions() {
        System.out.println("Я студент и я отвечаю на вопросы");
    }
*/

    @Override
    public void studyInTheUniversity() {
        System.out.println("Я студент " + getStudentName() + " " + getStudentSurname() + ". Мне " + getStudentAge() +
                " лет. Я должен посещать лекции и семинары, делать домашние задания, проходить " +
                "практику, писать курсовые работы. Мой преподаватель " + teacher.getTeacherSurname());
    }
}
