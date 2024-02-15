
import Cards from './components/cards'
import './App.css';
import NavBar from './components/navBar';
import { Carousel } from 'bootstrap';
import CarouselInitial from './components/carrousel';
function App() {
  return (
    <main className='app'>
      <NavBar/>
      <CarouselInitial/>
      <Cards/>
    </main>
  )
}

export default App
