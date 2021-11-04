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
public class Superviviente {
    private int vidas;
    private int nivel;
    private String nombre;
    private SkillsPersonaje skills;
    private Arma arma;
   
    public Superviviente()
    {
        vidas=3;
        nivel=0;
        skills=SkillsPersonaje.RAPIDO;    
        arma=null;
    }
    
    public Superviviente(int vidas,int nivel,String nombre,SkillsPersonaje skills)
    {
        this.vidas = vidas;
        this.nivel = nivel;
        this.nombre = nombre;
        this.skills = skills;   
        //this.arma=arma;
        arma = null;
    }
    
    public boolean tieneArma()
    {
       return !(arma==null);
    }
    
    public void deleteArma()
    {
        arma=null;
    }
    
    public void setvidas(int vidas)
    {
        this.vidas = vidas;
    }
    
    public int getvidas()
    {
        return vidas;
    }
    
    public void setnivel(int nivel)
    {
        this.nivel = nivel;
    }
    
    public int getnivel()
    {
        return nivel;
    }
  
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getnombre()
    {
        return nombre;
    }
    
    public void setskills(SkillsPersonaje skills)
    {
        this.skills = skills;
    }
    
    public SkillsPersonaje getskills()
    {
        return skills;
    }
    
    public void setarma(Arma arma)
    {
        this.arma = arma;
    }
    
    public Arma getarma()
    {
        return arma;
    }
    
}
