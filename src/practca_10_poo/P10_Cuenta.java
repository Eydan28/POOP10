/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practca_10_poo;

/**
 *
 * @author Eydan
 */
/**
 * Clase que representa una cuenta bancaria básica con operaciones de 
 * depósito, retiro y consulta de saldo.
 * <p>
 * Esta clase permite gestionar un saldo y realizar operaciones básicas 
 * sobre él. Si se intenta retirar más dinero del disponible, se lanza 
 * una excepción {@link P10_SaldoInsuficienteException}.
 * </p>
 * 
 * @author Eydan
 */
public class P10_Cuenta {
    /** 
     * Saldo actual de la cuenta. 
     */
    private double saldo;

    /**
     * Constructor por defecto que inicializa la cuenta sin saldo.
     */
    public P10_Cuenta() {
    }

    /**
     * Constructor que inicializa la cuenta con un saldo específico.
     * 
     * @param saldo El saldo inicial de la cuenta.
     */
    public P10_Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo en la cuenta.
     * 
     * @param saldo El nuevo saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Incrementa el saldo de la cuenta mediante un depósito.
     * 
     * @param monto La cantidad a depositar.
     */
    public void depositar(double monto) {
        saldo += monto;
    }

    /**
     * Retira una cantidad específica del saldo de la cuenta.
     * <p>
     * Si la cantidad a retirar excede el saldo disponible, se lanza 
     * la excepción {@link P10_SaldoInsuficienteException}.
     * </p>
     * 
     * @param monto La cantidad a retirar.
     * @throws P10_SaldoInsuficienteException Si el monto excede el saldo disponible.
     */
    public void retirar(double monto) throws P10_SaldoInsuficienteException {
        if (monto > saldo) {
            throw new P10_SaldoInsuficienteException("No tienes ese dinero");
        } else {
            saldo -= monto;
        }
    }

    /**
     * Consulta el saldo actual de la cuenta.
     * <p>
     * Este método es una forma más amigable de llamar a {@link #getSaldo()}.
     * </p>
     * 
     * @return El saldo actual.
     */
    public double consultarSaldo() {
        return getSaldo();
    }

    /**
     * Devuelve una representación en forma de cadena del estado de la cuenta.
     * 
     * @return Una cadena que contiene el saldo de la cuenta.
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
