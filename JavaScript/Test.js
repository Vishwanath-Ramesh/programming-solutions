process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
  console.log("Input", inputStdin);
  currentLine++;
  process.stdin.resume();
  if (currentLine > 4) process.stdin.destroy();
});

// process.stdin.on("end", (_) => {
//   console.log("End", inputString);
//   inputString = inputString
//     .replace(/\s*$/, "")
//     .split("\n")
//     .map((str) => str.replace(/\s*$/, ""));
//   main();
// });

// function readLine() {
//   return inputString[currentLine++];
// }

// function main() {
//   const n = parseInt(readLine(), 10); // Read and integer like this
//   console.log("Test");
//   // Read an array like this
//   const c = readLine()
//     .split(" ")
//     .map((cTemp) => parseInt(cTemp, 10));
//   console.log(c);
// }

process.stdin.on("end", function () {
  main(inputString);
});

function main(input) {
  process.stdout.write("Hi, " + input + ".\n"); // Writing output to STDOUT
}
