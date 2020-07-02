package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampHeight;
    private double stampLength;
    private boolean hasAStamp;

    public Stamp (String stampName, double stampHeight, double stampLength, boolean hasAStamp) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampLength = stampLength;
        this.hasAStamp = hasAStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public double getStampLength() {
        return stampLength;
    }

    public boolean isHasAStamp() {
        return hasAStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampHeight, stampHeight) == 0 &&
                Double.compare(stamp.stampLength, stampLength) == 0 &&
                hasAStamp == stamp.hasAStamp &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeight, stampLength, hasAStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampLength=" + stampLength +
                ", hasAStamp=" + hasAStamp +
                '}';
    }
}