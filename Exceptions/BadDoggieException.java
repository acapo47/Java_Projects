/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.exceptions;

/**
 *
 * @author Anthony
 */
public class BadDoggieException 
        extends /*Runtime*/Exception {

    /**
     * Creates a new instance of <code>BadDoggieException</code> without detail
     * message.
     */
    public BadDoggieException() {
    }

    /**
     * Constructs an instance of <code>BadDoggieException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public BadDoggieException(String msg) {
        super(msg);
    }
}
