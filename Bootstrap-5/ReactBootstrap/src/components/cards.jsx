import { useEffect } from "react";
import Card from "./card";
import useGetCharacters from "../hooks/getCharacters";
import RenderCards from "./renderCards";

function Cards(props) {
    
    const data = useGetCharacters()

  return (
    <div className="container d-flex justify-content-center align-items-center h-100  ">
      <div className="row d-flex pt-5 m-0">
        <RenderCards characters={data.results}/>
      </div>
    </div>
  );
}

export default Cards;
