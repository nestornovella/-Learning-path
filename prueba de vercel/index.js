const express = require('express')
const cors = require('cors')
const routes = require("./src/routes/indexRoutes")
const { connect } = require('./src/db')
const PORT = process.env.PORT || 3001

const app = express()

app.use(cors())
app.use(express.json())
app.use('/', routes)

// Definimos una función asincrónica para poder usar await
async function startServer() {
  try {
    // Conectamos a la base de datos y sincronizamos el modelo
    await connect.sync({ force: true });
    console.log('Base de datos sincronizada.');

    // Iniciamos el servidor
    app.listen(PORT, () => {
      console.log(`Servidor ejecutándose en el puerto ${PORT}`);
    });
  } catch (error) {
    console.error('Error al sincronizar la base de datos:', error);
  }
}

// Llamamos a la función para iniciar el servidor
startServer();