function mostrarAlerta(){
    alert("hola mundo")
  }

  const cleanBtn = document.getElementById('cleanBtn')
  const form = document.getElementById('form')
  const tBody = document.getElementById('tBody')
  let index = 1

  function clean (){
    Array.from(form).forEach(e => {
      if(e.value){
        e.value = ""
      }
    })
  } 

  function deleteElement (event){
    console.log(event.id)
    Array.from(tBody.children).forEach(element => {
     if( element.id === event.id){
      fetch("http://localhost:8080/api/languages/" + event.id,{
        method:"DELETE",
        headers:{'Content-Type': 'application/json'},
       
      }).then(()=>getAllLanguagesList())
     }
    })
  }



  function getAllLanguagesList(){
    tBody.innerHTML =""
    console.log(tBody.innerHTML)
    const lenguagesList = fetch("http://localhost:8080/api/languages")

    lenguagesList.then(response => response.json())
    .then(data => {
      data.length && data.forEach(lenguage => {
        const template = `<tr id=${lenguage.id}>
            <td>${lenguage.id}</td>
            <td>${lenguage.name}</td>
            <td>${lenguage.users}</td>
            <td>${lenguage.description}</td>

            <td><button id="${lenguage.id}" onclick="deleteElement(this)" type="button" class="btn btn-danger">🗑️</button></td>
        </tr>`
        console.log(data)
        validateInputs(lenguage, template)
    
      })
    })

    
  }




  function createNewLenguage(){
    const newLenguage = {}
     Array.from(form).forEach(e => {

      newLenguage[e.name] = e.value
     })

    

    fetch("http://localhost:8080/api/languages",{
      method:"POST",
      headers:{'Content-Type': 'application/json'},
      body: JSON.stringify(newLenguage)
    })
    .then( () => getAllLanguagesList())
    .then(()=> clean())
      
    
  }

  function validateInputs(inputValue, template){
    if(inputValue.name && inputValue.description && inputValue.users){
      tBody.insertAdjacentHTML("beforeend", template)
    }
  }


  function verifyCharacters(element, maxChars){

    if(element.value.length > maxChars){
      element.value = element.value.slice(0,maxChars)
    }
  }


  getAllLanguagesList()