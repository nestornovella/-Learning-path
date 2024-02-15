import React, { useState } from 'react';

function NavBar() {

  const [show, setShow] = useState(false)

  function showHandle() {
    setShow(!show)
  }

  return (
    <nav className='navbar navbar-expand-lg bg-dark' data-bs-theme="dark">
      <div className='container-fluid'>
        <a className='navbar-brand' href="">Rick And Morty</a>
        <button onClick={showHandle} className='navbar-toggler'>
          <span className='navbar-toggler-icon'></span>
        </button>
        <div className={`collapse navbar-collapse ${show ? "show" : ""}` }>
          <ul className='navbar-nav ms-3'>
            <li >
            <a className='nav-link' href="">Inicio</a>
            </li>
            <li>
              <a className='nav-link' href="">Acerca de</a>
            </li>
            <li >
              <a className='nav-link' href="">Favoritos</a>
            </li>
          </ul>
          <form action="" className='ms-auto d-flex'>
            <input className='form-control me-2 ' type="text" />
            <button className='btn btn-outline-primary'>Search</button>
          </form>
        </div>
      </div>
    </nav>
  );
}

export default NavBar;

