/*import java.util.*;

class main {
    public static void main(String[] args) {

        // abcdefghijklmnopqrstuvwxyz

        //System.out.print("hello world!!");

        // int number = 10;
        // String name = "max";
        // System.out.println(number);
        // System.out.println(name);

        // int a = 20;
        // int b = 10;
        // int c = a+b;
        // System.out.print(c);

         //System.out. println(1 + 1 + 1 + 1 + 1 == 5);

        // Scanner sc = new Scanner(System.in);//its buy value
        // System.out.println("Enter your name:");
        // String name = sc.nextLine();//its store the value
        // System.out.println("hi I am " + name);

        // Scanner input = new Scanner(System.in);
        // System.out.println("enter the first number");
        // int a = input.nextInt();
        // System.out.println("enter the second number");
        // int b = input.nextInt();
        // int c=a+b;
        // System.out.println("the sum of two value is:-" + c);

        // Scanner input = new Scanner(System.in);
        // System.out.println("enter name");
        // String name = input.nextLine();
        // System.out.println("enter age");
        // int age = input.nextInt();
        // System.out.println("hi my name is "+ name + "and my age is " + age);

        // System.out.println("simple interest calculator");
        // Scanner scan = new Scanner(System.in);
        // System.out.println("enter p value");
        // int p = scan.nextInt();
        // System.out.println("enter r value");
        // int r = scan.nextInt();
        // System.out.println("enter t value");
        // int t = scan.nextInt();
        // int si = (p*r*t)/100;
        // System.out.println("the simple interest is:" + si);


        // Scanner input = new Scanner(System.in);
        // System.out.println("enter the value of A");
        // int a = input.nextInt();
        // System.out.println("enter the value of B");
        // int b = input.nextInt();
        // if(a>b){
        // System.out.println("A is big");
        // }
        // else{
        // System.out.println("B is big");
        // }

        // Scanner input = new Scanner (System.in);
        // System.out.println("enter the mark");
        // int mark = input.nextInt();
        // if(mark>=35){
        // System.out.println("pass");
        // }
        // else{
        // System.out.println("fail");
        // }

        // int a = 10;
        // int b = 20;
        // if(a>b){
        //     System.out.println("a is biggest");
        // }
        // else if(b>a){
        //     System.out.println("b is biggest");
        // }
        // else{
        //     System.out.println("both are equal");
        // }

        // ------------------FOOOOOOOOOOOR-LOOOOOOOOOOOOOP-----------------------------

        // for(int i=1; i<=5 ; i++){
        // System.out.println(i);
        // }

        // for(int i=5; i>=0 ; i--){
        // System.out.println(i);
        // }

        // Scanner input = new Scanner(System.in);
        // System.out.println("enter the start value");
        // int a = input.nextInt();
        // System.out.println("enter the end value");
        // int b = input.nextInt();
        // for(int i=a; i<=b; i=i+1){
        // System.out.println(i);
        // }

        // for(int i=1; i<=10; i=i+1){
        // if(i%2==0){
        // System.out.println(i);
        // }
        // }

        // for (int i=1; i<=5; i++){
        // for(int j=1; j<=2 ;j++){
        // System.out.println("helloWorld");
        // }
        // }

        // for(int i=1; i<=3; i++){
        // for(int j=1; j<=3; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for(int i=1; i<=3; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // System.out.println("Its square * pattern");
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=5; j++){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        // System.out.println("Right Half Pyramid Pattern");
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        // System.out.println("Reverse Right Half Pyramid Pattern");
        // for(int i=1; i<=5; i++){
        // for(int j=i; j<=5; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // System.out.println("Number Increasing Pyramid Pattern");
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(j);
        // }
        // System.out.println("");
        // }

        // System.out.println("Number-Increasing Reverse Pyramid Pattern");
        // for(int i=1; i<=5; i++){
        // for(int j=i; j<=5; j++){
        // System.out.print(j);
        // }
        // System.out.println("");
        // }

        // System.out.println(" Right Pascal’s Triangle");
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // for(int i=1; i<=4; i++){
        // for(int j=i; j<=4; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // System.out.println("K Pattern");
        // for(int i=1; i<=5; i++){
        // for(int j=i; j<=5; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // System.out.println("Zero-One Triangle Pattern");
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=i; j++){
        // // System.out.print("*");
        // if((i + j) % 2 == 0){
        // System.out.print("1 ");
        // }
        // else{
        // System.out.print("0 ");
        // }
        // }
        // System.out.println("");
        // }

        // System.out.println("Number-Changing Pyramid Pattern");
        // int num=1;
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(num+" ");
        // num++;
        // }
        // System.out.println("");
        // }

        // ------------------FOOOOOOOOOOOR-EACHHH-LOOOOOOOOOOOOOP-----------------------------
        // int num[] = {12,34,56,78,90};
        // for(int var:num){
        //     System.out.println(var);
        // }

        // String num[] = {"one","two","three","four","five"};
        // for(String var:num){
        //     System.out.println(var);
        // }


        // -------------------------------ARRRRRRRRRAY------------------------------

        
        // int[] myArray = new int[1]; // Creates an array with 5 elements
        // myArray[0]=12;
        // System.out.println(Arrays.toString(myArray));


        // String fruit[] ={"apple","banana","orange",};
        // System.out.println(Arrays.toString(fruit));

        // int num[] ={1,2,3,4,5};
        // System.out.println(num[2]);//-->3
        // System.out.println(Arrays.toString(num));//--->[1,2,3,4,5]

        // Scanner input = new Scanner(System.in);
        // System.out.println("enter A");
        // int a = input.nextInt();
        // System.out.println("enter B");
        // int b = input.nextInt();
        // System.out.println("enter C");
        // int c = input.nextInt();
        // System.out.println("enter D");
        // int d = input.nextInt();
        // int num[]={a,b,c,d};
        // System.out.println("Array:-" + Arrays.toString(num));

        // System.out.println("reverse array");
        // int num[]={12,84,72,20,67};
        // for (int i = num.length - 1; i >= 0; i--) {
        //      System.out.print(num[i] + " ");
        //     }

        // System.out.println("reverse array");
        // String arr[]={"apple","banana","orange","mango"};
        // for(int i = arr.length - 1; i >=0; i--){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println("add to array");
        // int[] a = {12, 45, 64, 34, 35};
        // int[] b = {98, 65, 82, 73, 10};
        // int[] c = new int[a.length + b.length];
        // // Copy elements from a
        // for (int i = 0; i < a.length; i++) {
        //     c[i] = a[i];
        // }
        // // Copy elements from b
        // for (int i = 0; i < b.length; i++) {
        //     c[i + a.length] = b[i];
        // }
        // // Print merged array c
        // System.out.print("Merged array c: ");
        // for (int value : c) {
        //     System.out.print(value + " ");
        // }

        // System.out.println("table problem");
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter which table you want:- ");
        // int a = scan.nextInt();
        // for(int i=0; i<=10; i++){
        //     System.out.println(i + "*" + a + "=" + a*i);
        // }

        // System.out.println("find max element in array");
        // int num[] = {1,2,3,4,5};    //----->try {12,34,56,78,90}
        // int max = num[0];
        // for(int var : num){
        //     if(var > max){          //1>1 - 2>1 - 3>2 - 4>3 - 5>4 - 5>5 
        //         max = var;         //max=2 - max=3 - max=4 - max=5 the loop done next print max value
        //     }
        //  }
        //     System.out.println("The largest value is: " + max);

        // System.out.println("Reverse the Array");
        // int num[] ={49,17,43,62,39};
        // for(int i=num.length-1; i>=0; i--){
        //     System.out.print(num[i]+" ");
        // }

        // System.out.println("count even number");
        // int num[] = {1,2,3,4,5,6,7,8,9,10};
        // for(int var : num){
        //     if(var%2==0){
        //         System.out.println(var);
        //     }
        // }

        // System.out.println("check for a specificvalue");
        // int num[] = {12,34,56,78,90};
        // Scanner scan = new Scanner(System.in);
        // System.out.println("which number you want to find");
        // int a = scan.nextInt();
        // for(int var : num){
        //     if(var==a){
        //         System.out.println("true");
        //     }
        // }

        // -------------------------------WHILE-LOOOOOOOOOOOOOOP------------------------------

        // int i = 1;
        // while(i<=10){
        //     System.out.println(i);
        //     i=i+2;
        // }

        //-------------------------doooo-while--loooooooooooop---------------------------------

        // int i = 1;
        // do {
        //     System.out.println("Number: " + i);
        //     i++;
        // } while (i <= 5);

    }
}*/