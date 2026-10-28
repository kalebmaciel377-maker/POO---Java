package poo_heranca_atv;

import javax.swing.JOptionPane;

public class Fun_tecnico extends Funcionarios{
    private String especialidade, cpf;
    private double salario;

    public Fun_tecnico() {
        super();
    }
    
    public void Especialidade (){
        especialidade = JOptionPane.showInputDialog(null, "digite a especialidade do tecnico: ");
        
        JOptionPane.showMessageDialog(null, "Especialidade: " + especialidade);
    }
    
    public void Salario (){
        double dias = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o total de dias trabalhados: "));
        
        salario = dias * 267;
        
        JOptionPane.showMessageDialog(null, "Salario: " + salario);
    }
    
    public void CPF_Tecnico (){
        String cpf1 = JOptionPane.showInputDialog(null, "digite o seu CPF : ");
        
        cpf = cpf1;
        
        JOptionPane.showMessageDialog(null, "CPF: " + cpf);
    }
    
    public void exibir_dados (){
        String menssage = "Dados\n" +
                        "Nome: " + getNome() + "\n" +
                        "Especialidade: " + especialidade + "\n" +
                        "CPF: " + cpf + "\n" +
                        "salario: " + salario;
        
        JOptionPane.showMessageDialog(null, menssage);
        
    }
    
    
}
