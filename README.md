# findingKthElement
Program for recursive finding kth smallest element in array.

## Input:

1. integer 1<=n<=10<sup>6</sup>: number of sets
2. n integers 1<=a<sub>i</sub><=10<sup>6</sup>: elements of array
3. integer 1<=m<=100: number of requests for kth element
4. m integers 1<=k<sub>j</sub><=10<sup>6</sup>: kth element to find

## Output

For each set:

k<sub>i</sub> and found value when kth element exists

or

k<sub>i</sub> and word 'brak' otherwise

## Example
### Input
```
3
5
1 2 3 4 5
3
1 2 3
5
5 3 4 4 3
5
2 5 1 3 4
10
1 1 1 1 1 1 1 1 1 1
5
1 10 0 -1 11
```

### Output

```
1 1
2 2
3 3
2 3
5 5
1 3
3 4
4 4
1 1
10 1
0 brak
-1 brak
11 brak
```