// Day 5: Template Literals
// https://www.hackerrank.com/challenges/js10-template-literals/problem?isFullScreen=true

function sides(literals, ...expressions) {
    const [a, p] = expressions;
    const rootCalculation = Math.sqrt(p ** 2 - 16 * a);
    const s1 = (p + rootCalculation) / 4;
    const s2 = (p - rootCalculation) / 4;
    return [s1, s2].sort();
}

