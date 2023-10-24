public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] years = new int[101];
        for(int [] log : logs){
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }
        int max = 0 , year = 0 ,count = 0;
        for(int i = 0 ; i < years.length ; i++){
            count += years[i];
            if(count > max){
                max = count;
                year = i;
            }
        }
        return year+1950;
    }
}