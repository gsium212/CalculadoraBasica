package com.example.calculadorabasica;

public class OperacionesMatematicas {
    private double numero1;
    private double numero2;

    public OperacionesMatematicas(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            return Double.NaN; // No se puede dividir entre 0
        }
    }
}
