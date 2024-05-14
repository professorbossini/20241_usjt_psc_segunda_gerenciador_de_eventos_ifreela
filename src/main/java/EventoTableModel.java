/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela.modelo;


import java.util.List;
import br.com.ifreela.ifreela.modelo.Evento;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author 82329522
 */
public class EventoTableModel extends AbstractTableModel {


    private List <Evento> eventos;
    public EventoTableModel(List <Evento> eventos){
        this.eventos = eventos;
    }
    
    @Override
    public int getRowCount() {
        
    }

    @Override
    public int getColumnCount() {
      return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    // Pegar o evento na posição rowIndex
    var evento = eventos.get(rowIndex);
    // Dele, você irá obter nome, descrição ou tenhoInteresse(boolean), dependendo de columnIndex
    if (columnIndex == 0)
        return evento.getNome(); // Retorna o nome do evento
    else if (columnIndex == 1)
        return evento.getDescricao(); // Retorna a descrição do evento
    else
        return evento.isTenhoInteresse(); // Retorna se o usuário tem interesse no evento
}
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       
    }
    
    @Override
    public String getColumnName(int column) {
        
    }

    //descobrir qual método podemos usar para tornar as células editaveis e fazer sua implemtação

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       

    }
    
}
