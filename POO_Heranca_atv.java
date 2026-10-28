package poo_heranca_atv;

import javax.swing.JOptionPane;

public class POO_Heranca_atv {

    public static void main(String[] args) {
        
        // Objeto 1
        Fun_tecnico tecnico1 = new Fun_tecnico();
        
        
        String nome1 = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        tecnico1.setNome(nome1);

        tecnico1.Especialidade();
        tecnico1.Salario();
        tecnico1.CPF_Tecnico();
        tecnico1.exibir_dados();
        
        
        
        // Objeto 2
        Fun_tecnico tecnico2 = new Fun_tecnico();
        
        
        String nome2 = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        tecnico1.setNome(nome2);

        tecnico2.Especialidade();
        tecnico2.Salario();
        tecnico2.CPF_Tecnico();
        tecnico2.exibir_dados();
        
        
        
        
        // Objeto 3
        Fun_tecnico tecnico3 = new Fun_tecnico();
        
        
        String nome3 = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        tecnico1.setNome(nome3);

        tecnico3.Especialidade();
        tecnico3.Salario();
        tecnico3.CPF_Tecnico();
        tecnico3.exibir_dados();
        
        
        
        // objeto 4
        Fun_adm adm1 = new Fun_adm();
        
        String nome4 = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        adm1.setNome(nome4);
        
        adm1.Setor();
        adm1.descontar_salario();
        adm1.exibir_dados1();
        
        
        // objeto 5
        Fun_adm adm2 = new Fun_adm();
        
        String nome5 = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        adm1.setNome(nome5);
        
        adm2.Setor();
        adm2.descontar_salario();
        adm2.exibir_dados1();
        
        
        // objeto 6
        Fun_adm adm3 = new Fun_adm();
        
        String nome6 = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        adm1.setNome(nome6);
        
        adm3.Setor();
        adm3.descontar_salario();
        adm3.exibir_dados1();
        
        
        
    }
    
}
