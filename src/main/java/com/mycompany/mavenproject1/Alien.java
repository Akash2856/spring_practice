/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Lenovo
 */
class Alien {
    private int age;
    private Laptop lap;

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Laptop getLap() {
        return lap;
    }
    
    public Alien(){
        System.out.println("in alien");
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void code(){
        lap.compile();
        System.out.println("coding..");
    }
    
}
