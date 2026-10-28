package poo_heranca_atv;

import javax.swing.JOptionPane;

public class Fun_adm extends Funcionarios{
    private String setor;
    private double valor;


    public Fun_adm() {
        super();
    }
    
    public void Setor (){
        setor = JOptionPane.showInputDialog(null, "Digite o setor: ");
        JOptionPane.showMessageDialog(null, "Setor: " + setor);
    }
    
    public void descontar_salario (){
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor do salario: "));
        double desconto = 0.1;
        
        if (salario1 > 0){
           valor  = salario1 * desconto;
           valor = valor + salario1;
        } else {
           JOptionPane.showMessageDialog(null, "Valor invalido!!!");
        }
    }
    
    public void exibir_dados1 (){
        String menssagem1 = "Dados\n"+ 
                            "Setor: " + setor + "\n" +
                            "Salario com Deconto 10%: " + valor;
        
        
        JOptionPane.showMessageDialog(null, menssagem1);
                            
    }
    
}
