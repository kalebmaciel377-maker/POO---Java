
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaleb_m_santos
 */
public class POO1 {
    public static void main(String[] args) {
        
        //exemplo   
        Conta_corrente cliente1 = new Conta_corrente(
            "Kaleb",
            "123.159.987-96",
            1000.00
        );
        
        cliente1.depositar(500);
        
        cliente1.sacar(250);
        
        System.out.println("Saldo atual da conta: " + cliente1.getValorConta());
        
        
        
        
        //  pratica
        
        Conta_corrente cliente2 = new Conta_corrente (
            "Matheus",
            "856.987.785-36",
            1000.00
        );
        
        cliente2.depositar(500);
        
        cliente2.sacar(1000);
        
        System.out.println("Saldo atual da conta: " + cliente2.getValorConta());
        
        
        
        
        // Cliente 3
        Conta_corrente cliente3 = new Conta_corrente (
            5000.00
        );
        
        
        String nome1 = JOptionPane.showInputDialog(null, "digite o seu nome: ");
        cliente3.setNome(nome1);
        
        
        String cpf1 = JOptionPane.showInputDialog(null, "digite o seu cpf: ");
        cliente3.setCpf(cpf1);
        
        
        cliente3.depositar(6700);
        
        cliente3.sacar(2222);
        
        System.out.println("Saldo atual da conta: " + cliente3.getValorConta());


    }
}
