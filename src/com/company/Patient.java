package com.company;

public class Patient extends User{
    protected String sex;
    protected int age;

    private Appointment[] appointments;
    private Appointment[] pendingAppointments;

    private void viewDoctor() {

    }

    private void requestAppointment(Doctor doc, String notes, String time) {
        Appointment app = new Appointment();
        app.setDoctor(doc);
        app.setNotes(notes);
        app.setTime(time);
        app.setPatient(this);

    }

    private void viewHistory() {

    }

    private void viewPrescription() {

    }

    private void requestTermination() {

    }

    public void viewPatient() {

    }

    private void reviewDoctor() {

    }

    private void addAppointment (Appointment item) {
        if (pendingAppointments == null) {
            pendingAppointments = new Appointment[1];
            pendingAppointments[0] = item;
        }

        int numOfAppointments = pendingAppointments.length;
        Appointment[] updatedArray = new Appointment[numOfAppointments + 1];
        for (int i = 0; i < numOfAppointments; i++) {
            updatedArray[i] = pendingAppointments[i];
        }

        updatedArray[numOfAppointments] = item;
        pendingAppointments = updatedArray;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
