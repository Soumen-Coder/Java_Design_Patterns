package com.soumen.prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable{

    private Point3D position;

    //initialized position to zero
    public GameUnit(){
        this.position = Point3D.ZERO;
    }

    // For starting the game from some position
    public GameUnit(float x, float y, float z){
        this.position = new Point3D(x,y,z);
    }

    @Override
    //GameUnit is the covariant of Object
    public GameUnit clone() throws CloneNotSupportedException{
        GameUnit unit = (GameUnit)super.clone(); //Does shallow copy and not deep copy
        unit.initialize(); // initialized position to zero and provides an abstract reset method()
        return unit;
    }

    public void initialize(){
        position = Point3D.ZERO;
        reset();
    }

    public abstract void reset();

    public void move(Point3D direction,  float distance){
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition(){
        return this.position;
    }
}
