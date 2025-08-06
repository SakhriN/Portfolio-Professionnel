const express = require('express');
const uuid = require('uuid'); // Pour générer des identifiants uniques
const app = express();
const port = 3000;

app.use(express.json()); // Pour analyser les données JSON des requêtes

const todos = []; // Tableau pour stocker les todos (solution en mémoire)
 
app.get('/add', (req, res) => {
    res.send(`
      <h1>Ajouter une nouvelle tâche</h1>
      <form method="post" action="/todos">
      <label for="titre">Titre:</label>
      <input type="text" id="titre" name="titre" placeholder="Titre" required>  
      <label for="contenu">Contenu:</label>
      <input type="text" id="contenu" name="contenu" placeholder="Contenu" required>
      <label for="statut">Statut:</label>
      <input type="text" id="statut" name="statut" placeholder="Statut" required>
        <button type="submit">Ajouter la tâche</button>
      </form>
    `);
  });
  
  // Endpoint pour gérer la soumission du formulaire et ajouter une tâche
  app.post('/todos', (req, res) => {
    console.log(req.body);
    const { titre, contenu, statut } = req.body;
    const newTodo = { id: uuid.v4(), titre, contenu, statut };
    todos.push(newTodo);
    res.json(newTodo);
  });

// Endpoint pour modifier une todo par son ID
app.put('/todos/:id', (req, res) => {
  const id = req.params.id;
  const { titre, contenu, statut } = req.body;
  const todo = todos.find((t) => t.id === id);
  if (!todo) {
    return res.status(404).json({ message: 'Todo non trouvée' });
  }
  todo.titre = titre;
  todo.contenu = contenu;
  todo.statut = statut;
  res.json(todo);
});

// Endpoint pour récupérer la liste de todos
app.get('/todos', (req, res) => {
  console.log(todos);
  res.json(todos);
});

// Endpoint pour récupérer une todo par son ID
app.get('/todos/:id', (req, res) => {
  const id = req.params.id;
  const todo = todos.find((t) => t.id === id);
  if (!todo) {
    return res.status(404).json({ message: 'Todo non trouvée' });
  }

  res.send(todo)

  res.json(todo);
});

// Endpoint pour supprimer une todo par son ID
app.delete('/todos/:id', (req, res) => {
  const id = req.params.id;
  const index = todos.findIndex((t) => t.id === id);
  if (index === -1) {
    return res.status(404).json({ message: 'Todo non trouvée' });
  }
  todos.splice(index, 1);
  res.sendStatus(204); // Statut de réponse "No Content" pour indiquer la suppression réussie
});

// Endpoint pour rechercher des todos par leur titre
app.get('/todos/search', (req, res) => {
  const titre = req.query.titre; // Récupère le titre depuis la requête
  const todosFound = todos.filter((t) => t.titre.includes(titre));
  res.json(todosFound);
});

// Démarrer le serveur
app.listen(port, () => {
  console.log(`Serveur en cours d'exécution sur le port ${port}`);
});
