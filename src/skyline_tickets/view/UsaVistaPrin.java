/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skyline_tickets.view;

import skyline_tickets.controller.Controlador_apartado_reportes;



/**
 *
 * @author juans
 */
public class UsaVistaPrin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        ViewApartadoReportes vistap = new ViewApartadoReportes();
        Apartado_reportes vistar = new Apartado_reportes();
        Controlador_apartado_reportes vis = new Controlador_apartado_reportes(vistap,vistar);
        vistap.setVisible(true);
        vistap.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
    }
    
}
