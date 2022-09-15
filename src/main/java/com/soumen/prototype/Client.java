package com.soumen.prototype;

import javafx.geometry.Point3D;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("************************1ST SWORDSMAN OBJECT*************************");
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(10,10,10), 20);
        s1.attack();
        System.out.println(s1.getPosition());
        System.out.println(s1);

        System.out.println("************************2ND SWORDSMAN OBJECT*************************");
        Swordsman s2 = (Swordsman)s1.clone();
        System.out.println(s2.getPosition());
        System.out.println(s2);

        System.out.println("************************1ST GENERAL OBJECT*************************");
        General g = new General();
        g.boostMorale();
        System.out.println(g);
        System.out.println(g.getPosition());

        System.out.println("************************2ND GENERAL OBJECT*************************");
        General g2 = (General)g.clone();
        System.out.println(g2);

    }
}
