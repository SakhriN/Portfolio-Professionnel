import { NavLink, Outlet } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css'


function Menu() {
  return (
    <div >
      <header>
        <div className="navbar navbar-extend-lg bg-danger text-light">
          <NavLink className="text-light text-decoration-none" to="/">Home</NavLink>
          <NavLink className="text-light text-decoration-none" to="/form">Formulaire</NavLink>
          <NavLink className="text-light text-decoration-none" to="/contact">Contacter</NavLink>
          <NavLink className="text-light text-decoration-none" to="/about">A Propos</NavLink>
        </div>
      </header>
      <Outlet />
    </div>
  );
}

export default Menu