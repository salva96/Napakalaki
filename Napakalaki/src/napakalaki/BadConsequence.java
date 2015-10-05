/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author durenot
 */
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text=text;
        this.levels=levels;
        this.nVisibleTreasures=nVisible;
        this.nHiddenTreasures=nHidden;
    }
    
    BadConsequence(String text, boolean death){
        this.text=text;
        this.death=death;
    }
    
    BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text=text;
        this.levels=levels;
        this.specificHiddenTreasures=tHidden;
        this.specificVisibleTreasures=tVisible;
    }
    String getText(){
        return this.text;
    }
    int getLevels(){
        return this.levels;
    }
    int getnHiddenTreasures(){
        return this.nHiddenTreasures;
    }
    int getnVisibleTreasures(){
        return this.nVisibleTreasures;
    }
    boolean getDeath(){
        return this.death;
    }
}

