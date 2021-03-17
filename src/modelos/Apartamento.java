/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import interfaces.Interface_Apartamento;

public class Apartamento implements Interface_Apartamento{

    private String tipo = "";
    private double preco = 0.0;
    
    public Apartamento(){
        
    }
    
    public Apartamento (String tipo, double preco){
        this.tipo = tipo;
        this.preco = preco;        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
     @Override
    public String getTipoDeApartamento() {
        return this.tipo;
    }

    @Override
    public double getPrecoDoApto() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Apartamento tipo =  " + tipo + "\n" + "Preco apto = " + preco;
    }

   
    
    

    
    
    
    
    
    
    
}
