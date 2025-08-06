const fs = require('fs');
const path = require('path');

function createDirectoryStructure(filePath, baseDirectory) {
  const data = fs.readFileSync(filePath, 'utf-8');
  const lines = data.split('\n');

  for (const line of lines) {
    const trimmedLine = line.trim();

    if (trimmedLine) {
      const directoryPath = path.join(baseDirectory, trimmedLine);
      if (!fs.existsSync(drairectoryPath)) {
            fs.mkdirSync(directoryPath, { recursive: true });
      }
    }
  }
}

if (require.main === module) {
  // Spécifiez le chemin du fichier texte contenant la structure
  const filePath = './structure.txt';

  // Spécifiez le répertoire de base où vous souhaitez créer l'arborescence
  const baseDirectory = './';

  createDirectoryStructure(filePath, baseDirectory);
}
