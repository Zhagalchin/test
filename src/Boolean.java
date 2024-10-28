public class Boolean {
    public static void main(String[] args) {
        int temp = 22;
        int time = 16;
        boolean whewer = temp >= 16 && temp <= 32;
        boolean clock = time > 11 && time < 21;
        if (whewer && clock){
            System.out.println("pizduy");
        }if (clock) {
            System.out.println("chitay knigu");
        }if (!clock) {
            System.out.println("sleept");

        }
    }
}
