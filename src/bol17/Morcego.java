/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol17;

/**
 *
 * @author ceque
 */
public class Morcego extends Mamifero implements IPodeVoar {

    @Override
    public void voar() {
        System.out.println("Pode voar");
    }
    
}
