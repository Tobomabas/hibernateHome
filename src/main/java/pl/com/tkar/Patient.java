package pl.com.tkar;

public class Patient {

    private String name;
    private int age;
    private String owner;

    public Patient() {
    }

    public Patient(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
