package com.campusdual.classroom;

public class TVRemote {

  //atributos
  int channel; //en qué canal está la tv

  int volume; //en qué nivel de volumen está la tele

  boolean on; //la tv está encendida o no

  String color; //color del mando a distancia

  //constructores
  public TVRemote(String color) {
    this.channel = 0;
    this.volume = 20;
    this.on = false;
    this.color = color;
  }

  //metodos
  public void turnOn() {
    if (this.getOn()) {
      System.out.println("La Tv ya está encendida.");
    } else {
      this.on = true;
    }
  }

  public void turnOff() {
    if (!this.getOn()) {
      System.out.println("La Tv ya está apagada.");
    } else {
      this.on = false;
    }
  }

  public void channelUp() {
//    if (this.getOn()) {
      this.channel++;
//    } else {
//      System.out.println("La Tv está apagada, enciendela para poder cambiar de canal.");
//    }
  }

  public void channelDown() {
//    if (this.getOn()) {
      if (this.checkMinValue(this.channel)) {
        System.out.println("No se puede bajar más de canal, ya estás en el canal 0.");
      } else {
        this.channel--;
      }
//    } else {
//      System.out.println("La Tv está apagada, enciendela para poder cambiar de canal.");
//    }
  }

  public void volumeUp() {
//    if(this.getOn()) {
      this.volume++;
      System.out.println("El volumen está al " + this.getVolume());
//    } else {
//      System.out.println("La Tv está apagada, enciendela para poder subir el volumen.");
//    }
  }

  public void volumeDown() {
//    if(this.getOn()) {
      if (this.checkMinValue(this.volume)) {
        System.out.println("El volumen ya está al mínimo.");
      } else {
        this.volume--;
        System.out.println("El volumen está al " + this.getVolume());
      }
//    }else{
//      System.out.println("La Tv está apagada, enciendela para poder bajar el volumen.");
//    }
  }

  public String getColor() {
    return this.color;
  }

  public boolean getOn() {
    return this.on;
  }

  public int getVolume() {
    return this.volume;
  }

  public int getChannel() {
    return this.channel;
  }

  private boolean checkMinValue(int value) {
    return value == 0;
  }
}
