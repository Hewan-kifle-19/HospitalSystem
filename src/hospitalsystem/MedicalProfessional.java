package hospitalsystem;

import java.util.ArrayList;

public abstract class MedicalProfessional extends Person {

    private String employeeId;
    private String specialization;
    private int yearsOfExperience;
    private ArrayList<Patient> assignedPatients;

    public MedicalProfessional(String employeeId, String name, int age,
                                String sex, String specialization,
                                int yearsOfExperience) {
        super(name, age, sex);
        this.employeeId        = employeeId;
        this.specialization    = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.assignedPatients  = new ArrayList<>();
    }

    // Abstract method — each specialist runs diagnostics differently
    public abstract void runDiagnostic(Patient patient);

    // Implementing abstract methods from Person
    @Override
    public void displayInfo() {
        System.out.println("============================================");
        System.out.println("  MEDICAL PROFESSIONAL RECORD");
        System.out.println("============================================");
        System.out.println("  Employee ID    : " + employeeId);
        System.out.println("  Name           : " + getName());
        System.out.println("  Role           : " + getRole());
        System.out.println("  Specialization : " + specialization);
        System.out.println("  Experience     : " + yearsOfExperience + " years");
        System.out.println("  Age            : " + getAge());
        System.out.println("  Sex            : " + getSex());
        System.out.println("  Patients       : " + assignedPatients.size());
        System.out.println("============================================");
    }

    // Overriding vision() from Person — unique to medical staff
    @Override
    public void vision() {
        System.out.println("Dr. " + getName() + " (" + getRole()
            + ") is on duty with " + yearsOfExperience
            + " years of experience.");
    }

    // Assign and remove patients
    public void assignPatient(Patient patient) {
        assignedPatients.add(patient);
        System.out.println("Patient " + patient.getName()
            + " assigned to " + getName() + ".");
    }

    public void removePatient(Patient patient) {
        if (assignedPatients.remove(patient)) {
            System.out.println("Patient " + patient.getName()
                + " removed from " + getName() + "'s list.");
        } else {
            System.out.println("Patient not found in list.");
        }
    }

    public void listAssignedPatients() {
        if (assignedPatients.isEmpty()) {
            System.out.println("No patients currently assigned to "
                               + getName() + ".");
            return;
        }
        System.out.println("Patients assigned to Dr. " + getName() + ":");
        for (Patient p : assignedPatients) {
            System.out.println("  - " + p.getName()
                               + " (ID: " + p.getPatientId() + ")");
        }
    }

    // Getters
    public String getEmployeeId()       { return employeeId; }
    public String getSpecialization()   { return specialization; }
    public int getYearsOfExperience()   { return yearsOfExperience; }
    public ArrayList<Patient> getAssignedPatients() { return assignedPatients; }

    // Setter
    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }
}
