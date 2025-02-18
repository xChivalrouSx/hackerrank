// Day 4: Count Objects
// https://www.hackerrank.com/challenges/js10-count-objects/problem?isFullScreen=true

function getCount(objects) {
    return objects.filter(obj => obj.x === obj.y).length;
}