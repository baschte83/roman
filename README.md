# Roman

### Assignment, class and language
This is my solution to the assignment **Roman** of class **software developement 1,** written in Java.

### Requirements
This programs translates a positive integer value from the terminal into its roman interpretation as a String object. If the integer value from the terminal is negative or 0, the program prints **Invalid Input** on the screen. The translation from integer to roman string works as follows:

Roman | Integer
----- | -------
I | 1
IV | 4
V | 5
X | 10
XL | 40
L | 50
C | 100
CD | 400
D | 500
M | 1000

Multiples of a value are translated into multiples of the roman string representation (for example: 30 = 3 * 10 = 3 * X = XXX), but no more than three times the same character. Higher roman string representations are left of lower ones (for example: 17 = 10 + 5 + 2 = X + V + II = XVII).
