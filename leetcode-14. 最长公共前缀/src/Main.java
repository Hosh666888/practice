import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2022/7/26 16:44
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {

        // String[] strs = {"flower","flow","flight"};
        // String[] strs = {"dog","racecar","car"};
        // String[] strs = {""};
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }

        Arrays.sort(strs,(Comparator.comparingInt(String::length)));

        if (strs[0].trim().equals("")){
            return "";
        }

        int index = 0;


        while (index<strs[0].length()){
            boolean flag = true;
            char c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(index)!=c){
                    flag = false;
                    break;
                }
            }

          if (!flag){
              break;
          }
          index++;
        }

        return strs[0].substring(0,index);
    }
}
