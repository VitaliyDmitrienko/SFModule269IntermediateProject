// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;

public class StudentCurrentCourseNumberComparator implements IStudentComparator {
    @Override
    public static int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
