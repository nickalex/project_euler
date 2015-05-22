import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    int i = 0;
    while(true){
      i+=20;
      if(NumberIsValid(i)){
        System.out.println(i);
        break;
      }
    }
  }

  public static Boolean NumberIsValid(int testNumber){
    for(int i = 1; i <= 20; i++){
      if(testNumber % i != 0){
        return false;
      }
    }
    return true;
  }
}
