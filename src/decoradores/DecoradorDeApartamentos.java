/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import interfaces.Interface_Apartamento;

public class DecoradorDeApartamentos implements Interface_Apartamento {

    protected Interface_Apartamento objeto;

    public DecoradorDeApartamentos(Interface_Apartamento objeto) {
        this.objeto = objeto;
    }

    @Override
    public String getTipoDeApartamento() {
        return this.objeto.getTipoDeApartamento();
    }

    @Override
    public double getPrecoDoApto() {
        return this.objeto.getPrecoDoApto();
    }
}
