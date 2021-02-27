package userapplication;

import java.util.ArrayList;

public class Person {
    public String patientName;
    public int patientAge;
    public int flatNumber;
    public String street1;
    public String street2;
    public String city;
    public String country;
    public int zipCode;
    public String community;
    public ArrayList<Person> list = new ArrayList<>();

    public Person() {

    }

    public Person(String patientName, int patientAge, int flatNumber, String street1, String street2, String city, String country, int zipCode, String community) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.flatNumber = flatNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.community = community;
    }

    public void printValues() {
        for (int i = 0; i < this.list.size(); i++) {
            Person data = this.list.get(i);
//            System.out.println(data.patientName + "sss" + this.list.size());
        }
    }

    public void savePersonalInformation(String patientName, int patientAge, int flatNumber, String street1, String street2, String city, String country, int zipCode, String community) {
//        System.out.println(patientName);
        this.list.add(new Person(patientName, patientAge, flatNumber, street1, street2, city, country, zipCode,community));
        this.printValues();
    }

    public ArrayList<Person> getList() {
        return list;
    }

    public static void main(String[] args) {
    }

}
