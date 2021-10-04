package chapterSeven.turtle_graphics;

public final class SketchPad {
    public int[][] floor = new int[20][20];

    public void displaySketchPad(){
        for (int[] row: floor) {
            for (int cell: row) {
                if (cell == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public void writeOn(int rowPosition, int columnPosition) {
        floor[rowPosition][columnPosition]= 1;
    }
}
