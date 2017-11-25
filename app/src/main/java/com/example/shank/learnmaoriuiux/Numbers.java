package com.example.shank.learnmaoriuiux;

/**
 * Created by shank on 16/11/2017.
 */

public class Numbers {

    private int soundImage;
    private int soundFile;
    private String englishNumber;
    private String maoriNumber;
    private int numberImage;

    public Numbers(int soundImage, String englishNumber, String maoriNumber, int numberImage, int soundFile){
        this.soundImage = soundImage;
        this.englishNumber = englishNumber;
        this.maoriNumber = maoriNumber;
        this.numberImage = numberImage;
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

    public String getEnglishNumber() {
        return englishNumber;
    }

    public void setEnglishNumber(String englishNumber) {
        this.englishNumber = englishNumber;
    }

    public String getMaoriNumber() {
        return maoriNumber;
    }

    public void setMaoriNumber(String maoriNumber) {
        this.maoriNumber = maoriNumber;
    }

    public int getNumberImage() {
        return numberImage;
    }

    public void setNumberImage(int numberImage) {
        this.numberImage = numberImage;
    }
}
