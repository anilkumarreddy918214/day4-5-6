import java.util.Scanner;
class Continue{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
byte i=0;
while(false){
i++;
if(i%5==0)continue;
System.out.print(i+",");
}
}
}