public class OperadorTernario {
    public static void main(String[] args) {
        float salario = 3000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Eu não vou doar neste momento";
        

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        
        System.out.println(resultado);
    }
}