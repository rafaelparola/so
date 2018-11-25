/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cell;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Ball;

/**
 *
 * @author rafael
 */
public class GameController {
    
   Random generator = new Random();
    
   Thread ball1 = new Thread(){
       @Override
       public void run(){
           System.out.println("1 ball running");
       }
   };
   Thread ball2 = new Thread(){
       @Override
       public void run(){
           System.out.println("2 ball running");
       }
   };
   Thread ball3 = new Thread(){
       @Override
       public void run(){
           System.out.println("3 ball running");
       }
   };
   Thread ball4 = new Thread(){
       @Override
       public void run(){
           System.out.println("4 ball running");
       }
   };
   Thread ball5 = new Thread(){
       @Override
       public void run(){
           System.out.println("5 ball running");
       }
   };
    
   
   
    public void startThreads(){
        
        ball1.start();
        ball2.start();
        ball3.start();
        ball4.start();
        ball5.start();
        
    }
    
    public ArrayList<Cell> insertBalls(ArrayList<Cell> cells){
        for(int i =0;i< cells.size();i++){
            cells.get(i).setAvailable(true);
        }
        int cel;
        if(ball1.isInterrupted()== false){
            cel = generator.nextInt(99);
            cells.get(cel).setBallId(ball1.getId());
            cells.get(cel).setAvailable(false);
           // JOptionPane.showMessageDialog(null, cells.get(cel).getBallId());
         // ball1.run();
          
            
        }
        if(ball2.isInterrupted()== false){
            cel = generator.nextInt(99);
            cells.get(cel).setBallId(ball2.getId());
            cells.get(cel).setAvailable(false);
           // JOptionPane.showMessageDialog(null, ball2.getId());
         //  ball2.run();
        }
        if(ball3.isInterrupted()== false){
            cel = generator.nextInt(99);
            cells.get(cel).setBallId(ball3.getId());
            cells.get(cel).setAvailable(false);
         //   JOptionPane.showMessageDialog(null, ball3.getId());
         //  ball3.run();
        }
        if(ball4.isInterrupted()== false){
            cel = generator.nextInt(99);
         cells.get(cel).setBallId(ball4.getId());
            cells.get(cel).setAvailable(false);
          // JOptionPane.showMessageDialog(null, ball4.getId());
            //ball4.run();
        }
        if(ball5.isAlive() == false){
          cel = generator.nextInt(99);
          cells.get(cel).setBallId(ball5.getId());
            cells.get(cel).setAvailable(false);
            //JOptionPane.showMessageDialog(null, ball5.getId());
         // ball5.run();
        }
        return cells;
    }
    
    public void killBall(long ballId) {
       // JOptionPane.showMessageDialog(null, ball1.getId());
        
        if(ball1.getId() == ballId){
            System.out.println(ball5.isInterrupted());
                ball1.interrupt();
               // System.out.println(ball1.isInterrupted());
        }
        if(ball2.getId() == ballId){
                ball2.interrupt();
              //  System.out.println(ball2.isInterrupted());
        }
        if(ball3.getId() == ballId){
                ball3.interrupt();
             //  System.out.println(ball3.isInterrupted());
        }
        if(ball4.getId() == ballId){
                ball4.interrupt();
            //  System.out.println(ball4.isInterrupted());
        }
        if(ball5.getId() == ballId){
                ball5.interrupt();
              
              //  System.out.println(ball5.isInterrupted());
        }
    }   
}
