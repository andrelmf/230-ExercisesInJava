package academy.devdojo.maratonajava.javacore.Aindroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aindroducaoclasses.dominio.Carro;

public class Carro01 {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setNome("\nFusca Bala");
        carro1.setModelo("Sport");
        carro1.setAno(1969);

        carro2.setNome("Mustang");
        carro2.setModelo("GT 500");
        carro2.setAno(1968);
        
        System.out.println(carro1.getNome());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());

        System.out.println("\n" + carro2.getNome());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());
    }

}