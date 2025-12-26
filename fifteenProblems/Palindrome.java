package fifteenProblems;

/*
-if x==0 then true
if x<0 || x% 10==0 then false

int rev=0;
 compare only half of num , so that we can decrease iterations
  while x>rev or else while x>0
	 int pop=x%10 
	 //to get  last digit from x without removing ,use %10 , % returns remainder of a division operation between two numbers
	 x/=10
	 rev=(rev*10)+pop
	 //we need to rev*10 ,if not 2+2 else 20+2
	  //to remove last digit from x then use /10
		
		 if(rev==x || x==rev/10){ // in case of odd num 12321 , rev will have 123
            return true;
        }
		
		
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int rev = 0;
        while (x > rev) {
            int pop = x % 10;
            x /= 10;
            rev = (rev * 10) + pop;
        }
        if (rev == x || x == rev / 10) {
            return true;
        }
        return false;
    }
;

}
