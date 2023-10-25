# Plus One

In this case, adding one to the Integer in form of array, since addition is of 1 there will not carry can get more than 1.
Approach :  Iterating through end of array , if the element is 9 than carry will move forward or just add carry and return.
```
for(int i = digits.length-1; i >= 0 ; i --){
            if(digits[i] == 9) digits[i] = 0;
            else{
                digits[i]++;
                return digits;
            }
        }
```
- making each 9 to 0 
- if element is not 9, add 1 and return 
- if the iteration gets over, it means all the elements were 9, so new array with length+1 will get returned with first element is 1
- like this - [0,0,0,0,0,0,0,0,0] - [1,0,0,0,0,0,0,0,0,0]

```
digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
```