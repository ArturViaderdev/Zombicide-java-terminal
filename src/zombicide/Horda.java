/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombicide;

/**
 *
 * @author arturv
 */
public class Horda {
    
    private int respawn = 2;
    
    public void camina()
    {
        respawn--;
    }
    
    public void resetRespawn()
    {
        respawn = 2;
    }

    public int getRespawn() {
        return respawn;
    }

    public void setRespawn(int respawn) {
        this.respawn = respawn;
    }
}
