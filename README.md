🔁 Cyclic Sort – README
📌 What is Cyclic Sort?

Cyclic Sort is an in-place sorting algorithm used when:

The array contains numbers from 1 to N

Each number appears once (or sometimes with duplicates)

The goal is to place each number at its correct index
👉 i.e., number x should be at index x - 1

It is commonly used in coding interviews and platforms like LeetCode for problems like:

Missing Number

Find Duplicate

Find All Missing Numbers

First Missing Positive

⚙️ How Cyclic Sort Works (Intuition)

We loop through the array and:

For current index i, check the correct index of arr[i]

If arr[i] is not at its correct position → swap

Otherwise → move to next index

This continues until all numbers are at their correct positions.

🧠 Algorithm Steps

Start from index i = 0

While i < n:

Let correctIndex = arr[i] - 1

If arr[i] != arr[correctIndex], swap them

Else, i++



| Metric      | Complexity |
| ----------- | ---------- |
| Time        | **O(N)**   |
| Space       | **O(1)**   |
| In-place    | ✅ Yes      |
| Stable Sort | ❌ No       |
