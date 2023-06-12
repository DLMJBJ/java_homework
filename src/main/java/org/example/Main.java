package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Ex01. 반지름이 10.0인 원의 면적을 구하시오.
         * 원의 넓이 구하는 공식은 반지름*반지름*파이로 계산
         * 변수 규칙
         * 파이 : PI, 상수 double
         * 반지름 : radius, 변수 double
         * 원의 면적 : circleArea, 변수 double
         * */
//        final double PI = 3.14159265359;
//        double radius = 10 ;// TODO:값이 고정이네
//        double circleArea;
//        circleArea=radius*radius*PI;
//        System.out.println("원의면적은 " + circleArea);

        /**
         * Ex02. 스캐너로 정수를 입력받고 3의 배수인지 판별하기
         * */
//        Scanner s = new Scanner(System.in);
//        System.out.print("숫자를 입력하시오: ");
//        int num = s.nextInt();
//        if(num%3==0 && num!=0) System.out.println("3의 배수입니다.");
//        else System.out.println("3의 배수가 아닙니다.");
//        s.close();
        /**
         *Ex03. 스캐너로 정수값인 성적을 입력받고 학점매기기. 90점까지는 A, 80점까지는 B, 70점까지는 C, 60점까지는 D, 나머지는 F
         * if~else문을 사용하여 만드시오.
         * */
//      Scanner s = new Scanner(System.in);
//        System.out.println("점수를입력하세요: ");
//        int score = s.nextInt();
//        if(score>=90) System.out.println("A");
//        else if (score>=80) System.out.println("B");
//        else if (score>=70) System.out.println("C");
//        else if (score>=60) System.out.println("D");
//        else System.out.println("E");
//        s.close();
        /**
         *Ex04. 스캐너로 정수값인 성적을 입력받고 60점 이상은 합격, 미만이면 불합격 출력하기. 단, 4학년의 경우 70점 이상이어야 합격.
         * if~else문을 사용하시오.
         * */
//        Scanner s= new Scanner(System.in);
//        System.out.print("점수를입력하시오:");
//        int score = s.nextInt();
//        System.out.print("학년을입력하시오:");
//        int year = s.nextInt();
//        if(year==4) {
//            if (score >= 70) System.out.println("합격");
//            else System.out.println("불합격");
//        }else {
//            if (score >= 60) System.out.println("합격");
//            else System.out.println("불합격");
//        }
//        s.close();
        /**
         * Ex05. 스캐너로 정수값인 성적을 입력받고 90점까지는 A, 80점까지는 B, ...60점까지는 D, 나머지는 F
         * switch문을 사용하시오.
         * */
        /**
         * Scanner s = new Scanner (System.in);
         *         char grade;
         *         System.out.println("점수를 입력하시오 :");
         *         int score=s.nextInt();
         *         switch (score/10) {
         *             case 10:
         *             case 9:
         *                 grade = 'A';
         *                 break;
         *             case 8:
         *                 grade = 'B';
         *                 break;
         *             case 7:
         *                 grade = 'C';
         *                 break;
         *             case 6:
         *                 grade = 'D';
         *                 break;
         *             default:
         *                 grade = 'F';
         *                 break;
         *         }
         *         System.out.println("학점은"+grade+"입니다");
         *         s.close();
         * */
        /**
         *Ex06. 에스프레소, 카푸치노, 카페라떼는 3500원, 아메리카노는 2000원으로 하여 커피 메뉴의 가격을 알려주는 프로그램을 만들기
         * 한글을 입력하면 금액을 알려주는 프로그램
         * */
//        Scanner s= new Scanner(System.in);
//        System.out.println("커피메뉴를 선택하시오 ");
//        String order = s.next();
//        int price=0;
//        if(order.equals("에스프레소") || order.equals("카푸치노") || order.equals("카페라떼")) price=3500;
//        else price=2000;
//
//        if (price!=0){
//            System.out.print(order+"는"+price+"원입니다");
//        }
//        s.close();
        /**
         *Ex07. 다음 각 항목이 나타내는 변수를 선언하시오
         * (1) int 형 변수 height :
         * (2) 0.25로 초기화된 double형 변수 size :
         * (3) height 변수의 값과 size변수의 값을 더한 값으로 초기화된 double형 변수 total :
         * (4) 문자 'a'로 초기화된 char형 변수 c :
         * (5) 자신의 이름으로 초기화된 문자열변수 name :
         * */
//        int height;
//        double size=0.25;
//        double total=height+size;
//        char c = 'a';
//        String name="장범준";
        /**
         * Ex08.  다음 수식의 결과 타입은?
         * (1) 67+12.8 :
         * (2) 10/3  :
         * (3) 10.0/3 :
         * (4) 10==9 :
         * */

        final double bodyTemp = 36.5;
    /**
     * Ex10.  다음 문장을 조건식으로 나타내시오.
     * (1) age는 12보다 작거나 같다
     * (2) age는 b보다 작고 c보다 크다
     * (3) age는 빼기 5는 10과 같다
     * (4) age는 b와 같지 않거나 c와 같다
     * int age;
     *     if(age<=12)
     *     if(age<b && age>c)
     *     if(age-5==10)
     *     if(age!=b || age==c)
     * */
    /**
     * Ex11.  다음 조건문을 조건 연산자를 이용하여 한 문장으로 작성하라.
     * if(sum>100) sum = 100;
     * else sum = 0;
     * int sum;
     * sum = sum>100 ? 100 : 0;
     * */
    /**
     * if(n>5) System.out.println(n);
     * else System.out.println(5);
     * */
    /**
     * Ex13. 다음 if문을 switch문으로 바꾸시오.
     * if(in.equals("가위")) System.out.println(1);
     * else if(in.equals("바위")) System.out.println(2);
     * else if(in.equals("보")) System.out.println(3);
     * else System.out.println(0);
     * */
//        int n=3;
//        System.out.println(n>5 ? n: 5);
//
//        Scanner s=new Scanner(System.in);
//        String in=s.next();
//        switch (in){
//            case "가위":
//                System.out.println(1);
//                break;
//            case "바위":
//                System.out.println(2);
//                break;
//            case "보":
//                System.out.println(3);
//                break;
//            default:
//                System.out.println(0);
//                break;
//        }
        /**
         * Ex14. Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
         * 다음 예시와 같이 출력하는 프로그램을 작성하라. ($1=1100원으로 가정)
         * */
        /**
         *         Scanner s=new Scanner(System.in);
         *         System.out.println("원화를 입력하세요(단위:원)>>");
         *         int num=s.nextInt();
         *         double dollar;
         *         dollar=(double) num/1100;
         *         dollar = Math.round(dollar*100)/100.0;
         *         System.out.println(num+"원은 $"+dollar+"입니다.");
         *         s.close();
         * */
        /**
         * Ex15.  Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
         * 십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
         *
         * Ex15_01. 2자리의 정수인지도 판별해 주려면??
         *
         * Scanner s=new Scanner(System.in);
         *         System.out.println("2자리의 정수 입력(10~99)>>");
         *         try {
         *             int num = s.nextInt();
         *             if(num/10==num%10) System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
         *             else System.out.println("No.. 다른디...");
         *         }catch (InputMismatchException e){
         *             System.out.println("아잇 어! 정수가 아니잖아");
         *         }
         *         s.close();
         * */
        /**
         * Ex16. Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전,
         * 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력하라.
         * */
        /**
         * Scanner s=new Scanner(System.in);
         *         System.out.println("금액을입력하시오>>");
         *
         *         int num=s.nextInt();
         *
         *         if(50000<=num){
         *             System.out.println("오만 원권 "+num/50000+"매");
         *             num%=50000;
         *         }
         *         if(10000<=num){
         *             System.out.println("만 원권 "+num/10000+"매");
         *             num%=10000;
         *         }
         *         if(5000<=num){
         *             System.out.println("오천 원권 "+num/5000+"매");
         *             num%=5000;
         *         }
         *         if(1000<=num){
         *             System.out.println("천 원권 "+num/1000+"매");
         *             num%=1000;
         *         }
         *         if(500<=num){
         *             System.out.println("500 원권 "+num/500+"매");
         *             num%=500;
         *         }
         *         if(100<=num){
         *             System.out.println("100 원권 "+num/100+"매");
         *             num%=100;
         *         }
         *         if(50<=num){
         *             System.out.println("50 원권 "+num/50+"매");
         *             num%=50;
         *         }
         *         if(10<=num){
         *             System.out.println("10 원권 "+num/10+"매");
         *             num%=10;
         *         }
         *         System.out.println("1원 "+num+"개");
         *         s.close();
         * */
        /**
         * Ex16_01. 배열로 푸는 법. 훨씬 쉬움.
         * */
//        int[] coin = {50000, 10000, 1000, 500, 100, 50, 10, 1};
//        Scanner s=new Scanner(System.in);
//        System.out.println("금액을 입력하시오>>");
//        int num=s.nextInt();
//
//        for(int i=0;i<coin.length;i++){
//            if(coin[i]<=num){
//                System.out.println(coin[i]+"원권 "+num/coin[i]+"개");
//                num%=coin[i];
//            }
//        }
//        s.close();
        /**
         * ※ 변수 세개와 스캐너 세번 선언! if-else, else if 구문을 사용하여 a<b<c 일 때(중간값 b),
         * b<a<c 일 때(중간값 a), 나머지 일 때(중간값 c)로 조건을 걸어줍니다.
         * */
        /**
         *         Scanner s=new Scanner(System.in);
         *         int a,b,c;
         *         System.out.println("정수 3개 입력>>");
         *         a=s.nextInt();
         *         b=s.nextInt();
         *         c=s.nextInt();
         *         int middle = a>b ? a>c ? b>c ? b: c : a : b>c ? a>c ? a : c : b;
         *         System.out.println("중간 값은"+middle);
         *         s.close();
         * */
        /**
         * Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
         * 평균값을 구하는 것이 아니고 중간값 구하는거임.
         * */
        /**
         *  Scanner s=new Scanner(System.in);
         *         System.out.println("정수 3개를 입력>>");
         *         int l1=s.nextInt();
         *         int l2=s.nextInt();
         *         int l3=s.nextInt();
         *         int max=0;
         *         if(l1>l2){
         *             if(l1>l3) {
         *                 max = l1;
         *                 l1 = 0;
         *             }else if(l2>l3){
         *                 max=l2;
         *                 l2=0;
         *             }else{
         *                 max=l3;
         *                 l3=0;
         *             }
         *         }else{
         *             if(l2>l3){
         *                 max=l2;
         *                 l2=0;
         *             }else if(l1<l3){
         *                 max=l3;
         *                 l3=0;
         *             }else{
         *                 max=l1;
         *                 l1=0;
         *             }
         *         }
         *         if(l1+l2+l3>max) System.out.println("삼각형이 됩니다.");
         *         else System.out.println("삼각형 안됨");
         *         s.close();
         * */
       /**
        * Ex19. 369게임을 간단히 작성해보자.
        * 1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
        * 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
        * */
//        Scanner s=new Scanner(System.in);
//        System.out.print("1~99 사이의 정수를 입력하시오>>");
//        int num=s.nextInt();
//        String clap="박수";
//        while(num!=0){
//            if(num%10==3 || num%10==6 || num%10==9) clap+="짝";
//            num/=10;
//        }
//        if(clap.length()>2) System.out.println(clap);
//        s.close();
        /**
         * Ex20. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다.
         * 100,100과 200,200의 두 점으로 이루어진 사각형이 있을 때 Scanner를 이용하여
         * 정수 x와 y 값을 입력받고 점 (x,y)가 이 직사각형 안에 있는 지를 판별하는 프로그램을 작성하라.
         * */
//        System.out.println("점 (x,y)의 좌표를 입력하시오 >>");
//        Scanner s=new Scanner(System.in);
//        int x=s.nextInt();
//        int y=s.nextInt();
//        boolean flag=true;
//        if(100<=x && 200>=x){
//            if(100<=y && 200>=y){
//                System.out.println("("+x+","+y+")은 사각형 안에 있습니다.");
//                flag=false;
//            }
//        }
//        if(flag) System.out.println("("+x+","+y+")은 사각형 안에 없습니다.");
//
//        s.close();




















        /**
         * Ex21. 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다.
         * 키보드로부터 사각형을 구성하는 두 점(x1, y1), (x2, y2)를 입력받아 100,100과 200,200의 두 점으로 이루어진 사각형과 충돌하는지 판별하는 프로그램을 작성하라.
         * (아래 코드를 참고하여 만드시오)
         * */
    //        System.out.println("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오 >>");
    //        Scanner s=new Scanner(System.in);
    //        int x1=s.nextInt();
    //        int y1=s.nextInt();
    //        int x2=s.nextInt();
    //        int y2=s.nextInt();
    //
    //       if( inRect(x1,y1,100,200,100,200)
    //       || inRect(x2,y2,100,200,100,200)) System.out.println("겹칩니다.");
    //       else System.out.println("안겹칩니다.");
    //
    //        s.close();
    /**
     * 주어진 inRect를 사용하지 않고 푸는 방법
     * */
//    System.out.println("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오 >>");
//    Scanner s=new Scanner(System.in);
//    int x1=s.nextInt();
//    int y1=s.nextInt();
//    int x2=s.nextInt();
//    int y2=s.nextInt();
//
//    if(x1<x2){
//        int temp;
//        temp=x1;
//        x1=x2;
//        x2=temp;
//    }
//    if(y1<y2){
//        int temp;
//        temp=y1;
//        y1=y2;
//        y2=temp;
//    }
//        if ((200<=x2 || x1<=100) || (200<=y2 && 100>=y1)){
//            System.out.println("안겹칩니다.");
//        }else{
//            System.out.println("겹칩니다.");
//        }
//
//    s.close();
        /**
         * Ex22. 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
         * 그리고 실수 값으로 다른 점 (x.y) 을 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
         * */
//        System.out.println("원의 중심과 반지름 입력>>");
//        Scanner s=new Scanner(System.in);
//        double p1=s.nextDouble();
//        double p2=s.nextDouble();
//        double r=s.nextDouble();
//
//        System.out.println("점 입력>>");
//        double x=s.nextDouble();
//        double y=s.nextDouble();
//
//        double dis=x-p1;
//        double tence=y-p2;
//        dis*=dis;
//        tence*=tence;
//        double distence=Math.sqrt(dis+tence);
//        if(distence<=r) System.out.println("in");
//        else System.out.println("out");
//        s.close();

        /**
         * E23. 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
         * 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
         * */
//        System.out.println("첫 번째 원의 중심과 반지름 입력>>");
//        Scanner s=new Scanner(System.in);
//        int x=s.nextInt();
//        int x1=s.nextInt();
//        double r=s.nextDouble();
//
//        System.out.println("두 번째 원의 중심과 반지름 입력>>");
//        int y=s.nextInt();
//        int y1=s.nextInt();
//        double r1=s.nextDouble();
//        double half_flex=0;
//        half_flex=r1+r;
//        double dis=x-y;
//        double tence=x1-y1;
//        dis*=dis;
//        tence*=tence;
//        double distence=Math.sqrt(dis+tence);
//        if(distence<half_flex){
//            System.out.println("겹친다.");
//        }else if(distence==half_flex){
//            System.out.println("접한다.");
//        }else{
//            System.out.println("만날 수 없어, 만나고 싶은데..");
//        }
//
//
//        s.close();
        /**
         * Ex24. 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
         * 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
         * */
//        (1)if문 사용시
//        System.out.println("달을 입력하세요(1~12)>>");
//        Scanner m=new Scanner(System.in);
//        int num=m.nextInt();
//
//        if(num>=3 && 5>=num) System.out.println("봄");
//        else if(num>=6 && num<=8) System.out.println("여름");
//        else if(num>=9 && num<=11) System.out.println("가을");
//        else System.out.println("겨울");
//        m.close();
//        (2)switch
//        System.out.println("달을 입력하세요(1~12)>>");
//        Scanner m=new Scanner(System.in);
//        int num=m.nextInt();
//
//        switch (num){
//            case 3: case 4: case 5:
//                System.out.println("봄");
//                break;
//            case 6: case 7: case 8:
//                System.out.println("여름");
//                break;
//            case 9: case 10: case 11:
//                System.out.println("가을");
//                break;
//            case 12: case 1: case 2:
//                System.out.println("겨울");
//                break;
//        }
//
//        m.close();
        /**
         * Ex25. 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다.
         * 연산자는 + - * / 의 네 가지로 하고 피연산자는 모두 실수로 한다. 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
         * 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
         * */
//      if문사용
//        System.out.print("연산>>");
//        Scanner s=new Scanner(System.in);
//        double op1=s.nextDouble();
//        String op=s.next();
//        double op2=s.nextDouble();
//        double res=0;
//        if(op.equals("+")) res=op1+op2;
//        else if (op.equals("-")) res=op1-op2;
//        else if (op.equals("*")) res=op1*op2;
//        else if (op.equals("/")){
//            if(op2==0){
//                System.out.println("0을 넣다니.. 오류를 일으킬 생각인가?");
//                return;
//            }else res=op1/op2;
//        }
//
//
//        System.out.println(op1+op+op2+"의 계산결과는"+res);
//        s.close();
//        switch사용
        Scanner s=new Scanner(System.in);
        System.out.print("연산>>");
        int op1=s.nextInt();
        String op=s.next();
        int op2=s.nextInt();
        int res=0;

        switch (op){
            case "+":
                res=op1+op2;
                break;
            case "-":
                res=op1-op2;
                break;
            case "*":
                res=op1*op2;
                break;
            case "/":
                if(op2==0){
                System.out.println("0을 넣다니.. 오류를 일으킬 생각인가?");
                return;
                }else res=op1/op2;
                break;
        }
        System.out.print(op1+op+op2+"의 계산결과는"+res);
        s.close();
    }
    public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2){
        if ((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)){
            return true;
        }else {
            return false;
        }
    }
}