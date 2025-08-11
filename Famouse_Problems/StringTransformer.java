package Famouse_Problems;
public class StringTransformer {
    public static void main(String[] args) {
        String s = "ABCD";
        int[] ops = {1, 2,1};
        System.out.println(transformString(s, ops)); // Output: CADB
    }

    public static String transformString(String s, int[] ops) {
        StringBuilder sb = new StringBuilder(s);

        for (int op : ops) {
            if (op == 1) {
                // Swap first and last character
                char temp = sb.charAt(0);
                sb.setCharAt(0, sb.charAt(sb.length() - 1));
                sb.setCharAt(sb.length() - 1, temp);
            }else if(op == 2){
                int mid = sb.length() / 2;
                String first = sb.substring(0,mid);
                String second = sb.substring(mid);

                sb = new StringBuilder(second + first);
            }
        }

        return sb.toString();
    }
}
