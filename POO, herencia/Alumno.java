/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1persona;

/**
 *
 * @author Aaron
 */
//Herencia 
public class Alumno extends Persona{
    
    public String NumerodeCuenta;
    public String promedio;
    public String grado;
    
    
public void datos(){
    System.out.println("Numero de Cuenta: "+NumerodeCuenta);
    System.out.println("El promedio: "+promedio);
    System.out.println("Grado: "+grado);

}    
    
}
