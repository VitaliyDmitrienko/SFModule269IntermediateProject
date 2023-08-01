// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;

public class StudentAvgExamScoreComparator implements IStudentComparator {
    @Override
    public int compare(Student o1, Student o2) {

        return Float.compare(o1.getAvgExamScore(), o2.getAvgExamScore());
    }
}
