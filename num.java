import java.util.Scanner;
class number{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
while(n!=0){
if(n%i==0){
if(n==i)
{
System.out.print(i);}
else{
System.out.print(i+",");
}
}
i++;
}
}
}

