/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skyline_tickets.view;

import javax.swing.JFrame;
import skyline_tickets.controller.Controlador_reportes;
import skyline_tickets.model.ReportesDao;

/**
 *
 * @author juans
 */
public class UsaVista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Apartado_reportes vista = new Apartado_reportes();
        ReportesDao dao = new ReportesDao();
        Controlador_reportes controlador = new Controlador_reportes(vista, dao);
        vista.setVisible(true);
        vista.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
    }
    
}
