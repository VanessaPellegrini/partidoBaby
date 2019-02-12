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
public class PartidoBaby {
    private String _nombrePartido;
    private Byte _dia;
    private Byte _mes;
    private Byte _anio;
    
    private Team objTeam1;
    private Team objTeam2;

    public PartidoBaby() {
        objTeam1 = new Team();
        objTeam2 = new Team();
    }

    public PartidoBaby(String _nombrePartido, Byte _dia, Byte _mes, Byte _anio) {
        this._nombrePartido = _nombrePartido;
        this._dia = _dia;
        this._mes = _mes;
        this._anio = _anio;
    }

    public String getNombre() {
        return _nombrePartido;
    }

    public Byte getDia() {
        return _dia;
    }

    public Byte getMes() {
        return _mes;
    }

    public Byte getAnio() {
        return _anio;
    }

    public Team getObjTeam1() {
        return objTeam1;
    }

    public Team getObjTeam2() {
        return objTeam2;
    }

    public void setNombrePartido(String _nombre) {
        this._nombrePartido = _nombre;
    }

    public void setDia(Byte _dia) {
        this._dia = _dia;
    }

    public void setMes(Byte _mes) {
        this._mes = _mes;
    }

    public void setAnio(Byte _anio) {
        this._anio = _anio;
    }

    public void setObjTeam1(Team objTeam1) {
        this.objTeam1 = objTeam1;
    }

    public void setObjTeam2(Team objTeam2) {
        this.objTeam2 = objTeam2;
    }
    
    //getFecha & setFecha
    public String getFecha(){
        String mes = this.getMes().toString();
        
        if(null != mes)switch (mes) {
            case "1":
                mes="enero";
                break;
            case "2":
                mes="febrero";
                break;
            case "3":
                mes="marzo";
                break;
            case "4":
                mes="abril";
                break;
            case "5":
                mes="mayo";
                break;
            case "6":
                mes="junio";
                break;
            case "7":
                mes="julio";
                break;
            case "8":
                mes="agosto";
                break;
            case "9":
                mes="septiembre";
                break;
            case "10":
                mes="octubre";
                break;
            case "11":
                mes="noviembre";
                break;
            case "12":
                mes="diciembre";
                break;
            default:
                break;
        }
        
        return this.getDia().toString() + " " + mes + " 20" + this.getAnio(); 
    }
    
    public void setFecha(Byte day, Byte month, Byte year){
        if(day>0 && day<=31 && month>0 && month<=12 && year > 0 && year < 99){
            this._dia = day;
            this._mes = month;
            this._anio = year;
        }
    }
    
    public void eliminarTeam01() {
        this.objTeam1 = null;
    }
    
    public void eliminarTeam02() {
        this.objTeam2 = null;
    }
}
