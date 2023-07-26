import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // long numeroGrande = 1000000000;
        // double salarioDouble = 2000;
        // float salarioFloat = 2000;
        // byte salarioByte = 10;
        // short idadeShort =10;
        // boolean verdadeiro = true;
        // boolean falso = false;
        // char caractere = 10;

        String nome = "André";
        String endereco = "Avenida dos Engenheiros , 1131";
        float salario = 1500;

        LocalDate data = LocalDate.of(2023, Month.JULY, 20);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de :" + salario + " , na data " + dataFormatada);
    }
} 
