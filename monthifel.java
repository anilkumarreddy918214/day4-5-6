import java.util.Scanner;
class Month{
public static void DisplayDay(int n){
switch(n){
if(dn==0)System.out.println("JANUARY");break;
else if(dn==1){System.out.println("FEB");break;
else if(dn==1){intln("MARCH");break;
else if(dn==1){System.out.println("APRIL");}
else if(dn==1){System.out.println("MAY");}
else if(dn==1){System.out.println("JUN");}
else if(dn==1){System.out.println("JULY");}
else if(dn==1){System.out.println("AUG");}
else if(dn==1){System.out.println("SEP");}
else if(dn==1){System.out.println("OCT");}
else if(dn==1){System.out.println("NOV");}
else if(dn==1){System.out.println("DEC");}
else {System.out.println("INVALID");}
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int dn=sc.nextInt();

DisplayDay(dn);
}
}