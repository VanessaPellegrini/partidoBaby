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
public class Team {
    private String _nombre;
    private String _ciudad;
    
    //se declaran los player
    private Player [] _arrPlayer;
    private Player objPlayer;
    
    //constructor por defecto
    //constructor con derivados

    public Team() {
        this._arrPlayer = new Player[6];
        for (int i = 0; i < 6; i++) {
            this._arrPlayer[i] = new Player();
        }
    }
    
    //constructor explicito + derivado
    public Team(String _nombre, String _ciudad) {
        this._nombre = _nombre;
        this._ciudad = _ciudad;
        _arrPlayer = new Player[6];
        objPlayer = new Player();
    }

    public String getNombre() {
        return _nombre;
    }

    public String getCiudad() {
        return _ciudad;
    }

    public Player[] getArrPlayer() {
        return _arrPlayer;
    }

    public Player getObjPlayer() {
        return objPlayer;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setCiudad(String _ciudad) {
        this._ciudad = _ciudad;
    }

    public void setArrPlayer(Player[] _arrPlayer) {
        this._arrPlayer = _arrPlayer;
    }

    public void setObjPlayer(Player objPlayer) {
        this.objPlayer = objPlayer;
    }
    
    //listar jugadores
    public void listarJugadores() {
        for (int i = 0; i < this._arrPlayer.length; i++) {
            //retorna el iesimo elemento de jugadores
            System.out.print("Nombre : " + this._arrPlayer[i].getNombre() + "\n" + "Apellido: " + this._arrPlayer[i].getApellido() +
            "\n" + "Tamaño: " + this._arrPlayer[i].getTamanio());
        }
    }
}
