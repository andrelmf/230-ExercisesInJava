import java.util.Scanner;

public class Aula07EstruturasCondicionaisSwitch_26 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para identificar se é dia útil ou fim de semana.");
        byte dia = scan.nextByte();

        switch(dia){
            case 2, 3, 4, 5, 6:
            System.out.println("Segunda-feira a sexta-feira , dia útil");
            break;
            case 1,7:
            System.out.println("Sábado ou domingo, fim de semana");
            break;
            
            default:
            System.out.println("Opção inválida");
            break;
        }
            

        


    }
}