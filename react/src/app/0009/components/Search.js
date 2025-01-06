import React, { useState } from "react";

function Search({ records, onShow }) {
  const [selectedId, setSelectedId] = useState(0);

  const optionValues = records.map(record => { 
    return {
      userId : record.id,
      "userName" : record.data[0].userName
     }});

  const onSelectionChange = (e) => {
    setSelectedId(e.target.value);
  }

  return (
    <div className="layout-row align-items-baseline select-form-container">
      <div className="select">
        <select data-testid="patient-name" defaultValue={0} onChange={onSelectionChange}>
          <option value={0} disabled>
            Select Patient
          </option>
          {
            optionValues.map((record, index) => 
              <option key={"option" + index} value={record.userId}>
                {record.userName}
              </option>)
          }
        </select>
      </div>

      <button type="submit" data-testid="show" onClick={() => onShow(selectedId)}>
        Show
      </button>
    </div>
  );
}

export default Search;
