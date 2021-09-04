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
public class Ponto2D implements Objeto2D{
    private Float x;
    private Float y;

    public Ponto2D(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public void moveX(Float dX) {
        x += dX;
    }

    @Override
    public void moveY(Float dY) {
        y+=dY;
    }

    @Override
    public void moveXY(Float dX, Float dY) {
        x+=dX;
        y+=dY;
    }
    
    public void write(){
        System.out.println(this.toString());
    }
    
}

