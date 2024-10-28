public class forEach {
    public static void main(String[] args) {
        String[] names = {"Max", "Nikita", "Lesha", "Alex"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
