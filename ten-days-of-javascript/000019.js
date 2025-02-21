// Day 6: JavaScript Dates
// https://www.hackerrank.com/challenges/js10-date/problem?isFullScreen=true

const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
function getDayName(dateString) {
    return days[new Date(dateString).getUTCDay()];
}
