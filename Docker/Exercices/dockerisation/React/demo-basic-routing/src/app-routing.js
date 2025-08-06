import { createBrowserRouter } from "react-router-dom"
import App from "./App"
import ErrorPage from "./routes/ErrorPage"
import Form from "./routes/Form"
import Menu from "./routes/Menu"
import About from "./routes/About"
import Contact from "./routes/Contact"


const router = createBrowserRouter([
    {path :"/",
    element : <Menu />,
    errorElement : <ErrorPage/>,
    children: [
        {
            path :"/",
            element : <App/>
        },
        {
            path :"/form",
            element : <Form/>
        },
        {
            path :"/contact",
            element : <Contact/>
        },
        {
            path :"/about",
            element : <About/>
        }
    ]},
    // {path :"/form",
    // element : <Form />,
    // errorElement : <ErrorPage/> }
])


export default router