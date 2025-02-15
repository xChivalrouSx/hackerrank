// Day 1: Let and Const
// https://www.hackerrank.com/challenges/js10-let-and-const/problem?isFullScreen=true

function main() {
    // ---------------
    // Add lines below
    // ---------------
    const PI = Math.PI;
    let r = readLine();
    console.log(PI * r * r);
    console.log(PI * r * 2);
    // ---------------
    // ---------------
    try {    
        PI = 0;
        console.log(PI);
    } catch(error) {
        console.error("You correctly declared 'PI' as a constant.");
    }
}
