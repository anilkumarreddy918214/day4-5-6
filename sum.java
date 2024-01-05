import java.util.Scanner;
class Sum{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int nd=0;
n=sc.nextInt();
while(n>0){
nd=nd+n%10;
n=n/10;
}
System.out.println(nd);
}
}

