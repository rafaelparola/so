/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.GameController;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Cell {
    
	private int id;
	private boolean available = true;
	private long ballId;
        GameController gameController = new GameController();
	
	public void verifyAvailability(){
		if(this.getBallId() == 0L) {
                    this.setAvailable(true);
		}else {
                    this.setAvailable(false);
		}
	}
	public void killBall(long ballId) {
            System.out.println(this.ballId);
            gameController.killBall(this.ballId);
            //jopJOptionPane.showMessageDialog(null, this.ballId);
	}

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return the ballId
     */
    public long getBallId() {
        return ballId;
    }

    /**
     * @param ballId the ballId to set
     */
    public void setBallId(long ballId) {
        this.ballId = ballId;
    }
        
        
}
