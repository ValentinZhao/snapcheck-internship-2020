public class Solution {

    private static final int MAXIMUM_LENGTH = 9;

    public static String encrypt(String s) {
        // since the length of s is constrained within [1, 81]
        // the maximum length of row and column is 9
        if (s.length() < 1 || s.length() > 81) throw new IllegalArgumentException();
        s = s.replaceAll("\\s+", "");
        int len = s.length();
        StringBuilder resultBuilder = new StringBuilder();
        StringBuilder tempBuilder;
        double sqrt = Math.sqrt((double) len);
        int row = (int) Math.round(sqrt), col;
        if (row >= sqrt) {
            col = row;
        } else {
            col = row == MAXIMUM_LENGTH ? MAXIMUM_LENGTH : row + 1;
        }


        for (int i = 0; i < col; i++) {
            tempBuilder = new StringBuilder();
            for (int k = i; k < len; k = k + col) {
                tempBuilder.append(s.charAt(k));
            }
            resultBuilder.append(tempBuilder.toString());
            resultBuilder.append(" ");
        }


        return resultBuilder.toString().trim();
    }

    public static void main(String[] args) {

        // make your onw test cases here

        String s = "chillout";
//        dasdasdasdasjdhasudhiuasdiuasdghuasbduasaisdghasjkdbasdubadnsdubjasdbnasbdjkasbda

        String res = encrypt(s);
        System.out.println(res);
    }
}
