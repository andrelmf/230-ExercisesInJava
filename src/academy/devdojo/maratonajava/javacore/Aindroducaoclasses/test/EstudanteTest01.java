package academy.devdojo.maratonajava.javacore.Aindroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aindroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Aindroducaoclasses.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        System.out.println(estudante01);


        impressora.imprime(estudante01);
        
        impressora.imprime(estudante02);
        
    }
} 