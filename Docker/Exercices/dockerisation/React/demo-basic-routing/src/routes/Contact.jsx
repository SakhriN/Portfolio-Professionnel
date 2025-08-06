import { NavLink } from "react-router-dom";



function Contact() {
  return (
    <div >
      <header >
        <h1>Contacter</h1>
        <hr></hr>
        <form>
          <div>
          <label >Adresse Mail :</label>
          <input type="text" className="form-label" name="" id="" />
          </div>
          <div>
          <label>Message a ajouter</label>
          <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
        </div> 
        <div>
          <button className="btn btn-danger">Submit why in english ? because</button>
        </div>
        </form>
      </header>
    </div>
  );
}

export default Contact