/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userapplication;

import java.util.ArrayList;

/**
 *
 * @author LUCKY
 */
public class Encounter extends Patient{
    
    public ArrayList<Encounter> encounterList = new ArrayList<>();

    public Encounter(String patientName, String time) {
        this.time = time;
        this.patientName = patientName;

    }
    
    public Encounter() {
    }

    public void saveEncounterHistory(String patientName, String time) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
        this.encounterList.add(new Encounter(patientName, time));
    }
}
