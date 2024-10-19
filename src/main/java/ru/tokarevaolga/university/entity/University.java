package ru.tokarevaolga.university.entity;

public class University {

    String universityName;
    String city;

    public University(String universityName, String city) {
        this.universityName = universityName;
        this.city = city;
    }

    public void printUniversityInfo() {
        System.out.println("Добро пожаловать в " + universityName + " в городе " + city);
    }
}
