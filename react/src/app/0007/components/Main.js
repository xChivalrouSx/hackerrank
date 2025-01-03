// CryptoRank Exchange
// https://www.hackerrank.com/challenges/cryptorank-exchange/problem?isFullScreen=true

import React, { useState } from "react";
import Table from "./Table";

function Main() {
  const [exchangeAmount, setExchangeAmount] = useState(0);
  const [touch, setTouch] = useState(false);

  const totalValue = 17042.67;

  const onExchangeAmountChange = (e) => {
    setTouch(true);
    setExchangeAmount(e.target.value);
  };

  const isExchangeAmountValid = () => {
    return !touch || (
            exchangeAmount > 0.01 & 
            exchangeAmount <= totalValue);
  };

  return (
    <div className="layout-column align-items-center mx-auto">
      <h1>CryptoRank Exchange</h1>
      <section>
        <div className="card-text layout-column align-items-center mt-12 px-8 flex text-center">
          <label>
            I want to exchange $ <input className="w-10" data-testid="amount-input" required type="number" placeholder="USD" valzue={exchangeAmount} 
            onChange={onExchangeAmountChange} /> of my $<span>{totalValue}</span>:
          </label>
          {
            !isExchangeAmountValid() &&
            <p data-testid="error" className="form-hint error-text mt-3   pl-0 ml-0">
              {
                exchangeAmount === "" ? "Amount cannot be empty" : 
                    exchangeAmount < 0.01 ? "Amount cannot be less than $0.01" :
                      exchangeAmount > totalValue ? "Amount cannot exceed the available balance" : "" 
              }
            </p>
          }
        </div>
      </section>
      <Table exchangeAmount={isExchangeAmountValid() ? exchangeAmount : -1} />
    </div>
  );
}

export default Main;
