
package com.mycompany.apolo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CuentaAtras implements Runnable{
    
    private boolean activo ;
    private VentanaPrincipal ventana; 
    private int valor;
    private String estado;

    public CuentaAtras(VentanaPrincipal ventana) {
        this.ventana = ventana;
        
        JTextField txtSegundos = ventana.getTxtSegundos();
        valor = Integer.parseInt(txtSegundos.getText());
        estado = "No Iniciado";
    }
    
    

    @Override
    public void run() {
        activo = true;
        JLabel etiSegundos = ventana.getEtiSegundos();
        while(valor>= 0 && activo){
            estado = "Activo";
            etiSegundos.setText(valor+"");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CuentaAtras.class.getName()).log(Level.SEVERE, null, ex);
            }
            valor--;
        }
        if (activo){
            estado = "Completado";
        }else{
            estado = "Cancelado";
        }
        ventana.finCuentaAtras(activo);
    }
    
    public void setActivo(boolean activo ){
        this.activo = activo;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
