package com.groundgurus.day2;
public class WineShop extends Shop {
    private boolean areminorsallowed;

    public boolean isAreminorsallowed() {
        return areminorsallowed;
    }

    
    public void setAreminorsallowed(boolean areminorsallowed) {
        this.areminorsallowed = areminorsallowed;
    }

    public WineShop(String name, String[] items, String address, int numberOfemployees,boolean areminorsallowed) {
        super(name, items, address, numberOfemployees);
        this.areminorsallowed = areminorsallowed;
    }
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Are Minors Allowed: " + areminorsallowed);
    }

    
}
