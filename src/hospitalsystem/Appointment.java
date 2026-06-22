package hospitalsystem;

public class Appointment {

    private String appointmentId;
    private Patient patient;
    private MedicalProfessional doctor;
    private String date;        // format: DD/MM/YYYY
    private String time;        // format: HH:MM
    private String reason;
    private String status;      // "Scheduled", "Completed", "Cancelled"

    public Appointment(String appointmentId, Patient patient,
                       MedicalProfessional doctor, String date,
                       String time, String reason) {
        this.appointmentId = appointmentId;
        this.patient       = patient;
        this.doctor        = doctor;
        this.date          = date;
        this.time          = time;
        this.reason        = reason;
        this.status        = "Scheduled";
    }

    // Getters
    public String getAppointmentId()          { return appointmentId; }
    public Patient getPatient()               { return patient; }
    public MedicalProfessional getDoctor()    { return doctor; }
    public String getDate()                   { return date; }
    public String getTime()                   { return time; }
    public String getReason()                 { return reason; }
    public String getStatus()                 { return status; }

    // Setters
    public void setStatus(String status)      { this.status = status; }
    public void setDate(String date)          { this.date = date; }
    public void setTime(String time)          { this.time = time; }

    // Display a clean summary of this appointment
    public void displayAppointment() {
        System.out.println("--------------------------------------------");
        System.out.println("  Appointment ID : " + appointmentId);
        System.out.println("  Patient        : " + patient.getName());
        System.out.println("  Doctor         : " + doctor.getName()
                                                  + " (" + doctor.getRole() + ")");
        System.out.println("  Date           : " + date);
        System.out.println("  Time           : " + time);
        System.out.println("  Reason         : " + reason);
        System.out.println("  Status         : " + status);
        System.out.println("--------------------------------------------");
    }
}
