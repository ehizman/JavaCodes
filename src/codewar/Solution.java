package codewar;


public class Solution {
    public static void main(String[] args) {
        String string = "Boy***man,is-good";
        System.out.println(camelCase(string));
    }

    public static String camelCase(String string){
        StringBuilder result = new StringBuilder();
        boolean capitalize = false;
        for (Character i: string.toCharArray()){
            String character = i + "";
            if (!character.matches("[A-Za-z]")){
                capitalize = true;
            }
            else{
                if (capitalize){
                    result.append(character.toUpperCase());
                    capitalize = false;
                }
                else{
                    result.append(character);
                }
            }
        }
        result.replace(0,1,result.substring(0, 1).toLowerCase());
        return result.toString();

    }
}
