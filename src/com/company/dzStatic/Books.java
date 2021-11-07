package com.company.dzStatic;

public class Books {
    public int ID;
    public static int booksCount;

    public Books() {
        this.ID = booksCount++;
    }

    public int getId() {
        return ID;
    }
}
