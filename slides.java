public class slides {
    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmno";
        String pattern = "KLMNOPQRST";

        int windowSize = 10;
        boolean found = false;

        for (int i = 0; i <= str.length() - windowSize; i++) {

            boolean match = true;

            for (int j = 0; j < windowSize; j++) {

                if (str.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                System.out.println("Pattern found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Pattern not found");
        }
    }
}
    

