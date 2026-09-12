public class index {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8, 9, 14};
        int target = 10;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Indexes: " + i + ", " + j);
                }
            }
        }
    }
}

