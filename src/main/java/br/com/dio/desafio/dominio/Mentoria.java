/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 *
 * @author aline
 */
public class Mentoria extends Conteudo{
    
    //Atributos
    private LocalDate data;
    
    //Criado um construtor vazio

    public Mentoria() {
    }
    
    
    //Métodos getter e setter para poder usar os atributos

    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    //Criada toString para poder imprimir e ver se ficou certo

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
}
