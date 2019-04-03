package pl.com.tkar;

public class Doctor {

    private String name;
    private String surname;
    private double sallary;
    private String specialization;

    public Doctor(String name, String surname, double sallary, String specialization) {
        this.name = name;
        this.surname = surname;
        this.sallary = sallary;
        this.specialization = specialization;
    }

    /**Default Constructor**/
    protected Doctor() {}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSallary() {
        return sallary;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sallary=" + sallary +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
