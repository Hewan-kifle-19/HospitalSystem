package hospitalsystem;

public class GeneralDoctor extends MedicalProfessional {

    private boolean acceptsWalkIns;

    public GeneralDoctor(String employeeId, String name, int age,
                         String sex, int yearsOfExperience,
                         boolean acceptsWalkIns) {
        super(employeeId, name, age, sex, "General Medicine",
              yearsOfExperience);
        this.acceptsWalkIns = acceptsWalkIns;
    }

    @Override
    public String getRole() {
        return "General Doctor";
    }

    // Polymorphism — broad general checkup diagnostic
    @Override
    public void runDiagnostic(Patient patient) {
        System.out.println("--------------------------------------------");
        System.out.println("  GENERAL DIAGNOSTIC");
        System.out.println("  Doctor  : Dr. " + getName());
        System.out.println("  Patient : " + patient.getName());
        System.out.println("--------------------------------------------");
        System.out.println("  Reviewing full patient vitals...");
        System.out.println("  Temperature    : "
                           + patient.getTemperature() + " C");
        System.out.println("  Blood Pressure : "
                           + patient.getBloodPressure());
        System.out.println("  Weight         : "
                           + patient.getWeight() + " kg");
        System.out.println("  Reviewing medical history : "
                           + patient.getMedicalHistory());
        System.out.println("  General health assessment complete.");
        System.out.println("  Diagnostic complete. Report filed.");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void vision() {
        System.out.println("Dr. " + getName()
            + " handles general medicine."
            + (acceptsWalkIns ? " Walk-in patients accepted." : ""));
    }

    public boolean isAcceptsWalkIns()            { return acceptsWalkIns; }
    public void setAcceptsWalkIns(boolean val)   { this.acceptsWalkIns = val; }
}
