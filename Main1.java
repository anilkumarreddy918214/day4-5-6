class Main{
public static void main(String[] args){
int num=135,reversed=0;
System.out.println("ORIGINAL NUMBER :"+num);
while(num !=0){
int digit=num % 10;
reversed=reversed * 10 +digit;
num/=10;
}
System.out.println("REVERSED NUMBER :"+reversed);
}
}

