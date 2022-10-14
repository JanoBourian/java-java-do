/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictopics;

/**
 *
 * @author super
 */
public class Persona {
    int age;
    String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void getName(){
        System.out.println(this.name);
    }
    
    public void getAge(){
        System.out.println(this.age);
    }
}
