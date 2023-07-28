// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;

public class UniversityYearOfFoundationComparator implements IUniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        return o1.getYearOfFoundation() - o2.getYearOfFoundation();
    }
}