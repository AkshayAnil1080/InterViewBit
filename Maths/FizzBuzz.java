

public class Solution {
    public String[] fizzBuzz(int A) {

        String str[] = new String[A];
        int j=0;
        for(int i=1; i<=A; i++)
        {
             if(i%5==0 && i%3==0)   // must be at first.
             str[j++] ="FizzBuzz";

             else if(i%3==0)
             str[j++] = "Fizz";

             else if(i%5==0)
             str[j++]="Buzz";

             else
             str[j++] = String.valueOf(i); // covert diff daat types of values into string

        }

        return str;
    }

}

// A = 5
// Return: [1 2 Fizz 4 Buzz]
