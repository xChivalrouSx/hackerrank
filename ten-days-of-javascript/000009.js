// Day 3: Arrays
// https://www.hackerrank.com/challenges/js10-arrays/problem?isFullScreen=true

function getSecondLargest(nums) {
    let sorted = nums.sort((a, b) => b - a);
    let max = sorted[0];
    for (let i = 1; i < sorted.length; i++) {
        let item = sorted[i];
        if (item < max) {
            return item;
        }
    }
    return max;
}