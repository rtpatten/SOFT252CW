package com.company;

public final class Data {

    private static Data instance;
    public static Patient[] patients;

    private Data() {

    }
    private static int[] nextID;

    public static void initialise() {
        Patient[] patients = new Patient[10];
        nextID = new int[4];
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Patient();
            //ID id = new ID();
            patients[i].setId(patients[i].getNewId("Patient"));
        }
        Doctor doc = new Doctor();
    }

    public static void increment(int num) {
        nextID[num]++;
    }

    public static int getNextID(int num) {
        return nextID[num];
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
            }
        return instance;
        }
}
