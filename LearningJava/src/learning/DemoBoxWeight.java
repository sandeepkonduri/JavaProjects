/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

class Box{
    double b;
    double h;
    double l;
    
    Box(){
        l=-1;
        b=-1;
        h=-1;
    }
    
    Box(Box ob){
        l=ob.l;
        b=ob.b;
        h=ob.h;
    }
    
    Box(double a, double b, double c){
        l=a;
        this.b=b;
        h=c;
    }
    
    Box(double x){
        l=b=h=x;
    }
    
    double volume(){
        return l*b*h;
    }
}

/**
 *
 * @author skonduri
 */

class BoxWeight extends Box {
    double g;
    
    BoxWeight(){
        l=b=h=g=-1;
    }
    
    BoxWeight(double a, double b, double c, double d){
        super(a,b,c);
       g=d;
    }
}

public class DemoBoxWeight {
    public static void main(String args[]){
        BoxWeight bw1 = new BoxWeight(10, 20, 30, 40);
        BoxWeight bw2 = new BoxWeight(1,2,3,7.8);
        
        double vol = bw1.volume();
        
        System.out.println(" The volume of the box BW1 is "+ vol + " ~ The Weight of the box BW1 is "+ bw1.g);
        
        vol = bw2.volume();
        
        System.out.println("The volume of the box BW2 is " + vol + " ~ The Weight of the box BW2 is "+ bw2.g);
        
    }
}
