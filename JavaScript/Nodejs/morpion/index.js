const fs = require('fs');
const readline = require('readline');

const boardSize = 3;
const board = Array.from(Array(boardSize), () => new Array(boardSize).fill(' '));
let currentPlayer = 'X';
let isBotEnabled = false;

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function printBoard() {
  console.log(board.map(row => row.map(cell => cell.padEnd(3, ' ')).join('|')).join('\n' + '---+---+---\n'));
}

function resetGame() {
  rl.question('Voulez-vous recommencer une nouvelle partie ? (Oui/Non) ', (answer) => {
    if (answer.toLowerCase() === 'oui' || answer.toLowerCase() === 'o') {
      for (let i = 0; i < boardSize; i++) {
        for (let j = 0; j < boardSize; j++) {
          board[i][j] = ' ';
        }
      }
      currentPlayer = 'X';
      saveGame();
      isBotEnabled = false;
      rl.question('Voulez-vous jouer contre un bot ? (Oui/Non) ', (answer) => {
    
        if (answer.toLowerCase() === 'oui' || answer.toLowerCase() === 'o') {
          isBotEnabled = true;
          console.log('Vous jouez contre le bot (O).');
    
        }
        printBoard();
        makeMove();
      });
    } else {
      rl.close();
    }
  });
}

function makeMove() {
  rl.question(`Joueur ${currentPlayer}, entrez la ligne et la colonne (par exemple, 1 2) : `, (input) => {
    const [row, col] = input.split(' ').map(Number);
    if (row >= 1 && row <= boardSize && col >= 1 && col <= boardSize && board[row - 1][col - 1] === ' ') {
      board[row - 1][col - 1] = currentPlayer;
      printBoard();
      const winner = checkWinner();
      if (winner) {
        console.log(`Le joueur ${winner} a gagné !`);

        resetGame()

      } else if (isBoardFull()) {
        console.log("Match nul !");

        resetGame()

      } else {
        switchPlayer();
        saveGame();
        if (isBotEnabled && currentPlayer === 'O') {
          makeBotMove();
        } else {
          makeMove();
        }
      }
    } else {
      console.log("Mouvement invalide. Réessayez.");
      makeMove();
    }
  });
}

function makeBotMove() {
  // Logic for the bot's move (simple random move in this example).
  let row, col;
  do {
    row = Math.floor(Math.random() * boardSize);
    col = Math.floor(Math.random() * boardSize);
  } while (board[row][col] !== ' ');
  board[row][col] = 'O';
  printBoard();
  const winner = checkWinner();
  if (winner) {
    console.log('Le bot (O) a gagné !');

    resetGame()

  } else if (isBoardFull()) {
    console.log('Match nul !');

resetGame()

  } else {
    switchPlayer();
    saveGame();
    makeMove();
  }
}

function checkWinner() {
  for (let i = 0; i < boardSize; i++) {
    if (board[i][0] !== ' ' && board[i][0] === board[i][1] && board[i][1] === board[i][2]) {
      return board[i][0];
    }
    if (board[0][i] !== ' ' && board[0][i] === board[1][i] && board[1][i] === board[2][i]) {
      return board[0][i];
    }
  }
  if (board[0][0] !== ' ' && board[0][0] === board[1][1] && board[1][1] === board[2][2]) {
    return board[0][0];
  }
  if (board[0][2] !== ' ' && board[0][2] === board[1][1] && board[1][1] === board[2][0]) {
    return board[0][2];
  }
  return null;
}



function isBoardFull() {
  for (let row of board) {
    if (row.includes(' ')) {
      return false;
    }
  }
  return true;
}

function switchPlayer() {
  currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
}

function saveGame() {
  const data = board.map(row => row.join('')).join('\n');
  fs.writeFileSync('partie.txt', data);
}

function loadGame() {
  try {
    const data = fs.readFileSync('partie.txt', 'utf8');
    const rows = data.split('\n');
    for (let i = 0; i < boardSize; i++) {
      for (let j = 0; j < boardSize; j++) {
        board[i][j] = rows[i][j];
      }
    }
  } catch (err) {
    console.error("Erreur lors du chargement de la partie.");
  }
}



function playGame() {
  loadGame();
  printBoard();
  resetGame();
}

playGame();
