/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act01sem03.nefi_valderrama.ejercicio1g;

/**
 *
 * @author Valderrama
 */
public class Act01Sem03Nefi_ValderramaEjercicio1G {

    public static void main(String[] args) {
    //EJERCICIO 1: G) Rpta: 1 3 4
        int x=1, y=2, z=3;
        
        if(++x > y++ || x-- > 0)
            z++;
        else 
            z--;
        System.out.println(x+" "+y+" "+z);
    }
}
