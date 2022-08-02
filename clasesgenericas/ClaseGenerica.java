/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesgenericas;

/**
 *
 * @author
 * x
 */
public class ClaseGenerica<T> {

    
  private  T objecto; 
    
    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
     */

    public ClaseGenerica(T objecto) {
        this.objecto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El objecto es tipo="+objecto.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "ClaseGenerica{" + "objecto=" + objecto + '}';
    }
    
}
