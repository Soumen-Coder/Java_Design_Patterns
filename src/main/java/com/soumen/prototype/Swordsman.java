package com.soumen.prototype;

public class Swordsman extends GameUnit{

     private String state = "idle";

     public void attack(){
         this.state = "attack";
     }

     @Override
     public void reset(){
         this.state="idle";
     }

     public String toString(){
         return "Swordsman"+ this.state + " @ "+ getPosition();
     }

}
