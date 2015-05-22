import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {

    long max = 0;

    //anyway to do this dynamically?
    for(int i = 999; i >=100; i--){
      for(int j = 999; j >= 100; j--){
          if( CheckPalindrome(i*j) && (i*j > max)){
            max = i*j;
          }
      }
    }
    System.out.println(max);

  }
  public static Boolean CheckPalindrome(long val){
    char[] chars = String.valueOf(val).toCharArray();
    for (int i = 0 ; i < chars.length/2; i++){
      if(chars[i] != chars[chars.length -1 - i]){
        return false;
      }
    }
    return true;

  }
}
