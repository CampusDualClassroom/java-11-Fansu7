package com.campusdual.classroom;

public class Exercise11 {
  public static void main(String[] args) {
    TVRemote redRemote = new TVRemote("Rojo");
    TVRemote blackRemote = new TVRemote("Negro");
    System.out.println(redRemote.getColor());
    System.out.println(blackRemote.getColor());

    //Encender la TV
    redRemote.turnOn();
    //Subir un canal
    redRemote.channelUp();
    //Bajar un canal
    redRemote.channelDown();
    //Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
    do{
      redRemote.channelDown();
    }while(redRemote.getChannel() != 0);
    //Subir el volumen
    redRemote.volumeUp();
    //Bajar el volumen
    redRemote.volumeDown();
    //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
    do{
      redRemote.volumeDown();
    }while(redRemote.getVolume() != 0);
    redRemote.volumeDown();
    //Obtener el color del mando a distancia y mostrarlo por pantalla
    System.out.println(redRemote.getColor());
    //Apagar la TV
    redRemote.turnOff();
  }

}