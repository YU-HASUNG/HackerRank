import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        //double m = Math.pow(10,9);
        //int Min = (int)m;
        int Max = 0;
        int Min = 1000000000;
        long Sum = 0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i) < Min){
                Min = arr.get(i);
            }
            if(arr.get(i) > Max){
                Max = arr.get(i);
            }
            Sum = Sum + arr.get(i);
        }
        System.out.print(Sum-Max);
        System.out.print(" ");
        System.out.print(Sum-Min);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
