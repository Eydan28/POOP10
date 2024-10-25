/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practca_10_poo;

/**
 * Clase principal que demuestra el manejo de excepciones en Java.
 * <p>
 * Esta clase contiene ejemplos de control de excepciones, operaciones aritméticas, 
 * manipulación de arreglos y uso de la clase {@link P10_Cuenta}.
 * </p>
 * 
 * @author lenovo
 */
public class Practca_10_POO {

    /**
     * Método principal de la aplicación.
     * <p>
     * Este método incluye ejemplos de operaciones aritméticas, control de excepciones,
     * y gestión de objetos de la clase {@link P10_Cuenta}.
     * </p>
     * 
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        int a = 5;
        float c = (float) a / 2;
        System.out.println(c);

        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = i * 10;
        }

        // Control de excepciones con arreglos
        try {
            for (int i = 0; i <= 5; i++) { // Error: desbordamiento de índice
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepción de desbordamiento de memoria");
        }

        System.out.println("Hola, he sobrevivido!");

        // Control de excepciones aritméticas
        try {
            float d = 4 / 0;
            System.out.println(d);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepción de desbordamiento de memoria");
        } catch (ArithmeticException ex) {
            System.out.println("Excepción aritmética Segundo Catch");
        }

        float n = miMetodoDivision(100, 2);
        System.out.println(n);

        try {
            float m = miMetodoDivision(100, 0);
            System.out.println(m);
        } catch (ArithmeticException ex) {
            System.out.println("Excepción aritmética permeada");
            System.out.println(ex.getStackTrace()); 
            ex.printStackTrace();
        }

        System.out.println("\nA pesar de todo, seguimos en el programa");

        float x = miMetodoDivision(20, 5);
        System.out.println(x);

        try {
            int w = suma(4, 7);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Excepción de operación no soportada");
            System.out.println("Atributo mensaje");
            System.out.println(ex.getMessage());
        }

        // Ejemplo de uso de la clase P10_Cuenta
        System.out.println("###################");
        P10_Cuenta cuenta = new P10_Cuenta(100.0f);
        System.out.println(cuenta.consultarSaldo());

        cuenta.depositar(100);
        System.out.println(cuenta.consultarSaldo());

        try {
            cuenta.retirar(300);
            System.out.println(cuenta.consultarSaldo());
        } catch (P10_SaldoInsuficienteException ex) {
            System.out.println("Excepción lanzada");
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Método que realiza la división de dos enteros.
     * <p>
     * Si se intenta dividir por cero, se lanza una excepción {@link ArithmeticException}.
     * </p>
     * 
     * @param f El numerador.
     * @param f0 El denominador.
     * @return El resultado de la división.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f / f0;
    }

    /**
     * Método que realiza la suma de dos enteros.
     * <p>
     * Este método lanza una excepción {@link UnsupportedOperationException}
     * para demostrar el manejo de excepciones personalizadas.
     * </p>
     * 
     * @param i Primer sumando.
     * @param i0 Segundo sumando.
     * @return La suma de los dos enteros.
     * @throws UnsupportedOperationException Siempre lanza esta excepción.
     */
    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operación no soportada aun");
    }
}

    

