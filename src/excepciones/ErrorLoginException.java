/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author engel
 */
public class ErrorLoginException extends Exception {

    public ErrorLoginException() {
    }
    
    public ErrorLoginException(String msj) {
        super(msj);
    }
}
