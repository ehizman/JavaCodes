package ChapterFive;

import java.util.Arrays;
import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static String displayPrompt() {
       return """
     -> Press 1 to display verse for the first day;
     -> Press 2 to display verse for the second day;
     -> Press 3 to display verse for the third day;
     -> Press 4 to display verse for the fourth day;
     -> Press 5 to display verse for the fifth day;
     -> Press 6 to display verse for the sixth day;
     -> Press 7 to display verse for the seventh day;
     -> Press 8 to display verse for the eight day;
     -> Press 9 to display verse for the ninth day;
     -> Press 10 to display verse for the tenth day;
     -> Press 11 to display verse for the eleventh day;
     -> Press 12 to display verse for the twelveth day;
     -> Press -1 to exit;
     """;
    }

    public static String chooseDay(int day) {
       switch (day){
      case 1:
     return ("""
        The first day of Christmas,
        My true love sent to me
        """);
      case 2:
     return("""
        The second day of Christmas,
        My true love sent to me
        """);
      case 3:
     return("""
        The third day of Christmas,
        My true love sent to me
        """);
      case 4:
     return("""
        The fourth day of Christmas,
        My true love sent to me
        """);
      case 5:
     return("""
        The fifth day of Christmas,
        My true love sent to me
        """);
      case 6:
     return("""
        The sixth day of Christmas,
        My true love sent to me
        """);
      case 7:
     return("""
        The seventh day of Christmas,
        My true love sent to me
        """);
      case 8:
     return("""
        The eight day of Christmas,
        My true love sent to me
        """);
      case 9:
     return("""
        The ninth day of Christmas,
        My true love sent to me
        """);
      case 10:
     return("""
        The tenth day of Christmas,
        My true love sent to me
        """);
      case 11:
     return("""
        The eleventh day of Christmas,
        My true love sent to me
        """);
      case 12:
     return("""
        The twelveth day of Christmas,
        My true love sent to me
        """);
      case -1:
     return ("""
        Exit;
        """);
      default:
     return("""
       Please enter a valid input
       """);
       }
    }

    public static String displayLyrics(int day) {
       String lyrics = "";
       switch (day){
           case 12:
               lyrics = lyrics + """
               Twelve drummers drumming,
               """;
               case 11:
                   lyrics = lyrics + """
                   Eleven pipers piping,
                   """;
                   case 10:
                       lyrics = lyrics + """
                       Ten lords a leaping,
                       """;
                       case 9:
                           lyrics = lyrics + """
                           Nine ladies dancing,
                           """;
                           case 8:
                               lyrics = lyrics + """
                               Eight maids a milking,
                               """;
                               case 7:
                                   lyrics = lyrics + """
                                   Seven swans a swimming,
                                   """;
                                   case 6:
                                       lyrics = lyrics + """
                                       Six geese a laying,
                                       """;
                                       case 5:
                                           lyrics = lyrics + """
                                           Five gold rings,
                                           """;
                                           case 4:
                                               lyrics = lyrics + """
                                               Four calling birds,
                                               """;
                                               case 3:
                                                   lyrics = lyrics + """
                                                   Three French hens,
                                                   """;
                                                   case 2:
                                                       lyrics = lyrics + """
                                                       Two turtle doves, and
                                                       """;
                                                       case 1:
                                                           lyrics = lyrics + """
                                                           A partridge in a pear tree.
                                                           """;
                                                           break;
                                                           default:
                                                               break;
       }
       return lyrics;
    }

    public static void main(String[] args) {
       int day;
       Scanner inputCollector = new Scanner(System.in);
       do {
           System.out.println(displayPrompt());
           System.out.print("Waiting for input: ");
           day = inputCollector.nextInt();
           System.out.println();
           System.out.print(chooseDay(day));
           if (day > 0 && (day <13)){
               System.out.println(displayLyrics(day));
           }
           else{
               day = -1;
           }

       }while (day != -1);
    }
}
