package com.groundgurus.day2;
public class Shop {    
        private String name;
        private String[] items;
        private String address;
        private int numberOfemployees;

    public Shop(String name, String[] items, String address, int numberOfemployees) {
        this.name = name;
        this.items = items;
        this.address = address;
        this.numberOfemployees = numberOfemployees;
    }

    public Shop() {
    }
        
        
        public String findByItemName(String name){
            return "";
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfemployees() {
        return numberOfemployees;
    }

    public void setNumberOfemployees(int numberOfemployees) {
        if (numberOfemployees > 0){
        this.numberOfemployees = numberOfemployees;
    }else {
            System.err.println("The value is invalid");
        }
    }
        
 public void printDetails(){
       System.out.println("Name: " + name);
    for (String item : items) {
            System.out.println(item);
        }
      System.out.println("Adresss: " + address); 
      System.out.println("Numbr of Employees: " + numberOfemployees);
 }
    
    
}



