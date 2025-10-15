
# Chapter1_Challenge_1_1: The Cryptic Message Decoder

## Description
This program decodes a secret integer message by extracting specific digits using only arithmetic operations and variables—no conditionals or loops. It computes a final code by multiplying the first and last digits, summing the second and second-last digits, and concatenating the two results.

## Example Input/Output
Input:  
13579

Output:  
The decrypted code is: 910

## What I Learned
- How to extract individual digits from an integer using division and modulus.
- Using Math.log10() to determine the number of digits dynamically.
- The importance of operator precedence and type casting when using Math.pow().
- String concatenation behavior in Java when mixing strings and integers.

## Challenges
- Initially, I struggled with extracting the second digit without loops. Using nested modulus and division with powers of 10 was tricky but satisfying.
- Remembering that Math.pow() returns a double, so casting to int is essential.
- Ensuring the concatenation (product + sum) didn’t perform arithmetic addition—relying on Java’s left-to-right string conversion solved this.
