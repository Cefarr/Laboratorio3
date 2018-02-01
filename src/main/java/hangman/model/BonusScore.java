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
public class BonusScore  implements GameScore{

    
    /**
     * El juego bonifica con 10 puntos x cada palabra correcta y disminuye 5 con cada incorrecta.
     * @param correctCount Es el puntaje que lleva correcto el jugador, siempre empieza desde 0.
     * @param incorrecotCount Con cada error, se disminuye el puntaje total obtenido del usuario
     * @return Regresa el resultado entre correctCount e incorrecotCount, siendo mayor o igual 0, nunca negativo
     */
    @Override
    public int calculeScore(int correctCount, int incorrecotCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
