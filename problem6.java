import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    //wow, should have used summation formula
     long sumOfSquares = 0;
    for(int i =1; i <= 100; i++){
      sumOfSquares = sumOfSquares + (i* i);
    }
    System.out.println(sumOfSquares);


    long x = 0;
    for(int i =1; i <= 100; i++){
      x = x + i;
    }
    long squareOfSums = x * x;
    System.out.println(squareOfSums);

    System.out.println(squareOfSums - sumOfSquares);
  }
}
