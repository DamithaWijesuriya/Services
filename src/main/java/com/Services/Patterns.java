            package com.Services;
            import java.math.BigInteger;
            import java.util.Scanner;
            import java.util.Scanner;
            public class Patterns{
                public static void main(String[] args) {
                    infinite();
                }

                /**
                 * ex1_q1_using if
                 * print the half of trangle

                 */

                public static void q1with_if() {
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (j < (9 - i))
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                }

                /**
                 * ex1_q1_using for
                 * print the half of trangle

                 */
                public static void q1_onlyWith_for() {
                    int i, j, k;
                    for (i = 10; i >= 1; i--) {
                        for (j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (k = 10; k >= i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }

                /*
                * ex1_q2
                * print trangle
                *
                */
                public static void q2_with_if() {
                    for (int i = 0; i < 20; i++) {
                        for (int j = 20; j > 20 - i; j--) {
                            if (j > i + 1)
                                System.out.print(" ");
                            else
                                System.out.print("*");

                        }
                        System.out.println();

                    }
                }

                /**ex1_q2_extra
                 *
                 */
                public static void q2_extra() {
                    for (int i = 0; i < 20; i++) {
                        for (int j = 0; j < 20 - i; j++) {
                            if (j - i < (i - j + 1))
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();

                    }
                }

                /**
                 * ex1_q3
                 * print Diamond
                 *
                 */
                public static void q3() {
                    int b;
                    for (int a = -10; a <= 10; a++) {
                        if (a < 0)
                            b = -a;
                        else
                            b = a;
                        int c = 10 - b;
                        for (int d = 0; d <= 10 + c; d++) {
                            if (d < b)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                }


                /**
                 * ex1_q4
                 * print half of trangle which is print after a space
                 */

                public static void q4() {
                    int p, q;
                    for (p = 1; p <= 10; p++)

                    {
                        System.out.print(" ----------------- ");
                        for (q = 1; q < p; q++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                /*
                    ex1_q5
                    print half of the trangle with front space

                */
                public static void q5() {
                    for (int i = 0; i < 10; i++) {
                        System.out.print(" ----------------- ");
                        for (int j = 0; j < 10; j++) {
                            if (j < (9 - i))
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                }

                /*ex1_q6


                 */
                public static void q6() {
                    int p, q, r;
                    {
                        for (p = 1; p <= 10; p++)
                        {
                            r = p;
                            if (p > 5) {
                                p -= 5;
                            }
                            for (q = 1; q <= p; q++) {
                                System.out.print("*");
                            }
                            p = r;
                            System.out.println();
                        }
                    }
                }

                /**
                 * ex2_q1

                 *
                 */
                public static void ex2_q1() {
                    for (int a = 1; a <= 5; a++) {
                        for (int b = 1; b <= 5; b++) {
                            if (a == 1 || a == 5 || b == 1 || b == 5) {
                                System.out.print("#");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                }

                /**
                 * ex2_q2
                 * empty square
                 */

                public static void ex2_q2() {
                    for (int p = 1; p <= 6; p++) {
                        for (int q = 1; q <= 6; q++) {
                            if (p == 1 || p == 6) {
                                System.out.print("#");
                            } else if (p == q) {
                                System.out.print("#");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println("");
                    }
                }


                /**
                 * ex2_q3
                 *
                 *print Z
                 */

                public static void ex_q3() {
                    for (int s = 1; s <= 6; s++) {
                        for (int t = 1; t <= 6; t++) {
                            if (s == 1 || s == 6) {
                                System.out.print("#");
                            } else if (s == 6 - t) {
                                System.out.print("#");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println("");
                    }
                }
                /**
                 *ex2_q4
                 * print reverse z
                 */
                public static void ex_q4() {
                    int w = 10;
                    for (int l = 1; l <= w; l++) {
                        for (int m = 1; m < w; m++) {
                            if (l == 1 || l == w || l == m || l == w - m) {
                                System.out.print("#");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                }

                /**
                  ex2_q5

                 *
                 */

                public static void ex2_q5() {
                    int k = 10;
                    for (int u = 1; u <= k; u++) {
                        for (int v = 1; v <= k; v++) {
                            if (u == 1 || u == k || v == 1 || v == k || u == v || u == (k - v)) {
                                System.out.print("#");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                }

                /**
                 * ex2_Factorial
                 */
                public static void  ex2_Factorial() {

                    for (int i=1;;i++) {

                        Scanner sc = new Scanner(System.in);
                        System.out.println("Please input a Integer ");
                        String input = sc.nextLine();
                        BigInteger num = new BigInteger(input), ans = new BigInteger("1");
                        System.out.println(num.toString());

                        while (true) {
                            if (num.equals(BigInteger.valueOf(0))) {
                                break;
                            }
                            ans = ans.multiply(num);
                            num = num.subtract(BigInteger.valueOf(1));
                        }

                        Scanner endCommand = new Scanner(System.in);
                        System.out.println("Do you want Continue ? (Y,N)");
                        String command = endCommand.nextLine();
                        if (command.equals("N")) {
                            break;
                        }
                        else if (command.equals("Y"))
                            continue;
                        else
                            System.out.println("Not a valid command, please type Y or N." + command);
                    }


                }

                /**
                 * multiplication_table
                 */
                public static void multiplication_table() {
                    int z = 12;
                    for (int x = 0; x <= z; x++) {
                        for (int y = 0; y <= z; y++) {

                            System.out.print(x + "X" + y + "= " + "\t" + x * y + "\t" + "||" + "\t");
                        }
                        System.out.println();
                    }
                }


                /**switch statment
                 *
                 */
                public static void switchans(String x) {
                    long startTime = System.nanoTime();
                    switch (x) {
                        case "1":
                            q1_onlyWith_for();
                            break;
                        case "2":
                            q1with_if();
                            break;
                        case "3":
                            q2_with_if();
                            break;
                        case "4":
                            q2_extra();
                            break;
                        case "5":
                            q3();
                            break;
                        case "6":
                            q4();
                            break;
                        case "7":
                            q5();
                            break;
                        case "8":
                            q6();
                            break;
                        case "9":
                            ex2_q1();
                            break;
                        case "10":
                            ex2_q2();
                            break;
                        case "11":
                            ex_q3();
                            break;
                        case "12":
                            ex_q4();
                            break;
                        case "13":
                            ex2_q5();
                            break;
                        case "14":
                            multiplication_table();
                            break;
                        case "15":
                            ex2_Factorial();
                            break;
                        case "16":
                            infinite();
                            break;
                        case "17":
                            fibonacciIterative();
                            break;
                        case "18":
                            q3_2d();
                            break;


                        default:
                            long endTime = System.nanoTime();
                            long duration = (endTime - startTime);
                            System.out.println("Execution time" + duration);

                    }
                }


                public static void infinite()
                {
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    go:

                    for(; ;)
                    {

                       switch (input) {
                           case "x":
                               break;

                           default:
                               System.out.println("Invalid Command");
                       }

                    }

                }

                /**
                 *
                 * Fibonacci
                 */

                public static void fibonacciIterative() {
                    Scanner input = new Scanner(System.in);
                    int total;
                    System.out.print("This is a Fibonacci sequence displayer.\nHow many numbers would you like it to display?");
                    total = input.nextInt();

                    BigInteger[] series = new BigInteger[total];

                    for (int x = 0; x < total; x++) {
                        if(x <= 1)
                        {
                            if(x == 1)
                                series[x] = BigInteger.valueOf(1L);
                            if(x == 0)
                                series[x] = BigInteger.valueOf(0L);
                        }

                        else
                            series[x] = series[x - 1].add(series[x - 2]);
                    }
                    for (int j = 0; j < series.length; j++) {


                        System.out.print(series[j] + "\n");
                    }
                    input.close();

                }


                /**
                 * print patterns in 2d array
                 */

                public static String[][] q3_2d()
                {
                    String[][] arr = new String[11][11];
                    for (int s = 10; s > 0; s--)
                    {
                        for (int t = 0; t <= 10; t++)
                        {
                            if (t < s)
                            {
                                arr[s][t] = " ";
                                System.out.print(arr[s][t]);
                            }
                            else
                                arr[s][t] = "* ";
                                System.out.print(arr[s][t]);
                        }
                        System.out.println();
                    }

                    return arr;
                }
            }







