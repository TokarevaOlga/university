package ru.tokarevaolga.university.util;

import ru.tokarevaolga.university.entity.Examable;

public class ExamOrganizer {
    public void organizeExam(Examable examable) {
        examable.visitExam();
    }
}
