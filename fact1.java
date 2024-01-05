import java.util.Scanner;
class number{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int i=1;
while(n>=i){
if(n%i==0){
count++;}
i++;}

if(n==2){
System.out.println("prime");}
else{
System.out.println(" not prime");}

}
}

