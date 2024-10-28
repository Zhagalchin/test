public class varible {

    public static void main(String[] args) {
        int daysSum = 10000;
        int years = daysSum / 365;
        int mounths = daysSum % 365 / 30;
        int days = daysSum % 365 % 30;
        System.out.println(years);
        System.out.println(mounths);
        System.out.println(days);



    }
}
