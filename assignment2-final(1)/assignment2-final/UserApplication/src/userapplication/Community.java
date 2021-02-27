package userapplication;

import java.util.ArrayList;

public class Community extends Person {

    public ArrayList<Community> communityList = new ArrayList<>();

    public Community() {
    }

    public Community(String patientName, String community) {
        this.patientName = patientName;
        this.community = community;
    }

    public void saveCommunityData(String patientName, String community) {
//        System.out.println(patientName);
        this.communityList.add(new Community(patientName, community));
        this.printValues();
    }
}
