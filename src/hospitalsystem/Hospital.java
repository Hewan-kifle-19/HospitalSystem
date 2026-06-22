package hospitalsystem;

import java.util.ArrayList;

public class Hospital implements Schedulable {

    private String hospitalName;
    private ArrayList<MedicalProfessional> doctors;
    private ArrayList<Nurse> nurses;
    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;
    private int appointmentCounter;

    public Hospital(String hospitalName) {
        this.hospitalName       = hospitalName;
        this.doctors            = new ArrayList<>();
        this.nurses             = new ArrayList<>();
        this.patients           = new ArrayList<>();
        this.appointments       = new ArrayList<>();
        this.appointmentCounter = 1;
    }

    // =========================================================
    // SCHEDULABLE INTERFACE IMPLEMENTATION
    // =========================================================

    @Override
    public boolean bookAppointment(Appointment appointment) {
        for (Appointment a : appointments) {
            if (a.getDoctor().getEmployeeId()
                    .equals(appointment.getDoctor().getEmployeeId())
                && a.getDate().equals(appointment.getDate())
                && a.getTime().equals(appointment.getTime())
                && !a.getStatus().equals("Cancelled")) {
                System.out.println("  ERROR: Dr. "
                    + appointment.getDoctor().getName()
                    + " already has an appointment at "
                    + appointment.getTime() + " on "
                    + appointment.getDate() + ".");
                return false;
            }
        }
        appointments.add(appointment);
        System.out.println("  Appointment booked successfully! ID: "
                           + appointment.getAppointmentId());
        return true;
    }

    @Override
    public boolean cancelAppointment(String appointmentId) {
        for (Appointment a : appointments) {
            if (a.getAppointmentId().equals(appointmentId)) {
                if (a.getStatus().equals("Cancelled")) {
                    System.out.println("  Appointment " + appointmentId
                                       + " is already cancelled.");
                    return false;
                }
                a.setStatus("Cancelled");
                System.out.println("  Appointment " + appointmentId
                                   + " cancelled successfully.");
                return true;
            }
        }
        System.out.println("  ERROR: Appointment ID "
                           + appointmentId + " not found.");
        return false;
    }

    @Override
    public void viewSchedule() {
        System.out.println("============================================");
        System.out.println("  " + hospitalName.toUpperCase()
                           + " — ALL APPOINTMENTS");
        System.out.println("============================================");
        if (appointments.isEmpty()) {
            System.out.println("  No appointments scheduled.");
            return;
        }
        for (Appointment a : appointments) {
            a.displayAppointment();
        }
    }

    // =========================================================
    // APPOINTMENT HELPERS
    // =========================================================

    public String generateAppointmentId() {
        return String.format("APT%03d", appointmentCounter++);
    }

    public void viewScheduledOnly() {
        System.out.println("============================================");
        System.out.println("  SCHEDULED APPOINTMENTS");
        System.out.println("============================================");
        boolean found = false;
        for (Appointment a : appointments) {
            if (a.getStatus().equals("Scheduled")) {
                a.displayAppointment();
                found = true;
            }
        }
        if (!found) System.out.println("  No active appointments.");
    }

    public Appointment findAppointment(String appointmentId) {
        for (Appointment a : appointments) {
            if (a.getAppointmentId().equals(appointmentId)) return a;
        }
        return null;
    }

    public void markCompleted(String appointmentId) {
        Appointment a = findAppointment(appointmentId);
        if (a != null && a.getStatus().equals("Scheduled")) {
            a.setStatus("Completed");
            System.out.println("  Appointment " + appointmentId
                               + " marked as completed.");
        } else if (a == null) {
            System.out.println("  Appointment not found.");
        } else {
            System.out.println("  Appointment is not in Scheduled status.");
        }
    }

    // =========================================================
    // DOCTOR MANAGEMENT
    // =========================================================

    public void addDoctor(MedicalProfessional doctor) {
        doctors.add(doctor);
        System.out.println("  Dr. " + doctor.getName()
            + " (" + doctor.getRole() + ") added to "
            + hospitalName + ".");
    }

    public void removeDoctor(String employeeId) {
        MedicalProfessional toRemove = findDoctor(employeeId);
        if (toRemove != null) {
            doctors.remove(toRemove);
            System.out.println("  Dr. " + toRemove.getName()
                               + " removed from system.");
        } else {
            System.out.println("  Doctor ID " + employeeId + " not found.");
        }
    }

    public MedicalProfessional findDoctor(String employeeId) {
        for (MedicalProfessional d : doctors) {
            if (d.getEmployeeId().equals(employeeId)) return d;
        }
        return null;
    }

    public void listDoctors() {
        System.out.println("============================================");
        System.out.println("  DOCTORS AT " + hospitalName.toUpperCase());
        System.out.println("============================================");
        if (doctors.isEmpty()) {
            System.out.println("  No doctors registered.");
            return;
        }
        for (MedicalProfessional d : doctors) {
            System.out.println("  [" + d.getEmployeeId() + "] Dr. "
                + d.getName() + " — " + d.getRole()
                + " (" + d.getYearsOfExperience() + " yrs exp)");
        }
    }

    // =========================================================
    // NURSE MANAGEMENT
    // =========================================================

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
        System.out.println("  " + nurse.getRole() + " " + nurse.getName()
            + " added to " + hospitalName + ".");
    }

    public Nurse findNurse(String employeeId) {
        for (Nurse n : nurses) {
            if (n.getEmployeeId().equals(employeeId)) return n;
        }
        return null;
    }

    public void listNurses() {
        System.out.println("============================================");
        System.out.println("  NURSES AT " + hospitalName.toUpperCase());
        System.out.println("============================================");
        if (nurses.isEmpty()) {
            System.out.println("  No nurses registered.");
            return;
        }
        for (Nurse n : nurses) {
            System.out.println("  [" + n.getEmployeeId() + "] "
                + n.getRole() + " " + n.getName()
                + " — Ward: " + n.getAssignedWard());
        }
    }

    // =========================================================
    // PATIENT MANAGEMENT
    // =========================================================

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("  Patient " + patient.getName()
            + " (ID: " + patient.getPatientId()
            + ") registered at " + hospitalName + ".");
    }

    public Patient findPatient(String patientId) {
        for (Patient p : patients) {
            if (p.getPatientId().equals(patientId)) return p;
        }
        return null;
    }

    public void listPatients() {
        System.out.println("============================================");
        System.out.println("  PATIENTS AT " + hospitalName.toUpperCase());
        System.out.println("============================================");
        if (patients.isEmpty()) {
            System.out.println("  No patients registered.");
            return;
        }
        for (Patient p : patients) {
            System.out.println("  [" + p.getPatientId() + "] "
                + p.getName() + " — Age: " + p.getAge()
                + " | Blood Type: " + p.getBloodType());
        }
    }

    // Getters
    public String getHospitalName()                        { return hospitalName; }
    public ArrayList<MedicalProfessional> getDoctors()     { return doctors; }
    public ArrayList<Nurse> getNurses()                    { return nurses; }
    public ArrayList<Patient> getPatients()                { return patients; }
    public ArrayList<Appointment> getAppointments()        { return appointments; }
}
