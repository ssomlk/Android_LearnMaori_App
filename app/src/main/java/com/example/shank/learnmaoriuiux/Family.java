package com.example.shank.learnmaoriuiux;

/**
 * Created by shank on 17/11/2017.
 */

public class Family {

    private int soundImage;
    private int soundFile;
    private String englishFamilyMember;
    private String maoriFamilyMemberName;
    private int familyMemberImage;

    public Family(int soundImage, String englishFamilyMember, String maoriFamilyMemberName, int familyMemberImage, int soundFile) {
        this.soundImage = soundImage;
        this.englishFamilyMember = englishFamilyMember;
        this.maoriFamilyMemberName = maoriFamilyMemberName;
        this.familyMemberImage = familyMemberImage;
        this.soundFile = soundFile;
    }

    public int getSoundImage() {
        return soundImage;
    }

    public void setSoundImage(int soundImage) {
        this.soundImage = soundImage;
    }

    public int getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(int soundFile) {
        this.soundFile = soundFile;
    }

    public String getEnglishFamilyMember() {
        return englishFamilyMember;
    }

    public void setEnglishFamilyMember(String englishFamilyMember) {
        this.englishFamilyMember = englishFamilyMember;
    }

    public String getMaoriFamilyMemberName() {
        return maoriFamilyMemberName;
    }

    public void setMaoriFamilyMemberName(String maoriFamilyMemberName) {
        this.maoriFamilyMemberName = maoriFamilyMemberName;
    }

    public int getFamilyMemberImage() {
        return familyMemberImage;
    }

    public void setFamilyMemberImage(int familyMemberImage) {
        this.familyMemberImage = familyMemberImage;
    }
}
