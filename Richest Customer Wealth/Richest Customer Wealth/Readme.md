# <h1 style="color:red;font-family: "Lucida Console", "Courier New", monospace;"> <center > Richest Customer Wealth  </center> </h1>

tags : #array #easy #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
You are given an `m x n` integer grid `accounts` where `accounts[i][j]` is the amount of money the `i​​​​​​​​​​​th​​​​` customer has in the `j​​​​​​​​​​​th`​​​​ bank. Return _the **wealth** that the richest customer has._

## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** accounts = `[[1,5],[7,3],[3,5]]`
**Output:** 10

## <mark style="background: #ABF7F7A6;">Approach</mark>


## <mark style="background: #FFB86CA6;">Code Implementation</mark>
```java
public int maximumWealth(int[][] accounts) {
	int rich = 0 ;
	for(int [] account : accounts){
		int sum = 0;
		for(int amount : account)
			sum+=amount;
            if(sum>rich) rich = sum;
	}
	return rich;
    }
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
Time Complexity -  the overall time complexity is O(n), where n is the length of the input array.
Space Complexity - O(1)