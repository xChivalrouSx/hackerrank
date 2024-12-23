
// Contact Form
// https://www.hackerrank.com/challenges/react-contact-form/problem?isFullScreen=true

"use client";

import { useState } from "react";
 
function App() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [message, setMessage] = useState("");
  const [submittedData, setSubmittedData] = useState(null);
  const [error, setError] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    // --- You need to add lines below ---
    if (name === "" || email === "" || message === "") {
      setError("All fields are required.")
      return;
    }
    setSubmittedData({ name, email, message });
    setName("");
    setEmail("");
    setMessage("");
    // -----------------------------------
  };

  return (
    <div className="App">
    <h1>Contact Form</h1>
    <form onSubmit={handleSubmit}>
        <input
        type="text"
        value={name}
        onChange={(e) => setName(e.target.value)}
        placeholder="Name"
        data-testid="name-input"
        />
        <input
        type="email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
        placeholder="Email"
        data-testid="email-input"
        />
        <textarea
        value={message}
        onChange={(e) => setMessage(e.target.value)}
        placeholder="Message"
        data-testid="message-input"
        />
        <button type="submit" data-testid="submit-button">
        Submit
        </button>
    </form>
    {error && (
        <p data-testid="error-message" className="error">
        {error}
        </p>
    )}
    {submittedData && (
        <div data-testid="submitted-data" className="submitted-data">
        <h2>Submitted Information</h2>
        <p>
            <strong>Name:</strong> {submittedData.name}
        </p>
        <p>
            <strong>Email:</strong> {submittedData.email}
        </p>
        <p>
            <strong>Message:</strong> {submittedData.message}
        </p>
        </div>
    )}
    </div>
  );
}

export default App;
