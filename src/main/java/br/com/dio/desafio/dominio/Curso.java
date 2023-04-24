/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

/**
 *
 * @author bruno
 */
public class Curso {
    
    //Atributos
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    //Criado um construtor vazio

    public Curso() {
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    //Criada toString para poder imprimir e ver se ficou certo

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + titulo + ", descri\u00e7\u00e3o=" + descricao + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
}
