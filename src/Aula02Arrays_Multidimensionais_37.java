public class Aula02Arrays_Multidimensionais_37 {
    public static void main(String[] args) {
        // 1,2,3,4,5, MESES
        // 31,28,31 DIAS

        // Três arrays com 3 posições cada um
        int [][] mesesDias  = new int [3][3];
        mesesDias[0][0] =31;
        mesesDias[0][1] =28;
        mesesDias[0][2] =31;

        mesesDias[0][0] =31;
        mesesDias[0][1] =28;
        mesesDias[0][2] =31;

        System.out.println(mesesDias[0][0]);

        for(int i =0; i < mesesDias.length; i++){
            for (int j = 0; j < mesesDias[i].length; j++) {
                System.out.println(mesesDias[i][j]);
            }
        }

        // Outra forma + facil de fazer
        for (int[] arrBase: mesesDias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }

    }
}