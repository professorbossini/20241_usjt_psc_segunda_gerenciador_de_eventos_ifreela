package br.com.bossini._usjt_psc_segunda_projeto_eventos.exemplo_jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class ExemploJTable2 {
  public static void main(String[] args) {
    String [] colunas = {"Nome", "Idade", "Sexo", "Endereço", "Vegetariano(a)?"};
    Object [][] dados = {
      {"José", 18, "M", "Rua B, 12", true},
      {"Maria", 22, "F", "Rua J, 14", true},
      {"Pedro", 19, "M", "Rua K, 122", false}
    };
    JTable tabela = new JTable(new ExibicaoPersonalizadaTableModel(dados, colunas));
    JScrollPane scroll = new JScrollPane(tabela);
    JFrame tela = new JFrame("Nova tabela");
    tela.setLocationRelativeTo(null);
    tela.getContentPane().add(scroll);
    tela.pack();
    tela.setVisible(true);
  }
}

class ExibicaoPersonalizadaTableModel extends AbstractTableModel{
  private Object [][] dados;
  private String [] colunas;
  public ExibicaoPersonalizadaTableModel (Object [][] dados, String [] colunas){
    this.dados = dados;
    this.colunas = colunas;
  }

  @Override
  public int getRowCount() {
    return dados.length;  
  }

  @Override
  public int getColumnCount() {
    return colunas.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    return dados[rowIndex][columnIndex];  
  }

  @Override
  public Class<?> getColumnClass(int columnIndex) {
    return getValueAt(0, columnIndex).getClass();
  }

  @Override
  public String getColumnName(int column) {
    return colunas[column];  
  }
  
  
  //descobrir qual método podemos usar para tornar as células editáveis e fazer a sua implementação
  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    if(columnIndex == 0) 
      return true;  
    return false;
  }
  @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // atualizo dados
    dados[rowIndex][columnIndex] = aValue;
    //atualização gráfica
    fireTableCellUpdated(rowIndex, columnIndex);  
  }
}
