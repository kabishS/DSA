public class VowelCount {
    public static void main(String[] args) {
        String str = "Swedhakabish";

        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a') {
                countA++;
            } 
            else if (ch == 'e') {
                countE++;
            } 
            else if (ch == 'i') {
                countI++;
            } 
            else if (ch == 'o') {
                countO++;
            } 
            else if (ch == 'u') {
                countU++;
            }
        }

        System.out.println("a = " + countA);
        System.out.println("e = " + countE);
        System.out.println("i = " + countI);
        System.out.println("o = " + countO);
        System.out.println("u = " + countU);
    }
}
// a = 2
// e = 1
// i = 1
// o = 0
// u = 0