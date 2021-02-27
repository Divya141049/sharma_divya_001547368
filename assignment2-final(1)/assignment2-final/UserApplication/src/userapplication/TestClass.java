package userapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        Person person = new Person();
        Encounter encounter = new Encounter();
        Community community = new Community();
        System.out.println("\nM E N U");
        System.out.println("1.Check Vital sign ?");
        System.out.println("2.Check Encounter History?");
        System.out.println("3.Community Analysis");
        System.out.println("4.Exit");
        int choice;
        String name;
        String communityName;
        choice = sc.nextInt();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        while (choice != 4) {
            if (choice == 1) {
                
                 patient.isPatientNormal("Shikha", "SchoolAge", 29, 95, 110, 30, 42, 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy", time);
                person.savePersonalInformation("Shikha", 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy");
                encounter.saveEncounterHistory("Shikha", time);
                community.saveCommunityData("Shikha", "Treasure Fantasy");
                
                patient.isPatientNormal("Yash", "Preschooler", 25, 115, 90, 17, 32, 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy", time);
                person.savePersonalInformation("Yash", 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy");
                encounter.saveEncounterHistory("Yash", time);
                community.saveCommunityData("Yash", "Treasure Fantasy");
                
                patient.isPatientNormal("Harsh Gupta", "Newborn", 35, 125, 49, 3, 5, 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy", time);
                person.savePersonalInformation("Harsh Gupta", 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy");
                encounter.saveEncounterHistory("Harsh Gupta", time);
                community.saveCommunityData("Harsh Gupta", "Treasure Fantasy");

                patient.isPatientNormal("Divya Sharma", "Infant", 21, 125, 89, 5, 10, 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy", time);
                person.savePersonalInformation("Divya Sharma", 23, 929, "street1", "street2", "city", "country", 452009, "Treasure Fantasy");
                encounter.saveEncounterHistory("Divya Sharma", time);
                community.saveCommunityData("Divya Sharma", "Treasure Fantasy");

                patient.isPatientNormal("Joe", "Toddler", 33, 105, 59, 9, 11, 23, 929, "street1", "street2", "city", "country", 452009, "Silicon", time);
                person.savePersonalInformation("Joe", 23, 929, "street1", "street2", "city", "country", 452009, "Silicon");
                encounter.saveEncounterHistory("Joe", time);
                community.saveCommunityData("Joe", "Silicon");
                
                patient.isPatientNormal("Atindra", "Adolescent", 35, 125, 49, 3, 5, 23, 929, "street1", "street2", "city", "country", 452009, "Silicon", time);
                person.savePersonalInformation("Atindra", 23, 929, "street1", "street2", "city", "country", 452009, "Silicon");
                encounter.saveEncounterHistory("Atindra", time);
                community.saveCommunityData("Atindra", "Silicon");
                System.out.println("Test data Added");
            } else if (choice == 2) {
                System.out.println("\nEnter patients name");
                sc.nextLine();
                name = sc.nextLine();
                // Encounter History class data
                System.out.print("Encounter History\n");
                System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Patient Name", "Age Group", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight in Kgs", "Weight in Pounds", "Vital Sign", "Time", "Respiratory Sign", "Heartrate Sign", "Blood Sign", "WeightKgSign", "WeightPound", "Encounter Time");
                System.out.print("\n");
                for (int i = 0; i < encounter.encounterList.size(); i++) {
                    Encounter data = encounter.encounterList.get(i);
                    Patient patientData = patient.patientList.get(i);
                    if (name.equals(data.patientName)) {
                        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", data.patientName, patientData.ageGroup, patientData.respiratoryRate, patientData.heartrate, patientData.bloodPressure, patientData.weightInKg, patientData.weightInPounds, (patientData.vitalSignNormal ? "Normal" : "Abnormal"), patientData.time, (patientData.respiratorySign ? "Normal" : "Abnormal"), (patientData.heartSign ? "Normal" : "Abnormal"), (patientData.bloodSign ? "Normal" : "Abnormal"), (patientData.weightKgSign ? "Normal" : "Abnormal"), (patientData.weightPoundSign ? "Normal" : "Abnormal"), data.time);
                        System.out.print("\n");
                    }
                }

            } else if (choice == 3) {
                System.out.println("\nEnter community name");
                sc.nextLine();
                communityName = sc.nextLine();
                System.out.print("Community List\n");
                System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Patient Name", "Age Group", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight in Kgs", "Weight in Pounds", "Vital Sign", "Time", "Respiratory Sign", "Heartrate Sign", "Blood Sign", "WeightKgSign", "WeightPound", "Community", "Encounter Time");
                System.out.print("\n");
                int count = 0;
                for (int i = 0; i < community.communityList.size(); i++) {
                    Community data = community.communityList.get(i);
                    Patient patientData = patient.patientList.get(i);
                    Encounter encounterLists = encounter.encounterList.get(i);
                    if (communityName.equals(data.community)) {
                        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", data.patientName, patientData.ageGroup, patientData.respiratoryRate, patientData.heartrate, patientData.bloodPressure, patientData.weightInKg, patientData.weightInPounds, (patientData.vitalSignNormal ? "Normal" : "Abnormal"), patientData.time, (patientData.respiratorySign ? "Normal" : "Abnormal"), (patientData.heartSign ? "Normal" : "Abnormal"), (patientData.bloodSign ? "Normal" : "Abnormal"), (patientData.weightKgSign ? "Normal" : "Abnormal"), (patientData.weightPoundSign ? "Normal" : "Abnormal"), data.community, encounterLists.time);
                        System.out.print("\n");
                        count++;
                    }
                }
                System.out.println("Total Number of Abnormal Patients:" + count);
            }
            System.out.println("\nM E N U");
            System.out.println("1.Check Vital sign ?");
            System.out.println("2.Check Encounter History?");
            System.out.println("3.Community Analysis");
            System.out.println("4.Exit");
            choice = sc.nextInt();
        }
    }
}
