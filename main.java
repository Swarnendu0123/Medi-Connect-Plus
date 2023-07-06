import java.util.*;

// patient class for maintaining patient info
class patient {
    static int patientId = 0;
    private String firstName;
    private String lastName;
    // private String password;
    private String password;
    private int id;// unique id to track each patient
    private int assignedDoctorId;
    private String appTime;

    public void setAppTime(String time) {
        this.appTime = time;
    }

    public String getAppTime() {
        return this.appTime;
    }

    public void SetName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = patientId;
        patientId++;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public boolean checkPass(String pass) {
        return this.password.equals(pass);
    }

    // function to assign doctor
    public void assigndDoctor(int id) {
        this.assignedDoctorId = id;
    }

    // function to get doctor id
    public int getDoctorId() {
        return this.assignedDoctorId;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getId() {
        return this.id;
    }
}

// doctor class to track each doctor
class doctor {
    private String firstName;
    private String lastName;
    private String password;
    private int id;// unique id for each doctor
    static int doctorId = 0;
    private ArrayList<patient> patientList = new ArrayList<>();
    private Queue<Integer> freeTimeSlot = new LinkedList<>();

    public doctor() {
        this.id = doctorId;
        doctorId++;
        freeTimeSlot.add(0);
        freeTimeSlot.add(1);
        freeTimeSlot.add(2);
        freeTimeSlot.add(3);
        freeTimeSlot.add(4);
        freeTimeSlot.add(5);
        freeTimeSlot.add(6);
        freeTimeSlot.add(7);
        freeTimeSlot.add(8);
        freeTimeSlot.add(9);
        freeTimeSlot.add(10);
        freeTimeSlot.add(11);
        freeTimeSlot.add(12);
        freeTimeSlot.add(13);
        freeTimeSlot.add(14);
        freeTimeSlot.add(15);
    }

    public Queue<Integer> getFreeSlots() {
        return this.freeTimeSlot;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public boolean checkPass(String pass) {
        return this.password.equals(pass);
    }

    // geter
    int getId() {
        return this.id;
    }

    // seter
    void addPatient(patient p) {
        patientList.add(p);
    }

    // function to get patient list size
    public int getPatientListSize() {
        return patientList.size();
    }

    // function to get doctor's name
    public String getName() {
        String name = firstName + " " + lastName;
        return name;
    }

    public ArrayList<patient> getPatientList() {
        return patientList;
    }
}

public class main {

    static ArrayList<patient> patientList = new ArrayList<>();
    static ArrayList<doctor> doctorList = new ArrayList<>();

    // instruction
    public static void instruction() {
        System.out.println("\n------ MediConnectPlus ------");
        System.out.println("Enter 1 to regester as patient");
        System.out.println("Enter 2 to regester as doctor");
        System.out.println("Enter 3 to log in as patient");
        System.out.println("Enter 4 to log in as doctor");
        System.out.println("Enter 5 to exit");
        System.out.println();
        System.out.println();
    }

    // doctor assigning function
    public static int assignDoctor() {
        // it will return the doctor's id who have minimum number of appointment
        int minAppDocId = 0;
        for (int i = 0; i < doctorList.size(); i++) {
            doctor curr = doctorList.get(i);
            if (curr.getPatientListSize() < doctorList.get(minAppDocId).getPatientListSize()) {
                minAppDocId = i;
            }
        }
        return minAppDocId;
    }

    // function to print info
    public static void printInfoofPatient(patient p) {
        System.out.println("\n------ Patient Profile ------");
        System.out.println("Name : " + p.getName());
        System.out.println("User Id : P" + p.getId());
        System.out.println("Assigned Doctor's Id : D" + p.getDoctorId());
        System.out.println("Assigned Doctor's Name : " + doctorList.get(p.getDoctorId()).getName());
        System.out.println("Appoinment Timing : " + p.getAppTime());
        System.out.println();
    }

    // function to print info of doctors
    public static void printInfoofDoctor(doctor d) {
        System.out.println("\n------ Doctor Profile ------");
        System.out.println("Name : " + d.getName());
        System.out.println("Doctor Id/User Id : D" + d.getId());
        System.out.println("Assigned Patient:");
        ArrayList<patient> patientList = d.getPatientList();
        int i = 1;
        if (patientList.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (patient patient : patientList) {
                System.out.println("Serial number: " + i + ", Patient Name: " + patient.getName() + ", Patient Id: P"
                        + patient.getId() + ", Appoinment Timing : " + patient.getAppTime());
                i++;
            }
        }
    }

    public static void main(String[] args) {
        // demo doctors
        doctor d1 = new doctor();
        doctor d2 = new doctor();
        doctor d3 = new doctor();
        d1.setName("Indranil", "Sen Gupta");
        d1.setPassword("superSecreat");
        d2.setName("Souvik", "Das");
        d2.setPassword("superSecreat");
        d3.setName("Srijan", "Sharma");
        d3.setPassword("superSecreat");
        doctorList.add(d1);
        doctorList.add(d2);
        doctorList.add(d3);

        HashMap<Integer, String> time = new HashMap<>();
        time.put(0, "8:00AM - 8:30AM");
        time.put(1, "8:30AM - 9:00AM");
        time.put(2, "9:00AM - 9:30AM");
        time.put(3, "9:30AM - 10:00AM");
        time.put(4, "10:00AM - 10:30AM");
        time.put(5, "10:30AM - 11:00AM");
        time.put(6, "11:00AM - 11:30AM");
        time.put(7, "11:30AM - 12:00AM");
        time.put(8, "12:00AM - 12:30AM");
        time.put(9, "12:30AM - 1:00AM");

        time.put(10, "2:00AM - 2:30AM");
        time.put(11, "2:30AM - 3:00AM");
        time.put(12, "3:00AM - 3:30AM");
        time.put(13, "3:30AM - 4:00AM");
        time.put(14, "4:00AM - 4:30AM");
        time.put(15, "4:30AM - 5:00AM");

        Scanner in = new Scanner(System.in);
        while (true) {
            instruction();
            System.out.println();
            System.out.print("Choie: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter First Name:");
                    String firstName = in.next();
                    System.out.print("Enter Last Name:");
                    String lastName = in.next();
                    System.out.print("Create password: ");
                    String pass = in.next();
                    patient p = new patient();
                    patientList.add(p);
                    p.SetName(firstName, lastName);
                    p.setPassword(pass);
                    int doctorId = assignDoctor();
                    p.assigndDoctor(doctorId);
                    doctor d = doctorList.get(doctorId);
                    d.addPatient(p);
                    Queue freeSlots = d.getFreeSlots();
                    p.setAppTime(time.get(freeSlots.remove()));
                    System.out.println();
                    System.out.println();
                    System.out.println("Regestered");
                    printInfoofPatient(p);
                    break;

                case 2:
                    System.out.print("Enter First Name : ");
                    firstName = in.next();
                    System.out.print("Enter Last Name : ");
                    lastName = in.next();
                    System.out.print("Create password: ");
                    pass = in.next();
                    d = new doctor();
                    doctorList.add(d);
                    d.setName(firstName, lastName);
                    d.setPassword(pass);
                    doctorId = d.getId();

                    System.out.println();
                    System.out.println();
                    System.out.println("Regestered as doctor");
                    System.out.println("Name: " + d.getName());
                    System.out.println("Your Id : D" + doctorId);
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter User Id : P");
                    int userid = in.nextInt();
                    if (userid > patientList.size() - 1) {
                        System.out.println();
                        System.out.println("Wrong user id");
                        System.out.println();
                        break;
                    }
                    System.out.print("Enter password: ");
                    pass = in.next();
                    if (patientList.get(userid).checkPass(pass)) {
                        p = patientList.get(userid);
                        printInfoofPatient(p);
                    } else {
                        System.out.println();
                        System.out.println("You have entered Wrong Password");
                    }
                    break;
                case 4:
                    System.out.print("Enter User Id : D");
                    userid = in.nextInt();
                    if (userid > doctorList.size() - 1) {
                        System.out.println();
                        System.out.println("Wrong user id");
                        System.out.println();
                        break;
                    }
                    System.out.print("Enter password: ");
                    pass = in.next();
                    if (doctorList.get(userid).checkPass(pass)) {
                        d = doctorList.get(userid);
                        printInfoofDoctor(d);
                    } else {
                        System.out.println();
                        System.out.println("You have entered Wrong Password");
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Exiting Programme...");
                    System.out.println();
                    return;
                default:
                    System.out.println("You have entered wrong input. enter a valid input.");
                    break;
            }
        }
    }
}