package org.example;

public final class UnitedComparator {
    private UnitedComparator() {
        System.out.println("Private constructor.");
        System.out.println("Forbidden to create this class instance.");
    }

    public static IStudentComparator getStudentComparator(EStudentMethodComparator currentStudentMethod) {
        IStudentComparator studentComparator;


        switch (currentStudentMethod) {
            case STUDENT_FULL_NAME_COMPARATOR:
                studentComparator = StudentFullNameComparator::compare;
                break;
            case STUDENT_UNIVERSITY_ID_COMPARATOR:
                studentComparator = StudentUniversityIdComparator::compare;
                break;
            case STUDENT_CURRENT_COURSE_COMPARATOR:
                studentComparator = StudentCurrentCourseNumberComparator::compare;
                break;
            case STUDENT_AVG_EXAM_SCORE_COMPARATOR:
                studentComparator = StudentAvgExamScoreComparator::compare;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currentStudentMethod);
        }

        return studentComparator;
        

    }

    public static IUniversityComparator getUniversityComparator(EUniversityMethodComparator currentUniversityMethod) {
        IUniversityComparator universityComparator;

        switch (currentUniversityMethod) {
            case UNIVERSITY_FULL_NAME_COMPARATOR:
                universityComparator = UniversityFullNameComparator::compare;
                break;
           case UNIVERSITY_SHORT_NAME_COMPARATOR:
                universityComparator = UniversityShortNameComparator::compare;
                break;
           case UNIVERSITY_ID_COMPARATOR:
                universityComparator = UniversityIdComparator::compare;
                break;
            case UNIVERSITY_YEAR_OF_FOUNDATION_COMPARATOR:
                universityComparator = UniversityYearOfFoundationComparator::compare;
                break;
            case UNIVERSITY_MAIN_PROFILE_COMPARATOR:
                universityComparator = UniversityMainProfileComparator::compare;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currentUniversityMethod);
        }

        return universityComparator;
    }
}
