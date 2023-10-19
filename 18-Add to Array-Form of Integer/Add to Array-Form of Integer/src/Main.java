import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length-1;
        List<Integer> list = new ArrayList<>();
        for(int i = n; i>=0 || k>=0 ; i++){
            if(i>=0){
                list.add(0,(num[i]+k)%10);
                k = (num[i]+k)/10;
            }else {
                list.add(0,k%10);
                k/=10;
            }
        }
        return list;
    }
}