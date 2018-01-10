/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david_pacheco_3a;

import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class CuentaHipoteca extends Cuenta {

    public void depositar(double monto) {
        this.setBalance(this.getBalance() + monto);
    }

    @Override
    public double calcularItereses(int meses) {
        if (this.getTipoCliente().equals("empresa") && meses > 12) {
            this.setTasaIntere((this.getTasaIntere() * meses) / 2);
        }
        if (this.getTipoCliente().equals("persona") && meses > 6) {
            this.setTasaIntere(this.getTasaIntere() * meses);
        }
        return this.getTasaIntere();
    }

}
