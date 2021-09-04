/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author leo
 */
public class Quadrado implements Figura2D{
    private Ponto2D p0;
    private Float lado;

    public Quadrado(Ponto2D p0, Float lado) {
        this.p0 = new Ponto2D(p0.getX(),p0.getY());
        this.lado = lado;
    }
    
    @Override
    public Float area() {
        return lado*lado;
    }

    @Override
    public Float perimetro() {
        return 4*lado;
    }

    @Override
    public void moveX(Float dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(Float dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(Float dX, Float dY) {
        p0.moveXY(dX, dY);
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p0=" + p0 
                + ", p1=" + this.getP1()  
                + ", p2=" + this.getP2()  
                + ", p3=" + this.getP3()
                + ", lado=" + lado 
                + ", area= "+ this.area() 
                + ", perimetro= " + this.perimetro() + '}';
    }
    
    public Ponto2D getP1(){
        return new Ponto2D(p0.getX(), p0.getY() + lado);
    }

    public Ponto2D getP2(){
        return new Ponto2D(p0.getX()+lado, p0.getY());
    }    

    public Ponto2D getP3(){
        return new Ponto2D(p0.getX()+lado, p0.getY() + lado);
    }
    
    public Ponto2D getP0() {
        return p0;
    }

    public Float getLado() {
        return lado;
    }
    
    public void write(){
        System.out.println(this.toString());
    }

}
