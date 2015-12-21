/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.CopaNews.Entidades;

/**
 *
 * @author hitalo
 */
public class Jogador {
    
    private int id_jogador;
    private String nome;
    private String sobrenome;
    private String apelido;
    private int datanasc_ano;
    private int datanasc_mes;
    private int datanasc_dia;
    private int datanasc_cidade;
    private int aposentado;  //0 para nao, 1 para aposentado
    private String aposenta_data;
    private String altura;
    private String  peso;

    public int getId_jogador() {
        return id_jogador;
    }

    public void setId_jogador(int id_jogador) {
        this.id_jogador = id_jogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getDatanasc_ano() {
        return datanasc_ano;
    }

    public void setDatanasc_ano(int datanasc_ano) {
        this.datanasc_ano = datanasc_ano;
    }

    public int getDatanasc_mes() {
        return datanasc_mes;
    }

    public void setDatanasc_mes(int datanasc_mes) {
        this.datanasc_mes = datanasc_mes;
    }

    public int getDatanasc_dia() {
        return datanasc_dia;
    }

    public void setDatanasc_dia(int datanasc_dia) {
        this.datanasc_dia = datanasc_dia;
    }

    public int getDatanasc_cidade() {
        return datanasc_cidade;
    }

    public void setDatanasc_cidade(int datanasc_cidade) {
        this.datanasc_cidade = datanasc_cidade;
    }

    public int getAposentado() {
        return aposentado;
    }

    public void setAposentado(int aposentado) {
        this.aposentado = aposentado;
    }

    public String getAposenta_data() {
        return aposenta_data;
    }

    public void setAposenta_data(String aposenta_data) {
        this.aposenta_data = aposenta_data;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
       
}
