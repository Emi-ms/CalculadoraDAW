/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoradaw2;

/**
 *
 * @author usuario
 */
public class Calculadora {
/**
 * refactorizamos con el patron de refactorizacion rename los nombre se las
 * variables de los dos operandos
 */
    private int operador1;
    private int operador2;
    private int resultado;

    public int getOp1() {
        return operador1;
    }
/**
 * 
 * @param op1 es el valor que se le asigna al parametro 
 */
    public void setOp1(int op1) {
        this.operador1 = op1;
    }

    public int getOp2() {
        return operador2;
    }

    public void setOp2(int op2) {
        this.operador2 = op2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
/**
 * esta fucion hace la operación aritmética de la suma	
 * @param operador1 es el primero operador
 * @param operador2 es el segundo operador
 * @return devuelve el resultado de la suma
 */
    public int suma(int operador1, int operador2) {
        return operador1 + operador2;
    }

    public int resta(int op1, int op2) {
        return op1 - op2;
    }

    public int multiplica(int op1, int op2) {
        return op1 * op2;
    }
/**
 * esta funcios hace la operacion aritmética de la división
 * @param op1
 * @param op2
 * @return
 */
    public int divide(int op1, int op2) {
        return op1 / op2;
    }
}
