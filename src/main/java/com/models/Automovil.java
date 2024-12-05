package com.models;

public class Automovil {
    public Motor motor;
    public Radio radio;

    public Automovil(Radio radio) {
        this.radio = radio;
    }

    public void manejar(){
        if(motor!=null){
            this.motor.encender();
        }else{
            System.out.println("No se puede encender el motor por que no existe motor en la instancia");
        }

    }

    public void escucharRadio(){
        this.radio.reproducir();
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }


}
