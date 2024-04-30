package br.com.bossini._usjt_psc_segunda_projeto_eventos.exemplo_jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ExemploJTable1 {
    public static void main(String[] args) {
        String [] colunas = {"id", "Descrição", "Data Inicio", "Data termino"};
        Object [] [] dados = {
            { "1", "Evento 1", "15/06", "18/06"},
            {"2", "Evento 2", "16/06", "19/06"}
        };
        JTable tabela = new JTable (dados, colunas);
        JScrollPane scroll = new JScrollPane(tabela);
        JFrame tela = new JFrame ();
        tela.setLocationRelativeTo(null);
        tela.getContentPane().add(scroll);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);

    }
}
