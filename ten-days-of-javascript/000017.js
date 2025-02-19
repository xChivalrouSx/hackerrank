// Day 5: Arrow Functions
// https://www.hackerrank.com/challenges/js10-arrows/problem?isFullScreen=true

function modifyArray(nums) {
    return nums.map((num) => (num % 2 === 0 ? num * 2 : num * 3));
}