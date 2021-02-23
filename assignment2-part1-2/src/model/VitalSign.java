/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.Scanner;

public class VitalSign {

    static int counter = 0;

    public VitalSign() {
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
                // Actual Data
                System.out.print("Enter the number of Patient\n");
                int numberOfPatients = sc.nextInt();

                for (int i = 0; i < numberOfPatients; i++) {
                    sc.nextLine();
                    System.out.print("Enter Age Group of patient" + (counter + 1) + "(Newborn, Infant, Toddler, Preschooler, SchoolAge, Adolescent) \n");
                    String ageGroup = sc.nextLine();
                    System.out.print("Enter Patient Name \n");
                    String patientName = sc.nextLine();
                    System.out.print("Enter Respiratory rate \n");
                    int respiratoryRate = sc.nextInt();
                    System.out.print("Enter Heartrate rate \n");
                    int heartRate = sc.nextInt();
                    System.out.print("Enter Blood Pressure rate \n");
                    int bloodPressure = sc.nextInt();
                    System.out.print("Enter Weight in Kgs rate \n");
                    int weightInKgs = sc.nextInt();
                    System.out.print("Enter Weight in Pounds rate \n");
                    int weightInPounds = sc.nextInt();
                    patient.isPatientNormal(patientName, ageGroup, respiratoryRate, heartRate, bloodPressure, weightInKgs, weightInPounds, counter);
                    counter++;
                }
                // To show all records if required
//                System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Patient Name", "Age Group", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight in Kgs", "Weight in Pounds", "Vital Sign", "Time");
//                System.out.print("\n");
//                for (int i = 0; i < counter; i++) {
//                    System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", patient.patientList[i].patientName, patient.patientList[i].ageGroup, patient.patientList[i].respiratoryRate, patient.patientList[i].heartrate, patient.patientList[i].bloodPressure, patient.patientList[i].weightInKg, patient.patientList[i].weightInPounds, (patient.patientList[i].vitalSignNormal ? "Normal" : "Abnormal"), patient.patientList[i].time + "\n");
//                }
        // To show all records if required
                // Actual Data
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