/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

public class TestClass {

    static int counter = 0;

    public TestClass() {
        counter++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        System.out.println("\nM E N U");
        System.out.println("1.Do you want to check Vital sign ?");
        System.out.println("2.Do you want to check Patient Histor ?");
        System.out.println("3.Exit");
        int choice;
        String name;
        choice = sc.nextInt();
        while (choice != 3) {
            if (choice == 1) {
                patient.isPatientNormal("Harsh Gupta", "Newborn", 35, 125, 65, 3, 5, counter);
                counter++;
                patient.isPatientNormal("Harsh Gupta", "Newborn", 10, 125, 65, 3, 5, counter);
                counter++;
                patient.isPatientNormal("Divya", "Infant", 19, 125, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Divya", "Infant", 19, 125, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Harsh", "Toddler", 19, 125, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Harsh", "Toddler", 19, 125, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Divya", "Preschooler", 25, 90, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Divya", "Preschooler", 25, 90, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Harsh Gupta", "SchoolAge", 19, 125, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Harsh Gupta", "SchoolAge", 19, 125, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Divya Sharma", "Adolescent", 19, 125, 75, 6, 11, counter);
                counter++;
                patient.isPatientNormal("Divya Sharma", "Adolescent", 19, 125, 75, 6, 11, counter);
                System.out.println("Test data Added");
                // To show all records if required
//        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Patient Name", "Age Group", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight in Kgs", "Weight in Pounds", "Vital Sign", "Time");
//        System.out.print("\n");
//        for (int i = 0; i < counter; i++) {
//            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", patient.patientList[i].patientName, patient.patientList[i].ageGroup, patient.patientList[i].respiratoryRate, patient.patientList[i].heartrate, patient.patientList[i].bloodPressure, patient.patientList[i].weightInKg, patient.patientList[i].weightInPounds, (patient.patientList[i].vitalSignNormal ? "Normal" : "Abnormal"), patient.patientList[i].time + "\n");
//        }
        // To show all records if required
            } else {
                System.out.println("\nEnter patients name");
                sc.nextLine();
                name = sc.nextLine();
                patient.showVitalSignHistory(name, counter);
            }
            System.out.println("\nM E N U");
            System.out.println("1.Do you want to check Vital sign ?");
            System.out.println("2.Do you want to check Patient History ?");
            System.out.println("3.Exit");
            choice = sc.nextInt();
        }
    }
}