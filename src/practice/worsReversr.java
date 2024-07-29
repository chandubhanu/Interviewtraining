package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class worsReversr {
public static String reverseword(String S) 
	{
        String a[]=S.split("\\.");
List name=Arrays.asList(a);
Collections.reverse(name);
return String.join(".",name);
    }

    public static void main(String args[])
    {
      
        String N=reverseword("i.like.this.program.very.much");
        System.out.println(N);
    }
}
