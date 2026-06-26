/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skyline_tickets.view;

import skyline_tickets.controller.Apartado_reportes_Controller;



/**
 *
 * @author juans
 */
public class UsaVistaPrin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        ApartadoReportes_view vistap = new ApartadoReportes_view();
        Apartado_reportes_view vistar = new Apartado_reportes_view();
        Apartado_reportes_Controller vis = new Apartado_reportes_Controller(vistap,vistar);
        vistap.setVisible(true);
        vistap.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
    }
    
}
