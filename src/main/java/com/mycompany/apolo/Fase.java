/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apolo;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Rubén
 */
public class Fase implements Runnable{
    
    private JLabel etiqueta;
    private int tiempo;

    public Fase(JLabel etiqueta , int tiempo){
        this.etiqueta = etiqueta;
        this.tiempo = tiempo;
      
    }
  
    @Override
    public void run() {
        etiqueta.setBackground(Color.red);
        try{
            Thread.sleep(tiempo);
            
        }catch(Exception e){
            
        }
        etiqueta.setBackground(Color.green);

    }
    
}
