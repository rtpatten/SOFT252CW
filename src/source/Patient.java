package source;

public class Patient extends User {

    private Appointment[] appointments;
    private Prescription[] prescriptions;


    public Patient() {
        setId(getNewID("Patient"));
    }
    
    public Patient(String option) {
        if (option == "request") {
        }
    }

    private void reviewDoctor(Doctor doc, String feedback, int rating) {
       //creates a review for a doctor
        Review review = new Review();
        review.setDoctor(doc);
        review.setFeedback(feedback);
        review.setPatient(this);
        review.setRating(rating);
    }

    public void viewDoctor(Doctor doc) {

    }

    public void requestAppointment(Doctor doc, String notes, String time) {
       //requests an appointment by creating an appointment and then adding it to an array of pending appointments all waiting to be approved
        Appointment appnt = new Appointment();
        appnt.setDoctor(doc);
        appnt.setNotes(notes);
        appnt.setTime(time);
        appnt.setPatient(this);
        PendingAppointments.addAppointment(appnt);
    }

    public void addPrescription(Prescription input) {
        int Length;
        if (prescriptions == null) {
            Length = 0;
        }
        else {
            Length = prescriptions.length;
        }

        //prescription array size in increased and the new prescription is added onto the end
        Prescription[] newArray = new Prescription[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = prescriptions[i];
        }
        newArray[Length] = input;
        prescriptions = newArray;
    }

    public void viewHistory() {

    }

    public String viewPrescription() {
        //returns the notes field of the prescription
        return prescriptions[0].getNotes();
    }

    public void requestTermination() {

    }

    public void viewPatient() {

    }
    
    public String getId() {
        return id;
    }
}
