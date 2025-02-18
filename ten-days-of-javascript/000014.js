// Day 4: Classes
// https://www.hackerrank.com/challenges/js10-class/problem?isFullScreen=true

class Polygon {

    constructor(sides) {
        this.sides = sides;
    }
    
    perimeter() {
        return this.sides.reduce((sum, side) => sum + side);
    }
    
}