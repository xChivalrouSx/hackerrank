// Article Sorting
// https://www.hackerrank.com/challenges/react-article-sorting/problem?isFullScreen=true

"use client";

import React, { useState } from "react";
import Articles from "./components/Articles";
import { ARTICLES_DATA } from "./constants";

function App() {
  const [values, setValues] = useState([...ARTICLES_DATA].sort((x, y) => y.upvotes - x.upvotes));
  
  const handleMostUpvoted = () => {
    setValues([...ARTICLES_DATA].sort((x, y) => y.upvotes - x.upvotes))
  };

  const handleMostRecent = () => {
    setValues([...ARTICLES_DATA].sort((x, y) => new Date(y.date) - new Date(x.date)))
  };

  return (
    <>
      <h8k-navbar header="Sorting Articles"></h8k-navbar>
      <div className="App">
        <div className="layout-row align-items-center justify-content-center my-20 navigation">
          <label className="form-hint mb-0 text-uppercase font-weight-light">
            Sort By
          </label>
          <button
            data-testid="most-upvoted-link"
            className="small"
            onClick={handleMostUpvoted}
          >
            Most Upvoted
          </button>
          <button
            data-testid="most-recent-link"
            className="small"
            onClick={handleMostRecent}
          >
            Most Recent
          </button>
        </div>
        <Articles articles={values} />
      </div>
    </>
  );
}

export default App;
