public class Song {
    public static void main(String[] args) {
        int test = 121;
        System.out.println(romanToInt("IX"));
    }

    static public int romanToInt(String s) {
        String roman = "IVXLCDM";
        int[] integer = {1, 5, 10, 50, 100, 500, 1000};
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (roman.indexOf(Character.toString(s.charAt(i))) >= roman.indexOf(Character.toString(s.charAt(i+1)))) {
                sum += integer[roman.indexOf(s.charAt(i))];
            } else {
                sum -= integer[roman.indexOf(s.charAt(i))];
            }
        }
        return sum + integer[roman.indexOf(s.charAt(s.length()-1))];
    }
}
