# <h1 style="color:red;font-family: "Lucida Console", "Courier New", monospace;"> <center > Kids With the Greatest Number of Candies  </center> </h1>

tags : #array #easy #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
There are `n` kids with candies. You are given an integer array `candies`, where each `candies[i]` represents the number of candies the `ith` kid has, and an integer `extraCandies`, denoting the number of extra candies that you have.

Return _a boolean array_ `result` _of length_ `n`_, where_ `result[i]` _is_ `true` _if, after giving the_ `ith` _kid all the_ `extraCandies`_, they will have the **greatest** number of candies among all the kids__, or_ `false` _otherwise_.

Note that **multiple** kids can have the **greatest** number of candies.


## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** candies = `[2,3,5,1,3]`, extraCandies = 3
**Output:**` [true,true,true,false,true]`

## <mark style="background: #ABF7F7A6;">Approach</mark>


## <mark style="background: #FFB86CA6;">Code Implementation</mark>
```java
public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // get the max candies a kid have
        // iterate through every kid and add extra candies
        // check if max out the max candies of one kid
        // if yes return true;
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        int max = getMaxCandies(candies);
        for(int candy : candies){
            // if((candy+extraCandies)> max)
            ans.add((candy+extraCandies)>= max);
        }
        return ans;
    }
    public int getMaxCandies(int [] candies){
        int max = 0;
        for(int candy : candies){
            if(max<candy) max = candy;
        }
        return max;
    }
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
Time Complexity -  the overall time complexity is O(n), where n is the length of the input array.
Space Complexity - O(1)