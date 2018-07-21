package com.groundgurus.day2;
public class ShopMain {
    public static void main(String[] args) {
        Shop wineShop = new WineShop("Port Wine Shop", new String[] {"Drunken Flame ", "Bennidict", "Coopers"},"SOME RANDOM CITYY",5, false);     
        wineShop.printDetails();
        
        Shop cakeShop = new Shop();
        cakeShop.setName  ("The Best Cakes");
        cakeShop.setItems  (new String[] {"Black Forrest", "Belgium Chocolate", "Classic Vanilla"});
        cakeShop.setAddress ( "SOME RANDOM CITYY TOOOOOO ");
        cakeShop.setNumberOfemployees (7);
        cakeShop.printDetails();
    }  
    
}
