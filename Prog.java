public class Prog {
    public static String Algorithm(String Input) {
        char[] chars = Input.toCharArray();
        return Input;
    }
    public static void main (String[] args) {
        String example = "A B + C D + * E -";
        System.out.println(Algorithm(example));
    }
}