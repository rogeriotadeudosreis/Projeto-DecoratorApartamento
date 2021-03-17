/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import interfaces.Interface_Apartamento;

public class AptoDecoradoComBanheira extends DecoradorDeApartamentos {

    public AptoDecoradoComBanheira(Interface_Apartamento objeto) {
        super(objeto);
    }

    @Override
    public String getTipoDeApartamento() {
        return this.objeto.getTipoDeApartamento() + " com banheira de hidromassagem";
    }

    @Override
    public double getPrecoDoApto() {
        return this.objeto.getPrecoDoApto() + 5000.0;
    }

    @Override
    public String toString() {
        return "Apartamento tipo = " + getTipoDeApartamento() + "\n" + "Preco apto = " + getPrecoDoApto();
    }
}
