# <h1 style="color:red;font-family: "Lucida Console", "Courier New", monospace;"> <center > How Many Numbers Are Smaller Than the Current Number</center> </h1>

tags : #array #easy #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
Given the array `nums`, for each `nums[i]` find out how many numbers in the array are smaller than it. That is, for each `nums[i]` you have to count the number of valid `j's` such that `j != i` **and** `nums[j] < nums[i]`.

## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** `nums = [8,1,2,2,3]`
**Output:** `[4,0,1,1,3]`
**Explanation:**
`For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). `
`For nums[1]=1 does not exist any smaller number than it.`
`For nums[2]=2 there exist one smaller number than it (1). `
`For nums[3]=2 there exist one smaller number than it (1). `
`For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).`


## <mark style="background: #ABF7F7A6;">Approach</mark>


## <mark style="background: #FFB86CA6;">Code Implementation</mark>
```java
public int[] smallerNumbersThanCurrent(int[] num) {
        int bucket [] = new int[102],result = 0;
        for(int i = 0 ; i < num.length; i++)
            bucket[num[i]+1]++;
        for(int i=1;i<bucket.length;i++)
            bucket[i] += bucket[i-1];
        for(int i = 0 ; i < num.length ; i++)
            num[i] = bucket[num[i]];
        return num;
    }
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
Time Complexity -  the overall time complexity is O(n), where n is the length of the input array.
Space Complexity - O(1)