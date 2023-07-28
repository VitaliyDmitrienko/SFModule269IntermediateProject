// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;

public class StudentCurrentCourseNumberComparator implements IStudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCurrentCourseNumber() - o2.getCurrentCourseNumber();
    }
}
