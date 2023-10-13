# <h1 style="color:red;font-family: "Lucida Console", "Courier New", monospace;"> <center > Shuffle the Array  </center> </h1>

tags : #array #easy #leetcode #k

## <mark style="background: #BBFABBA6;">Problem Statement</mark>:
Given the array `nums` consisting of `2n` elements in the form `[x1,x2,...,xn,y1,y2,...,yn]`.
_Return the array in the form_ `[x1,y1,x2,y2,...,xn,yn]`.

## <mark style="background: #FFF3A3A6;">Input and Output Format</mark>
**Input:** nums = [2,5,1,3,4,7], n = 3
**Output:** [2,3,5,4,1,7]
**Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

## <mark style="background: #ABF7F7A6;">Approach</mark>


## <mark style="background: #FFB86CA6;">Code Implementation</mark>
```java
public int[] shuffle(int n,int [] arr){
        int [] ans = new int[arr.length];
        int count = 0;
        for(int i = 0 ; i < arr.length ; i ++){
            ans[count++] = arr[i];
            ans[count++] = arr[n+i];
        }
        return ans;
    }
```

## <mark style="background: #ADCCFFA6;">Time and Space Complexity Analysis</mark>
Time Complexity -  the overall time complexity is O(n), where n is the length of the input array.
Space Complexity - O(1)