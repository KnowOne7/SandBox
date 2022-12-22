package FAANG;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][]{{1, 1, 1,}, {1, 1, 0}, {1, 0, 1}};

        floodFill(image, 1, 1, 2);
    }

        public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            // int [] directions = {{1,0},
            //                      {0,1},
            //                      {-1,0},
            //                      {0,-1}}

            if(image[sr][sc] == newColor)
                return image;
            fill(image, sr, sc, image[sr][sc], newColor);
            System.out.println(Arrays.toString(image[0]));
            System.out.println(Arrays.toString(image[1]));
            System.out.println(Arrays.toString(image[2]));
            return image;
        }

        public static void fill(int[][] image, int sr, int sc, int color, int newColor){
//            System.out.println(sr + " " + sc);
//
//            System.out.println(Arrays.toString(image));
            System.out.println();
            System.out.println("Current POS: " + sr + " " + sc);
            System.out.println();
            System.out.println(Arrays.toString(image[0]));
            System.out.println(Arrays.toString(image[1]));
            System.out.println(Arrays.toString(image[2]));
            System.out.println();

            if(sr < 0 || sc <  0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color){
                System.out.println("Return "+ sr + " " + sc);
                System.out.println();
                return;
            }
            else {
                System.out.println("Fill POS: " + sr + " " + sc);
                image[sr][sc] = newColor;
            }
//            System.out.println("Up from: " + sr + " " + sc);
            fill(image, sr-1, sc, color, newColor);
//            System.out.println("Right from: "+ sr + " " + sc);
            fill(image, sr, sc + 1, color, newColor);
//            System.out.println("Down from: "+ sr + " " + sc);
            fill(image, sr + 1, sc, color, newColor);
//            System.out.println("Left from: "+ sr + " " + sc);
            fill(image, sr, sc - 1, color, newColor);

        }
    }