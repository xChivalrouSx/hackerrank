import React from "react";
import { cryptocurrencyList } from "../cryptocurrency-list";

function Table({exchangeAmount}) {
  return (
    <div className="card card-text mt-10 mx-4">
      <table className="mb-0">
        <thead>
          <tr>
            <th>Cryptocurrency</th>
            <th>Exchange Rate</th>
            <th>Number of Coins</th>
          </tr>
        </thead>
        <tbody data-testid="exchange-data">
          {
            cryptocurrencyList.map(c => 
              <tr key={"tr-" + c.code}>
                <td>{c.name}</td>
                <td>1 USD = {c.rate + " " + c.code}</td>
                <td>{exchangeAmount === -1 ? "n/a" : (c.rate * exchangeAmount).toFixed(8)}</td>
              </tr>
            )
          }
        </tbody>
      </table>
    </div>
  );
}

export default Table;
