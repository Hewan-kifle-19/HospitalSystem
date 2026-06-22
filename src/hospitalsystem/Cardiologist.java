package hospitalsystem;

public class Cardiologist extends MedicalProfessional {

    private int maxPatientsPerDay;

    public Cardiologist(String employeeId, String name, int age,
                        String sex, int yearsOfExperience,
                        int maxPatientsPerDay) {
        super(employeeId, name, age, sex, "Cardiology", yearsOfExperience);
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    @Override
    public String getRole() {
        return "Cardiologist";
    }

    // Polymorphism — unique diagnostic for heart specialist
    @Override
    public void runDiagnostic(Patient patient) {
        System.out.println("--------------------------------------------");
        System.out.println("  CARDIOLOGY DIAGNOSTIC");
        System.out.println("  Doctor  : Dr. " + getName());
        System.out.println("  Patient : " + patient.getName());
        System.out.println("--------------------------------------------");
        System.out.println("  Checking heart rate...");
        System.out.println("  Reviewing blood pressure : "
                           + patient.getBloodPressure());
        System.out.println("  Running ECG analysis...");
        System.out.println("  Evaluating cardiovascular risk factors...");
        System.out.println("  Diagnostic complete. Report filed.");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void vision() {
        System.out.println("Dr. " + getName()
            + " specializes in heart and cardiovascular conditions."
            + " Sees up to " + maxPatientsPerDay + " patients/day.");
    }

    public int getMaxPatientsPerDay()  { return maxPatientsPerDay; }
    public void setMaxPatientsPerDay(int max) { this.maxPatientsPerDay = max; }
}
