// Day 8: Create a Button
// https://www.hackerrank.com/challenges/js10-create-a-button?isFullScreen=true

var customButton = document.createElement('button');
customButton.id = 'btn';
customButton.innerHTML = '0';
customButton.addEventListener("click", function() {
                customButton.innerHTML = parseInt(customButton.innerHTML) + 1;
            });
document.body.appendChild(customButton);