
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaleb_m_santos
 */
public class Conta_corrente implements Conta{
    private String nome;
    private String cpf;
    private double ValorConta;

    // construtor 2
    public Conta_corrente(double ValorConta) {
        this.ValorConta = ValorConta;
    }
    
    // construtor 1
    public Conta_corrente(String nome, String cpf, double ValorConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.ValorConta = ValorConta;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorConta() {
        return ValorConta;
    }

    public void setValorConta(double ValorConta) {
        this.ValorConta = ValorConta;
    }

    @Override
    public void sacar(double valor) {
        
        if (valor > 0 && valor <= ValorConta){
            
            ValorConta = ValorConta - valor;
            
            JOptionPane.showMessageDialog(null, 
                    "saque realizado com sulcesso"
            );
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Saldo insulficiente ou valor invalido"
            );
   
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            ValorConta = ValorConta + valor;
            
            JOptionPane.showMessageDialog(null, 
                    "Deposito realizado com sulcesso"
            );
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Valor depositado invalido"
            );
        }
        
        
    }
    
}
