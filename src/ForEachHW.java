public class ForEachHW {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++){
            num[i] = i+100;
        }for (int nemp : num) {
            System.out.println(nemp);
        }
    }
}
