import java.util.Scanner;

public class electrocityBillCalculator {
    public static void main(String[] args) {
        final double UNDER_100 = 60.7;
        final double OVER_100 = 125.9;
        final double OVER_200 = 187.9;
        final double OVER_300 = 280.6;
        final double OVER_400 = 417.7;
        final double OVER_500 = 670.6;

        Scanner input = new Scanner(System.in);

        int useEletrocity = 0;
        double payment = 0;

        System.out.println("=========================");
        System.out.println(" 주택용 전기요금(저압) 계산기");
        System.out.println("=========================");
        System.out.printf("전력 사용량을 입력하세요(kWh) : ");
        useEletrocity = input.nextInt();
        input.nextLine();

//        System.out.println(useEletrocity);

        if(useEletrocity <= 100) {
            payment = useEletrocity * UNDER_100;
            System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.", useEletrocity, payment);
        } else if(useEletrocity > 100 && useEletrocity <= 200) {
            payment = 100 * UNDER_100 + (useEletrocity - 100) * OVER_100;
            System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.", useEletrocity, payment);
        } else if(useEletrocity > 200 && useEletrocity <= 300) {
            payment = 100 * UNDER_100 + 100 * OVER_100 + (useEletrocity - 200) * OVER_200;
            System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.", useEletrocity, payment);
        } else if(useEletrocity > 300 && useEletrocity <= 400) {
            payment = 100 * UNDER_100 + 100 * OVER_100 + 100 * OVER_200 + (useEletrocity - 300) * OVER_300;
            System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.", useEletrocity, payment);
        } else if(useEletrocity > 400 && useEletrocity <= 500) {
            payment = 100 * UNDER_100 + 100 * OVER_100 + 100 * OVER_200 + 100 * OVER_300 + (useEletrocity - 400) * OVER_400;
            System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.", useEletrocity, payment);
        } else if(useEletrocity > 500) {
            payment = 100 * UNDER_100 + 100 * OVER_100 + 100 * OVER_200 + 100 * OVER_300 + 100 * OVER_400 + (useEletrocity - 500) * OVER_500;
            System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.", useEletrocity, payment);
        }
    }
}
