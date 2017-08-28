/*
 * Proyecto que pida al usuario la hora acutal, en horas y minutos
 * mostrar si es de madrugada, si por la mañana, por la tarde
 */
package ejerciciohoradia;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class EjercicioHoraDia {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("introducce la hora");
        int horas = Integer.parseInt(br.readLine());
        System.out.println("introducce los minutos");
        int minutos = Integer.parseInt(br.readLine());

        /**
         * 0 a 7 madrugada 7 a 12 Mañana 12 a 21 Tarde 21 a 0 Noche
         */
        if (horas == 12 && minutos == 0) {
            System.out.println("mediodia");
        } else {
            if (horas == 0 && minutos == 0) {
                System.out.println("medianoche");
            } else {
                if (horas >= 0 && horas <= 7) {
                    System.out.println("madrugada");
                } else {
                    if (horas > 7 && horas <= 12) {
                        System.out.println("Mañana");
                    } else {
                        if (horas > 12 && horas <= 21) {
                            System.out.println("tarde");
                        } else {
                            if (horas > 21 && horas <= 23) {
                                System.out.println("noche");
                            }
                        }
                    }
                }
            }
        }

    }

}
