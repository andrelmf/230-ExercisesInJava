import java.util.Scanner;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){

        System.out.println("Digite qual é o seu salário: ");
        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();
        
        // Tabela de impostos por faixa:
        // Até ∈ 34.712
        double imposto1 = 9.70/100;
        // Até ∈ 68.507
        double imposto2 = 37.35/100;
        // Acima de 68.508
        double imposto3 = 49.50/100;

        if(salario <= 34712){
            double calculaImposto = salario * imposto1;
            salario -= calculaImposto;
            System.out.println("O imposto que você terá de pagar é: "+ calculaImposto +" e o valor que você receberá líquido é de: " + salario);
        } else if (salario <= 68507){
            double calculaImposto = salario * imposto2;
            salario -= calculaImposto;
            System.out.println("O imposto que você terá de pagar é: "+ calculaImposto +" e o valor que você receberá líquido é de: " + salario);
        } else {
            double calculaImposto = salario * imposto3;
            salario -= calculaImposto;
            System.out.println("O imposto que você terá de pagar é: "+ calculaImposto +" e o valor que você receberá líquido é de: " + salario);
        }
        
    }
}