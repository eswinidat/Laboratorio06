/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio06.ENCAPSULAMIENTO;

/**
 *
 * @author IDAT
 */
public class PruebaPerson {
    
    public static void main(String[] args) {
        
        person persona = new person("eswin");
        //persona.name ="Nombre modificado";
        System.out.println("person");
        persona.setName("Nombre modificado");
        System.out.println("persona");
    }
}
