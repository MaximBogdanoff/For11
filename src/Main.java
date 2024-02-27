public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    for (int i=1; i<=10; i=i+1) {
        System.out.println(i);
    }

    for (int i1=10; i1>=1; i1=i1-1) {
        System.out.println(i1);
    }

    for (int i2=0; i2<17; i2=i2+2) {
        System.out.println(i2);
    }

    for (int i3=10; i3>=-10; i3=i3-1) {
        System.out.println(i3);
    }

    for (int i4=1904; i4<=2096; i4=i4+4) {
        System.out.println(i4+" год является высокосным");
    }

    for (int i5=7; i5<=98; i5=i5+7) {
        System.out.println(i5);
    }

    for (int i6=1; i6<=512; i6=i6*2) {
        System.out.println(i6);
    }

    int sum = 29000;
    int total =0;
    for (int i7=1;i7<=12; i7++) {
        total = total + sum;

        System.out.println("Месяц "+i7+" , сумма накоплений равна "+total+" рублей");
    }

        int sum1 = 29000;
        double total1 =0d;
        for (int i8=1;i8<=12; i8++) {
            total1= total1+(total1*0.01);
            total1 = total1 + sum1;

            System.out.println("Месяц "+i8+" , сумма накоплений равна "+total1+" рублей");
        }

        for (int i9=1; i9<=10; i9=i9+1) {
            System.out.println("2*"+i9+"="+i9*2);
        }






    }
}