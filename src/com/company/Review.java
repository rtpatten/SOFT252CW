package com.company;

public class Review {
    protected Object patient;
    protected Object doctor;
    protected int rating;
    protected String feedback;

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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
