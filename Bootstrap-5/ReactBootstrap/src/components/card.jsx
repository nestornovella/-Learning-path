import React from 'react';
const url1 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKFvcK3DW2x4ZNID7tt0CdwoNyNP9MgoM3pCSJzMDlz8dhyvLDK-y3gq5pyX3lJApk3e4&usqp=CAU"
import './../App.css';

function Card({character, delay}) {
    console.log(delay.toString())
  
    return (
        <div className={`card bg-dark animate__animated animate__fadeInBottomLeft animate__delay-${delay}s overflow`}>
            <div className="row overflow">
                <img className='cardImage' style={{"height":"300px"}} src={character.image} alt="" />
            </div>
            <div className='card-body text-light'>
                <h4 className='card-title'>{character.name}</h4>
                <p className='card-text text-secondary  '>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis, inventore.</p>
                <a name="" id="" className="btn btn-outline-primary rounded-0" href="#" role="button">go to site</a>
           </div>
        </div>
      );
}

export default Card;