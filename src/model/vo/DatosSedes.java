/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

/**
 *
 * @author usuario
 */
public class DatosSedes { 
   
   //Atributos
    private int id_sede;
    private String direccion_sede;
    private String barrio_sede;
    private String ciudad_sede;
    private String telefono_sede;
   
    public DatosSedes(){
    
    }
      
    public DatosSedes( int id_sede, String direccion_sede, String barrio_sede, String ciudad_sede, String telefono_sede){
        
        this.id_sede=id_sede;
        this.direccion_sede=direccion_sede;
        this.barrio_sede=barrio_sede;
        this.ciudad_sede=ciudad_sede;
        this.telefono_sede=telefono_sede;
        
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getDireccion_sede() {
        return direccion_sede;
    }

    public void setDireccion_sede(String direccion_sede) {
        this.direccion_sede = direccion_sede;
    }

    public String getBarrio_sede() {
        return barrio_sede;
    }

    public void setBarrio_sede(String barrio_sede) {
        this.barrio_sede = barrio_sede;
    }

    public String getCiudad_sede() {
        return ciudad_sede;
    }

    public void setCiudad_sede(String ciudad_sede) {
        this.ciudad_sede = ciudad_sede;
    }

    public String getTelefono_sede() {
        return telefono_sede;
    }

    public void setTelefono_sede(String telefono_sede) {
        this.telefono_sede = telefono_sede;
    }
    
    
    
}
