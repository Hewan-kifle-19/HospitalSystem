package hospitalsystem;

public class Neurologist extends MedicalProfessional {

    private boolean performsSurgery;

    public Neurologist(String employeeId, String name, int age,
                       String sex, int yearsOfExperience,
                       boolean performsSurgery) {
        super(employeeId, name, age, sex, "Neurology", yearsOfExperience);
        this.performsSurgery = performsSurgery;
    }

    @Override
    public String getRole() {
        return "Neurologist";
    }

    // Polymorphism — unique diagnostic for brain/nerve specialist
    @Override
    public void runDiagnostic(Patient patient) {
        System.out.println("--------------------------------------------");
        System.out.println("  NEUROLOGY DIAGNOSTIC");
        System.out.println("  Doctor  : Dr. " + getName());
        System.out.println("  Patient : " + patient.getName());
        System.out.println("--------------------------------------------");
        System.out.println("  Checking neurological reflexes...");
        System.out.println("  Evaluating cognitive response...");
        System.out.println("  Reviewing patient temperature : "
                           + patient.getTemperature() + " C");
        System.out.println("  Assessing brain activity patterns...");
        if (performsSurgery) {
            System.out.println("  Surgical consultation available"
                               + " if required.");
        }
        System.out.println("  Diagnostic complete. Report filed.");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void vision() {
        System.out.println("Dr. " + getName()
            + " specializes in brain and nervous system conditions."
            + (performsSurgery ? " Surgical cases accepted." : ""));
    }

    public boolean isPerformsSurgery()          { return performsSurgery; }
    public void setPerformsSurgery(boolean val) { this.performsSurgery = val; }
}
