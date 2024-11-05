package ru.tokarevaolga.university.entity;

public class University {

    private String universityName;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}

// private String city;

   /* public University(String universityName, String city) {
        this.universityName = universityName;
        this.city = city;
    }

    public void printUniversityInfo() {
        System.out.println("Добро пожаловать в " + universityName + " в городе " + city);
    }
}
*/