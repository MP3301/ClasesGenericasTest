/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import clasesgenericas.ClaseGenerica;

/**
 *
 * @author
 * x
 */
public class Test {
    
    public static void main(String[] args) {
        ClaseGenerica<Integer> objectoInt = new ClaseGenerica(15);
        
        
        //se llama a funcion obtener tipo de tipo T que recibe por parametro un objecto generico tipo T (se usa T para no especificar el tipo y pasarle cualquier objecto a parametro)
        objectoInt.obtenerTipo();
        
        
    }
    
}
