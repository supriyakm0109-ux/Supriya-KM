


public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4,6,8,9,14};
        int target = 10;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                break;
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            } 
        } boolean found = false;
        if (!found) {
            System.out.println("Element not found");
        }
    }
}