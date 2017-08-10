/**
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 10. November 2016
 * Purpose: Loesung Praktikumseinheit 03: Roman
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

/**
 * Template fuer Klasse Roman.
 *
 * @author Hammerschall
 */
public class Roman {

    /**
     * Liste aller roemischen Zahlen
     */
    private final String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    /**
     * Arabische Werte zu roemischen Zahlen
     */
    private final int[] arabic = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    /**
     * Berechnet die roemische Darstellung zu einer arabischen Zahl.
     * @param value arabische Zahl.
     * @return roemische Darstellung als String.
     */
    public String getRoman(final int value) {

        // Variable fuer roemische Darstellung
        String result = "";

        // --------------------------------------

        // Ergaenzen Sie hier Ihren Code
        int newValue = value;

        /**
         * Aeussere for-Schleife laeuft durch das arabic-Array in fallender
         * Groesse. Ist das aktuelle Element aus dem arabic-Array in der eingegebenen
         * Zahl enthalten, wird mittels einer int-Division ein Zaehler gesetzt.
         * Dieser Zaehler dient dazu in der zweiten for-Schleife die
         * entsprechenden roemischen Ziffern zum String "result" hinzuzufuegen.
         * Nachdem das ganze arabic-Array durchlaufen ist, wird die aeussere for-Schleife
         * beendet und der String "result" zurueckgegeben.
         */
        for (int i = roman.length - 1; i >= 0; i--) {

            int counter = newValue / arabic[i];
            newValue = newValue % arabic[i];

            for (int j = 0; j < counter; j++) {

                result += roman[i];

            }
        }

        // ---------------------------------------

        return result;

    }

    /**
     * Start des Programms Roman.
     * @param args int-Wert zur Umwandlung in roemische Zahl
     */
    public static void main(String[] args) {

        // Wert fuer positiven Integer einlesen
        int value = Integer.parseInt(args[0]);

        // Pruefung ob Eingabewert <= 0. In diesem Fall
        // Abbruch des Programms mit Fehlermeldung.

        // --------------------------------------

        /**
         * Zuerst wird geprueft, ob der Eingabewert kleiner oder gleich 0 ist.
         * Ist dem so, wird das Programm nicht weiter ausgefuehrt. Nur wenn keine
         * 0 eingegeben wurde wird im else-Teil des if-else die Methode getRoman()
         * mit dem eingegebenen Wert aufgerufen.
         */
        if (value <= 0) {

            System.out.println("Invalid Input");		// Ausgabe der Fehlermeldung

        }
        else {

            // Aufruf der Methode zur Berechnung der roemischen Zahl.
            String result = new Roman().getRoman(value);
            System.out.println(result);

        }

        // ---------------------------------------

    }

}
