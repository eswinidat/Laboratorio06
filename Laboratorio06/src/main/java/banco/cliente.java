/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IDAT
 */
public class cliente {
    private String cliente;
    private String apellido;
    private String dni;
    private String telefono;
    private double saldo;

    public cliente(String cliente, String apellido, String dni, String telefono, double saldo) {
        this.cliente = cliente;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "cliente{" + "cliente=" + cliente + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }

    public void deposito(double montoDepositar){
        this.saldo+= montoDepositar;
    }
    public void retiro(double montoRetirar){
        this.saldo-= montoRetirar;
    }
    
}
