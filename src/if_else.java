public class if_else {
    public static void main(String[] args) {

        int temp = 28;
        boolean hot = temp > 25;// != не равно || - или && логическое и
        boolean cold = temp < 20;
        int time = 15;
        boolean isnight = time > 22 || time < 6;

        if (hot && !isnight){ //поставит тру если не соотвествует (логическое "не")
            System.out.println("HOT");
        } else if (cold) {
            System.out.println("COLD");
        } else System.out.println("POH");

    }
}
