package easy;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "ab_a";
        System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(isValid(s));
        System.out.println(isValid2(s));

    }


    static boolean isValid(String s){

        if (s.isEmpty()) return true;

        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }


    static boolean isValid2(String s){

        if (s.isEmpty()) return false;

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)){
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            }else{
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;

    }

}
