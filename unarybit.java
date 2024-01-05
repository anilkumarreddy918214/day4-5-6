import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int b=sc.nextInt();
System.out.println("First Number="+n);
System.out.println("Second Number="+b);
System.out.println(n+"s bitwise Complement="+~n);
System.out.println(b+"s bitwise Complement="+~b);
}
}


