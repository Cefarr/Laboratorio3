/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

import hangman.model.GameScore;

/**
 *
 * @author 2098325
 */
public class OriginalScore implements GameScore{

    /**
     * 
     * @param correctCount El puntuja correcto que lleva el usuario.
     * @param incorrecotCount El puntuja incorrecto que lleva el usuario.
     * @return Regresa una resta entre el correctt count y el incorrectCount, siendo la respuesta siempre mayor  o igual a 0.
     */
    @Override
    public int calculeScore(int correctCount, int incorrecotCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
