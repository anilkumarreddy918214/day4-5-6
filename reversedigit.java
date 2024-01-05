import java.util.Scanner;
class Reverse{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=0;
int nd=0;

n=sc.nextInt();
while(n!=0){
nd=nd*10+(n%10);
n=n/10;

}
if(n==nd){
System.out.println(nd+"it is palidrom");}
else{
System.out.println(nd+"it is not palindrom");
}
}
}
