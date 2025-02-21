// Day 6: Bitwise Operators
// https://www.hackerrank.com/challenges/js10-bitwise/problem?isFullScreen=true

function getMaxLessThanK(n, k) {
    let max = 0;
    for (let i = 1; i < n; i++) {
        for (let j = i + 1; j <= n; j++) {
            let bitwise = i & j;
            if (bitwise < k && bitwise > max) {
                max = bitwise;
            }
        }
    }
    return max;
}