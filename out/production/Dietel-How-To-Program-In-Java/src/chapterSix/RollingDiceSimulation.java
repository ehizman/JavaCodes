package chapterSix;

import java.security.SecureRandom;

public class RollingDiceSimulation {

    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int face;
        int frequencyFace1 = 0;
        int frequencyFace2 = 0;
        int frequencyFace3 = 0;
        int frequencyFace4 = 0;
        int frequencyFace5 = 0;
        int frequencyFace6 = 0;


        for (int i = 0; i < 6_000_000; i++) {

            face = 1 + randomNumber.nextInt(6);

            switch (face){
                case 1:{
                    ++frequencyFace1;
                    break;
                }
                case (2):{
                    ++frequencyFace2;
                    break;
                }
                case(3):{
                    ++frequencyFace3;
                    break;
                }
                case(4):{
                    ++frequencyFace4;
                    break;
                }
                case(5):{
                    ++frequencyFace5;
                    break;
                }
                case(6): {
                    ++frequencyFace6;
                    break;
                }
                default:{
                    break;
                }
            }
        }
        System.out.printf(" Face 1 shows \t%d times%n Face 2 shows \t%d times%n Face 3 shows \t%d times%n Face 4 " +
                "shows \t%d times%n Face 5 shows \t%d times%n Face 6 shows\t%d times%n", frequencyFace1,
                frequencyFace2, frequencyFace3, frequencyFace4, frequencyFace5, frequencyFace6);
    }
}
