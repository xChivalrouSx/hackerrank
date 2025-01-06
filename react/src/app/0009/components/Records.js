import React from "react";

function Records({data, onNext}) {

  function formatTimestampToDate(timestamp) {
    const date = new Date(timestamp); 
    const day = String(date.getDate()).padStart(2, "0");
    const month = String(date.getMonth() + 1).padStart(2, "0");
    const year = date.getFullYear();
    return `${month}/${day}/${year}`;
  }

  return (
      data === undefined ? <></> :
        <div className="patient-profile-container" id="profile-view">
        <div className="layout-row justify-content-center">
          <div id="patient-profile" data-testid="patient-profile" className="mx-auto">
            <h4 id="patient-name">{data[0].userName}</h4>
            <h5 id="patient-dob">DOB: {data[0].userDob}</h5>
            <h5 id="patient-height">Height: {data[0].meta.height} cm</h5>
          </div>
          <button className="mt-10 mr-10" data-testid="next-btn" onClick={onNext}>
            Next
          </button>
        </div>

        <table id="patient-records-table">
          <thead id="table-header">
            <tr>
              <th>SL</th>
              <th>Date</th>
              <th>Diagnosis</th>
              <th>Weight</th>
              <th>Doctor</th>
            </tr>
          </thead>
          <tbody id="table-body" data-testid="patient-table">
            {
              data.map((value, index) => 
                <tr key={"tr-" + index}>
                  <td>{index + 1}</td>
                  <td>{formatTimestampToDate(value.timestamp)}</td>
                  <td>{value.diagnosis.name}</td>
                  <td>{value.meta.weight}</td>
                  <td>{value.doctor.name}</td>
                </tr>
              )
            }
          </tbody>
        </table>
      </div>
  );
}

export default Records;
