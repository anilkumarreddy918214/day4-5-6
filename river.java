import java.util.Scanner;
class Reverse{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int nd=1;
System.out.print("enter any positive number:");
n=sc.nextInt();
while(n>0){
nd=nd*(n%10);
n=n/10;
}
System.out.println(nd);

}
}