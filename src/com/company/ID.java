package com.company;

public class ID {
    int nextID;

    public int getNextID() {
        return nextID;
    }

    public void setNextID(int nextID) {
        this.nextID = nextID;
    }

    public ID() {
        nextID = 0;
    }

    private int findNum(String type) {
        int num = 0;

        if (type == "Patient") {
            num = 0;
        }
        if (type == "Doctor") {
            num = 1;
        }
        if (type == "Secretary") {
            num = 2;
        }
        if (type == "Admin") {
            num = 3;
        }
        return num;
    }

    public String getNewId(String type) {
        int num = findNum(type);
        num = MainGlobalData.getNewID(num);
        String val = String.valueOf(num);

        String id = type.charAt(0) + val;
        MainGlobalData.increment(num = findNum(type));
        return id;
    }

}
