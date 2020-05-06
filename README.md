# Reverse Polish Notation Calculator
RPN Calculator written in Java

## Principle of operation

The operation of a Reverse Polish Notation calculator differs from a standard calculator. In order to make operations the user has to follow a different approach

Below there is an example of its operation.

* Adding two numbers: instead of `1 + 2` the user shoud press the buttons in that order `1 Enter 2 Enter + =`

So, every time the user presses the `Enter` key, the last number that he typed gets pushed in the stack and when an operand (`+`,`-`,`*`,`/`) is pressed the last two elements get popped out of the stack to execute the operation.
To show the result on the screen the user presses the `=` button.
<br>
<br>
<br>
<br>
* * *
*Created this project as part of the **Object-Oriented Programming** course at the Electrical & Computer Engineering department of the Univeristy of Patras.*
