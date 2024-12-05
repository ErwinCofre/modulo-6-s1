package org.example;

import com.models.Automovil;

import com.models.Motor;
import com.models.Radio;
import com.models.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    /*Usuario usuario = new Usuario();
    usuario.setId(1);
    usuario.setNombre("Juan");
    usuario.setApellido("Salas");
    usuario.setEdad(45);
    usuario.setEmail("email@email.com");
    //constructor completo
    Usuario usuario2= new Usuario(2,"Jose","Araneda",35,"email2@email.com");


    System.out.println(usuario);
    System.out.println(usuario2);*/
        Motor motor = new Motor(1400);
        Radio radio = new Radio();

        Automovil automovil = new Automovil(radio);

        automovil.setMotor(motor);

        automovil.manejar();
        automovil.escucharRadio();



    }
}
