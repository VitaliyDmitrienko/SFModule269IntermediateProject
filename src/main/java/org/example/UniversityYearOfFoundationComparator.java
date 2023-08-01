// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;

public class UniversityYearOfFoundationComparator implements IUniversityComparator {
    @Override
    public static int compare(University o1, University o2) {
        return Integer.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}
