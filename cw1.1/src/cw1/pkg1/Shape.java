/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1.pkg1;

/**
 *
 * @author M00609218
 */
public abstract class Shape {
    final String _name;
    
    public Shape(String name){

        _name = name;
    }
    

    public void displayDescription(){
        System.out.println("I'm a shape named "+_name);
    }
}
