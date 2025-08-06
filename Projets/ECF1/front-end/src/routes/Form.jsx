import axios from "axios";
import { useNavigate } from "react-router-dom";
import { useLocation, useParams } from "react-router";
import { useEffect, useState } from "react";

function Form() {

const {id} = useParams();
let tableau = useLocation();
let navigue = useNavigate();
const tablo = tableau.state.table;
const [project, setProject] = useState(null)

  useEffect(() => {
if(id!==undefined){
const getProject = async () => {
        try {
          const response = await axios.get(`http://localhost:2103/project/${id}`);
          setProject(response.data);
        } catch (error) {
          console.error("Erreur lors du chargement du projet :", error);
        }
      };

      getProject();
    }
  }, [id]);

    function addProject(e){
        e.preventDefault();
        let counter = 0;
        const  nom = document.getElementById("name").value;
        const  content = document.getElementById("content").value;
        const  statut = document.getElementById("statut-select").value;
        let boolean = true;
        
        while(boolean){
            boolean = false;
            for (let i = 0; i < tablo.length; i++) {
                if (tablo[i].id === counter) {
                    counter++;      
                    boolean = true; 
                    // break;           
                }
            }
        }
        
        const newitem = {
            id : counter,
            titre : nom,
            contenu : content,
            etat : statut
        }

        axios.post(`http://localhost:2103/projects`, newitem)
            .then(response => {
                alert("Projet ajouté avec succès.")
                navigue("/")
            })
            .catch(error => {
                console.error(error); // Gérer les erreurs potentielles
            });
    };

    function editProject(e){
        e.preventDefault();
        const  nom = document.getElementById("name").value;
        const  content = document.getElementById("content").value;
        const  statut = document.getElementById("statut-select").value;

        axios.patch(`http://localhost:2103/project/${id}`, {titre:nom, contenu:content, etat:statut})
        alert("Modification réussie.");
        navigue("/");

    };
    




    return (



        <>
            <h1>FORMULAIRE</h1>
            <hr></hr>



            {id===undefined||project ? (
            <form onSubmit={id===undefined ? addProject : editProject}>
                <div>
                    <label>
                        Titre du projet :
                    </label>
                    <input required defaultValue={id===undefined ? '' : project.titre} type="text" name="name" id="name" />
                </div>
                <div>
                    <label>
                        Contenu du projet :
                    </label>
                    <input required defaultValue={id===undefined ? '' : project.contenu} type="text" name="content" id="content" />
                </div>
                <div>
                    <label>
                        Ou en êtes-vous dans ce projet ?
                    </label>
                </div>
                <div>
                    <select required name="statut" id="statut-select">
                        <option value="">Merci de dire l'avancée du projet</option>
                        <option value="non-terminé">Non Terminé</option>
                        <option value="en-cours">En cours</option>
                        <option value="en-attente">En attente</option>
                        <option value="terminé">Terminé</option>
                    </select>
                </div>
                <button type="submit" className={id===undefined ? "btn btn-primary" : "btn btn-warning" }> {id===undefined ? "Confirmer" : "Editer"}</button>
            </form>
            ) : (
  <p>Chargement du projet...</p>
)}
        </>


    )
}

export default Form