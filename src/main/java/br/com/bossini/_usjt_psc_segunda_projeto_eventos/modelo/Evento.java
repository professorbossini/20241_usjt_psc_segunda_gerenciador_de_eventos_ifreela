/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author rodrigo
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
        
    private int codigo;
    private String nome;
    private String descricao;
    private boolean tenhoInteresse;
    private Date dataInicio;
    private Date dataTermino;
    
}
