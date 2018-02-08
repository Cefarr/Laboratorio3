/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hangman.test;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.quicktheories.core.Gen;
import static org.quicktheories.QuickTheory.qt;
import org.quicktheories.api.AsString;
import static org.quicktheories.generators.Generate.*;
import static org.quicktheories.generators.SourceDSL.*;
/**
 *
 * @author cesar
 */
public class GameScoreTest {
 
    
    /**
     * Clases de equivalencia
     * #1: El puntaje aumenta 10 puntos con cada palabra corecta y disminuyee 5 con cada error. 
     * #2: Inicia con un puntaje determinado(100) y disminuye 1' con cada error.
     * #3: Con cada palabra correcta se agrega 5 ^ x, siendo x la idecimaletra,
     * y por cada error se resta 8.
     * 
     * Condicion de Frontera:
     *#1 : Cuando hay una palabra correcta puede tomar dos caminos,
     * el del bonus Score o el de Power Score.
     * 
     * Correcta un 0, incorrecta un 1.
     * 
     */
    
    private final int puntaje;
    private final int palabrasC;
    private final int palabrasNc;
    private final int pal;
    
    private  AsString<Integer> et;
    @Test
    public void testClaseEquivalenciaUnoPos() {
        BonusScore bs= new BonusScore();

                qt().forAll(range(0,1).describedAs(null)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)>0);
//        qt().forAll(range(0,2).describedAs( null)).check((pal,puntaje)-> bs.calculeScore(palabrasC, palabrasC)==(puntaje));
                
                //check(pal, puntaje)-> bs.calculeScore(palabrasC, palabrasNc)>=0;           
    }
    
    @Test
    public void testClaseEquivalenciaUnoNeg() {
        BonusScore bs= new BonusScore();
        
       //qt().forAll(range(0,2)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)>=0);
        qt().forAll(range(0,2).describedAs(null)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)>=0);
        
                
                //check(pal, puntaje)-> bs.calculeScore(palabrasC, palabrasNc)>=0;           
    }
    @Test
    public void testClaseEquivalenciaDos() {
        OriginalScore bs= new OriginalScore();
        
       //qt().forAll(range(0,2)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)>=0);
        qt().forAll(range(0,2).describedAs(null)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)<=100);
        
                
                //check(pal, puntaje)-> bs.calculeScore(palabrasC, palabrasNc)>=0;           
    }    
    
    @Test
    public void testClaseEquivalenciaTresPos() {
        PowerScore bs= new PowerScore();

                qt().forAll(range(0,1).describedAs(null)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)>0);
//        qt().forAll(range(0,2).describedAs( null)).check((pal,puntaje)-> bs.calculeScore(palabrasC, palabrasC)==(puntaje));
                
                //check(pal, puntaje)-> bs.calculeScore(palabrasC, palabrasNc)>=0;           
    }
    
    @Test
    public void testClaseEquivalenciaTresNeg() {
        PowerScore bs= new PowerScore();
        
       //qt().forAll(range(0,2)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)>=0);
        qt().forAll(range(0,2).describedAs(null)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)<=500);
        
                
                //check(pal, puntaje)-> bs.calculeScore(palabrasC, palabrasNc)>=0;           
    }
    
    
    @Test
    public void testFrontera() {
        PowerScore bs= new PowerScore();
        BonusScore bs1= new BonusScore();        
       //qt().forAll(range(0,2)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)>=0);
        qt().forAll(range(0,2).describedAs(null)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)<=500);
        
        qt().forAll(range(0,1).describedAs(null)).check((puntaje) -> bs.calculeScore(puntaje, palabrasC)<=500);                
                //check(pal, puntaje)-> bs.calculeScore(palabrasC, palabrasNc)>=0;           
    }    
    
    
}
