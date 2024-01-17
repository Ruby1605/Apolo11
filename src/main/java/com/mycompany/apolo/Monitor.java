
package com.mycompany.apolo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Monitor implements Runnable{
    
    private CuentaAtras cuentaAtras ; 
    private VentanaPrincipal ventana ;

    public Monitor(CuentaAtras cuentaAtras, VentanaPrincipal ventana) {
        this.cuentaAtras = cuentaAtras;
        this.ventana = ventana;
    }

    @Override
    public void run() {
        JLabel etiEstado = ventana.getEtiEstado();
        String estado = cuentaAtras.getEstado();
        while(estado.equals("Activo")|| estado.equals("No Iniciado")){
            etiEstado.setText(cuentaAtras.getEstado());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
            }
            estado= cuentaAtras.getEstado();
        }
      etiEstado.setText(cuentaAtras.getEstado());

    }
    
    
    
}
