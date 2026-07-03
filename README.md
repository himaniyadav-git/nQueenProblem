N-Queens Problem using Backtracking (Java)
📌 Overview

This project implements the N-Queens Problem using the Backtracking algorithm in Java.

The objective of the N-Queens problem is to place N queens on an N × N chessboard such that no two queens attack each other.

A queen can attack:

Horizontally
Vertically
Diagonally

The program recursively places queens row by row while checking whether each position is safe. If a position leads to a dead end, it backtracks and tries another position.

🚀 Features
Solves the N-Queens problem using Backtracking.
Checks whether a queen placement is safe.
Prints the chessboard before solving.
Prints the valid solution found.
Counts the number of valid solutions.
Easy to modify for different values of N.
🛠 Technologies Used
Java
Recursion
Backtracking
📂 Project Structure
Backtracking/
│
└── NQueens.java
⚙️ How It Works
1. Initialize the Board

The board is initialized with 'X', representing empty cells.

Example (N = 4):

X X X X
X X X X
X X X X
X X X X
2. Place Queens

The algorithm places one queen in each row.

For every column in the current row:

Check if placing a queen is safe.
If safe:
Place the queen.
Move to the next row.
If it doesn't lead to a solution:
Remove the queen.
Try the next column.
3. Safety Check

The isSafe() method verifies that no queen exists in:

Same column (upwards)
Upper-left diagonal
Upper-right diagonal

Since queens are placed row by row, checking previous rows is sufficient.

4. Backtracking

If no valid position exists in a row:

Remove the previously placed queen.
Return to the previous row.
Try another column.

This continues until a valid solution is found or all possibilities are exhausted.

📌 Time Complexity

Worst Case:

O(N!)

Backtracking significantly reduces unnecessary searches compared to checking every possible arrangement.

Space Complexity
O(N²)
Chessboard storage
Recursive call stack
▶️ How to Run
Save the file as:
NQueens.java
Compile
javac NQueens.java
Run
java Backtracking.NQueens
📤 Sample Output (N = 4)

Initial Board

X X X X
X X X X
X X X X
X X X X

One Valid Solution

X Q X X
X X X Q
Q X X X
X X Q X
total ways = 1

Note: In the current implementation, the recursion returns after finding the first valid solution, so only one solution is printed and counted. If you uncomment the line:

// nQueen(board, row + 1);

and comment out:

if (nQueen(board, row + 1)) {
    return true;
}

the program will explore all possible configurations and print every valid solution.

📚 Learning Concepts

This project demonstrates:

Backtracking
Recursion
Constraint Satisfaction Problems (CSP)
2D Arrays
Algorithm Design
State Space Search
🎯 Future Improvements
Print all possible solutions.
Optimize using bit masking.
Visualize the board using Java Swing or JavaFX.
Accept board size (N) as user input.
Display execution time and performance statistics.
👨‍💻 Author

Himani Yadav

This project was created to understand the Backtracking technique through the classic N-Queens Problem, one of the most popular recursion and constraint satisfaction problems in computer science.