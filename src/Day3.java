public class Day3 {
    public static void main(String[] args) {
        char[] name = new char[26];
        for(int i = 0; i < 26; i++) {
            name[i] = (char)('a' + i);
            System.out.println(name[i]+"="+(i+1));
        }
    }
}
