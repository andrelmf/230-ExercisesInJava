import java.util.Scanner;

public class Aula03EstruturasDeRepeticao_29 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite um número para ser impresso os primeiros 25 números");
            int valorMax = scan.nextInt();
            
            for(int i = 0; i<=valorMax; i++){
                if(i > 25){
                    break;
                } else{
                    System.out.println(i);
                }
            }
        }
}