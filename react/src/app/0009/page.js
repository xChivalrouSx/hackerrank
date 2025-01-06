// Patient Medical Records
// https://www.hackerrank.com/challenges/patient-medical-records/problem?isFullScreen=true

"use client";

import React, { useState } from "react";
import Search from "./components/Search";
import Records from "./components/Records";
import medical_records from "./medicalRecords";

const title = "Patient Medical Records";

const App = () => {
  const [data, setData] = useState(undefined);

  const onShow = (id) => {
    if (id === 0 ) {
      alert("Please select a patient name") 
      return; 
    }
    setData(
      medical_records.find(record => record.id === id).data
    )
  }

  const onNext = () => {
    if (data === undefined) {
      return; 
    }
    setData((data) => {
      const nextId = medical_records.length === data[0].userId ? 1 : data[0].userId + 1;
      setData(
        medical_records.find(record => record.id === nextId + "").data
      )
    })
  }

  return (
    <div className="App">
      <h8k-navbar header={title}></h8k-navbar>
      <div className="content">
        
        <Search records={medical_records} onShow={onShow}/>
        <Records data={data} onNext={onNext}/>
      </div>
    </div>
  );
};

export default App;
