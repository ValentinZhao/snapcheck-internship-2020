# How to Test
Simple `clone` my fork and run it as `Java Application` in Intellij IDEA.

# Intuition
- Use `Math.sqrt` + `Math.round` to find a proper `row`, since `row` should be the lower or upper bound of its square root base on its value.
    - i.e., `sqrt(8)` nearly `2.8` so the row should be `3`, and vice versa
- Update the `column` based on `row`, it should be the same as `row` when `length` is a perfect square, otherwise should be `row + 1`
- The output is simply pick every `col` characters from `s` and group by `row` counts in each part
    - i.e., when `row` is 3 and `col` is 4, the output should be like `xxx xxx xxx xxx`

# Time and Space Complexity
- Time: O(L), L is the length of `s`. I visit every character in the string for only once.
- Space: O(L), L is the length of `s`. For the use of `StringBuilder`.

# <span style="color:red">Errors in Your Example</span>
The output of `chillout` should be
> cl ho iu lt
## Explanation
You said
> L = 8, SQRT(8) is between 2 and 3. Rewritten with 3 columns and 3 rows (2*3 = 6 < 8 so we have to use 3x3)

which is not true. The optimal solution is `row=2` and `col=4`, which is also meet the requirement that `floor(sqrt(8)) <= row <= col <= ceil(sqrt(8))`

Because of another requirement:
> If multiple grids satisfy the above conditions, choose the one **with the minimum area**
 
As my solution `row * col = 8` is smaller the `3*3=9` as your solution. I have the minimum area.