const express = require('express');
const fs = require('fs');

const app = express();
const port = 3000;

app.use(express.json());

// Chargement des données depuis les fichiers JSON
const clientsData = JSON.parse(fs.readFileSync('clients.json'));
const produitsData = JSON.parse(fs.readFileSync('produits.json'));
const commandesData = JSON.parse(fs.readFileSync('commandes.json'));

// Route pour afficher la liste des clients
app.get('/clients', (req, res) => {
  res.json(clientsData);
});

// Route pour afficher un client par son ID
app.get('/client/:id', (req, res) => {
    const clientId = parseInt(req.params.id);
    const client = clientsData.clients.find(client => client.id === clientId);
    if (client) {
      res.json(client);
    } else {
      res.status(404).json({ message: 'Commande non trouvée' });
    }
});

// Route pour afficher un produit par son ID
app.get('/produit/:id', (req, res) => {
    const produitId = parseInt(req.params.id);
    const produit = produitsData.produits.find(produit => produit.id === produitId);
    if (produit) {
      res.json(produit);
    } else {
      res.status(404).json({ message: 'Commande non trouvée' });
    }
});

// Route pour afficher la liste des produits
app.get('/produits', (req, res) => {
  res.json(produitsData);
});

// Route pour afficher la liste des commandes
app.get('/commandes', (req, res) => {
  res.json(commandesData);
});

// Route pour afficher une commande par son ID
app.get('/commande/:id', (req, res) => {
  const commandeId = parseInt(req.params.id);
  const commande = commandesData.commandes.find(commande => commande.id === commandeId);
  if (commande) {
    res.json(commande);
  } else {
    res.status(404).json({ message: 'Commande non trouvée' });
  }
});

// Route pour créer une nouvelle commande
app.post('/commandes', (req, res) => {
  const nouvelleCommande = req.body;
  commandesData.commandes.push(nouvelleCommande);
  // Enregistrez la mise à jour dans le fichier JSON
  fs.writeFileSync('commandes.json', JSON.stringify(commandesData, null, 2));
  res.status(201).json(nouvelleCommande);
});

app.post('/produits', (req, res) => {
    const nouveauProduit = req.body;
    produitsData.produits.push(nouveauProduit);
    // Enregistrez la mise à jour dans le fichier JSON
    fs.writeFileSync('produits.json', JSON.stringify(produitsData, null, 2));
    res.status(201).json(nouveauProduit);
  });

  app.post('/clients', (req, res) => {
    const nouveauClient = req.body;
    clientsData.clients.push(nouveauClient);
    // Enregistrez la mise à jour dans le fichier JSON
    fs.writeFileSync('clients.json', JSON.stringify(clientsData, null, 2));
    res.status(201).json(nouveauClient);
  });



app.listen(port, () => {
  console.log(`Serveur en cours d'exécution sur le port ${port}`);
});


