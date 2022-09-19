/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rvsfara.javafx_patterns_jenkins.state;

/**
 *
 * @author rvsfara
 */
public class Desconectado implements Estado{
    private final String mensagem ="Usuário Desconectado";

    @Override
    public String enviaMensagem() {
        return this.mensagem;
    }

    @Override
    public Boolean conectado() {
        return false;
    }
    @Override
    public String toString() {
        return this.mensagem;
    }
    
}