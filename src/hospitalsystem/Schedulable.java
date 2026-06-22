package hospitalsystem;

public interface Schedulable {

    // Contract — any class that implements this MUST provide these methods
    boolean bookAppointment(Appointment appointment);
    boolean cancelAppointment(String appointmentId);
    void viewSchedule();
}
