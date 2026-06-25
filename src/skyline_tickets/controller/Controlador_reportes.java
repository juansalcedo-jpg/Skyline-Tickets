/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skyline_tickets.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import skyline_tickets.model.ReportesDao;
import skyline_tickets.view.Apartado_reportes;

/**
 *
 * @author juans
 */
public class Controlador_reportes implements ActionListener{
    
    public ReportesDao persona = new ReportesDao();
    public Apartado_reportes vista = new Apartado_reportes();
    DefaultTableModel modelo = new DefaultTableModel();
    CreadorPdf_reportes CrearPdf;
    
    public Controlador_reportes(Apartado_reportes vista, ReportesDao dao) {
        this.vista = vista;
        this.persona = dao;
        this.CrearPdf = new CreadorPdf_reportes();
        this.vista.btnExportar.addActionListener(this);
        cargarTabla();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.btnExportar){
            CrearPdf.setCrearPdf(vista.tabla);
        }
    }

    private void cargarTabla() {
        List datos = persona.listar();
        DefaultTableModel modelo = (DefaultTableModel) vista.tabla.getModel();
        modelo.setRowCount(0);

        for (Object obj : datos) {
            Object[] fila = (Object[]) obj;
            modelo.addRow(fila);
        }
    }
    
}
