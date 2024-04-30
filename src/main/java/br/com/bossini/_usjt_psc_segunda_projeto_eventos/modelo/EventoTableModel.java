/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo;

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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pegar o evento na posição rowIndex
        var evento = eventos.get(rowIndex);
        //dele, vc vai pegar o nome, descrição ou tenhoInteresse, dependendo de column
        if (columnIndex == 0)
            return evento.getNome();
        if(columnIndex == 1)
            return evento.getDescricao();
        return evento.isTenhoInteresse();
    }
    
}
