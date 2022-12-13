package LeetCode;

import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月05日 11:35 PM
 */
public class _3LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        int a =  lengthOfLongestSubstring("au");
        int ab =  lengthOfLongestSubstring3("pwwkew");

        System.out.println(ab);
    }

    public static int lengthOfLongestSubstring(String s){
        int l=0;
        int r=0;
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }

        while(r<=s.length() ) {
            if (check(s.substring(l,r))) {
                r++;
            }
            else{
                r++;
                l++;
            }
        }
        return r-l-1;
    }
    public static boolean check(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            Character c = str.charAt(i);
            map.put(c,0);
        }
        for(int i = 0;i<str.length();i++){
            Character c = str.charAt(i);
            map.put(c,map.get(c)+1);
        }
        Set<Character> keyset = map.keySet();
        for (Character c :keyset) {
            if(map.get(c)>1){
                return false;
            }
        }
        return true;
    }


    //better solution
    public static int lengthOfLongestSubstring3(String s){
        int l=0;  //left pointer
        int r=0;  //right pointer
        int max=0;  //for calculate the length each time

        //condition right pointer is less then the length
        while(r<s.length()){
            //set the pointer at left pointer
            int p = l;

            //left and right pointer sets up a window
            //and we use a actual pointer to check:
            //inside the window do we have duplicate character
            //if we found a duplicate charater, move left pointer to that charater's next
            while(p<r){
                if(s.charAt(p)!=s.charAt(r)){
                    p++;
                }else{
                    l=p+1;
                    break;
                }
            }

            //check each time's number exceed max
            if(max<r-l){
                max=r-l;
            }

            //after each check, right pointer plus 1
            r++;
        }
        return max+1;
    }
}
