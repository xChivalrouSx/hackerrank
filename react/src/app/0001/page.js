
// Item List Manager
// https://www.hackerrank.com/challenges/item-list-manager/problem?isFullScreen=true

"use client";

import { useState } from "react";

function App() {
  const [items, setItems] = useState([]);
  const [input, setInput] = useState("");

  const handleAddItem = () => {
    // -------------------------------------------------------------------------------------------------
    // --- You need to add this lines for solution hackerrank provides all other lines for challange ---
    // -------------------------------------------------------------------------------------------------

    if(input.trim() !== "") {
      setItems([...items, input]);
      setInput("")
    }
    
    // -------------------------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------------------------
    // -------------------------------------------------------------------------------------------------
  };

  return (
    <>
      <h8k-navbar header="Item List Manager"></h8k-navbar>
      <div className="App">
        <h3>Item List</h3>
        <input
          type="text"
          value={input}
          onChange={(e) => setInput(e.target.value)}
          placeholder="Enter item"
          data-testid="input-field"
        />
        <button onClick={handleAddItem} data-testid="add-button">
          Add Item
        </button>
        <ul data-testid="item-list">
          {items.map((item, index) => (
            <li key={index} data-testid="list-item">
              {item}
            </li>
          ))}
        </ul>
      </div>
    </>
  );
}

export default App;
