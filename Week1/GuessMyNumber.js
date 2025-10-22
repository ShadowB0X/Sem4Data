"use strict";

window.addEventListener("DOMContentLoaded", main);

function main() {
  const log = document.querySelector("#log");
  const secretInput = document.querySelector("#secret");
  const lockBtn = document.querySelector("#lockBtn");
  const guessBtn = document.querySelector("#guessBtn");

  let secret = null;
  let tries = 0;

  lockBtn.addEventListener("click", () => {
    const val = Number(secretInput.value);
    if (!Number.isInteger(val) || val < 1 || val > 100) {
      addLine("Vælg et tal mellem 1 og 100 først.", "error");
      return;
    }
    secret = val;
    tries = 0;
    clearLog();
    addLine("Dit tal er låst. Computeren begynder at gætte.");
    secretInput.disabled = true;
    lockBtn.disabled = true;
    guessBtn.disabled = false;
  });

  guessBtn.addEventListener("click", () => {
    if (secret === null) return;

    const guess = Math.floor(Math.random() * 100) + 1;
    tries++;

    if (guess < secret) {
      addLine(`Computeren gættede ${guess} – for lavt.`);
    } else if (guess > secret) {
      addLine(`Computeren gættede ${guess} – for højt.`);
    } else {
      addLine(`Computeren gættede ${guess} – korrekt!`);
      addLine(`Antal forsøg: ${tries}`);
      guessBtn.disabled = true;
    }
  });

  function addLine(text) {
    const li = document.createElement("li");
    li.textContent = text;
    log.appendChild(li);
  }

  function clearLog() {
    log.innerHTML = "";
  }
}