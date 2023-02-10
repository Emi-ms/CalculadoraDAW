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

    private int op1;
    private int op2;
    private int resultado;

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int suma(int op1, int op2) {
        return op1 + op2;
    }

    public int resta(int op1, int op2) {
        return op1 - op2;
    }

    public int multiplica(int op1, int op2) {
        return op1 * op2;
    }

    public int divide(int op1, int op2) {
        return op1 / op2;
    }
}
