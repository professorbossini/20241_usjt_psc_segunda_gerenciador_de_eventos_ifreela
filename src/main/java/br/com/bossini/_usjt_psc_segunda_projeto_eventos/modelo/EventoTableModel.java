/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodrigo
 */
public class EventoTableModel extends AbstractTableModel{
    
    private List <Evento> eventos;
    public EventoTableModel(List <Evento> eventos){
        this.eventos = eventos;
    }

    @Override
    public int getRowCount() {
        return eventos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        if(column == 0)
            return "Nome";
        if(column == 1)
            return "Descrição";
        if(column == 2)
            return "Tem interesse";
        if(column == 3)
            return "Data Início";
        return "Data Término";
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var sdf = new SimpleDateFormat("dd/MM/yyyy (EEEE) - HH:mm:ss");
        //pegar o evento na posição rowIndex
        var evento = eventos.get(rowIndex);
        //dele, vc vai pegar o nome, descrição ou tenhoInteresse, dependendo de column
        if (columnIndex == 0)
            return evento.getNome();
        if(columnIndex == 1)
            return evento.getDescricao();
        if(columnIndex == 2)
            return evento.isTenhoInteresse();
        if(columnIndex == 3)
            return sdf.format(evento.getDataInicio());
        return sdf.format(evento.getDataTermino());
            
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 2)
            return Boolean.class;
        return String.class;        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if(columnIndex == 2)
            eventos.get(rowIndex).setTenhoInteresse((Boolean)aValue);
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    
    
    
    
    
    
}
