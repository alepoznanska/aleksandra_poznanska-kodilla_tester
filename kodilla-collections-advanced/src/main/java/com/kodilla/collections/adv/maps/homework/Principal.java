package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String fullName;
    private String schoolName;

    public Principal(String fullName, String schoolName) {
        this.fullName = fullName;
        this.schoolName = schoolName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(fullName, principal.fullName) &&
                Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, schoolName);

    }
}