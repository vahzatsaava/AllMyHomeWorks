package com.company.OOP.dzOOP.staticFirstDZ;

import java.net.IDN;

class Books {
    public int ID;
    public static int booksCount;

    public Books() {
        this.ID = booksCount++;
    }

    public int getId() {
        return ID;
    }
}
