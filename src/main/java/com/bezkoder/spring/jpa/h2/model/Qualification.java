package com.bezkoder.spring.jpa.h2.model;

public enum Qualification {
    MTECH("M.Tech"),
    BE("B.E"),
    MSC("MSC"),
    MCA("MCA"),
    BSC("BSC"),
    MBA("MBA"),
    BCOM("B.COM"),
    MCOM("M.COM");

    private String value;


    Qualification(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }
}
