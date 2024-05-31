import { useState, useEffect } from "react";
import axios from 'axios';
import "../styles/Login.css";

function Login() {
    let [text, setText] = useState("");

    useEffect(() => {
        async function getFirstApiResultFromSpringBoot() {
            let response = await axios.get("http://localhost:8080/hello");
            setText(response.data);
        }

        getFirstApiResultFromSpringBoot();
    }, [])


    return (
        <div>
            <h1 className="welcome">{text}, Welcome to OCSS</h1>
        </div>
    )
}

export default Login;