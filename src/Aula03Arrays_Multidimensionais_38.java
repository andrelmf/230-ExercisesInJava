public class Aula03Arrays_Multidimensionais_38 {
    public static void main(String[] args) {
        int[][]arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[0] = new int[3];
        arrayInt[0] = new int[6];

        for(int[] arrayBase: arrayInt){
            System.out.println("\n------");
            for (int num: arrayBase){
                    System.out.println(num + "");
            }
        }
    }
    
    
}