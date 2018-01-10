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
public class CuentaAhorro extends Cuenta{

    private int horasSemanales;

    public CuentaAhorro(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public void depositar(double monto) {
        this.setBalance(this.getBalance() + monto);
    }

    public void retitar(double monto) {
        double aux = this.getBalance();
        if (this.getBalance()>0) {
            this.setBalance(this.getBalance() - monto);
        }else{
            JOptionPane.showMessageDialog(null, "Cuenta sin monto");
        }
    }

    @Override
    public double calcularItereses(int meses) {
        if (this.getBalance() >1000 || this.getBalance() < 0) {
            this.setTasaIntere(this.getTasaIntere() * meses);          
        }else{
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return this.getTasaIntere();
    }

}
