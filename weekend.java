import java.util.Scanner;
class Weekend{
public static void DisplayDay(int n){
switch(n){
case 0:System.out.println("SUNDAY");break;
case 1:System.out.println("MONDAY");break;
case 2:System.out.println("TUESDAY");break;
case 3:System.out.println("WENDESDAY");break;
case 4:System.out.println("THURSDAY");break;
case 5:System.out.println("FRIDAY");break;
case 6:System.out.println("SATURDAY");break;
default:System.out.println("INVALID");break;
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int dn=sc.nextInt();

DisplayDay(dn);
}
}

