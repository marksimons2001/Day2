/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundgurus.day2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marks
 */
public class WineShopTest {
    
    public WineShopTest() {
    }

    @Test
    public void testSomeMethod() {
        WineShop wineShop = new WineShop("Port Wine Shop", new String[] {"Drunken Flame ", "Bennidict", "Coopers"},"SOME RANDOM CITYY",5, false);     
        wineShop.printDetails();
        
        assertEquals(false, wineShop.isAreMinorsAllowed());
    }
    
}
