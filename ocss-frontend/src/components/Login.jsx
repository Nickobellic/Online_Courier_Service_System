import { useState, useEffect } from "react";
import Card from '@mui/material/Card';
import { TextField } from "@mui/material";
import {inputLabelClasses} from "@mui/material";
import {Button} from "@mui/material";
import CardContent from '@mui/material/CardContent';
import '@fontsource/roboto/700.css';
import axios from 'axios';
import "../styles/Login.css";
import {Typography} from "@mui/material";

function Login() {

    /*async function addSellers() {
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
    }*/

    async function getAllSellers () {
        try {
            let response = await axios.get("http://localhost:8080/get-products");
            console.log(response.data);
        } catch(error) {
            console.error(`Error in getting Sellers Details: ${error}`);
        }
    }

    return (
        <div className="welcome">
            <Card className="login-card" sx={{borderRadius: "50px"}}>
                <div className="login-title" >
                <Typography  variant="h3">
                    Login
                     </Typography>
                </div> 
                <div className="login-tf">
                    <TextField InputLabelProps={{
                        sx: {
                            color: "white",
                        }
                    }} id="outlined-basic" label="Name" variant="outlined" />
                </div>
                
                <div className="login-tf">
                    <TextField InputLabelProps={{
                        sx: {
                            color: "white",
                        }
                    }} id="outlined-basic" label="Password" variant="outlined" />
                </div>

                <Button className="click-btn" variant="contained" onClick={getAllSellers} >Click Me</Button>
            </Card>
        </div>
    )
}

export default Login;