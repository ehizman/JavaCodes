package Hackerrank;

public class Kangaroo {
    public static void main(String[] args) {
        String returnValue = kangaroo(0,2 ,5, 3);
        System.out.println(returnValue);
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        for (int i = 0; i <= 10000; i++){
            if (v2 < v1){
                return ("NO");
            }
            if ((x1-x2)+ i * (v1-v2) == 0){
                return("YES");
            }
        }
        return ("NO");
    }
}
