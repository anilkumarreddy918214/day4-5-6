import java.util.Scanner;
class ArthamaticOperation{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int sum=n+m;
int sub=n-m;
int div=n/m;
int product=n*m;
int quotient=n%m;
System.out.println("sum is="+sum);
System.out.println("sub is="+sub);
System.out.println("div is="+div);
System.out.println("prod is="+product);
System.out.println("quotient="+quotient);
}
}


