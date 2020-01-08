package com.company;

public final class PendingAppointments {
    private static Appointment[] pendingAppointments;

    private PendingAppointments() {

    }

    public static void addAppointment(Appointment item) {
        int numOfAppointments;
        if (pendingAppointments == null) {
            numOfAppointments = 0;
        }
        else {
            numOfAppointments = pendingAppointments.length;
        }

        Appointment[] newArray = new Appointment[numOfAppointments + 1];
        for (int i = 0; i < numOfAppointments; i++) {
            newArray[i] = pendingAppointments[i];
        }
        newArray[numOfAppointments] = item;
        pendingAppointments = newArray;

    }
}
