public class slide {
    public static void main(String[] args) {

        int[] arr = {7, 1, 9, 3, 2, 11, 2, 8, 4, 5, 2, 6};
        int k = 2;

        for (int i = 0; i <= arr.length - k; i++) {

            int max = arr[i];

            for (int j = i; j < i + k; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.println(max);
        }
    }
}
    
