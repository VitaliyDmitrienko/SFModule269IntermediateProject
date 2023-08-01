// Module 26.9 intermediate project (Student/University method's comparator)
package org.example;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static org.apache.commons.lang3.stream.Streams.stream;

public class Main {

    public static void main(String[] args) throws IOException {

//        Class XLSXFileReader() has private constructor & forbidden to create instance
//        System.out.println(new XLSXFileReader());

//        Class UnitedComparator() has private constructor & forbidden to create instance
//        System.out.println(new UnitedComparator());

        List<Student> studentDataStorage = new ArrayList<>(XLSXFileReader.getStudentData());
        List<University> universityDataStorage = new ArrayList<>(XLSXFileReader.getUniversityData());

        IStudentComparator studentComparator =
                UnitedComparator.getStudentComparator(EStudentMethodComparator.STUDENT_AVG_EXAM_SCORE_COMPARATOR);
//        List<IStudentComparator> studentComparatorList =
//                new ArrayList((Collection) UnitedComparator.getStudentComparator(EStudentMethodComparator.STUDENT_CURRENT_COURSE_COMPARATOR));
        List<IUniversityComparator> universityComparatorList = new ArrayList();

        studentDataStorage.stream().sorted(studentComparator).forEach(System.out::println);
//        studentDataStorage.stream().sorted((Comparator<? super Student>) studentComparator).forEach(System.out::println);

        IUniversityComparator universityComparator =
                UnitedComparator.getUniversityComparator(EUniversityMethodComparator.UNIVERSITY_YEAR_OF_FOUNDATION_COMPARATOR);

        universityDataStorage.stream().sorted(universityComparator).forEach(System.out::println);


    }
}