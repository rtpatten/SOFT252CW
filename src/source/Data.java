package source;

public final class Data {

    private static Data instance;

    public static Patient[] patients;
    
    public static Doctor[] doctors;
    public static Admin[] admins;
    public static Secretary[] secretaries;
    public static String activeID;

    private static int[] nextID;
    
    public static User[] requests;

    private Data() {

    }

    public static void setup() {
        //instantiate some objects so they can be populated with some initial values
        nextID = new int[4];
        patients = new Patient[5];
        doctors = new Doctor[5];
        admins = new Admin[5];
        secretaries = new Secretary[5];
        
        //set inital ids for patients and doctors
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Patient();
            doctors[i] = new Doctor();
            System.out.println(doctors[i].getId());
        }
        Doctor doc = new Doctor();
        
        //sets some inital values for logging in and makes an appointment request
        patients[2].requestAppointment(doc, "apoointment notes", "4 0 clock");
        patients[1].setPassword("abc");
        doctors[3].setPassword("def");
        
    }

    public static void setActiveID(String id) {
        activeID = id;
    }
    
    public static void requestAccount(User user) {
        createUser(requests, user);
    }
    
    public static int findByID(String ID) {
        char firstLetter = ID.charAt(0);
        int pos = -1;
        String val;
        
        //compares id entered into the user id field with all of the ids of the patient, doctor or secretary based on the first letter
        //and returns the position in the array of those objects that matched the id entered.
        
        
        if (firstLetter == 'P') {
            
            for (int i = 0; i < patients.length; i++) {
                val = patients[i].getId();
                if (val.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'D') {
            for (int i = 0; i < doctors.length; i++) {
                val = doctors[i].getId();
                if (val.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'S') {
            for (int i = 0; i < secretaries.length; i++) {
                val = secretaries[i].getId();
                if (val.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'A') {
            for (int i = 0; i < admins.length; i++) {
                val = admins[i].getId();
                if (val.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        
        return pos;
    }
    
    public static String checkLogin() {
        String type = "";
        
        return type;
    }
    
    public static void increment(int num) {
        nextID[num]++;
    }

    public static int getNextID(int num) {
        return nextID[num];
    }

    public static int[] getNextIDArray() {
        return nextID;
    }

    public static User[] popObject(User[] array, User item) {
        //
        if (array == null) {
            return array;
        }

        // removes an object from the array by finding the item in the array and then decreasing the array length for that
        //portion of the array and saves the position
        User[] newArray = new User[array.length - 1];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                position = i;
            }
        }

        //the rest of the objects are added onto the end of the original array.
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == position) {
                continue;
            }

            newArray[k++] = array[i];
        }

        return newArray;
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
    public static User[] createUser(User[] array, User user) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        User[] newArray = new User[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = user;
        return newArray;


    }

    public static Prescription[] pushObject(Prescription[] array, Prescription prescription) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Prescription[] newArray = new Prescription[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = prescription;
        return newArray;


    }

    public static void setInstance(Data instance) {
        Data.instance = instance;
    }

    public static Patient[] getPatients() {
        return patients;
    }

    public static int[] getNextID() {
        return nextID;
    }

}
