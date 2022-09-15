package com.soumen.objectpool;

import javafx.geometry.Point2D;

public class BitMap implements Image{

    private Point2D location;
    private String name;

    public BitMap(String name){
        this.name = name;
    }

    @Override
    public void draw(){
        //draw the Image
        System.out.println("Drawing "+name+" @ "+location);
    }

    @Override
    public Point2D getLocation(){
        return this.location;
    }

    @Override
    public void setLocation(Point2D location){
        this.location = location;
    }

    @Override
    public void reset(){
        location = null;
        System.out.println("Bitmap has been resetted");
    }


}
