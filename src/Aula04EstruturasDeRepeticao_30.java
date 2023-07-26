import java.util.Scanner;

public class Aula04EstruturasDeRepeticao_30 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do carro para verificar quais parcelas e quanto você deverá pagar.");
        float valorCarro = scan.nextFloat();

        for(int parcela =1; parcela <= valorCarro; parcela++){
            float valorParcela = valorCarro / parcela;
            // if(valorParcela >= 1000){
            //     System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            // } else {
            //     break;
            // }
            if(valorParcela < 1000){
                break;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }

    }
}