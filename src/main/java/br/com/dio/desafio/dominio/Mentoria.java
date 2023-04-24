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
public class Mentoria {
    
    //Atributos
    private String titulo;
    private String descricao;
    private LocalDate data;
    
    //Criado um construtor vazio

    public Mentoria() {
    }
    
    
    //Métodos getter e setter para poder usar os atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    //Criada toString para poder imprimir e ver se ficou certo

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + titulo + ", descri\u00e7\u00e3o=" + descricao + ", data=" + data + '}';
    }
    
}
