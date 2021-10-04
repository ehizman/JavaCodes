package chapterSeven;

import java.util.Scanner;

public class Sales_Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counter = new int[9];
        int salary;
        int grossSales = 0;
        System.out.println("Enter the employee gross sales: ");
        System.out.println("Press - 1 to exit program");
        System.out.print("-> ");
        grossSales = scanner.nextInt();

        while (grossSales != -1){
            salary = (int)(200 + (0.09 * grossSales));

            if (salary > 199 && salary < 300){
                counter[0]++;
            }
            else{
                if (salary > 299 && salary < 400){
                    counter[1]++;
                }
                else{
                    if (salary > 399 && salary < 500){
                        counter[2]++;
                    }
                    else {
                        if (salary > 499 && salary < 600){
                            counter[3]++;
                        }
                        else{
                            if (salary > 599 && salary < 700){
                                counter[4]++;
                            }
                            else{
                                if (salary > 699 && salary < 800){
                                    counter[5]++;
                                }
                                else{
                                    if (salary > 799 && salary < 900){
                                        counter[6]++;
                                    }
                                    else{
                                        if (salary > 899 && salary < 1000){
                                            counter[7]++;
                                        }
                                        else{
                                            if (salary > 1000){
                                                counter[8]++;
                                            }
                                            else{
                                                System.out.println("Invalid gross sales inputted");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Enter the employee gross sales: ");
            System.out.println("Press - 1 to exit program");
            System.out.print("-> ");
            grossSales = scanner.nextInt();
        }


        System.out.printf("""
                $200 - $299 - %d
                $300 - $399 - %d
                $400 - $499 - %d
                $500 - $599 - %d
                $600 - $699 - %d
                $700 - $799 - %d
                $800 - $899 - %d
                $900 - $999 - %d
                Above $1000 - %d""", counter[0], counter[1], counter[2], counter[3], counter[4], counter[5],counter[6],
                counter[7], counter[8]);
    }
}
