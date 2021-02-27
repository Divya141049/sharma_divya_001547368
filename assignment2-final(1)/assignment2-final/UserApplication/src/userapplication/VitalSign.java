package userapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VitalSign {

    static int counter = 0;

    public VitalSign() {
        counter++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        Person person = new Person();
        Encounter encounter = new Encounter();
        Community communityObj = new Community();
        System.out.println("\nM E N U");
        System.out.println("1.Check Vital sign ?");
        System.out.println("2.Check Encounter History?");
        System.out.println("3.Community Analysis");
        System.out.println("4.Exit");
        int choice;
        String name;
        String communityName;
        choice = sc.nextInt();

        while (choice != 4) {
            if (choice == 1) {
                // Actual Data
                System.out.print("Enter the number of Patient\n");
                int numberOfPatients = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < numberOfPatients; i++) {
                    System.out.print("Enter Age Group of patient" + (counter + 1) + "(Newborn, Infant, Toddler, Preschooler, SchoolAge, Adolescent) \n");
                    String ageGroup = sc.nextLine();
                    System.out.print("Enter Patient Name \n");
                    String patientName = sc.nextLine();
                    System.out.print("Enter Respiratory rate \n");
                    int respiratoryRate = sc.nextInt();
                    System.out.print("Enter Heartrate  \n");
                    int heartRate = sc.nextInt();
                    System.out.print("Enter Blood Pressure  \n");
                    int bloodPressure = sc.nextInt();
                    System.out.print("Enter Weight in Kgs  \n");
                    int weightInKgs = sc.nextInt();
                    System.out.print("Enter Weight in Pounds  \n");
                    int weightInPounds = sc.nextInt();
                    System.out.print("Enter Patient Age\n");
                    int patientAge = sc.nextInt();
                    System.out.print("Enter Flat Number \n");
                    int flatNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Street1 Address \n");
                    String street1 = sc.nextLine();
                    System.out.print("Enter Street2 Address \n");
                    String street2 = sc.nextLine();
                    System.out.print("Enter City \n");
                    String city = sc.nextLine();
                    System.out.print("Enter Country \n");
                    String country = sc.nextLine();
                    System.out.print("Enter Zipcode \n");
                    int zipCode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Community \n");
                    String community = sc.nextLine();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    String time = dtf.format(now);
                    person.savePersonalInformation(patientName, patientAge, flatNumber, street1, street2, city, country, zipCode, community);
                    encounter.saveEncounterHistory(patientName, time);
                    communityObj.saveCommunityData(patientName, community);
                    patient.isPatientNormal(patientName, ageGroup, respiratoryRate, heartRate, bloodPressure, weightInKgs, weightInPounds, patientAge, flatNumber, street1, street2, city, country, zipCode, community, time);
                }
                // Actual Data
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

                for (int i = 0; i < communityObj.communityList.size(); i++) {
                    Community data = communityObj.communityList.get(i);

                    Encounter encounterData = encounter.encounterList.get(i);
                    Patient patientData = patient.patientList.get(i);
                    if (communityName.equals(data.community)) {
                        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", data.patientName, patientData.ageGroup, patientData.respiratoryRate, patientData.heartrate, patientData.bloodPressure, patientData.weightInKg, patientData.weightInPounds, (patientData.vitalSignNormal ? "Normal" : "Abnormal"), patientData.time, (patientData.respiratorySign ? "Normal" : "Abnormal"), (patientData.heartSign ? "Normal" : "Abnormal"), (patientData.bloodSign ? "Normal" : "Abnormal"), (patientData.weightKgSign ? "Normal" : "Abnormal"), (patientData.weightPoundSign ? "Normal" : "Abnormal"), data.community, encounterData.time);
                        System.out.print("\n");
                        count++;
                    }
                }
                System.out.println("Total Number of Abnormal Patients:" + count);
//                patient.showCommunityData(communityName);
            }
            System.out.println("\nM E N U");
            System.out.println("1.Check Vital sign ?");
            System.out.println("2.Check Encounter History?");
            System.out.println("3.Community Analysis");
            System.out.println("4.Exit");
            choice = sc.nextInt();
        }
        // To show all records if required
//        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Patient Name", "Age Group", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight in Kgs", "Weight in Pounds", "Vital Sign", "Time");
//        System.out.print("\n");
//        for (int i = 0; i < counter; i++) {
//            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", patient.patientList[i].patientName, patient.patientList[i].ageGroup, patient.patientList[i].respiratoryRate, patient.patientList[i].heartrate, patient.patientList[i].bloodPressure, patient.patientList[i].weightInKg, patient.patientList[i].weightInPounds, (patient.patientList[i].vitalSignNormal ? "Normal" : "Abnormal"), patient.patientList[i].time + "\n");
//        }
        // To show all records if required
    }
}
