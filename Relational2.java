import java.util.Scanner;
class Relational{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if((a<b)&&(a<c)){
System.out.println("the number is="+a);}
if((b<a)&&(b<c));{
System.out.println("the number is="+b);}
if((c<a)&&(c<b));{
System.out.println("the number is="+c);}
}
}