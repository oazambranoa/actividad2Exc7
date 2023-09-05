/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc7;

/**
 *
 * @author omarz
 */
/*
Enunciado:

Ejercicio resuelto Nº 12
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo.

*/

import java.util.Scanner;

public class Actividad2Exc7 {

    public static void main(String[] args) {
        
        double numWorkHours, priceHour, extraHours, extra8Hours, totalSalary;
        String name;
        
        System.out.println("Ingrese el nombre del trabajador: ");
        Scanner nombre = new Scanner(System.in);
        
        name = nombre.nextLine();
        
        System.out.println("Ingrese el total de horas trabajadas en la semana: ");
        Scanner horas = new Scanner(System.in);
        
        numWorkHours = horas.nextDouble();
        
        System.out.println("Ingrese el valor de hora de trabajo: ");
        Scanner valor = new Scanner(System.in);
        
        priceHour = valor.nextDouble();
        
        if (numWorkHours > 40){
            extraHours = numWorkHours - 40;
            if  (extraHours > 8){
                extra8Hours = extraHours - 8;
                totalSalary = 40 * priceHour + 16 * priceHour + extra8Hours * 3 * priceHour;
            } else{
                totalSalary = 40 * priceHour + extraHours * 2 * priceHour;
            }
        } else {
            totalSalary = numWorkHours * priceHour;
        }
        
        System.out.println("El trabajador " + name + " devengo $" + totalSalary);
    }
}
