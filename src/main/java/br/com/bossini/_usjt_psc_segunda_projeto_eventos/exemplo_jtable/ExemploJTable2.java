package br.com.bossini._usjt_psc_segunda_projeto_eventos.exemplo_jtable;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class ExemploJTable2 {
 public static void main(String[] args){
    String [] colunas = {"Nome", "Idade", "Sexo", "Endereço", "Vegetariano(a)?"};
    Object [][] dados = {
        {"josé", 18, "M", "Rua B, 12", true},
        {"Maria", 14, "F", "Rua X, 15", false},
        {"Pedro", 19, "M", "Rua k, 122", true}

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
    private Object [] [] dados;
    private String [] colunas;
    public ExibicaoPersonalizadaTableModel (Object [][] dados, String [] colunas){
        this.dados= dados;
        this.colunas=colunas;
    }
    @Override
    public int getRowCount(){
        return dados.length;
    }
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        return dados [rowIndex] [columnIndex];
    }
    @Override
    public Class <?> getColumnClass(int columnIndex){
        return getValueAt(0, columnIndex).getClass();
    }
    @Override
    public String getColumnName(int column){
        return colunas [column];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        dados[rowIndex] [columnIndex] = aValue;
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}