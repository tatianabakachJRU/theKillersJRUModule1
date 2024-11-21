package lecture_6;

public class L6_Example_1 {
    public static void main(String[] args) {

        int[][] myArray2 = //[3][ ]
                {
                        {1, 2, 3}, //0  [0,1,2]
                        {4, 5, 6}, //1  [0,1,2]
                        {7, 8}  //2  [0,1,2]


                };
        myArray2[1][2] = 100;

        for (int i = 0; i < myArray2.length; i++) { // по внешнему массиву
            for (int j = 0; j < myArray2[i].length; j++) { // по внутренним массивам
                System.out.print(myArray2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
