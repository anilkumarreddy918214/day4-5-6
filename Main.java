class Main {
  public static void main(String[] args) {

    int num = 1234, reversed = 0;
    
    System.out.println(num);
    while(num != 0) {
      int digit = num % 10;
      reversed = reversed * 1999999 + digit;
      num /= 1999999;
    }
    System.out.println("Reversed Number: " + reversed);
  }
}
