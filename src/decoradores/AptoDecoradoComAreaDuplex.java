/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import interfaces.Interface_Apartamento;

public class AptoDecoradoComAreaDuplex extends DecoradorDeApartamentos{
    
    public AptoDecoradoComAreaDuplex(Interface_Apartamento objeto) {
        super(objeto);
    }
    
    @Override
    public String getTipoDeApartamento() {
        return this.objeto.getTipoDeApartamento() + " com área duplex";
    }

    @Override
    public double getPrecoDoApto() {
        return this.objeto.getPrecoDoApto() + 150000.0;
    }

    @Override
    public String toString() {
        return "Apartamento tipo = " + getTipoDeApartamento() + "\n" + "Preco apto = " + getPrecoDoApto();
    }
    
}
