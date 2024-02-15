import Card from "./card";


function RenderCards(props) {
  
    return (  
        <div className="row pt-5 mb-5 pb-5 d-flex justify-content-center">
            {
               
                props.characters && props.characters.map((char, index) => {
                    
                    return <div className="col-xl-4 p-3 col-md-6 col-sm-12 p-0  mb-4">
                         <Card key={char.id} character={char} delay={0.5}/>
                    </div> 
                   
                })
            }
        </div>
    );
}

export default RenderCards;