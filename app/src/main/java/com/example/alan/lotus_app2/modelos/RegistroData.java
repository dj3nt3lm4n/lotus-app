package com.example.alan.lotus_app2.modelos;

/**
 * Created by alan on 16/03/18.
 */
//sustituir por los campos de la api
public class RegistroData {
    private String sex;
    private String birthday;
    private String name;
    private String email;
    private String password;
    private String password_confirmation;
    /*email: {type: String, unique: true, required: true},
    nombre: {type: String},
    password: {type: String},
    telefono: {type: Number},

    "sex": "macho pecho peludo",
                  "birthday": "1995/02/20",
                  "name": "roberto medina mercado",
                  "email": "roberm31@outlook.com",
                  "password": "roberto111",
                  "password_confirmation": "roberto111"
    */

    public RegistroData(String sex, String birthday, String name, String email, String password, String password_confirmation) {
        this.sex = sex;
        this.birthday = birthday;
        this.name = name;
        this.email = email;
        this.password = password;
        this.password_confirmation = password_confirmation;
    }

    public RegistroData() {
        this.sex = "";
        this.birthday = "";
        this.name = "";
        this.email = "";
        this.password = "";
        this.password_confirmation = "";
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_confirmation() {
        return password_confirmation;
    }

    public void setPassword_confirmation(String password_confirmation) {
        this.password_confirmation = password_confirmation;
    }
}
