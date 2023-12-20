package nl.entelect;

public class LatticePaths {

    public static int getNumberOfRoutes(int rows,int cols){
       int highestMove = 0;
        for (int row=1; row<=rows; row++) {
            for (int col=1; col<=cols; col++) {
                if(row*col>highestMove){
                    highestMove = row*col;
                    System.out.print(highestMove);
                }

            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(getNumberOfRoutes(2,2));
    }
}
