/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

/**
 *
 * @author 82329522
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
