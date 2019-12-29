/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesjava;

/**
 *
 * @author Walter Galdamez
 */
//nombre de la clase
class Persona{
        //atributos de la clase
        //no es necesario asignar valores por defecto
        String nombre="";
        String apellidoPaterno="";
        String apellidoMaterno="";
        
        //metodos de la clase
        //los usaran los obejetos de esta clase
        public void desplegarDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("apellido paterno: "+apellidoPaterno);
        System.out.println("apellido materno: "+apellidoMaterno);
        }
}
public class ClasesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //aqui se crearan los objetos de la clase Persona
        //Los objetos son instancias de una clase
    }
    //Este codigo no imprime nada en pantalla ya que los atributos no tienen valores asignados
}
