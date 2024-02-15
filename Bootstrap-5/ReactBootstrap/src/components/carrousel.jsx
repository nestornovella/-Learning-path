import useGetCharacters from "../hooks/getCharacters";
import './../App.css';


function CarouselInitial() {
    const data = useGetCharacters()
    return (
        <div className="container mainCarousel">
            <div className="row d-flex justify-content-center">
                <div className="col-xl-6 px-0" >
                <div id="carouselExample" className="carousel slide">
                <div className="carousel-inner">
                    {
                        data.results && data.results.map((char, index) => {
                            return <div className={`carousel-item ${index == 0 ? 'active' : ''}`} >
                                <img src={char.image} className="d-block w-100 imageCarousel " alt={char.name} />
                            </div>
                        })
                    }
                </div>
                <button className="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
                    <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Previous</span>
                </button>
                <button className="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
                    <span className="carousel-control-next-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Next</span>
                </button>
            </div>
                </div>
                <div className="col-xl-6 d-flex flex-column px-5  bg-dark">
                    <h1 className="card-title text-light fw-bold fs-1 mb-5">Titulo de la desc</h1>
                    <p className=" text-secondary fs-4">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Vero atque corrupti enim nobis provident hic repellendus necessitatibus consectetur unde eveniet sit consequuntur ullam ut amet eum minima velit, porro similique?</p>
                </div>
            </div>
            
        </div>

    );
}

export default CarouselInitial;