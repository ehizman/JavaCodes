package LeetCode;

import java.util.*;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        int color = image[sr][sc];
        if (newColor != color){
            floodFillFourConnectingCells(image, sr, sc, newColor, color);
        }
        return image;
    }

    private static void floodFillFourConnectingCells(int[][] image, int sr, int sc, int newColor, int color) {
        if (image[sr][sc] == color){
            image[sr][sc] = newColor;
            if (sr >= 1){
                floodFillFourConnectingCells(image, sr-1, sc, newColor, color);
            }
            if (sr < image.length-1){
                floodFillFourConnectingCells(image, sr+1, sc, newColor, color);
            }
            if (sc >= 1){
                floodFillFourConnectingCells(image, sr, sc-1, newColor, color);
            }
            if (sc < image[sr].length - 1){
                floodFillFourConnectingCells(image, sr, sc+1, newColor, color);
            }
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        floodFill(image, 1, 1, 2);
        Arrays.stream(image).forEach((element) ->{
            System.out.println(Arrays.toString(element));
        });
    }
}
