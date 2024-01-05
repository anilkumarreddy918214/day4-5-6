import java.util.Scanner;
class Month{
public static void DisplayDay(int n){
switch(n){
case 0:System.out.println("JANUARY");break;
case 1:System.out.println("FEB");break;
case 2:System.out.println("MARCH");break;
case 3:System.out.println("APRIL");break;
case 4:System.out.println("MAY");break;
case 5:System.out.println("JUN");break;
case 6:System.out.println("JULY");break;
case 7:System.out.println("AUG");break;
case 8:System.out.println("SEP");break;
case 9:System.out.println("OCT");break;
case 10:System.out.println("NOV");break;
case 11:System.out.println("DEC");break;
default:System.out.println("INVALID");break;
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int dn=sc.nextInt();

DisplayDay(dn);
}
}
