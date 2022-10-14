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
public class Alumno extends Persona{
    int matricula;
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void getMatricula(){
        System.out.println(this.matricula);
    }
}
