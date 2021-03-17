/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;

import modelos.Apartamento;

public class TesteApartamento {
    
    public static void main(String[] args) {
        
        Apartamento apto = new Apartamento();
        AptoDecoradoComBanheira apto101 = new AptoDecoradoComBanheira(apto);
        AptoDecoradoComAreaDuplex apto102 = new AptoDecoradoComAreaDuplex(apto);
        
       
        System.out.println(apto);
        System.out.println(apto101);
        System.out.println(apto102);
        
        
        
    }
    
}
