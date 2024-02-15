import React, { useEffect, useState } from 'react';



function useGetCharacters() {
    const [characters, setCharacters] = useState([])
    const [error, setError] = useState([])
    useEffect(()=>{
            fetch("https://rickandmortyapi.com/api/character")
            .then(res => res.json())
            .then(data => setCharacters(data))
            .catch( err => setError(prev => [...prev, err]))
    },[])

   
    return ( 
        error.length ? error : characters
     );
}

export default useGetCharacters;