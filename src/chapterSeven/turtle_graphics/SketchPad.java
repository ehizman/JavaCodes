package chapterSeven.turtle_graphics;

public final class SketchPad {
    public static int[][] sketchPad = new int[20][20];

    public static void displaySketchPad(){
        for (int[] row: sketchPad) {
            for (int cell: row) {
                if (cell == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.printf("%d ",cell);
                }
            }
            System.out.println();
        }
    }
}
