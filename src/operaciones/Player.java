/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author vann
 */
public class Player {
    private String _nombre;
    private String _apellido;
    private Float _tamanio;
    
    //constructor por defecto
    public Player() {
    }
  
    //constructor explicito
    public Player(String _nombre, String _apellido, Float _tamanio) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._tamanio = _tamanio;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public Float getTamanio() {
        return _tamanio;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public void setTamanio(Float _tamanio) {
        this._tamanio = _tamanio;
    }
}
