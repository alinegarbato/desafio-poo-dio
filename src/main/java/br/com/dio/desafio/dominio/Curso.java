/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

/**
 *
 * @author bruno
 */
public class Curso extends Conteudo{
    
    //Atributos
    private int cargaHoraria;
    
    //Criado um construtor vazio

    public Curso() {
    }
    
    
    
    //Métodos getter e setter para poder usar os atributos

        public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    //Criada toString para poder imprimir e ver se ficou certo

    @Override
    public String toString() {
        return "Curso{" + 
                "titulo=" + getTitulo() + '\'' +
                ", descricao=" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria + 
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
}
