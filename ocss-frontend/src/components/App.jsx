import styles from '../App.css';
import axios from 'axios';
import {useState, useEffect} from "react";

function App() {
  let [text, setText] = useState("");

  useEffect(() => {
    async function getSpringBootContent() {
      let response = await axios.get("http://localhost:8080/hello");
      setText(response.data);
    }

    getSpringBootContent();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <p>
          {text}, Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
