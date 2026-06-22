package hospitalsystem;

public class Nurse extends Person {

    private String employeeId;
    private String assignedWard;
    private int yearsOfExperience;
    private boolean isHeadNurse;

    public Nurse(String employeeId, String name, int age, String sex,
                 String assignedWard, int yearsOfExperience,
                 boolean isHeadNurse) {
        super(name, age, sex);
        this.employeeId       = employeeId;
        this.assignedWard     = assignedWard;
        this.yearsOfExperience = yearsOfExperience;
        this.isHeadNurse      = isHeadNurse;
    }

    // Implementing abstract methods from Person
    @Override
    public String getRole() {
        return isHeadNurse ? "Head Nurse" : "Nurse";
    }

    @Override
    public void displayInfo() {
        System.out.println("============================================");
        System.out.println("  NURSE RECORD");
        System.out.println("============================================");
        System.out.println("  Employee ID    : " + employeeId);
        System.out.println("  Name           : " + getName());
        System.out.println("  Role           : " + getRole());
        System.out.println("  Assigned Ward  : " + assignedWard);
        System.out.println("  Experience     : " + yearsOfExperience
                           + " years");
        System.out.println("  Age            : " + getAge());
        System.out.println("  Sex            : " + getSex());
        System.out.println("============================================");
    }

    // Overriding vision() from Person — unique to Nurse
    @Override
    public void vision() {
        System.out.println(getRole() + " " + getName()
            + " is managing the " + assignedWard + " ward.");
    }

    // Take and record a patient's vitals
    public void takeVitals(Patient patient, double temperature,
                           double weight, String bloodPressure) {
        System.out.println("--------------------------------------------");
        System.out.println("  " + getRole() + " " + getName()
                           + " recording vitals for "
                           + patient.getName() + "...");
        patient.recordVitals(temperature, weight, bloodPressure);
        System.out.println("--------------------------------------------");
    }

    // Overloaded — take vitals without blood pressure
    public void takeVitals(Patient patient, double temperature,
                           double weight) {
        System.out.println("--------------------------------------------");
        System.out.println("  " + getRole() + " " + getName()
                           + " recording vitals for "
                           + patient.getName() + "...");
        patient.recordVitals(temperature, weight);
        System.out.println("--------------------------------------------");
    }

    // Prepare patient for doctor appointment
    public void preparePatient(Patient patient) {
        System.out.println(getRole() + " " + getName()
            + " has prepared patient " + patient.getName()
            + " for their appointment.");
    }

    // Getters
    public String getEmployeeId()      { return employeeId; }
    public String getAssignedWard()    { return assignedWard; }
    public int getYearsOfExperience()  { return yearsOfExperience; }
    public boolean isHeadNurse()       { return isHeadNurse; }

    // Setters
    public void setAssignedWard(String ward)    { this.assignedWard = ward; }
    public void setHeadNurse(boolean headNurse) { this.isHeadNurse = headNurse; }
}
