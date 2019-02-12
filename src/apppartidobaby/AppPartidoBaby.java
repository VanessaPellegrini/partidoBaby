/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppartidobaby;

import java.util.ArrayList;
import java.util.Scanner;
import operaciones.PartidoBaby;
import operaciones.Player;
import operaciones.Team;

/**
 *
 * @author vann
 */
public class AppPartidoBaby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean continuar = true;
        ArrayList<PartidoBaby> _arrListListaPartidos = new ArrayList<>();
        
        do{
            imprimirMenu();
            Scanner scan = new Scanner(System.in);
            String opcion = scan.next();
            
            if(opcion.equals("1")){
                
                PartidoBaby objNuevoPartido = new PartidoBaby();
                
                String nombrePartido="";
                Byte diaPartido=' ';
                Byte mesPartido=' ';
                Byte anioPartido=' ';
                
                String nombreEquipo1="";
                String ciudadEquipo1="";
                String nombreEquipo2="";
                String ciudadEquipo2="";             
                
                //ingresar nuevo partido partidoBaby
                System.out.println("|******| Ingrese nombre del Partido |******|");
                nombrePartido = scan.next();
                objNuevoPartido.setNombrePartido(nombrePartido);
                
                System.out.println("|******| Ingrese la fecha que desea reservar |******|");
                
                do{
                System.out.println("\n Ingrese el día: ");
                diaPartido = scan.nextByte();
                objNuevoPartido.setDia(diaPartido);
                }while( diaPartido < 1 || diaPartido>31 );
                //
                do{
                System.out.println("\n Ingrese el mes: ");
                mesPartido = scan.nextByte();
                objNuevoPartido.setMes(mesPartido);
                }while( mesPartido <1 || mesPartido>12 );
                
                do{
                System.out.println("\n ingrese el año en formato 20(XX): ");
                anioPartido = scan.nextByte();
                objNuevoPartido.setAnio(anioPartido);
                }while( anioPartido < 18 || anioPartido > 99 );
                //objNuevoPartido.setFecha(diaPartido, mesPartido, anioPartido);
                
                //ingresar datos de los equipos
                System.out.println("\n Ingrese el nombre del primer equipo: ");
                nombreEquipo1= scan.next();
                objNuevoPartido.getObjTeam1().setNombre(nombreEquipo1);
                System.out.println("\n Ingrese la ciudad: ");
                ciudadEquipo1 = scan.next();
                objNuevoPartido.getObjTeam1().setCiudad(ciudadEquipo1);
                
                System.out.println("\n Ingrese el nombre del segundo equipo que jugará: ");
                nombreEquipo2 = scan.next();
                objNuevoPartido.getObjTeam2().setNombre(nombreEquipo2);
                System.out.println("\n Ingrese la ciudad: ");
                ciudadEquipo2 = scan.next();
                objNuevoPartido.getObjTeam2().setCiudad(ciudadEquipo2);
                
                //ingresar jugadores
                System.out.println("\n Ingrese los datos de los jugadores del primer equipo: ");
                for (int i = 0; i < 6; i++) {
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nombreJugador = scan.next();
                    objNuevoPartido.getObjTeam1().getArrPlayer()[i].setNombre(nombreJugador);
                    
                    System.out.println("Ingrese el apellido del jugador: ");
                    String apellidoJugador = scan.next();
                    objNuevoPartido.getObjTeam1().getArrPlayer()[i].setApellido(apellidoJugador);
                    
                    System.out.println("Ingrese altura jugador: ");
                    Float alturaJugador = scan.nextFloat();
                    objNuevoPartido.getObjTeam1().getArrPlayer()[i].setTamanio(alturaJugador);
                }
                
                System.out.println("\n Ingrese los datos de los jugadores del segundo equipo: ");
                for (int i = 0; i < 6; i++) {
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nombreJugador = scan.next();
                    objNuevoPartido.getObjTeam2().getArrPlayer()[i].setNombre(nombreJugador);
                    
                    System.out.println("Ingrese el apellido del jugador: ");
                    String apellidoJugador = scan.next();
                    objNuevoPartido.getObjTeam2().getArrPlayer()[i].setApellido(apellidoJugador);
                    
                    System.out.println("Ingrese altura jugador: ");
                    Float alturaJugador = scan.nextFloat();
                    objNuevoPartido.getObjTeam2().getArrPlayer()[i].setTamanio(alturaJugador);
                }

                //agrego el partido al arraylist
                _arrListListaPartidos.add(objNuevoPartido);
                
            }//if opcion 1
            
            if(opcion.equals("2")){
                // Listar todos los partidos, junto al nombre de sus dos equipos y jugadores.
                //TODO validar que el tamaño del equipo no sea 0 
                if(_arrListListaPartidos.isEmpty()){
                    System.out.println("|******| Listado de partidos vacio, para ver listado ingrese los datos de los mismos |******|");
                }else{
                    System.out.println("\n |****** Listado de partidos ******|");
                    for (int i = 0; i < _arrListListaPartidos.size(); i++) {
                        _arrListListaPartidos.get(i);
                        System.out.println("\n Nombre partido: " + _arrListListaPartidos.get(i).getNombre());
                        System.out.println("\n Fecha del partido: " + _arrListListaPartidos.get(i).getFecha());
                        //imprime nombre equipos
                        System.out.println("\n |****** Nombre equipos y jugadores ******| ");
                        System.out.println("\n |******| Primer Equipo |******|");
                        System.out.println("\n Nombre :" + _arrListListaPartidos.get(i).getObjTeam1().getNombre());
                        System.out.println("\n Ciudad :" + _arrListListaPartidos.get(i).getObjTeam1().getCiudad());
                    
                        //nombre jugadores [TODO] validar que si esta vacio no lo imprima
                        //TODO no se puede comprobar
                        if(_arrListListaPartidos.get(i).getObjTeam1() == null){
                            System.out.println("Se ha eliminado el equipo 1 ");
                        }else{
                            System.out.println("|******| Nombre jugadores primer Equipo|******|");
                            Player [] arrTeam1 = _arrListListaPartidos.get(i).getObjTeam1().getArrPlayer();
                            for (int j = 0; j < arrTeam1.length; j++) {
                                System.out.println("Nombre :" + arrTeam1[j].getNombre());
                                System.out.println("Apellido: " + arrTeam1[j].getApellido());
                                System.out.println("Altura: "+ arrTeam1[j].getTamanio());
                            }
                        }
                        
                        //System.out.println(_arrListListaPartidos.get(i).getObjTeam1().listarJugadores());

                        System.out.println("\n |******| Segundo Equipo |******|");
                        System.out.println("\n Nombre :" + _arrListListaPartidos.get(i).getObjTeam2().getNombre());
                        System.out.println("\n Ciudad :" + _arrListListaPartidos.get(i).getObjTeam2().getCiudad());
                        
                        if (_arrListListaPartidos.get(i).getObjTeam1() == null) {
                            System.out.println("Se ha eliminado el equipo 2");
                        }else{
                            System.out.println("\n |******| Nombre jugadores segundo Equipo |******|");
                            Player [] arrTeam2 = _arrListListaPartidos.get(i).getObjTeam2().getArrPlayer();
                            for (int j = 0; j < arrTeam2.length; j++) {
                                System.out.println("Nombre :" + arrTeam2[j].getNombre());
                                System.out.println("Apellido: " + arrTeam2[j].getApellido());
                                System.out.println("Altura: "+ arrTeam2[j].getTamanio());
                            }
                        }
                    }
                }
                
                
            }//FIN if opcion 2
            if(opcion.equals("3")){
                //Eliminar algún equipo para un partido determinado por su posición dentro de la lista.
                if(_arrListListaPartidos.isEmpty()){
                    System.out.println("|******| Para eliminar un equipo primero debe ingresar uno a la lista |******|");
                }else{
                    for (int i = 0; i < _arrListListaPartidos.size(); i++) {
                        //imprimir toda la lista de partidos
                        System.out.println("|******| Partidos disponibles para eliminar |******|");
                        String listaPartidos = _arrListListaPartidos.get(i).getNombre();
                        System.out.println(i+" - " + listaPartidos);

                        System.out.println("\n Ingrese número de partido a eliminar: ");
                        int elegirPartido = scan.nextInt();
                        
                        System.out.println("|******| Equipos disponibles para Eliminar |******|");
                        String listaEquipo1 = _arrListListaPartidos.get(i).getObjTeam1().getNombre();
                        String listaEquipo2 = _arrListListaPartidos.get(i).getObjTeam2().getNombre();
                        System.out.println("1 - " + listaEquipo1);
                        System.out.println("2 - " + listaEquipo2);

                        System.out.println("Ingrese número de equipo a eliminar (1 o 2) según corresponda: ");
                        int eliminarPartido = scan.nextInt();

                        if(eliminarPartido == 1){
                            System.out.println("Atención partido 1 eliminado");
                            _arrListListaPartidos.get(elegirPartido).eliminarTeam01();
                        }else if(eliminarPartido == 2){
                            System.out.println("Atención partido 2 eliminado");
                            _arrListListaPartidos.get(elegirPartido).eliminarTeam02();
                        } 
                    }
                }
            }//if opcion 3
            if(opcion.equals("4")){
                //Modificar los datos de algún jugador de un equipo de un partido.
                if(_arrListListaPartidos.isEmpty()){
                    System.out.println("|******| Para modificar un jugador perteneciente a un equipo primero debe ingresar un equipo a la lista |******|");
                }else{
                    for (int i = 0; i < _arrListListaPartidos.size(); i++) {
                        //imprimir toda la lista de partidos
                        System.out.println("|******| Partidos disponibles para modificar |******|");
                        String listaPartidos = _arrListListaPartidos.get(i).getNombre();
                        System.out.println(i+" - " + listaPartidos);

                        System.out.println("\n Ingrese el número de partido a modificar: ");
                        int elegirPartido = scan.nextInt();
                        
                        //imprimir lista de equipos
                        System.out.println("|******| Equipos disponibles para modificar |******|");
                        String listaEquipo1 = _arrListListaPartidos.get(i).getObjTeam1().getNombre();
                        String listaEquipo2 = _arrListListaPartidos.get(i).getObjTeam2().getNombre();
                        System.out.println("1 - " + listaEquipo1);
                        System.out.println("2 - " + listaEquipo2);

                        System.out.println(" Ingrese el número de equipo a modificar (1 o 2): ");
                        int elegirEquipo = scan.nextInt();
                        
                        //modificar jugadores Equipos 1
                        if(elegirEquipo==1) {
                            if(_arrListListaPartidos.get(elegirPartido).getObjTeam1() == null){
                                System.out.println("No existe esta opción ya que el equipo 1 fue eliminado.");
                            }else{
                                System.out.println("Seleccionar jugador a eliminar del equipo 1");
                                //TODO imprimir nombre de jugadores
                                Player [] arrTeam1 = _arrListListaPartidos.get(i).getObjTeam1().getArrPlayer();
                                for (int j = 0; j < arrTeam1.length; j++) {
                                    System.out.println(j+" - "+ "Nombre :" + arrTeam1[j].getNombre());
                                    System.out.println(j +" - "+ "Apellido: " + arrTeam1[j].getApellido());
                                    System.out.println(j+" - "+ "Altura: "+ arrTeam1[j].getTamanio());
                                }
                                
                                System.out.println(" Ingrese el numero del jugador a modificar (0 a 5): ");
                                int elegirJugador = scan.nextInt();
                                
                                System.out.println("El jugador seleccionado es: " + _arrListListaPartidos.get(elegirPartido).getObjTeam1().getArrPlayer()[elegirJugador]);
                                
                                System.out.println("Ingrese nombre a modificar: ");
                                String modNombre = scan.next();
                                
                                System.out.println("Ingrese apellido a modificar: ");
                                String modApellido = scan.next();
                                
                                System.out.println("Ingrese altura a modificar: ");
                                Float modAltura = scan.nextFloat();
                                
                                //seteo nuevamente
                                _arrListListaPartidos.get(elegirPartido).getObjTeam1().getArrPlayer()[elegirJugador].setNombre(modNombre);
                                _arrListListaPartidos.get(elegirPartido).getObjTeam1().getArrPlayer()[elegirJugador].setApellido(modApellido);
                                _arrListListaPartidos.get(elegirPartido).getObjTeam1().getArrPlayer()[elegirJugador].setTamanio(modAltura);
                            }
                        }else{
                            if(_arrListListaPartidos.get(elegirPartido).getObjTeam2() == null){
                                System.out.println("No existe esta opción ya que el equipo 2 fue eliminado.");
                            }else{
                                System.out.println("Seleccionar jugador a eliminar del equipo 2");
                                Player [] arrTeam2 = _arrListListaPartidos.get(i).getObjTeam2().getArrPlayer();
                                for (int j = 0; j < arrTeam2.length; j++) {
                                    System.out.println(j +" - "+ "Nombre :" + arrTeam2[j].getNombre());
                                    System.out.println(j +" - "+ "Apellido: " + arrTeam2[j].getApellido());
                                    System.out.println(j+" - "+ "Altura: "+ arrTeam2[j].getTamanio());
                                }
                                
                                System.out.println(" Ingrese el numero del jugador a modificar (0 a 5): ");
                                int elegirJugador = scan.nextInt();
                                
                                System.out.println("El jugador seleccionado es: " + _arrListListaPartidos.get(elegirPartido).getObjTeam2().getArrPlayer()[elegirJugador].getNombre()+ " " +
                                _arrListListaPartidos.get(elegirPartido).getObjTeam2().getArrPlayer()[elegirJugador].getApellido() + " "+ _arrListListaPartidos.get(elegirPartido).getObjTeam2().getArrPlayer()[elegirJugador].getTamanio());
                                
                                System.out.println("Ingrese nombre a modificar: ");
                                String modNombre = scan.next();
                                
                                System.out.println("Ingrese apellido a modificar: ");
                                String modApellido = scan.next();
                                
                                System.out.println("Ingrese altura a modificar: ");
                                Float modAltura = scan.nextFloat();
                                
                                //seteo nuevamente
                                _arrListListaPartidos.get(elegirPartido).getObjTeam2().getArrPlayer()[elegirJugador].setNombre(modNombre);
                                _arrListListaPartidos.get(elegirPartido).getObjTeam2().getArrPlayer()[elegirJugador].setApellido(modApellido);
                                _arrListListaPartidos.get(elegirPartido).getObjTeam2().getArrPlayer()[elegirJugador].setTamanio(modAltura);
                                
                            }
                        }
                    }
                }
            }//if opcion 4
            if(opcion.equals("5")){
                //TODO: confirmacion salida
                continuar = false;
            }//if opcion 5
            
        }while(continuar);
    }
    public static void imprimirMenu(){
        System.out.println("1 - Ingresar Nuevo Partido");
        System.out.println("2 - Listar Partidos");
        System.out.println("3 - Eliminar equipo");
        System.out.println("4 - Modificar datos de jugador");
        System.out.println("5 - Salir del programa");
    }
}
