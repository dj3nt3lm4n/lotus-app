package com.example.alan.lotus_app2.modelos;

/**
 * Created by alan on 16/03/18.
 */

public class RegistroData {
    private String nombre;
    private String correo;
    private String pass;
    private String tel;

    public RegistroData(String nombre, String correo, String pass, String tel) {
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
        this.tel = tel;
    }

    public RegistroData() {
        this.nombre = "";
        this.correo = "";
        this.pass = "";
        this.tel = "";
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    @Override
    public String toString() {
        return "RegistroData{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", pass='" + pass + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
