# <h1 style="color:red"> <center > Permutation </center> </h1>

tags : #array #easy  #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
Given a **zero-based permutation** `nums` (**0-indexed**), build an array `ans` of the **same length** where `ans[i] = nums[nums[i]]` for each `0 <= i < nums.length` and return it.

## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** nums = [0,2,1,5,3,4]
**Output:** [0,1,2,4,5,3]

## <mark style="background: #ABF7F7A6;">Approach</mark>
points to note :


## <mark style="background: #FFB86CA6;">Code Implementation</mark>
```java
public static int buildArray(int [] nums) {
	int [] arr = new int[nums.length];
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = nums[nums[i]];
	}
	return arr;
}
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
