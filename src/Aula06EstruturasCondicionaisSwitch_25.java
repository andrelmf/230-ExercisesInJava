import java.util.Scanner;

public class Aula06EstruturasCondicionaisSwitch_25 {
    public static void main(String[] args){
        System.out.println("Digite um dia: ");
        Scanner scan = new Scanner(System.in);
        byte dia = scan.nextByte();
        
        switch(dia){
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda-feira");
            break;
            case 3:
            System.out.println("Terça-feira");
            break;
            case 4:
            System.out.println("Quarta-feira");
            break;
            case 5:
            System.out.println("Quinta-feira");
            break;
            case 6:
            System.out.println("Sexta-feira");
            break;
            case 7:
            System.out.println("Sábado");
            break;
            default:
            System.out.println("Número não encontrado");
        }
    }
    
}