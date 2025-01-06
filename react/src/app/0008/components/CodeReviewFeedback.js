// Code Review Feedback
// https://www.hackerrank.com/challenges/code-review-feedback/problem?isFullScreen=true

import React, { useState } from "react";


const FeedbackSystem = () => {

  const [values, setValues] = useState([
    {
      "name" : "Readability",
      "up" : 0,
      "down" : 0      
    },
    {
      "name" : "Performance",
      "up" : 0,
      "down" : 0      
    },
    {
      "name" : "Security",
      "up" : 0,
      "down" : 0      
    },
    {
      "name" : "Documentation",
      "up" : 0,
      "down" : 0      
    },
    {
      "name" : "Testing",
      "up" : 0,
      "down" : 0      
    },
  ]);

  const setSpecificValue = (name, isUp) => {
    setValues(values.map(value => {
      if (value.name === name) {
        isUp ? value.up++ : value.down++;
      }
      return value;
    }));
  };

  return (
      <div className="my-0 mx-auto text-center w-mx-1200">
        <div className="flex wrap justify-content-center mt-30 gap-30">
          {
            values.map((value, index) => 
                <div className="pa-10 w-300 card" key={"base-div" + index}>
                    <h2>{value.name}</h2>
                    <div className="flex my-30 mx-0 justify-content-around">
                        <button className="py-10 px-15" data-testid={"upvote-btn-" + index} onClick={() => setSpecificValue(value.name, true)}>
                            👍 Upvote
                        </button>
                        <button className="py-10 px-15 danger" data-testid={"downvote-btn-" + index} onClick={() => setSpecificValue(value.name, false)}>
                            👎 Downvote
                        </button>
                    </div>
                    <p className="my-10 mx-0" data-testid={"upvote-count-" + index}>
                        Upvotes: <strong>{value.up}</strong>
                    </p>
                    <p className="my-10 mx-0" data-testid={"downvote-count-" + index}>
                        Downvotes: <strong>{value.down}</strong>
                    </p>
                </div>
            )
          }
        </div>
      </div>
    )};

export default FeedbackSystem;
