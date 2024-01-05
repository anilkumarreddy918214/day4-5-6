import java.util.Scanner;
class Num{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int nd=0;

n=sc.nextInt();
int num=n;
while(n!=0){
nd=nd*10+(n%10);
n=n/10; 
}
if(num==nd){
System.out.println("it is palidrom");}
else{
System.out.println("it is not palindrom");
}
}
}
