package nl.entelect;

import java.io.*;

public class MaximumPathSum {

    public static int [][] getTriangle(String [] numbers, int lines){

        // allocate triangular array
        int[][] triangle = new int[lines+ 1][];
        for (int i = 0; i <= lines; i++) {
            triangle[i] = new int[i + 1];
        }

        // fill triangular array
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
//                triangle[i][j] = Integer.parseInt(numbers[i*(triangle[i].length-1)+j]);
                System.out.print(triangle[i].length);
            }
            System.out.println();
        }

        return triangle;
    }

    public static int getMaximumPath(int [][] triangle){
      return 0;
    }
    public static void main(String[] args) {

        String path = System.getProperty("user.dir")+"/src/nl/entelect/maximum_path_triangle.txt";
        File file = new File(path);
        int lines = 0;

        String numbers = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                lines++;
                numbers += st + " ";
            System.out.println(st);
            }
        }
        catch (IOException fe){
            System.out.println(fe);
        }


        int[][] triangle = getTriangle(numbers.split(" "), lines);

        // print triangular array
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++){
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();

        }
    }

}
