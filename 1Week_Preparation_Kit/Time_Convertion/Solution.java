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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here

    StringBuffer result = new StringBuffer();
    int hour = Integer.parseInt(s.substring(0,2));
    String timeFlag = s.substring(s.length()-2, s.length());

    if(timeFlag.equalsIgnoreCase("PM")) {
        if(hour < 12) {
          hour += 12;  
        }
        result.append(String.valueOf(hour));

    } else {
        if(hour == 12) {
            result.append("00");
        } else if(hour < 10){
            result.append('0').append(String.valueOf(hour));            
        }
        else{
            result.append(String.valueOf(hour));  
        }
    }

    result = result.append((s.substring(2, s.length()-2)));
    return result.toString();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
