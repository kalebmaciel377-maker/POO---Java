
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kaleb_m_santos
 */
public class metodos implements Interface {

    //Atributos
    private String nome;
    private String cargo;
    private String categoria;
    private double salario;
    private double imposto;
    private double salario_liq;
    private double desconto;
    private int horas;
    private int horasExtras;

    // Construtor
    public metodos() {
    }

    // encapsulamento
    public String getNome() {
        return nome;
    }
    
    public void setCargo (String Cargo){
        this.cargo = Cargo;
    }
    
    public String getCargo() {
        return cargo;
    }    

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void sethorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double gethorasextras() {
        return horasExtras;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getdesconto() {
        return desconto;
    }

    public void setdesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalario_liq() {
        return salario_liq;
    }

    public void setSalario_liq(double salario_liq) {
        this.salario_liq = salario_liq;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    

    public void funcionario() {

        nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionario: ");
        cargo = JOptionPane.showInputDialog(null, "Digite o cargo do " + nome + ": ");
        categoria = JOptionPane.showInputDialog(null, "Digite a categoria do " + nome + ": ");

        JOptionPane.showMessageDialog(null,
                "Ficha do Funcionario\n"
                + "Nome: " + nome + "\n"
                + "Cargo: " + cargo + "\n"
                + "Categoria: " + categoria + "\n"
        );
    }
    
    
    
    
    

    public void horasExtras() {
        int horas;

        horas = Integer.parseInt(
            JOptionPane.showInputDialog("Digite as horas extras:")
        );

        horasExtras = horas * 35 * 1.5;

        JOptionPane.showMessageDialog(null,
            "Total das horas extras: R$ " + horasExtras);
    }
    
    
    
    
    public void exibir_folha(){
        salario = salario - desconto;
        
        JOptionPane.showMessageDialog(null,
            "Folha de pagamento\n\n" +
            "Nome: " + nome + "\n" +
            "Cargo : " + cargo + "\n" +
            "Categoria :" + categoria+ "\n" +
            "Salario: " + salario + "\n" +
            "desconto: " + desconto + "\n" +
            "Horas extras: " + horasExtras + "\n");
    }

    
    
    
    
    // metodos da interface
    @Override
    public void Calcular_salario() {
        double dias = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o total de dias: "));
        
        salario = dias * 350;

        JOptionPane.showMessageDialog(null,
                "Valor Salario Bruto: " + salario
        );

    }
    
    
    
    

    @Override
    public void descontar_imposto() {

        desconto = salario * 0.10;

        JOptionPane.showMessageDialog(null,
                "Valor Salario Liquido: " + desconto
        );

    }

}
