import java.util.Scanner;

public class Ex202 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int cantidadAlumnos=0, precioAlumno=0, precioTotal=0;

        System.out.print("Cuantos alumnos son? ");
        cantidadAlumnos = sc.nextInt();
        if(cantidadAlumnos>=100)
        {
            precioAlumno=65;
            precioTotal=cantidadAlumnos*precioAlumno;
        }
        else if(cantidadAlumnos>=50 && cantidadAlumnos<=99)
        {
            precioAlumno=70;
            precioTotal=cantidadAlumnos*precioAlumno;
        }
        else if(cantidadAlumnos>=30 && cantidadAlumnos<=49)
        {
            precioAlumno=950;
            precioTotal=cantidadAlumnos*precioAlumno;
        }
        else if(cantidadAlumnos<30 && cantidadAlumnos>0)
        {
            precioAlumno=4000;
            precioTotal=cantidadAlumnos*precioAlumno;
        }
        System.out.println("Se debe cobrar por alumno "+ precioAlumno + " \u20AC");
        System.out.println("Se debe pagar a la compañia "+ precioTotal + " \u20AC");
    }
}
