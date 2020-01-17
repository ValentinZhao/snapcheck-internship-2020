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