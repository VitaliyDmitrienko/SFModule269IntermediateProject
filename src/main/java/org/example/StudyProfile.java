// Module 25.9 intermediate project (XLSX-file reader)
package org.example;

public enum StudyProfile {
    ADMINISTRATION("Администрирование"),
    CARDIOLOGY("Кардиология"),
    FINANCIAL("Финансы"),
    GASTROENTEROLOGY("Гастроэнтерология"),
    JURISPRUDENCE("Юриспруденция"),
    LINGUISTICS("Лингвистика"),
    MANAGEMENT("Делопроизводство"),
    MATHEMATICS("Математика"),
    MEDICINE("Медицина"),
    PHLEBOLOGY("Флебология"),
    PHYSICS("Физика"),
    PSYCHOLOGY("Психология"),
    SURGERY("Хирургия"),
    THERAPY("Терапия");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
