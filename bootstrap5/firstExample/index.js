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
      
      if(element.id === event.id){
        element.remove()
      }
    })
  }

  function createNewLenguage(){
    const inputValue = {}
    Array.from(form).forEach(e => {
        if(e.value){
            inputValue[e.name] = e.value
        }
      })
        const template = `<tr id=${index}>
            <td>${index}</td>
            <td>${inputValue.name}</td>
            <td>${inputValue.amount}</td>
            <td>${inputValue.description}</td>

            <td><button id="${index++}" onclick="deleteElement(this)" type="button" class="btn btn-danger">🗑️</button></td>
        </tr>`
    

        validateInputs(inputValue, template)
    
  }

  function validateInputs(inputValue, template){
    if(inputValue.name && inputValue.description && inputValue.amount){
      tBody.insertAdjacentHTML("beforeend", template)
    }
  }


  function verifyCharacters(element, maxChars){
    console.log(element.value.length)
    if(element.value.length > maxChars){
      element.value = element.value.slice(0,maxChars)
    }
  }