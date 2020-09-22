import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n=10;

    if(n < 10){
      System.out.println("n 은 10보다 작습니다.");
    }else if(n == 10){
      System.out.println("n 은 10입니다.");
    }else{
      System.out.println("n 은 10보다 큽니다.");
    }

    int num = 10;
    if(num > 10){
      System.out.print("Richard ");
    }
    if(num == 10){
      System.out.print("King ");
    }
    if(num <= 10){
      System.out.print("Philippe ");
    }

    int num1 = 80;

    if(num1 % 2 == 1){
      System.out.println("School ");
    }else if(num1 >= 80){
      System.out.println("Study ");
    }else{
      System.out.println("Teacher ");
    }

    int num2 = 10;

    if(num2 > 0 && num2 % 2 == 1){
      System.out.print("Spain : " + (num2 > 0 && num2 % 2 == 1));
    }
    if(num2 > 10 || num2 == 10){
      System.out.print("Italy : " + (num2 > 10));
    }
    System.out.println(" / "+ (num2 == 10));

    System.out.println("정수입력1");
    int num3 = sc.nextInt();
    System.out.println("정수입력2");
    int num4 = sc.nextInt();

    int max;
    int min;
    if(num3 == num4){
      System.out.println("같은숫자입니다.");
    }
    if(num3 > num4){
      max = num3;
      min = num4;
    }else{
      max = num4;
      min = num3;
    }
    if(num3 != num4){
    System.out.println(min + " 가장작고 " + max + " 가장큼 ");
    }

    final String text = "자바 재밌다!";

    for(int i=0; i<5; i++){
      System.out.println(text);
    }

    final String text1 = "오예!";

    for(int u=0; u<=100; u++){
      if(u % 10 == 0){
        System.out.println(text1);
      }
    }

    for(int ii=0; ii<=100; ii++){
      if(ii % 2 == 0){
        System.out.println(ii);
      }
    }

    System.out.println("카운트다운");
    int count = sc.nextInt();

    for(int uu=count; uu>=0; uu--){
      System.out.println(uu);
    }

    System.out.println("첫번째수");
    int sum = sc.nextInt();
    System.out.println("두번째수");
    int sum2 = sc.nextInt();

    





    double avg = sc.nextDouble();


  }
}