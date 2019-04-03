package pl.com.tkar;

import java.util.Date;

public class Visit {

    private Doctor doctor;
    private Patient patient;
    private Date date;
    private String desciption;

    public Visit() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getDate() {
        return date;
    }

    public String getDesciption() {
        return desciption;
    }

    public Visit(Doctor doctor, Patient patient, Date date, String desciption) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", date=" + date +
                ", desciption='" + desciption + '\'' +
                '}';
    }
}
