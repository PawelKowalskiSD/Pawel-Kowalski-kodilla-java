package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessException extends Exception {

    public static String ERR_NOT_FOUND_COMPANY = "Not found company";
    public static String ERR_NOT_FOUND_EMPLOYEE = "Not found Employee";

    public SearchProcessException(String message) {
        super(message);
    }
}
