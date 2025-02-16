// Day 2: Loops
// https://www.hackerrank.com/challenges/js10-loops/problem?isFullScreen=true

function vowelsAndConsonants(s) {
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    let consonants = [];
    for (let i = 0; i < s.length; i++) {
        let c = s[i];
        if (vowels.includes(c)) {
            console.log(c);
        } else {
            consonants.push(c);
        }
    }
    consonants.forEach(c => console.log(c));   
}