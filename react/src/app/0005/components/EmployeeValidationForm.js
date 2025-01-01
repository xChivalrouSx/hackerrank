// Employee Validation
// https://www.hackerrank.com/challenges/employee-validation/problem?isFullScreen=true

import React, { useState } from "react";

function EmployeeValidationForm() {
  // -----------------------------------------------
  // --- You need to add this lines ----------------
  // -----------------------------------------------
  const [values, setValues] = useState({
    name: "",
    email: "",
    employeeId: "",
    joinDate: "",
  });

  const onSubmit = (e) => {
    setValues({
      name: "",
      email: "",
      employeeId: "",
      joinDate: "",
    });
  };

  const onNameChange = (e) => {
    setValues({...values, name: e.target.value});
  };

  const isNameValid = () => {
    return /^[a-zA-Z]{4,}$/.test(values.name);
  };

  const onEmailChange = (e) => {
    setValues({...values, email: e.target.value});
  };

  const isEmailValid = () => {
    return /^[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[A-Za-z]+$/.test(values.email);
  };

  const onIdChange = (e) => {
    setValues({...values, employeeId: e.target.value});
  };

  const isIdValid = () => {
    return /^\d{6}$/.test(values.employeeId);
  };

  const onDateChange = (e) => {
    setValues({...values, joinDate: e.target.value});
  };

  const isDateValid = () => {
    return new Date(values.joinDate) <= new Date();
  };

  const isAllValid = () => {
    return isNameValid() && isEmailValid() && isIdValid() && isDateValid();
  };

  // -----------------------------------------------
  // -----------------------------------------------
  // -----------------------------------------------

  return (
    <div className="layout-column align-items-center mt-20 ">
      <div className="layout-column align-items-start mb-10 w-50" data-testid="input-name">
        <input
          className="w-100"
          type="text"
          name="name"
          value={values.name}
          placeholder="Name"
          data-testid="input-name-test"
          // --- You need to add line below --- 
          onChange={onNameChange}
        />
        { 
          // --- You need to add line below --- 
          !isNameValid() && <p className="error mt-2">Name must be at least 4 characters long and only contain letters and spaces</p> 
        }
      </div>
      <div className="layout-column align-items-start mb-10 w-50" data-testid="input-email">
        <input
          className="w-100"
          type="text"
          name="email"
          value={values.email}
          placeholder="Email"
          // --- You need to add line below --- 
          onChange={onEmailChange}
        />
        { 
          // --- You need to add line below --- 
          !isEmailValid() && <p className="error mt-2" >Email must be a valid email address</p> 
        }
      </div>
      <div className="layout-column align-items-start mb-10 w-50" data-testid="input-employee-id">
        <input
          className="w-100"
          type="text"
          name="employeeId"
          value={values.employeeId}
          placeholder="Employee ID"
          // --- You need to add line below --- 
          onChange={onIdChange}
        />
        {
          // --- You need to add line below --- 
          !isIdValid() && <p className="error mt-2">Employee ID must be exactly 6 digits</p> 
        }
      </div>
      <div className="layout-column align-items-start mb-10 w-50" data-testid="input-joining-date">
        <input
          className="w-100"
          type="date"
          name="joiningDate"
          value={values.joinDate}
          placeholder="Joining Date"
          // --- You need to add line below ---
          onChange={onDateChange}
        />
        {
          // --- You need to add line below --- 
          !isDateValid() && <p className="error mt-2">Joining Date cannot be in the future</p> 
        }   
      </div>
      <button data-testid="submit-btn" type="submit" 
        // --- You need to add line below ---
        disabled={!isAllValid()} onClick={onSubmit}>
        Submit
      </button>
    </div>
  );
}

export { EmployeeValidationForm };
