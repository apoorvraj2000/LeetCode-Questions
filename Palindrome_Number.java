package AllCodes;

public class Palindrome_Number {

	public boolean isPalindrome(int x) {
        int n=x;
        int reverseNo=0;
        while(n>0)
        {
            int lastDigit=n%10;
            reverseNo=(reverseNo*10)+lastDigit;
            n=n/10;
        }
        if(x<0)
        {
            reverseNo*=-1;
        }
        if(x==reverseNo)
            return true;
        else
            return false;
    }
}
