
// Slideshow
// https://www.hackerrank.com/challenges/react-slideshow-1/problem?isFullScreen=true

import React, { useState } from "react";

function Slides({ slides }) {

  // -------------------------------------------------------------------------------------------------
  // --- You need to add this lines for solution hackerrank provides all other lines for challange ---
  // -------------------------------------------------------------------------------------------------

  const [index, setIndex] = useState(0);
  
  const handleRestart = () => {
    setIndex(0);
  };

  const handlePrev = () => {
    setIndex((x) => x-1);
  };

  const handleNext = () => {
    setIndex((x) => x+1);
  };

  // -------------------------------------------------------------------------------------------------
  // -------------------------------------------------------------------------------------------------
  // -------------------------------------------------------------------------------------------------

  return (
    <div>
      <div id="navigation" className="text-center">
        <button data-testid="button-restart" className="small outlined"
          // --- You need to add lines below (2 line) ---
          onClick={handleRestart}
          disabled={index == 0}>
          Restart
        </button>
        <button data-testid="button-prev" className="small"
          // --- You need to add lines below (2 line) ---
          onClick={handlePrev}
          disabled={index == 0}>
          Prev
        </button>
        <button data-testid="button-next" className="small" 
          // --- You need to add lines below (2 line) ---
          onClick={handleNext}
          disabled={index == slides.length - 1}>
          Next
        </button>
      </div>
      <div id="slide" className="card text-center">
        {
          // --- You need to update lines below ---
        }
        <h1 data-testid="title">{slides[index].title}</h1>
        <p data-testid="text">{slides[index].text}</p>
      </div>
    </div>
  );
}

export default Slides;
