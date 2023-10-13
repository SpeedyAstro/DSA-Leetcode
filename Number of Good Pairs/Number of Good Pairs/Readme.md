# <h1 style="color:red;font-family: "Lucida Console", "Courier New", monospace;"> <center > Number of Good Pairs </center> </h1>

tags : #array #easy #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
Given an array of integers `nums`, return _the number of **good pairs**_.
A pair `(i, j)` is called _good_ if `nums[i] == nums[j]` and `i` < `j`.

## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** nums = [1,2,3,1,1,3]
**Output:** 4

## <mark style="background: #ABF7F7A6;">Approach</mark>


## <mark style="background: #FFB86CA6;">Code Implementation</mark>
```java
    public int numIdenticalPairs(int[] nums) {
        int [] ans = new int[101];
        int result = 0;
        for(int ele:nums){
            result = result + ans[ele]++;
        }
        return result;
    }
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
Time Complexity -  the overall time complexity is O(n), where n is the length of the input array.
Space Complexity - O(1)