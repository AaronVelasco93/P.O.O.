/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1persona;


public class Modulo1Persona {

    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno estudiante = new Alumno();
        
         estudiante.NumerodeCuenta="413112576";
         estudiante.edad=1;
         estudiante.estatura=(1.2f);
         estudiante.grado="Segundo";
         estudiante.promedio="8.5";
         estudiante.nombre="Aaron";
         
          System.out.println("+++++++++++++Datos del alumno+++++++++++++++++++++");
         estudiante.datos();
         System.out.println("+++++++++++++++++Datos Personales++++++++++++++");
         estudiante.datosPersonales();
        
        
        
    }
    
}
