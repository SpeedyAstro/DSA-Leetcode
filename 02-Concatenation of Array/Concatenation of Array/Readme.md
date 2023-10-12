# <h1 style="color:red"> <center > Concatenation of an  Array </center> </h1>

tags : #array #easy #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
Given an integer array `nums` of length `n`, you want to create an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` (**0-indexed**).

## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** nums = [1,2,1]
**Output:** [1,2,1,1,2,1]

## <mark style="background: #ABF7F7A6;">Approach</mark>


## <mark style="background: #FFB86CA6;">Code Implementation</mark>

```java
public int[] getConcatenation(int[] nums) {
	int length = nums.length;
	int[] ans = new int[length*2];
	for(int i=0;i<length*2;i++){
		ans[i] = nums[i%length];
    }
	return ans;
}  
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
Time Complexity -  the overall time complexity is O(n), where n is the length of the input array.
Space Complexity - O(1)