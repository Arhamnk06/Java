# Java
This repo is where I keep my Java practice work and LeetCode-style problems.
I use it to try out ideas, write small lab exercises, and get more comfortable with Java.
Nothing here is an official assignment — it’s just my own practice space.

1: Falling Power

Falling power multiplies a number by the next smaller number for a given number of steps. For example, eight falling three becomes eight times seven times six. The exponent zero always returns one. The base can be positive, zero, or negative. All calculations must use long to avoid overflow.

2: Counting Inversions

An inversion happens when a larger number appears before a smaller one in an array. It shows how far the array is from being sorted. A sorted array has zero inversions. A fully reversed array has the maximum number of inversions. The method must count all such pairs and work for arrays of any size.

3: everyOther

Creates and returns a new array that contains the values stored at even index positions of the input array. The method must compute the correct output length using integer division and must copy elements without modifying the original array. It must handle empty arrays, single element arrays, and both odd and even lengths while ensuring no trailing zeros appear in the result.

4: createZigZag

Constructs a two dimensional array with the given row and column counts. The array is filled with consecutive integers using a running counter that increases by one each step. Even numbered rows are written in forward order, while odd numbered rows are written in reverse order to create the zigzag pattern. Index arithmetic and controlled traversal ensure correct placement of values.

5: reverseAscendingSubarrays

Reorders the contents of the given array in place by finding maximal strictly increasing segments and reversing each one. The method must scan the array once, track segment boundaries, and apply in place reversal without allocating new arrays. Single element segments remain unchanged, and the input array structure is preserved.

6: pancakeScramble

Builds a new string by applying repeated prefix reversals. At step i, the method reverses the first i characters of the current string. StringBuilder is used to perform efficient mutable reversals before converting back to a string. This process continues until the full string has been reversed on the final pass.

7: reverseVowels(String text)

A method that returns a new string where all vowels are reversed.
Only aeiouAEIOU count as vowels.
The tricky part is keeping the capitalization of the vowel that originally sat in that position.

8: Polynomial class

An immutable class that stores polynomial coefficients in an array.
It trims leading zeros, handles the zero polynomial properly, and supports:
	•	getDegree()
	•	getCoefficient(int k)
	•	Defensive copying of the input array

