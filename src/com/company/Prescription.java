package com.company;

public class Prescription {
    Object patient;
    Object doctor;
    String Notes;

    protected Object medicine;
    protected int quantity;
    protected String Dosage;

    public Object getPatient() {
        return patient;
    }

    public void setPatient(Object patient) {
        this.patient = patient;
    }

    public Object getDoctor() {
        return doctor;
    }

    public void setDoctor(Object doctor) {
        this.doctor = doctor;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public Object getMedicine() {
        return medicine;
    }

    public void setMedicine(Object medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }
}
