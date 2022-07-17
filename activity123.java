import java.util.Scanner;

public class activity123 {
    public static void main(String[] args) {
        //First activity:
        //First:
     Scanner console=new Scanner(System.in);
     System.out.println("Enter the number!");
     int num = console.nextInt();
     check(num);
    }
    static void check(int num){
        if(num%2==0){
            System.out.println("The number is even!");
        } else{
            System.out.println("The number is odd!");
        }

        //Forth:
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Enter first number!");
//        String temp = console.next();
//
//        System.out.println("Enter second number!");
//        int y=console.nextInt();
//        System.out.println("Enter third number!+\nIf you only have two numbers enter 0.");
//        int z=console.nextInt();
//        try{
//            int x = Integer.parseInt(temp);
//            sum(x,y);
//        } catch(Exception e){
//            double x = Double.parseDouble(temp);
//            sum(x,y);
//        } finally {
//            if(z != 0){
//                int x = Integer.parseInt(temp);
//                sum(x,y,z);
//            }
//        }
//    }
//
//    public static void sum (int firstNum , int secondNum) {
//        int sum = firstNum + secondNum ;
//        System.out.println("The sum of the numbers is: "+sum);
//    }
//    public static void sum (int firstNum , int secondNum , int thirdNum) {
//        int sum = firstNum + secondNum + thirdNum ;
//        System.out.println("The sum of the numbers is:"+sum);
//    }
//    public static void sum (double firstNum , int secondNum) {
//        double sum = firstNum + secondNum  ;
//        System.out.println("The sum of the numbers is:"+sum);
//    }
//}

        //Second activity:
        //First :
//        Scanner console = new Scanner(System.in);
//        int[] array = new int[5];
//        System.out.println("Enter the numbers!");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = console.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + "");
//        }
//    }
//}

        //Second :
//        int[] array = {1,2,3};
//        System.out.println("The sum of the array is " + arraySum(array));
//    }
//
//    private static int arraySum(int[] array) {
//        int sum = 0;
//        for(int i = 0; i < array.length; i++)
//            sum+= array[i];
//        return sum;
//    }
//}

       //Third :
//        Scanner console=new Scanner(System.in);
//        int[] array = new int [3];
//        System.out.println("Enter the numbers!");
//        for (int i=0;i<array.length;i++) {
//            array[i]=console.nextInt();
//        }
//        squaredArray(array);
//    }
//
//    public static int[] squaredArray (int[] Array) {
//        int [] Array2 = new int[3];
//        for (int i=0; i<Array2.length; i++) {
//
//            Array2[i]=Array[i]*Array[i] ;}
//        for(int i=0; i<Array2.length; i++) {
//            System.out.print(Array2[i]+" ");}
//        return Array2 ;
//    }
//
//
//
//    public static int arraySum (int[] Array) {
//        int sum = 0;
//        for (int i=0; i<Array.length; i++)
//            sum += Array[i];
//        return sum;
//    }
//}



    //Third activity:
    //First :
//        int[] arr = { 2, 3, 6,0, 3, 9, 7 };
//        System.out.println(findIndex(arr , 11));
//    }
//
//    public static int findIndex(int[] arr, int num) {
//        int find = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == num) {
//                find = i;
//                return i;
//            }
//        }
//        return find;
//    }
//}

    //Second :
//        int[] arr = { 2, 3, 6,0, 3, 9, 7 };
//        System.out.println(findMin(arr));
//    }
//
//    public static int findMin(int[] arr) {
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            min = Math.min(min, arr[i]);
//        }
//        return min;
//    }
//}
