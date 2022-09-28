package ch004;

public class UpperCaseConvert {
    public static void main(String[] args) {
        String s = "hello1234";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(++c);
            } else if (Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb);
    }
}
