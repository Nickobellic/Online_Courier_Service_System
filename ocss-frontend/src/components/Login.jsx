import { useState, useEffect } from "react";
import axios from 'axios';
import "../styles/Login.css";

function Login() {

    async function addSellers() {
        try {
        let response = await axios.post("http://localhost:8080/new-seller", {
            seller_name: "Jacob",
            seller_username: "jacob@gmail.com",
            seller_password: "itsmejacob",
            items_sold: "1001",
            total_sales: 1
        });

        console.log(response.status);
    } catch(err) {
        console.error(`Error in creating new Sellers: ${err}`);
    }
    }

    return (
        <div>
            <h1 className="welcome">Welcome to OCSS</h1>
            <button onClick={addSellers}>Click Me</button>
        </div>
    )
}

export default Login;