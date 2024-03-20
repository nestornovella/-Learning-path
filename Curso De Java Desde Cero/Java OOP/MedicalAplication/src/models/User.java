package models;

//abstract me permite crear una clase padre generica que no es constructora de intancias
public abstract class User {
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "nombre: " + name + "\n" + "address: " + address ;   
    }

    public abstract void showData();
  
}
