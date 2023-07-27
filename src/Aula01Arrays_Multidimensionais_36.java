public class Aula01Arrays_Multidimensionais_36{
    public static void main(String[] args) {
        // 1,2,3,4,5, MESES
        // 31,28,31 DIAS

        int [][] mesesDias  = new int [3][3];
        mesesDias[0][0] =31;
        mesesDias[0][1] =28;
        mesesDias[0][2] =31;

        mesesDias[0][0] =31;
        mesesDias[0][1] =28;
        mesesDias[0][2] =31;

        System.out.println(mesesDias[0][0]);

        for(int i =0; i < mesesDias.length; i++){
            for (int j = 0; j < mesesDias[0].length; j++) {
                System.out.println(mesesDias[i][j]);
            }
        }

    }
}