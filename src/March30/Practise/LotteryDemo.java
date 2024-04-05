package March30.Practise;

import java.util.Scanner;

public class LotteryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int lt= 0;
//        System.out.println("Enter your Lottery ticket number in between 1- 100 ");
//        System.out.println("You can have maximum 3 tries: ");
//            for (int i = 1; i <= 3; i++) {
//                lt = sc.nextInt();
//
//                    if (lt != 55) {
//                        System.out.println("Try Again");
//                    } else {
//                        System.out.println("You are winner");
//                    }
//            }
//            System.out.println("Sorry for this time! Better luck next time");
//        }
//        }



            System.out.println("****Welcome to my Lottery System****");
            System.out.println("Enter the number you want to try. ");
            System.out.print("That number must be between 1 and 100 : ");
            int num = sc.nextInt();
            if (num == 55) {
                System.out.println("Congratulations!! You won the lottery of $50k");
            }
            else if (num == 10 || num == 20) {
                System.out.println("Sorry. Please try again");
            }
            else if ( num > 100 || num < 1)
            {
                System.out.println("Number is out of range");
            }
            else
                    System.out.println("Better luck next time");
               }
            }



