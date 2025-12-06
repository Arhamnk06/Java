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

9: Polynomial Multiplication and Comparison (Java)

This update adds three new features to the Polynomial class. The multiply method builds a new polynomial representing the product of two polynomials, with the result sized based on the sum of the degrees. Internal terms may cancel out, but the highest-degree term never does. The equals method checks whether another object is a Polynomial with the same degree and identical coefficients. The class now also implements compareTo, which orders polynomials by degree first. If the degrees match, it compares coefficients starting from the highest order term and decides which polynomial is greater. These changes keep the class immutable and consistent with Java’s Comparable interface.

10: SpySet extends HashSet and tracks how many times a duplicate add is attempted. The constructor takes a number N, which is the limit for duplicate attempts. Every time add() is called with a value that already exists in the set, the duplicate counter increases. When the counter reaches N, the entire set clears itself and the counter resets. Adding a new, unique element works like a normal HashSet. The class stays generic, so SpySet works with any type.

11: AccessCountArrayList extends ArrayList and keeps track of how many times the list is accessed through the get and set methods. It uses one counter that increments every time either method is called. Both methods first increase the counter, then call the original ArrayList version. The class adds two extra methods: getAccessCount(), which returns the current counter value, and resetCount(), which sets it back to zero. Everything else behaves like a normal ArrayList.

12: Swing & 2D Shapes

This lab focuses on building an interactive Swing component that reacts to mouse movement. The task is to complete the Head class so that each head is a 500×500 JPanel that draws a simple cartoon face. A MouseListener is added in the constructor, and the eyes should open when the mouse is inside the component and close when the mouse leaves it. The paintComponent method handles all drawing using shapes like ovals and rectangles. Running HeadMain shows four separate Head components in a 2×2 grid, each responding independently as you move the cursor across them. The final submission is the completed Head.java, and all debugging prints must be removed.

13: Working With Exceptions

This lab shows how to check for invalid input and signal errors using exceptions.
divideNumbers handles division edge cases.
convertCelsiusToFahrenheit checks if the value is a number and above absolute zero.
A custom InvalidTemperatureException is used when the temperature is physically impossible.

14: Working With Files

file_slice reads a file into memory and returns only the requested lines, while validating the range.
rev_rev_file reads a file, reverses the order of the lines and the characters, writes the result to another file, and always returns the reversed text.
The methods show how to safely open files, handle read/write errors, and process text line by line.
