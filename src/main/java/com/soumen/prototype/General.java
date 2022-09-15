package com.soumen.prototype;

public class General extends GameUnit{

    private String state = "idle";

    public void boostMorale(){
        this.state = "Boost Morale";
    }

    public String toString(){
        return "General"+ this.state + " @ " + getPosition();
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Generals are Unique");
    }

    @Override
    public void reset(){
        throw new UnsupportedOperationException("Reset Not Supported");
    }
}
