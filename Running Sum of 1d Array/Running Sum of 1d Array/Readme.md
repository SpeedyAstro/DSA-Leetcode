# <h1 style="color:red"> <center > Running Sum of 1d Array </center> </h1>

tags : #array #easy #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.
Return the running sum of `nums`.

## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** nums = [1,2,3,4]
**Output:** [1,3,6,10]
**Explanation:** Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

## <mark style="background: #ABF7F7A6;">Approach</mark>


## <mark style="background: #FFB86CA6;">Code Implementation</mark>
```java
public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++)
            nums[i] += nums[i-1];
        return nums;
    }
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
Time Complexity -  the overall time complexity is O(n), where n is the length of the input array.
Space Complexity - O(1)