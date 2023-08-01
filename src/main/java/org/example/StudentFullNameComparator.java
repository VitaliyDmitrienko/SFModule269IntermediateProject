// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;

import org.apache.commons.lang3.StringUtils;

public class StudentFullNameComparator implements IStudentComparator {
    @Override
    public static int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getFullName(),o2.getFullName());
    }
}
