// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;

import org.apache.commons.lang3.StringUtils;

public class UniversityFullNameComparator implements IUniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(),o2.getFullName());
    }
}