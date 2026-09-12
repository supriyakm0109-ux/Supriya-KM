public class palindrome {
    public static void main(String[] args) {
        int left=0;
        String str = "cat";
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Is a palindrome");
    }
    
}
