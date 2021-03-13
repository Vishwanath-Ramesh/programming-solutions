const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

let noOfTestCases = 0;
let noOfVillainsAndPlayers = 0;
let strengthOfVillains = [];
let energiesOfPlayers = [];

readline.question("Enter number of test cases", (inputValue) => {
  noOfTestCases = parseInt(inputValue);
  //   readline.close();
});

readline.on("line", (input) => {
  console.log(`Received: ${input}`);
});

readline.on("resume", () => {
  console.log("Readline resumed.");
});

readline.question("Enter number of villains and player", (inputValue) => {
  noOfVillainsAndPlayers = parseInt(inputValue);
  readline.close();
});

readline.question("Enter strengths of villains", (inputValue) => {
  strengthOfVillains = inputValue.split(" ").sort();
  readline.close();
});

readline.question("Enter energies of players", (inputValue) => {
  energiesOfPlayers = inputValue.split(" ").sort();
  readline.close();
});

readline.on("close", function () {
  console.log("\nBYE BYE !!!");
  process.exit(0);
});

if (
  !strengthOfVillains.length ||
  !strengthOfVillains.length ||
  strengthOfVillains.length !== energiesOfPlayers.length
)
  return "LOSE";

const result = energiesOfPlayers.every(
  (playerStrength, index) => playerStrength > strengthOfVillains[index]
);

if (result) return "WIN";
else "LOSE";
