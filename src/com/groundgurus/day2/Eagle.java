package com.groundgurus.day2;
public class Eagle extends Animals {
    private boolean walk;

    public boolean isWalk() {
        return walk;
    }

    
    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public Eagle(boolean walk) {
        super(walk);
        this.walk = walk;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Go: " + walk);
    }
}
