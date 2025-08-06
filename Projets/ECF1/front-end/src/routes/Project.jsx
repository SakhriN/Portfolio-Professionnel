import axios from "axios"
import { useState, useEffect } from "react";
import "bootstrap/dist/css/bootstrap.min.css"
import { useNavigate } from "react-router-dom";
// import router from "../app-routing";

function Project() {
    const [tableau, setTableau] = useState([])
let navigue = useNavigate()

    function InitList() {
        useEffect(() => {
            axios.get("http://localhost:2103/projects")
                .then(response => {
                    const data = response.data.test
                    setTableau(data)
                })
                .catch(error => {
                    console.error(error);
                });
        }, [])
    }
    InitList()

    function deleteProject(projectId) {
        axios.delete(`http://localhost:2103/project/${projectId}`)
            .catch(error => {
                console.error(error);
            });
            const updatedTableau = tableau.filter(item => item.id !== projectId);
            setTableau(updatedTableau);
    };


    useEffect(() => {
        console.table(tableau);
      }, [tableau]); 


    return (
        <>
            <h1>BIENVENUE DANS MA PAGE A PROJETS</h1>
            <hr></hr>
            <h2>LES PROJETS :</h2>
            <button className="btn btn-primary" onClick={() => { navigue("/add",{state : {table : tableau}})}}>
                Ajouter
            </button>
            {tableau.map(item => (
                <div className="rounded border border-danger" key={item.id}>

                    <div>
                        <b>{item.titre}</b>
                    </div>
                    <div>
                        {item.contenu}
                    </div>
                    <div>
                        {item.etat}
                    </div>
                    <div>
                        <button className="btn btn-warning" onClick={()=>navigue(`/edit/${item.id}`,{state : {table : tableau}})}>
                            editer
                        </button>
                        <button className="btn btn-danger" onClick={() => { deleteProject(item.id) }}>
                            supprimer
                        </button>

                    </div>
                </div>
            ))}
        </>

    )
}

export default Project