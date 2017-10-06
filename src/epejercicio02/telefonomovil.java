/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epejercicio02;

import java.util.Scanner;

/**
 *
 * @author alond
 */
class telefonomovil {
       private String pantalla = "";
        private String camara = "";
        private String procesador = "";

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public void celular()
    {
        Scanner input = new Scanner(System.in);
            System.out.println("Elija una de las opciones");
            System.out.println("A.Telefonos moviles");
            System.out.println("[1] Samsung S7");
            System.out.println("[2] iPhone 6");
            System.out.println("[3] Huawei P8");
            System.out.println("Seleccione un modelo: ");
             char opcion = input.next().charAt(0);
            
                 switch (opcion) {
                    case '1':
                        System.out.println("A.Caracteristicas");
                        System.out.println("Pantalla: 8.4");
                        System.out.println("Camara: 8MP ");
                        System.out.println("Procesador: 1.40Ghz");
                        break;
                    case '2':
                        System.out.println("Pantalla: 7.4");
                        System.out.println("Camara: 7MP ");
                        System.out.println("Procesador: 1.40Ghz");
                        break;
                    case '3':
                        System.out.println("Pantalla: 8.4");
                        System.out.println("Camara: 8MP ");
                        System.out.println("Procesador: 1.40Ghz");
                        break;
                 
                       default:
                        System.out.println("Solo números entre 1 y 3");
               }
           }
}

    
                
