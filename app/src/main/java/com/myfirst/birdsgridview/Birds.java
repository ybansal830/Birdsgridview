package com.myfirst.birdsgridview;

public class Birds {

    private int birdsImageId;
    private String birdName;

    public Birds(int birdsImageId,String birdName) {
        this.birdsImageId = birdsImageId;
        this.birdName = birdName;
    }

    public int getBirdsImageId() {
        return birdsImageId;
    }
    public String getBirdName(){
        return birdName;
    }
}
