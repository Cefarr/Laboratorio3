/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author 2098325
 */
public class PowerScore implements GameScore{

    /**
     * EL puntaje aumenta  con el numero de la iesima letra tipo 5^x. Y se disminuye con cada palabra incorrecta
     * con 8 puntos.
     * @param correctCount Indica el puntaje que lleva el usuario, empieza en 0.
     * @param incorrecotCount Es la cuenta de no aciertos del cliente.
     * @return Es la suma entre correctCOunt e incorrectCOunt, siempre es mayor o igual a 0(no negativo)
     * o menor o igual a 500.
     */
    @Override
    public int calculeScore(int correctCount, int incorrecotCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
