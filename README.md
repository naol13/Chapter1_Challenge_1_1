N/**/...., [10/15/2025 11:43 PM]
# 🔍 Chapter1_Challenge_1_1: The Cryptic Message Decoder

> *"In espionage, the truth is never in plain sight—it’s hidden in the math."*

## 🎯 Problem Summary
As a secret agent, you’ve intercepted an encoded integer. The real intelligence lies in its digits:
- Multiply the first and last digits.
- Add the second and second-to-last digits.
- Concatenate the two results to form the final decrypted code.

This challenge uses only variables and arithmetic operators**—no loops, no conditionals—to extract and manipulate digits.

## 🧪 Example

**Input:  
13579

Step-by-step:
- First digit: 1, Last digit: 9 → Product = 9
- Second digit: 3, Second-last: 7 → Sum = 10
- Final code: "9" + "10" → 910

Output:

N/**/...., [10/15/2025 11:43 PM]
The decrypted code is: 910

N/**/...., [10/15/2025 11:49 PM]
## 💡 Key Concepts Demonstrated
- Digit extraction using / and %
- Dynamic digit counting with Math.log10()
- Power-of-10 scaling via Math.pow()
- Implicit string concatenation in Java
- Type casting (double → int)

## 🧠 Reflection
This challenge deepened my understanding of pure arithmetic manipulation. Initially, I assumed loops were necessary to parse digits—but realizing that logarithms and powers of 10 could isolate any digit was a breakthrough. The biggest hurdle was handling Math.pow()'s double return type and ensuring clean integer division. Now, I see numbers not just as values, but as structured data.

> ✨ Fun Fact: This method works for any integer with **4+ digits**—making it scalable beyond the example!
