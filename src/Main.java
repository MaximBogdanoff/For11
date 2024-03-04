public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        for (int i1 = 10; i1 >= 1; i1 = i1 - 1) {
            System.out.println(i1);
        }

        for (int i2 = 0; i2 < 17; i2 = i2 + 2) {
            System.out.println(i2);
        }

        for (int i3 = 10; i3 >= -10; i3 = i3 - 1) {
            System.out.println(i3);
        }

        for (int i4 = 1904; i4 <= 2096; i4 = i4 + 4) {
            System.out.println(i4 + " год является высокосным");
        }

        for (int i5 = 7; i5 <= 98; i5 = i5 + 7) {
            System.out.println(i5);
        }

        for (int i6 = 1; i6 <= 512; i6 = i6 * 2) {
            System.out.println(i6);
        }

        int sum = 29000;
        int total = 0;
        for (int i7 = 1; i7 <= 12; i7++) {
            total = total + sum;

            System.out.println("Месяц " + i7 + " , сумма накоплений равна " + total + " рублей");
        }

        int sum1 = 15000;
        double total1 = 0d;
        int i8 = 0;
        while (total1 < 2459000) {
            total1 = total1 + (total1 * 0.01);
            total1 = total1 + sum1;
            i8++;
            System.out.println("Месяц " + i8 + " , сумма накоплений равна " + total1 + " рублей");
        }

        for (int i9 = 1; i9 <= 10; i9 = i9 + 1) {
            System.out.println("2*" + i9 + "=" + i9 * 2);
        }

        int i10 = 1;
        do {
            System.out.print(i10 + " ");
            i10 = i10 + 1;
        }
        while (i10 <= 10);
        System.out.println();
        for (int i11 = 10; i11 >= 0; i11 = i11 - 1) {
            System.out.print(i11 + " ");
        }
        System.out.println();

        double people = 12000000d;
        int birth = 17;
        int died = 8;
        for (int i12 = 0; i12 <= 10; i12 = i12 + 1) {
            people = people + 0.001 * people * (birth - died);
            System.out.println("Год " + i12 + ", численность населения составляет " + people);
        }

        int monthAmount = 15000;
        double sum2 = 0d;
        int i13 = 0;
        while (sum2 <= 12000000) {
            sum2 = (sum2 + monthAmount) * 1.07;
            i13++;
            System.out.println("В месяце " + i13 + " накоплений " + sum2);
        }
        System.out.println();

        double monthAmount1 = 15000d;
        double percent=0.07d;
        int sum3 = 12000000;
        for (int i14=0;monthAmount1<sum3;i14++) {
            monthAmount1=monthAmount1+monthAmount1*percent;
            if (i14%6==0) {
                System.out.println("Сумма " + monthAmount1 + "  ,месяц " + i14);
            }
            }

        double monthAmount2 = 15000d;
        double percent1=0.07d;
        for (int i15=0;i15<=108;i15++) {
            monthAmount2=monthAmount2+monthAmount2*percent1;
            if (i15%6==0) {
                System.out.println("Сумма " + monthAmount2 + "  ,месяц " + i15);
            }
        }

        for (int i16=1; i16<31; i16+=7 ) {
            System.out.println("Сегодня пятница "+i16+" , необходимо подготовить отчет");
        }


        int currentYear = 2100;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }}}}














