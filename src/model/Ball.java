/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rafael
 */
public class Ball extends Thread {

    Random generator = new Random();

    public void run(ArrayList<Cell> cells) {
        
        
        
        int cel;
        cel = generator.nextInt(99);
            cells.get(cel).setBallId(this.getId());
            cells.get(cel).setAvailable(false);
            
            
            
    }
    
   

    
 
}