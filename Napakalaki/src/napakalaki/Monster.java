/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author durenot
 */
public class Monster {
    private String name;
    private int combatLevel;
    private BadConsequence bc;
    private Prize price;
    
    Monster(String name, int level, BadConsequence bc, Prize price){
        this.name=name;
        this.combatLevel=level;
        this.bc=bc;
        this.price=price;
    }
   
    public int getCombatLevel(){
        return this.combatLevel;
    }
    public String getName(){
        return this.name;
    }
    public BadConsequence getBc(){
        return this.bc;
    }
    public Prize getPrize(){
        return this.price;
    }
}
