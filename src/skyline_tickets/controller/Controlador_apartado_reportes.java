/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skyline_tickets.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import skyline_tickets.view.Apartado_reportes;
import skyline_tickets.view.TipoReportes;
import skyline_tickets.view.ViewApartadoReportes;


/**
 *
 * @author juans
 */
public class Controlador_apartado_reportes implements ActionListener{
    
    public ViewApartadoReportes vista;
    public Apartado_reportes vistaR;
    
    public Controlador_apartado_reportes(ViewApartadoReportes vista, Apartado_reportes vistaR){
        this.vista=vista;
        this.vistaR=vistaR;
        this.vista.Rfinanciero.addActionListener(this);
        this.vista.Roperacional.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.Rfinanciero){
            vista.setVisible(false);
            vistaR.setVisible(true);
            vistaR.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            TipoReportes.tipo = 1;
        }else if(e.getSource() == vista.Roperacional){
            vista.setVisible(false);
            vistaR.setVisible(true);
            vistaR.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            TipoReportes.tipo = 2;
        }
    }
    
    
    
}
