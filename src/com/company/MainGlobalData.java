package com.company;

public final class MainGlobalData {

    private static MainGlobalData instance;
    public static Patient[] patients;

    private MainGlobalData() {

    }
    private static int[] newID;

    public static void initialise() {
        Patient[] patients = new Patient[10];
        newID = new int[4];
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Patient();
            //ID id = new ID();
            patients[i].setId(patients[i].getNewId("Patient"));
        }
        Doctor doc = new Doctor();
    }

    public static void increment(int num) {
        newID[num]++;
    }

    public static int getNewID(int num) {
        return newID[num];
    }

    public static MainGlobalData getInstance() {
        if (instance == null) {
            instance = new MainGlobalData();
            }
        return instance;
        }
}
