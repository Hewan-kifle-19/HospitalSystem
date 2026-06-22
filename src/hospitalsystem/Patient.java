package hospitalsystem;

public class Patient extends Person {

    private String patientId;
    private String bloodType;
    private double temperature;   // in Celsius
    private double weight;        // in kg
    private String bloodPressure; // e.g. "120/80"
    private String medicalHistory;

    public Patient(String patientId, String name, int age,
                   String sex, String bloodType) {
        super(name, age, sex);
        this.patientId      = patientId;
        this.bloodType      = bloodType;
        this.temperature    = 36.6;   // healthy default
        this.weight         = 0.0;
        this.bloodPressure  = "Not recorded";
        this.medicalHistory = "None";
    }

    // Implementing abstract methods from Person
    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public void displayInfo() {
        System.out.println("============================================");
        System.out.println("  PATIENT RECORD");
        System.out.println("============================================");
        System.out.println("  Patient ID     : " + patientId);
        System.out.println("  Name           : " + getName());
        System.out.println("  Age            : " + getAge());
        System.out.println("  Sex            : " + getSex());
        System.out.println("  Blood Type     : " + bloodType);
        System.out.println("  Temperature    : " + temperature + " C");
        System.out.println("  Weight         : " + weight + " kg");
        System.out.println("  Blood Pressure : " + bloodPressure);
        System.out.println("  Medical History: " + medicalHistory);
        System.out.println("============================================");
    }

    // Overriding vision() from Person — unique to Patient
    @Override
    public void vision() {
        System.out.println("Patient " + getName()
            + " is awaiting medical examination.");
    }

    // Record vitals — method overloading (same name, different parameters)
    public void recordVitals(double temperature, double weight,
                             String bloodPressure) {
        this.temperature   = temperature;
        this.weight        = weight;
        this.bloodPressure = bloodPressure;
        System.out.println("Vitals recorded successfully for "
                           + getName() + ".");
    }

    public void recordVitals(double temperature, double weight) {
        this.temperature = temperature;
        this.weight      = weight;
        System.out.println("Temperature and weight recorded for "
                           + getName() + ". Blood pressure not provided.");
    }

    // Getters
    public String getPatientId()      { return patientId; }
    public String getBloodType()      { return bloodType; }
    public double getTemperature()    { return temperature; }
    public double getWeight()         { return weight; }
    public String getBloodPressure()  { return bloodPressure; }
    public String getMedicalHistory() { return medicalHistory; }

    // Setters
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}
