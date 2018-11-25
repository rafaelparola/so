/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameController;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.Cell;

/**
 *
 * @author rafael
 */
public class Board extends javax.swing.JFrame {

                GameController gameController = new GameController();
                private ArrayList<Cell> cells = new ArrayList<Cell>();
    
                Cell cell1 = new Cell();
		Cell cell2 = new Cell();
		Cell cell3 = new Cell();
		Cell cell4 = new Cell();
		Cell cell5 = new Cell();
		Cell cell6 = new Cell();
		Cell cell7 = new Cell();
		Cell cell8 = new Cell();
		Cell cell9 = new Cell();
		Cell cell10 = new Cell();
		Cell cell11 = new Cell();
		Cell cell12 = new Cell();
		Cell cell13 = new Cell();
		Cell cell14 = new Cell();
		Cell cell15 = new Cell();
		Cell cell16 = new Cell();
		Cell cell17 = new Cell();
		Cell cell18 = new Cell();
		Cell cell19 = new Cell();
		Cell cell20 = new Cell();
		Cell cell21 = new Cell();
		Cell cell22 = new Cell();
		Cell cell23 = new Cell();
		Cell cell24 = new Cell();
		Cell cell25 = new Cell();
		Cell cell26 = new Cell();
		Cell cell27 = new Cell();
		Cell cell28 = new Cell();
		Cell cell29 = new Cell();
		Cell cell30 = new Cell();
		Cell cell31 = new Cell();
		Cell cell32 = new Cell();
		Cell cell33 = new Cell();
		Cell cell34 = new Cell();
		Cell cell35 = new Cell();
		Cell cell36 = new Cell();
		Cell cell37 = new Cell();
		Cell cell38 = new Cell();
		Cell cell39 = new Cell();
		Cell cell40 = new Cell();
		Cell cell41 = new Cell();
		Cell cell42 = new Cell();
		Cell cell43 = new Cell();
		Cell cell44 = new Cell();
		Cell cell45 = new Cell();
		Cell cell46 = new Cell();
		Cell cell47 = new Cell();
		Cell cell48 = new Cell();
		Cell cell49 = new Cell();
		Cell cell50 = new Cell();
		Cell cell51 = new Cell();
		Cell cell52 = new Cell();
		Cell cell53 = new Cell();
		Cell cell54 = new Cell();
		Cell cell55 = new Cell();
		Cell cell56 = new Cell();
		Cell cell57 = new Cell();
		Cell cell58 = new Cell();
		Cell cell59 = new Cell();
		Cell cell60 = new Cell();
		Cell cell61 = new Cell();
		Cell cell62 = new Cell();
		Cell cell63 = new Cell();
		Cell cell64 = new Cell();
		Cell cell65 = new Cell();
		Cell cell66 = new Cell();
		Cell cell67 = new Cell();
		Cell cell68 = new Cell();
		Cell cell69 = new Cell();
		Cell cell70 = new Cell();
		Cell cell71 = new Cell();
		Cell cell72 = new Cell();
		Cell cell73 = new Cell();
		Cell cell74 = new Cell();
		Cell cell75 = new Cell();
		Cell cell76 = new Cell();
		Cell cell77 = new Cell();
		Cell cell78 = new Cell();
		Cell cell79 = new Cell();
		Cell cell80 = new Cell();
		Cell cell81 = new Cell();
		Cell cell82 = new Cell();
		Cell cell83 = new Cell();
		Cell cell84 = new Cell();
		Cell cell85 = new Cell();
		Cell cell86 = new Cell();
		Cell cell87 = new Cell();
		Cell cell88 = new Cell();
		Cell cell89 = new Cell();
		Cell cell90 = new Cell();
		Cell cell91 = new Cell();
		Cell cell92 = new Cell();
		Cell cell93 = new Cell();
		Cell cell94 = new Cell();
		Cell cell95 = new Cell();
		Cell cell96 = new Cell();
		Cell cell97 = new Cell();
		Cell cell98 = new Cell();
		Cell cell99 = new Cell();
		Cell cell100 = new Cell();
    
    /**
     * Creates new form Board
     */
    public Board() {
        initComponents();
       
                                 /*Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
				.getScaledInstance(pos1.getWidth(), pos1.getHeight(), Image.SCALE_SMOOTH);
                                ImageIcon imageIcon = new ImageIcon(iconLogo);*/
        
        cells.add(cell1);
        cells.add(cell2);
        cells.add(cell3);
        cells.add(cell4);
        cells.add(cell5);
        cells.add(cell6);
        cells.add(cell7);
        cells.add(cell8);
        cells.add(cell9);
        cells.add(cell10);
        
        cells.add(cell11);
        cells.add(cell12);
        cells.add(cell13);
        cells.add(cell14);
        cells.add(cell15);
        cells.add(cell16);
        cells.add(cell17);
        cells.add(cell18);
        cells.add(cell19);
        cells.add(cell20);
        
        cells.add(cell21);
        cells.add(cell22);
        cells.add(cell23);
        cells.add(cell24);
        cells.add(cell25);
        cells.add(cell26);
        cells.add(cell27);
        cells.add(cell28);
        cells.add(cell29);
        cells.add(cell30);
        
        cells.add(cell31);
        cells.add(cell32);
        cells.add(cell33);
        cells.add(cell34);
        cells.add(cell35);
        cells.add(cell36);
        cells.add(cell37);
        cells.add(cell38);
        cells.add(cell39);
        cells.add(cell40);
        
        cells.add(cell41);
        cells.add(cell42);
        cells.add(cell43);
        cells.add(cell44);
        cells.add(cell45);
        cells.add(cell46);
        cells.add(cell47);
        cells.add(cell48);
        cells.add(cell49);
        cells.add(cell50);
        
        cells.add(cell51);
        cells.add(cell52);
        cells.add(cell53);
        cells.add(cell54);
        cells.add(cell55);
        cells.add(cell56);
        cells.add(cell57);
        cells.add(cell58);
        cells.add(cell59);
        cells.add(cell60);
        
        cells.add(cell61);
        cells.add(cell62);
        cells.add(cell63);
        cells.add(cell64);
        cells.add(cell65);
        cells.add(cell66);
        cells.add(cell67);
        cells.add(cell68);
        cells.add(cell69);
        cells.add(cell70);
        
        cells.add(cell71);
        cells.add(cell72);
        cells.add(cell73);
        cells.add(cell74);
        cells.add(cell75);
        cells.add(cell76);
        cells.add(cell77);
        cells.add(cell78);
        cells.add(cell79);
        cells.add(cell80);
        
        cells.add(cell81);
        cells.add(cell82);
        cells.add(cell83);
        cells.add(cell84);
        cells.add(cell85);
        cells.add(cell86);
        cells.add(cell87);
        cells.add(cell88);
        cells.add(cell89);
        cells.add(cell90);
        
        cells.add(cell91);
        cells.add(cell92);
        cells.add(cell93);
        cells.add(cell94);
        cells.add(cell95);
        cells.add(cell96);
        cells.add(cell97);
        cells.add(cell98);
        cells.add(cell99);
        cells.add(cell100);
        gameController.insertBalls(cells);
       
        this.timeCounter();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B26 = new javax.swing.JButton();
        B40 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        B35 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        B29 = new javax.swing.JButton();
        B30 = new javax.swing.JButton();
        B36 = new javax.swing.JButton();
        B37 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        B38 = new javax.swing.JButton();
        B34 = new javax.swing.JButton();
        B39 = new javax.swing.JButton();
        B46 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        B47 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        B48 = new javax.swing.JButton();
        B49 = new javax.swing.JButton();
        B50 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        B41 = new javax.swing.JButton();
        B42 = new javax.swing.JButton();
        B43 = new javax.swing.JButton();
        B44 = new javax.swing.JButton();
        B45 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });

        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });

        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        B11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B11MouseClicked(evt);
            }
        });

        B12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B12MouseClicked(evt);
            }
        });

        B13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B13MouseClicked(evt);
            }
        });

        B14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B14MouseClicked(evt);
            }
        });

        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });

        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B10MouseClicked(evt);
            }
        });

        B16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B16MouseClicked(evt);
            }
        });

        B17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B17MouseClicked(evt);
            }
        });

        B18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B18MouseClicked(evt);
            }
        });

        B19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B19MouseClicked(evt);
            }
        });

        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });

        B15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B15MouseClicked(evt);
            }
        });

        B26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B26MouseClicked(evt);
            }
        });

        B40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B40MouseClicked(evt);
            }
        });

        B27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B27MouseClicked(evt);
            }
        });

        B35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B35MouseClicked(evt);
            }
        });

        B28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B28MouseClicked(evt);
            }
        });

        B29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B29MouseClicked(evt);
            }
        });

        B30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B30MouseClicked(evt);
            }
        });

        B36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B36MouseClicked(evt);
            }
        });

        B37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B37MouseClicked(evt);
            }
        });

        B21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B21MouseClicked(evt);
            }
        });

        B22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B22MouseClicked(evt);
            }
        });

        B23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B23MouseClicked(evt);
            }
        });

        B24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B24MouseClicked(evt);
            }
        });

        B25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B25MouseClicked(evt);
            }
        });

        B31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B31MouseClicked(evt);
            }
        });

        B32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B32MouseClicked(evt);
            }
        });

        B33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B33MouseClicked(evt);
            }
        });

        B38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B38MouseClicked(evt);
            }
        });

        B34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B34MouseClicked(evt);
            }
        });

        B39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B39MouseClicked(evt);
            }
        });

        B46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B46MouseClicked(evt);
            }
        });

        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton42MouseClicked(evt);
            }
        });

        B47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B47MouseClicked(evt);
            }
        });

        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton44MouseClicked(evt);
            }
        });

        B48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B48MouseClicked(evt);
            }
        });

        B49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B49MouseClicked(evt);
            }
        });

        B50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B50MouseClicked(evt);
            }
        });

        jButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton48MouseClicked(evt);
            }
        });

        jButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton49MouseClicked(evt);
            }
        });

        B41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B41MouseClicked(evt);
            }
        });

        B42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B42MouseClicked(evt);
            }
        });

        B43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B43MouseClicked(evt);
            }
        });

        B44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B44MouseClicked(evt);
            }
        });

        B45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B45MouseClicked(evt);
            }
        });

        jButton55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton55MouseClicked(evt);
            }
        });

        jButton56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton56MouseClicked(evt);
            }
        });

        jButton57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton57MouseClicked(evt);
            }
        });

        jButton58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton58MouseClicked(evt);
            }
        });

        jButton59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton59MouseClicked(evt);
            }
        });

        jButton60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton60MouseClicked(evt);
            }
        });

        jButton61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton61MouseClicked(evt);
            }
        });

        jButton62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton62MouseClicked(evt);
            }
        });

        jButton63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton63MouseClicked(evt);
            }
        });

        jButton64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton64MouseClicked(evt);
            }
        });

        jButton65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton65MouseClicked(evt);
            }
        });

        jButton66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton66MouseClicked(evt);
            }
        });

        jButton67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton67MouseClicked(evt);
            }
        });

        jButton68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton68MouseClicked(evt);
            }
        });

        jButton69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton69MouseClicked(evt);
            }
        });

        jButton70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton70MouseClicked(evt);
            }
        });

        jButton71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton71MouseClicked(evt);
            }
        });

        jButton72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton72MouseClicked(evt);
            }
        });

        jButton73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton73MouseClicked(evt);
            }
        });

        jButton74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton74MouseClicked(evt);
            }
        });

        jButton75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton75MouseClicked(evt);
            }
        });

        jButton76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton76MouseClicked(evt);
            }
        });

        jButton77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton77MouseClicked(evt);
            }
        });

        jButton78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton78MouseClicked(evt);
            }
        });

        jButton79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton79MouseClicked(evt);
            }
        });

        jButton80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton80MouseClicked(evt);
            }
        });

        jButton81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton81MouseClicked(evt);
            }
        });

        jButton82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton82MouseClicked(evt);
            }
        });

        jButton83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton83MouseClicked(evt);
            }
        });

        jButton84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton84MouseClicked(evt);
            }
        });

        jButton85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton85MouseClicked(evt);
            }
        });

        jButton86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton86MouseClicked(evt);
            }
        });

        jButton87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton87MouseClicked(evt);
            }
        });

        jButton88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton88MouseClicked(evt);
            }
        });

        jButton89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton89MouseClicked(evt);
            }
        });

        jButton90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton90MouseClicked(evt);
            }
        });

        jButton91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton91MouseClicked(evt);
            }
        });

        jButton92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton92MouseClicked(evt);
            }
        });

        jButton93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton93MouseClicked(evt);
            }
        });

        jButton94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton94MouseClicked(evt);
            }
        });

        jButton95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton95MouseClicked(evt);
            }
        });

        jButton96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton96MouseClicked(evt);
            }
        });

        jButton97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton97MouseClicked(evt);
            }
        });

        jButton98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton98MouseClicked(evt);
            }
        });

        jButton99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton99MouseClicked(evt);
            }
        });

        jButton100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton100MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        cells.get(0).killBall(cells.get(0).getBallId());//cell1.killBall(cells.get().getBallId());
    }//GEN-LAST:event_B1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        cells.get(1).killBall(cells.get(1).getBallId());
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        cells.get(2).killBall(cells.get(2).getBallId());
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        cells.get(3).killBall(cells.get(3).getBallId());
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
       cells.get(4).killBall(cells.get(4).getBallId());
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        cells.get(5).killBall(cells.get(5).getBallId());
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
       cells.get(6).killBall(cells.get(6).getBallId());
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        cells.get(7).killBall(cells.get(7).getBallId());
    }//GEN-LAST:event_B8MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        cells.get(8).killBall(cells.get(8).getBallId());
    }//GEN-LAST:event_B9MouseClicked

    private void B10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseClicked
        cells.get(9).killBall(cells.get(9).getBallId());
    }//GEN-LAST:event_B10MouseClicked

    private void B11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B11MouseClicked
        cells.get(10).killBall(cells.get(10).getBallId());
    }//GEN-LAST:event_B11MouseClicked

    private void B12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B12MouseClicked
        cells.get(11).killBall(cells.get(11).getBallId());
    }//GEN-LAST:event_B12MouseClicked

    private void B13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B13MouseClicked
        cells.get(12).killBall(cells.get(12).getBallId());
    }//GEN-LAST:event_B13MouseClicked

    private void B14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B14MouseClicked
        cells.get(13).killBall(cells.get(13).getBallId());
    }//GEN-LAST:event_B14MouseClicked

    private void B15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B15MouseClicked
        cells.get(14).killBall(cells.get(14).getBallId());
    }//GEN-LAST:event_B15MouseClicked

    private void B16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B16MouseClicked
       cells.get(15).killBall(cells.get(15).getBallId());
    }//GEN-LAST:event_B16MouseClicked

    private void B17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B17MouseClicked
        cells.get(16).killBall(cells.get(16).getBallId());
    }//GEN-LAST:event_B17MouseClicked

    private void B18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B18MouseClicked
        cells.get(17).killBall(cells.get(17).getBallId());
    }//GEN-LAST:event_B18MouseClicked

    private void B19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B19MouseClicked
        cells.get(18).killBall(cells.get(18).getBallId());
    }//GEN-LAST:event_B19MouseClicked

    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
        cells.get(19).killBall(cells.get(19).getBallId());
    }//GEN-LAST:event_B20ActionPerformed

    private void B21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B21MouseClicked
        cells.get(20).killBall(cells.get(20).getBallId());
    }//GEN-LAST:event_B21MouseClicked

    private void B22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B22MouseClicked
        cells.get(21).killBall(cells.get(21).getBallId());
    }//GEN-LAST:event_B22MouseClicked

    private void B23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B23MouseClicked
        cells.get(22).killBall(cells.get(22).getBallId());
    }//GEN-LAST:event_B23MouseClicked

    private void B24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B24MouseClicked
        cells.get(23).killBall(cells.get(23).getBallId());
    }//GEN-LAST:event_B24MouseClicked

    private void B25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B25MouseClicked
        cells.get(24).killBall(cells.get(24).getBallId());
    }//GEN-LAST:event_B25MouseClicked

    private void B26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B26MouseClicked
        cells.get(25).killBall(cells.get(25).getBallId());
    }//GEN-LAST:event_B26MouseClicked

    private void B27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B27MouseClicked
        cells.get(26).killBall(cells.get(26).getBallId());
    }//GEN-LAST:event_B27MouseClicked

    private void B28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B28MouseClicked
        cells.get(27).killBall(cells.get(27).getBallId());
    }//GEN-LAST:event_B28MouseClicked

    private void B29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B29MouseClicked
        cells.get(28).killBall(cells.get(28).getBallId());
    }//GEN-LAST:event_B29MouseClicked

    private void B30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B30MouseClicked
        cells.get(29).killBall(cells.get(29).getBallId());
    }//GEN-LAST:event_B30MouseClicked

    private void B31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B31MouseClicked
        cells.get(30).killBall(cells.get(30).getBallId());
    }//GEN-LAST:event_B31MouseClicked

    private void B32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B32MouseClicked
        cells.get(31).killBall(cells.get(31).getBallId());
    }//GEN-LAST:event_B32MouseClicked

    private void B33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B33MouseClicked
     cells.get(32).killBall(cells.get(32).getBallId());
    }//GEN-LAST:event_B33MouseClicked

    private void B34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B34MouseClicked
        cells.get(33).killBall(cells.get(33).getBallId());
    }//GEN-LAST:event_B34MouseClicked

    private void B35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B35MouseClicked
        cells.get(34).killBall(cells.get(34).getBallId());
    }//GEN-LAST:event_B35MouseClicked

    private void B36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B36MouseClicked
        cells.get(35).killBall(cells.get(35).getBallId());
    }//GEN-LAST:event_B36MouseClicked

    private void B37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B37MouseClicked
        cells.get(36).killBall(cells.get(36).getBallId());
    }//GEN-LAST:event_B37MouseClicked

    private void B38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B38MouseClicked
        cells.get(37).killBall(cells.get(37).getBallId());
    }//GEN-LAST:event_B38MouseClicked

    private void B39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B39MouseClicked
       cells.get(38).killBall(cells.get(38).getBallId());
    }//GEN-LAST:event_B39MouseClicked

    private void B40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B40MouseClicked
        cells.get(39).killBall(cells.get(39).getBallId());
    }//GEN-LAST:event_B40MouseClicked

    private void B41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B41MouseClicked
        cells.get(40).killBall(cells.get(40).getBallId());
    }//GEN-LAST:event_B41MouseClicked

    private void B42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B42MouseClicked
        cells.get(41).killBall(cells.get(41).getBallId());
    }//GEN-LAST:event_B42MouseClicked

    private void B43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B43MouseClicked
        cells.get(42).killBall(cells.get(42).getBallId());
    }//GEN-LAST:event_B43MouseClicked

    private void B44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B44MouseClicked
        cells.get(43).killBall(cells.get(43).getBallId());
    }//GEN-LAST:event_B44MouseClicked

    private void B45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B45MouseClicked
        cells.get(44).killBall(cells.get(44).getBallId());
    }//GEN-LAST:event_B45MouseClicked

    private void B46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B46MouseClicked
        cells.get(45).killBall(cells.get(45).getBallId());
    }//GEN-LAST:event_B46MouseClicked

    private void B47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B47MouseClicked
        cells.get(46).killBall(cells.get(46).getBallId());
    }//GEN-LAST:event_B47MouseClicked

    private void B48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B48MouseClicked
        cells.get(47).killBall(cells.get(47).getBallId());
    }//GEN-LAST:event_B48MouseClicked

    private void B49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B49MouseClicked
        cells.get(48).killBall(cells.get(48).getBallId());
    }//GEN-LAST:event_B49MouseClicked

    private void B50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B50MouseClicked
        cells.get(49).killBall(cells.get(49).getBallId());
    }//GEN-LAST:event_B50MouseClicked

    private void jButton55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton55MouseClicked
        cells.get(50).killBall(cells.get(50).getBallId());
    }//GEN-LAST:event_jButton55MouseClicked

    private void jButton56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton56MouseClicked
       cells.get(51).killBall(cells.get(51).getBallId());
    }//GEN-LAST:event_jButton56MouseClicked

    private void jButton57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton57MouseClicked
        cells.get(52).killBall(cells.get(52).getBallId());
    }//GEN-LAST:event_jButton57MouseClicked

    private void jButton59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton59MouseClicked
        cells.get(53).killBall(cells.get(53).getBallId());
    }//GEN-LAST:event_jButton59MouseClicked

    private void jButton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MouseClicked
       cells.get(54).killBall(cells.get(54).getBallId());
    }//GEN-LAST:event_jButton44MouseClicked

    private void jButton48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton48MouseClicked
        cells.get(55).killBall(cells.get(55).getBallId());
    }//GEN-LAST:event_jButton48MouseClicked

    private void jButton49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton49MouseClicked
       cells.get(56).killBall(cells.get(56).getBallId());
    }//GEN-LAST:event_jButton49MouseClicked

    private void jButton58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton58MouseClicked
        cells.get(57).killBall(cells.get(57).getBallId());
    }//GEN-LAST:event_jButton58MouseClicked

    private void jButton60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton60MouseClicked
       cells.get(58).killBall(cells.get(58).getBallId());
    }//GEN-LAST:event_jButton60MouseClicked

    private void jButton42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MouseClicked
        cells.get(59).killBall(cells.get(59).getBallId());
    }//GEN-LAST:event_jButton42MouseClicked

    private void jButton70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton70MouseClicked
        cells.get(60).killBall(cells.get(60).getBallId());
    }//GEN-LAST:event_jButton70MouseClicked

    private void jButton71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton71MouseClicked
       cells.get(61).killBall(cells.get(61).getBallId());
    }//GEN-LAST:event_jButton71MouseClicked

    private void jButton72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton72MouseClicked
       cells.get(62).killBall(cells.get(62).getBallId());
    }//GEN-LAST:event_jButton72MouseClicked

    private void jButton73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton73MouseClicked
      cells.get(63).killBall(cells.get(63).getBallId());
    }//GEN-LAST:event_jButton73MouseClicked

    private void jButton74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton74MouseClicked
       cells.get(64).killBall(cells.get(64).getBallId());
    }//GEN-LAST:event_jButton74MouseClicked

    private void jButton61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton61MouseClicked
       cells.get(65).killBall(cells.get(65).getBallId());
    }//GEN-LAST:event_jButton61MouseClicked

    private void jButton63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton63MouseClicked
       cells.get(66).killBall(cells.get(66).getBallId());
    }//GEN-LAST:event_jButton63MouseClicked

    private void jButton65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton65MouseClicked
        cells.get(67).killBall(cells.get(67).getBallId());
    }//GEN-LAST:event_jButton65MouseClicked

    private void jButton66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton66MouseClicked
      cells.get(68).killBall(cells.get(68).getBallId());
    }//GEN-LAST:event_jButton66MouseClicked

    private void jButton67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton67MouseClicked
      cells.get(69).killBall(cells.get(69).getBallId());
    }//GEN-LAST:event_jButton67MouseClicked

    private void jButton75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton75MouseClicked
       cells.get(70).killBall(cells.get(70).getBallId());
    }//GEN-LAST:event_jButton75MouseClicked

    private void jButton76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton76MouseClicked
      cells.get(71).killBall(cells.get(71).getBallId());
    }//GEN-LAST:event_jButton76MouseClicked

    private void jButton77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton77MouseClicked
       cells.get(72).killBall(cells.get(72).getBallId());
    }//GEN-LAST:event_jButton77MouseClicked

    private void jButton79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton79MouseClicked
      cells.get(73).killBall(cells.get(73).getBallId());
    }//GEN-LAST:event_jButton79MouseClicked

    private void jButton64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton64MouseClicked
      cells.get(74).killBall(cells.get(74).getBallId());
    }//GEN-LAST:event_jButton64MouseClicked

    private void jButton68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton68MouseClicked
      cells.get(75).killBall(cells.get(75).getBallId());
    }//GEN-LAST:event_jButton68MouseClicked

    private void jButton69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton69MouseClicked
      cells.get(76).killBall(cells.get(76).getBallId());
    }//GEN-LAST:event_jButton69MouseClicked

    private void jButton78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton78MouseClicked
      cells.get(77).killBall(cells.get(77).getBallId());
    }//GEN-LAST:event_jButton78MouseClicked

    private void jButton80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton80MouseClicked
    cells.get(78).killBall(cells.get(78).getBallId());
    }//GEN-LAST:event_jButton80MouseClicked

    private void jButton62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton62MouseClicked
    cells.get(79).killBall(cells.get(79).getBallId());
    }//GEN-LAST:event_jButton62MouseClicked

    private void jButton90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton90MouseClicked
    cells.get(80).killBall(cells.get(80).getBallId());
    }//GEN-LAST:event_jButton90MouseClicked

    private void jButton91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton91MouseClicked
     cells.get(81).killBall(cells.get(81).getBallId());
    }//GEN-LAST:event_jButton91MouseClicked

    private void jButton92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton92MouseClicked
     cells.get(82).killBall(cells.get(82).getBallId());
    }//GEN-LAST:event_jButton92MouseClicked

    private void jButton93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton93MouseClicked
     cells.get(83).killBall(cells.get(83).getBallId());
    }//GEN-LAST:event_jButton93MouseClicked

    private void jButton94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton94MouseClicked
      cells.get(84).killBall(cells.get(84).getBallId());
    }//GEN-LAST:event_jButton94MouseClicked

    private void jButton81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton81MouseClicked
      cells.get(85).killBall(cells.get(85).getBallId());
    }//GEN-LAST:event_jButton81MouseClicked

    private void jButton83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton83MouseClicked
     gameController.killBall(cells.get(86).getBallId());
    }//GEN-LAST:event_jButton83MouseClicked

    private void jButton85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton85MouseClicked
     gameController.killBall(cells.get(87).getBallId());
    }//GEN-LAST:event_jButton85MouseClicked

    private void jButton86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton86MouseClicked
     gameController.killBall(cells.get(88).getBallId());
    }//GEN-LAST:event_jButton86MouseClicked

    private void jButton87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton87MouseClicked
      gameController.killBall(cells.get(89).getBallId());
    }//GEN-LAST:event_jButton87MouseClicked

    private void jButton95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton95MouseClicked
     gameController.killBall(cells.get(90).getBallId());
    }//GEN-LAST:event_jButton95MouseClicked

    private void jButton96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton96MouseClicked
     gameController.killBall(cells.get(91).getBallId());
    }//GEN-LAST:event_jButton96MouseClicked

    private void jButton97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton97MouseClicked
       gameController.killBall(cells.get(92).getBallId());
    }//GEN-LAST:event_jButton97MouseClicked

    private void jButton99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton99MouseClicked
      gameController.killBall(cells.get(93).getBallId());
    }//GEN-LAST:event_jButton99MouseClicked

    private void jButton84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton84MouseClicked
       gameController.killBall(cells.get(94).getBallId());
    }//GEN-LAST:event_jButton84MouseClicked

    private void jButton88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton88MouseClicked
      gameController.killBall(cells.get(95).getBallId());
    }//GEN-LAST:event_jButton88MouseClicked

    private void jButton89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton89MouseClicked
      gameController.killBall(cells.get(96).getBallId());
    }//GEN-LAST:event_jButton89MouseClicked

    private void jButton98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton98MouseClicked
     gameController.killBall(cells.get(97).getBallId());
    }//GEN-LAST:event_jButton98MouseClicked

    private void jButton100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton100MouseClicked
      gameController.killBall(cells.get(98).getBallId());
    }//GEN-LAST:event_jButton100MouseClicked

    private void jButton82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton82MouseClicked
      gameController.killBall(cells.get(99).getBallId());
    }//GEN-LAST:event_jButton82MouseClicked

    public void timeCounter(){
        int delay = 1000*2; //milliseconds
     ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
          cells = gameController.insertBalls(cells);
          verifyCells();
          
          
          
      }
  };
  new Timer(delay, taskPerformer).start();
    }
    
    public void verifyCells(){
        
        if(cells.get(0).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B1.getWidth(), B1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B1.setText("O");
            pack();
            repaint();
        }else{B1.setText("");}
        if(cells.get(1).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B2.getWidth(), B2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B2.setText("O");
            pack();
            repaint();
        }else{B2.setText("");}
        if(cells.get(2).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B3.setText("O");
            pack();
            repaint();
        }else{B3.setText("");}
        if(cells.get(3).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B4.getWidth(), B4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B4.setText("O");
            pack();
            repaint();
        }else{B4.setText("");}
        if(cells.get(4).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B5.setText("O");
            pack();
            repaint();
        }else{B5.setText("");}
        if(cells.get(5).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B6.setText("O");
            pack();
            repaint();
        }else{B6.setText("");}
        if(cells.get(6).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B7.setText("O");
            pack();
            repaint();
        }else{B7.setText("");}
        if(cells.get(7).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B8.setText("O");
            pack();
            repaint();
        }else{B8.setText("");}
        if(cells.get(8).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B9.setText("O");
            pack();
            repaint();
        }else{B9.setText("");}
        if(cells.get(9).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B10.setText("O");
            pack();
            repaint();
        }else{B10.setText("");}
        if(cells.get(10).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B11.setText("O");
            pack();
            repaint();
        }else{B11.setText("");}
        if(cells.get(11).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B12.setText("O");
            pack();
            repaint();
        }else{B12.setText("");}
        if(cells.get(12).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B13.setText("O");
            pack();
            repaint();
        }else{B13.setText("");}
        if(cells.get(13).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B14.setText("O");
            pack();
            repaint();
        }else{B14.setText("");}
        if(cells.get(14).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B15.setText("O");
            pack();
            repaint();
        }else{B15.setText("");}
        if(cells.get(15).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B16.setText("O");
            pack();
            repaint();
        }else{B16.setText("");}
        if(cells.get(16).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B17.setText("O");
            pack();
            repaint();
        }else{B17.setText("");}
        if(cells.get(17).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B18.setText("O");
            pack();
            repaint();
        }else{B18.setText("");}
        if(cells.get(18).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B19.setText("O");
            pack();
            repaint();
        }else{B19.setText("");}
        if(cells.get(19).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B20.setText("O");
            pack();
            repaint();
        }else{B20.setText("");}
        if(cells.get(20).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B21.setText("O");
            pack();
            repaint();
        }else{B21.setText("");}
        if(cells.get(21).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B22.setText("O");
            pack();
            repaint();
        }else{B22.setText("");}
        if(cells.get(22).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B23.setText("O");
            pack();
            repaint();
  
        }else{B23.setText("");}
        if(cells.get(23).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B24.setText("O");
            pack();
            repaint();

        }else{B24.setText("");}
        if(cells.get(24).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B25.setText("O");
            pack();
            repaint();
        }else{B25.setText("");}
        if(cells.get(25).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B26.setText("O");
            pack();
            repaint();
        }else{B26.setText("");}
        if(cells.get(26).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B27.setText("O");
            pack();
            repaint();
        }else{B27.setText("");}
        if(cells.get(27).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B28.setText("O");
            pack();
            repaint();
        }else{B28.setText("");}
        if(cells.get(28).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B29.setText("O");
            pack();
            repaint();
        }else{B29.setText("");}
        if(cells.get(29).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B30.setText("O");
            pack();
            repaint();
        }else{B30.setText("");}
        if(cells.get(30).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B31.setText("O");
            pack();
            repaint();
        }else{B31.setText("");}
        if(cells.get(31).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B32.setText("O");
            pack();
            repaint();
        }else{B32.setText("");}
        if(cells.get(32).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B33.setText("O");
            pack();
            repaint();
        }else{B33.setText("");}
        if(cells.get(33).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B34.setText("O");
            pack();
            repaint();
        }else{B34.setText("");}
        if(cells.get(34).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B35.setText("O");
            pack();
            repaint();
        }else{B35.setText("");}
        if(cells.get(35).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B36.setText("O");
            pack();
            repaint();
        }else{B36.setText("");}
        if(cells.get(36).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B37.setText("O");
            pack();
            repaint();
        }else{B37.setText("");
        if(cells.get(37).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B38.setText("O");
            pack();
            repaint();
        }else{B38.setText("");}
        if(cells.get(38).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B39.setText("O");
            pack();
            repaint();
        }else{B39.setText("");}
        if(cells.get(39).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B40.setText("O");
            pack();
            repaint();
        }else{B40.setText("");}
        if(cells.get(40).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B41.setText("O");
            pack();
            repaint();
        }else{B41.setText("");}
        if(cells.get(41).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B42.setText("O");
            pack();
            repaint();
        }else{B42.setText("");}
        if(cells.get(42).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B43.setText("O");
            pack();
            repaint();
        }else{B43.setText("");}
        if(cells.get(43).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B44.setText("O");
            pack();
            repaint();
        }else{B44.setText("");}
        if(cells.get(44).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B45.setText("O");
            pack();
            repaint();
        }else{B45.setText("");}
        if(cells.get(45).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B46.setText("O");
            pack();
            repaint();
        }else{B46.setText("");}
        if(cells.get(46).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B47.setText("O");
            pack();
            repaint();
        }else{B47.setText("");}
        if(cells.get(47).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B48.setText("O");
            pack();
            repaint();
        }else{B48.setText("");}
        if(cells.get(48).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B49.setText("O");
            pack();
            repaint();
        }else{B49.setText("");}
        if(cells.get(49).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            B50.setText("O");
            pack();
            repaint();
        }else{B50.setText("");}
        if(cells.get(50).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton55.setText("O");
            pack();
            repaint();
        }else{jButton55.setText("");}
        if(cells.get(51).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton56.setText("O");
            pack();
            repaint();
        }else{jButton56.setText("");}
        if(cells.get(52).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton57.setText("O");
            pack();
            repaint();
        }else{jButton57.setText("");}
        if(cells.get(53).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton59.setText("O");
            pack();
            repaint();
        }else{jButton59.setText("");}
        if(cells.get(54).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton44.setText("O");
            pack();
            repaint();
        }else{jButton44.setText("");}
        if(cells.get(55).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton48.setText("O");
            pack();
            repaint();
        }else{jButton48.setText("");}
        if(cells.get(56).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton49.setText("O");
            pack();
            repaint();
        }else{jButton49.setText("");}
        if(cells.get(57).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton58.setText("O");
            pack();
            repaint();
        }else{jButton58.setText("");}
        if(cells.get(58).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton60.setText("O");
            pack();
            repaint();
        }else{jButton60.setText("");}
        if(cells.get(59).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton42.setText("O");
            pack();
            repaint();
        }else{jButton42.setText("");}
        if(cells.get(60).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton70.setText("O");
            pack();
            repaint();
        }else{jButton70.setText("");}
        if(cells.get(61).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton71.setText("O");
            pack();
            repaint();
        }else{jButton71.setText("");}
        if(cells.get(62).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton72.setText("O");
            pack();
            repaint();
        }else{jButton72.setText("");}
        if(cells.get(63).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton73.setText("O");
            pack();
            repaint();
        }else{jButton73.setText("");}
        if(cells.get(64).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton74.setText("O");
            pack();
            repaint();
        }else{jButton74.setText("");}
        if(cells.get(65).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton61.setText("O");
            pack();
            repaint();
        }else{jButton61.setText("");}
        if(cells.get(66).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton63.setText("O");
            pack();
            repaint();
        }else{jButton63.setText("");}
        if(cells.get(67).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton65.setText("O");
            pack();
            repaint();
        }else{jButton65.setText("");}
        if(cells.get(68).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton66.setText("O");
            pack();
            repaint();
        }else{jButton66.setText("");}
        if(cells.get(69).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton67.setText("O");
            pack();
            repaint();
        }else{jButton67.setText("");}
        if(cells.get(70).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton75.setText("O");
            pack();
            repaint();
        }else{jButton75.setText("");}
        if(cells.get(71).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton76.setText("O");
            pack();
            repaint();
        }else{jButton76.setText("");}
        if(cells.get(72).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton77.setText("O");
            pack();
            repaint();
        }else{jButton77.setText("");}
        if(cells.get(73).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton79.setText("O");
            pack();
            repaint();
        }else{jButton79.setText("");}
        if(cells.get(74).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton64.setText("O");
            pack();
            repaint();
        }else{jButton64.setText("");}
        if(cells.get(75).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton68.setText("O");
            pack();
            repaint();
        }else{jButton68.setText("");}
        if(cells.get(76).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton69.setText("O");
            pack();
            repaint();
        }else{jButton69.setText("");}
        if(cells.get(77).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton78.setText("O");
            pack();
            repaint();
        }else{jButton78.setText("");}
        if(cells.get(78).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton80.setText("O");
            pack();
            repaint();
        }else{jButton80.setText("");}
        if(cells.get(79).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton62.setText("O");
            pack();
            repaint();
        }else{jButton62.setText("");}
        if(cells.get(80).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton90.setText("O");
            pack();
            repaint();
        }else{jButton90.setText("");}
        if(cells.get(81).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton91.setText("O");
            pack();
            repaint();
        }else{jButton91.setText("");}
        if(cells.get(82).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton92.setText("O");
            pack();
            repaint();
        }else{jButton92.setText("");}
        if(cells.get(83).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton93.setText("O");
            pack();
            repaint();
        }else{jButton93.setText("");}
        if(cells.get(84).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton94.setText("O");
            pack();
            repaint();
        }else{jButton94.setText("");}
        if(cells.get(85).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton81.setText("O");
            pack();
            repaint();
        }else{jButton81.setText("");}
        if(cells.get(86).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton83.setText("O");
            pack();
            repaint();
        }else{jButton83.setText("");}
        if(cells.get(87).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton85.setText("O");
            pack();
            repaint();
        }else{jButton85.setText("");}
        if(cells.get(88).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton86.setText("O");
            pack();
            repaint();
        }else{jButton86.setText("");}
        if(cells.get(89).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton87.setText("O");
            pack();
            repaint();
        }else{jButton87.setText("");}
        if(cells.get(90).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton95.setText("O");
            pack();
            repaint();
        }else{jButton95.setText("");}
        if(cells.get(91).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton96.setText("O");
            pack();
            repaint();
        }else{jButton96.setText("");}
        if(cells.get(92).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton97.setText("O");
            pack();
            repaint();
        }else{jButton97.setText("");}
        if(cells.get(93).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton99.setText("O");
        }else{jButton99.setText("");}
        if(cells.get(94).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton84.setText("O");
            pack();
            repaint();
            jButton84.setText("O");
        }else{jButton84.setText("");}
        if(cells.get(95).isAvailable() ==false){
//            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
//            .getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH);
//            ImageIcon imageIcon = new ImageIcon(iconLogo);
//            jButton88.setText("O");
//            pack();
//            repaint();
              jButton88.setText("O");
        }else{jButton88.setText("");}
        if(cells.get(96).isAvailable() ==false){
//            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
//            .getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH);
//            ImageIcon imageIcon = new ImageIcon(iconLogo);
//            jButton89.setText("O");
//            pack();
//            repaint();
              jButton89.setText("O");
        }else{jButton89.setText("");}
        if(cells.get(97).isAvailable() ==false){
//            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
//            .getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH);
//            ImageIcon imageIcon = new ImageIcon(iconLogo);
//            jButton98.setText("O");
//            pack();
//            repaint();

                jButton98.setText("O");
        }else{jButton98.setText("");}
        if(cells.get(98).isAvailable() ==false){
            Image iconLogo = new ImageIcon("imagens/ball.jpg").getImage()
            .getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton100.setText("O");
            pack();
            repaint();
            jButton100.setText("O");
        }else{jButton100.setText("");}
        
        //cells.get(99).setAvailable(false);
        if(cells.get(99).isAvailable() ==false){
            /*Image iconLogo = new ImageIcon("imagens/ball.png").getImage()
            .getScaledInstance(jButton82.getWidth(), jButton82.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(iconLogo);
            jButton82.setText("O");
            pack();
            repaint();
            JOptionPane.showMessageDialog(null, cells.get(99).isAvailable() ==false);*/
            jButton82.setText("O");
        }else{jButton82.setText("");}
        
        
    }}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B17;
    private javax.swing.JButton B18;
    private javax.swing.JButton B19;
    private javax.swing.JButton B2;
    private javax.swing.JButton B20;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton B23;
    private javax.swing.JButton B24;
    private javax.swing.JButton B25;
    private javax.swing.JButton B26;
    private javax.swing.JButton B27;
    private javax.swing.JButton B28;
    private javax.swing.JButton B29;
    private javax.swing.JButton B3;
    private javax.swing.JButton B30;
    private javax.swing.JButton B31;
    private javax.swing.JButton B32;
    private javax.swing.JButton B33;
    private javax.swing.JButton B34;
    private javax.swing.JButton B35;
    private javax.swing.JButton B36;
    private javax.swing.JButton B37;
    private javax.swing.JButton B38;
    private javax.swing.JButton B39;
    private javax.swing.JButton B4;
    private javax.swing.JButton B40;
    private javax.swing.JButton B41;
    private javax.swing.JButton B42;
    private javax.swing.JButton B43;
    private javax.swing.JButton B44;
    private javax.swing.JButton B45;
    private javax.swing.JButton B46;
    private javax.swing.JButton B47;
    private javax.swing.JButton B48;
    private javax.swing.JButton B49;
    private javax.swing.JButton B5;
    private javax.swing.JButton B50;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    // End of variables declaration//GEN-END:variables
}
