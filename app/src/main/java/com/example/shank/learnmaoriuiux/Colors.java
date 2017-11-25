package com.example.shank.learnmaoriuiux;

/**
 * Created by shank on 17/11/2017.
 */

public class Colors {

    private int soundImage;
    private String englishColor;
    private String maoriColor;
    private int colorCode;
    private int soundFile;

    public Colors(int soundImage, String englishColor, String maoriColor, int colorCode, int soundFile) {
        this.soundImage = soundImage;
        this.englishColor = englishColor;
        this.maoriColor = maoriColor;
        this.colorCode = colorCode;
        this.soundFile = soundFile;
    }

    public int getSoundImage() {
        return soundImage;
    }

    public void setSoundImage(int soundImage) {
        this.soundImage = soundImage;
    }

    public String getEnglishColor() {
        return englishColor;
    }

    public void setEnglishColor(String englishColor) {
        this.englishColor = englishColor;
    }

    public String getMaoriColor() {
        return maoriColor;
    }

    public void setMaoriColor(String maoriColor) {
        this.maoriColor = maoriColor;
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int maoriColor) {
        this.colorCode = maoriColor;
    }

    public int getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(int soundFile) {
        this.soundFile = soundFile;
    }
}
