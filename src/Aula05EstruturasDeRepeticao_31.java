import java.util.Scanner;

public class Aula05EstruturasDeRepeticao_31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor total do carro: ");
        double valorCarro = scan.nextDouble();
        
        for (int parcela = (int)valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;

            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela" + parcela + "R$" + valorParcela);
        }
    }
}