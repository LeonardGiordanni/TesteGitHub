/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03poo;

import Beans.Ponto2D;
import Beans.Quadrado;

/**
 *
 * @author leo
 */
public class Aula03POOMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ponto2D p0 = new Ponto2D(0.f,0.f);
       p0.moveXY(3.f, 1.f);
       p0.write();
       Quadrado q0 = new Quadrado(p0, 2.f);
       q0.write();

    }
    
}
