const Sequelize = require ("sequelize")
const pg = require('pg')


const sequelize = new Sequelize("postgres://default:2HkeCtswa3mq@ep-late-sea-a47niy8v.us-east-1.aws.neon.tech:5432/verceldb?sslmode=require",{
    dialect: 'postgres',
    dialectModule: pg, // I've added this.
    logging: false,
  })




module.exports = {
    connect: sequelize
}