/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jenkins;

/**
 *
 * @author Pavilion
 */
public class Hello {

    //Added comment.
    private String name;
    private String lastName;;;;;;;;;
    /**
     * @param args the command line arguments
     */

    private Hello(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return "Hello, " + this.name;
    }
    
    public static void main(String[] args) {
        Hello antonio = new Hello("Antonio");
        System.out.println(antonio);
    }
    
}


