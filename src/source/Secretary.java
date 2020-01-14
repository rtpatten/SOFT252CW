package source;

public class Secretary extends User {

    public void approvePatientAccounts() {

    }

    public void viewAppointmentRequests() {

    }

    public void setupAppointment() {

    }

    public void giveMedicine() {

    }

    public void removePatient(Patient patient) {
        //removes a patient from the patients array via method popObject
        Data.popObject(Data.patients, patient);
    }

    public void approvePatientRemoval() {

    }
}
