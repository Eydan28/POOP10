/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practca_10_poo;

/**
 * Excepción personalizada para manejar situaciones de saldo insuficiente.
 * <p>
 * Esta excepción se utiliza para señalar que una operación no se puede 
 * completar debido a que el saldo es insuficiente.
 * </p>
 * 
 * @author Eydan
 */
public class P10_SaldoInsuficienteException extends Exception {

    /**
     * Constructor vacío de la clase {@code P10_SaldoInsuficienteException}.
     * <p>
     * Crea una nueva excepción sin mensaje adicional.
     * </p>
     */
    public P10_SaldoInsuficienteException() {
    }

    /**
     * Constructor que acepta un mensaje detallado sobre la causa de la excepción.
     * <p>
     * Crea una nueva excepción con el mensaje proporcionado.
     * </p>
     * 
     * @param message El mensaje que describe la razón de la excepción.
     */
    public P10_SaldoInsuficienteException(String message) {
        super(message);
    }
}
