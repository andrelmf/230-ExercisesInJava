package academy.devdojo.maratonajava.javacore.Aindroducaoclasses.dominio;

public class ImpressoraEstudante {

    public static void imprime(Estudante estudante) {
        System.out.println("---------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

    }
}