"use client";

import React from "react";
import Slides from './components/Slides';
import { SLIDES_DATA } from "./constants";

function App() {
  return (
      <div className="App">
        <Slides slides={SLIDES_DATA} />
      </div>
  );
}

export default App;
