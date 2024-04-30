package br.com.ifreela.ifreela.exemplo_jtable;

    import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
    public class ExemploJTable2 {

    public static void main(String[] args) {
        String [] colunas = {"Nome", "Idade", "Sexo", "Endereço", "Vegetariano(a)?"};
        Object [] [] dados = {
            {"José", 18, "M", "Rua B, 12", true},
            {"Maria", 22, "F", "Rua J, 14", true},
            {"JPedro", 19, "M", "Rua K, 122", false}
        };

        JTable table = new JTable(new ExibicapPersonalizadaTableModel(dados, colunas));
        JScrollPane scroll = new JScrollPane(table);
        JFrame tela = new JFrame("Nova Tela");
        tela.setLocationRelativeTo(null);
        tela.getContentPane().add(scroll);
        tela.pack();
        tela.setVisible(true);
    }
}

class ExibicapPersonalizadaTableModel extends AbstractTableModel{
    private Object [][] dados;
    private String [] colunas;
    public ExibicapPersonalizadaTableModel (Object [] [] dados, String [] colunas){
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

    //descobrir qual método podemos usar para tornar as células editaveis e fazer sua implemtação

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 0)
            return true;
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //atuliza dados
        dados[rowIndex][columnIndex] = aValue;
        //atulização gráfica
        fireTableCellUpdated(rowIndex, columnIndex);

    }

}
