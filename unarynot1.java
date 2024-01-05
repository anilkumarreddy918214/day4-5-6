import java.util.Scanner;
class Test{
public static void main(String args[]){
boolean c=true;
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Code is:"+c);
System.out.println("A is:"+a);
System.out.println("B is:"+b);
System.out.println("Code is:"+!c);
System.out.println("!(a<b) is:"+!(a<b));
System.out.println("!(a>b) is:"+!(a>b));
}
}