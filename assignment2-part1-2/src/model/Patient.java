/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Patient {

    public String ageGroup;
    public String patientName;
    public String time;
    public int respiratoryRate;
    public int heartrate;
    public int bloodPressure;
    public int weightInKg;
    public int weightInPounds;
    public boolean vitalSignNormal;
    public boolean respiratorySign;
    public boolean heartSign;
    public boolean bloodSign;
    public boolean weightKgSign;
    public boolean weightPoundSign;

    public Patient() {
    }

    public Patient(String patientName, String ageGroup, int respiratoryRate, int heartrate, int bloodPressure, int weightInKg, int weightInPounds, boolean vitalSign, String time, boolean respiratorySign, boolean heartSign, boolean bloodSign, boolean weightKgSign, boolean weightPoundSign) {
        this.ageGroup = ageGroup;
        this.patientName = patientName;
        this.respiratoryRate = respiratoryRate;
        this.heartrate = heartrate;
        this.bloodPressure = bloodPressure;
        this.weightInKg = weightInKg;
        this.weightInPounds = weightInPounds;
        this.vitalSignNormal = vitalSign;
        this.time = time;
        this.respiratorySign = respiratorySign;
        this.heartSign = heartSign;
        this.bloodSign = bloodSign;
        this.weightKgSign = weightKgSign;
        this.weightPoundSign = weightPoundSign;

    }
    Patient patientList[] = new Patient[50];

    public void newVitalSign(String patientName, String ageGroup, int respiratoryRate, int heartrate, int bloodPressure, int weightInKg, int weightInPounds, int counter, boolean vitalSign, boolean respiratorySign, boolean heartSign, boolean bloodSign, boolean weightKgSign, boolean weightPoundSign) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        patientList[counter] = new Patient(patientName, ageGroup, respiratoryRate, heartrate, bloodPressure, weightInKg, weightInPounds, vitalSign, dtf.format(now), respiratorySign, heartSign, bloodSign, weightKgSign, weightPoundSign);
    }

    public boolean isVitalSignNormal(String ageGroup, int respiratoryRate, int heartrate, int bloodPressure, int weightInKg, int weightInPounds) {
        switch (ageGroup) {
            case "Newborn":
                return (respiratoryRate >= 30 && respiratoryRate <= 50)
                        && (heartrate >= 120 && heartrate <= 160)
                        && (bloodPressure >= 50 && bloodPressure <= 70)
                        && (weightInKg >= 2 && weightInKg <= 3)
                        && (weightInPounds >= 4.5 && weightInPounds <= 7);
            case "Infant":
                return (respiratoryRate >= 20 && respiratoryRate <= 30)
                        && (heartrate >= 80 && heartrate <= 140)
                        && (bloodPressure >= 70 && bloodPressure <= 100)
                        && (weightInKg >= 4 && weightInKg <= 10)
                        && (weightInPounds >= 9 && weightInPounds <= 22);
            case "Toddler":
                return (respiratoryRate >= 20 && respiratoryRate <= 30)
                        && (heartrate >= 80 && heartrate <= 130)
                        && (bloodPressure >= 80 && bloodPressure <= 110)
                        && (weightInKg >= 10 && weightInKg <= 14)
                        && (weightInPounds >= 22 && weightInPounds <= 31);
            case "Preschooler":
                return (respiratoryRate >= 20 && respiratoryRate <= 30)
                        && (heartrate >= 80 && heartrate <= 120)
                        && (bloodPressure >= 80 && bloodPressure <= 110)
                        && (weightInKg >= 14 && weightInKg <= 18)
                        && (weightInPounds >= 31 && weightInPounds <= 40);
            case "SchoolAge":
                return (respiratoryRate >= 20 && respiratoryRate <= 30)
                        && (heartrate >= 70 && heartrate <= 110)
                        && (bloodPressure >= 80 && bloodPressure <= 120)
                        && (weightInKg >= 20 && weightInKg <= 42)
                        && (weightInPounds >= 41 && weightInPounds <= 92);
            case "Adolescent":
                return (respiratoryRate >= 12 && respiratoryRate <= 20)
                        && (heartrate >= 55 && heartrate <= 105)
                        && (bloodPressure >= 110 && bloodPressure <= 120)
                        && (weightInKg >= 50) && (weightInPounds >= 110);
        }
        return false;
    }

    public boolean isIndividualVitalSignNormal(String ageGroup, String signType, int value) {
        switch (ageGroup) {
            case "Newborn": {
                switch (signType) {
                    case "respiratory":
                        return value >= 30 && value <= 50;
                    case "heartrate":
                        return value >= 120 && value <= 160;
                    case "bloodPressure":
                        return value >= 40 && value <= 70;
                    case "weightInKg":
                        return value >= 2 && value <= 3;
                    case "weightInPounds":
                        return value >= 4.5 && value <= 7;
                }
            }
            case "Infant":
                switch (signType) {
                    case "respiratory":
                        return value >= 20 && value <= 30;
                    case "heartrate":
                        return value >= 80 && value <= 140;
                    case "bloodPressure":
                        return value >= 70 && value <= 100;
                    case "weightInKg":
                        return value >= 4 && value <= 10;
                    case "weightInPounds":
                        return value >= 9 && value <= 22;
                }
            case "Toddler":
                switch (signType) {
                    case "respiratory":
                        return value >= 20 && value <= 30;
                    case "heartrate":
                        return value >= 80 && value <= 130;
                    case "bloodPressure":
                        return value >= 80 && value <= 110;
                    case "weightInKg":
                        return value >= 10 && value <= 14;
                    case "weightInPounds":
                        return value >= 22 && value <= 31;
                }
            case "Preschooler":
                switch (signType) {
                    case "respiratory":
                        return value >= 20 && value <= 30;
                    case "heartrate":
                        return value >= 80 && value <= 120;
                    case "bloodPressure":
                        return value >= 80 && value <= 110;
                    case "weightInKg":
                        return value >= 14 && value <= 18;
                    case "weightInPounds":
                        return value >= 31 && value <= 40;
                }
            case "SchoolAge":
                switch (signType) {
                    case "respiratory":
                        return value >= 20 && value <= 30;
                    case "heartrate":
                        return value >= 70 && value <= 110;
                    case "bloodPressure":
                        return value >= 80 && value <= 120;
                    case "weightInKg":
                        return value >= 20 && value <= 42;
                    case "weightInPounds":
                        return value >= 41 && value <= 92;
                }
            case "Adolescent":
                switch (signType) {
                    case "respiratory":
                        return value >= 12 && value <= 20;
                    case "heartrate":
                        return value >= 55 && value <= 105;
                    case "bloodPressure":
                        return value >= 110 && value <= 120;
                    case "weightInKg":
                        return value >= 50;
                    case "weightInPounds":
                        return value >= 110;
                }
        }
        return true;
    }

    public void showVitalSignHistory(String name, int counter) {
        System.out.print("\nVital Sign History\n");
        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Patient Name", "Age Group", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight in Kgs", "Weight in Pounds", "Vital Sign", "Time", "Respiratory Sign", "Heartrate Sign", "Blood Sign", "WeightKgSign", "WeightPound");
        System.out.print("\n");
        for (int j = 0; j < counter; j++) {
            if (name.equals(patientList[j].patientName)) {
                System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", patientList[j].patientName, patientList[j].ageGroup, patientList[j].respiratoryRate, patientList[j].heartrate, patientList[j].bloodPressure, patientList[j].weightInKg, patientList[j].weightInPounds, (patientList[j].vitalSignNormal ? "Normal" : "Abnormal"), patientList[j].time, (patientList[j].respiratorySign ? "Normal" : "Abnormal"), (patientList[j].heartSign ? "Normal" : "Abnormal"), (patientList[j].bloodSign ? "Normal" : "Abnormal"), (patientList[j].weightKgSign ? "Normal" : "Abnormal"), (patientList[j].weightPoundSign ? "Normal" : "Abnormal"));
                System.out.print("\n");
            }
        }
    }

    public boolean isPatientNormal(String patientName, String ageGroup, int respiratoryRate, int heartrate, int bloodPressure, int weightInKg, int weightInPounds, int counter) {
        boolean vitalSign = this.isVitalSignNormal(ageGroup, respiratoryRate, heartrate, bloodPressure, weightInKg, weightInPounds);
        System.out.print(patientName + " " +ageGroup + (vitalSign ? " Normal" : " Abnormal" + "\n"));
        boolean respiratorySigns = this.isIndividualVitalSignNormal(ageGroup, "respiratory", respiratoryRate);
        boolean heartSigns = this.isIndividualVitalSignNormal(ageGroup, "heartrate", heartrate);
        boolean bloodSigns = this.isIndividualVitalSignNormal(ageGroup, "bloodPressure", bloodPressure);
        boolean weightKgSigns = this.isIndividualVitalSignNormal(ageGroup, "weightInKg", weightInKg);
        boolean weightPoundSigns = this.isIndividualVitalSignNormal(ageGroup, "weightInPounds", weightInPounds);
        this.newVitalSign(patientName, ageGroup, respiratoryRate, heartrate, bloodPressure, weightInKg, weightInPounds, counter, vitalSign, respiratorySigns, heartSigns, bloodSigns, weightKgSigns, weightPoundSigns);
        return vitalSign;
    }

    public static void main(String[] args) {

    }
}