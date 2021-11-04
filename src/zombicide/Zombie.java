package zombicide;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturv
 */
public class Zombie {
    private int danyo;
    private int movimiento;
   /* private TipoZombie tipo;*/
    private Horda horda;

    public int getMuere() {
        return muere;
    }

    public void setMuere(int muere) {
        this.muere = muere;
    }
    private int muere;
    
  /*  public Zombie(int danyo, int movimiento, TipoZombie tipo)
    {
        horda = new Horda();
        this.danyo=danyo;
        this.movimiento= movimiento;
        this.tipo = tipo;
    }
    
    public Zombie(TipoZombie tipo)
    {
       horda = new Horda();
       this.tipo = tipo;
       if(tipo == TipoZombie.CAMINANTE)
       {
           danyo=1;
           movimiento=1;
           muere=1;
       }
       else if(tipo==TipoZombie.GORDO)
       {
           danyo=1;
           movimiento=2;
           muere = 2;
       }
       else if(tipo==TipoZombie.UNKNOWN)
       {
           danyo=3;
           movimiento=2;
           muere=2;
       }
    }
*/
    
    public Zombie(int danyo, int movimiento)
    {
        horda = new Horda();
        horda.camina();
        this.danyo=danyo;
        this.movimiento= movimiento;
    }
    
    public Zombie()
    {
       horda = new Horda();
    }
    
    
    public int getDanyo() {
        return danyo;
    }

    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    /*public TipoZombie getTipo() {
        return tipo;
    }

    public void setTipo(TipoZombie tipo) {
        this.tipo = tipo;
    }*/

    public Horda getHorda() {
        return horda;
    }

    public void setHorda(Horda horda) {
        this.horda = horda;
    }
    
    //Recibe un número aleatorio del 1 al 10
    public void CalcularGolpeo(SkillsPersonaje skills)
    {
        System.out.println("Este no se ejecuta");
    }
    
    public int calcula(SkillsPersonaje skills)
    {
          int bonimonstruo =0;
         int aleatorio = 1 + (int)(Math.random() * ((10 - 1) + 1));

         if(skills == SkillsPersonaje.RAPIDO)
         {
             bonimonstruo=5;
         }
         else if(skills==SkillsPersonaje.AMBIDIESTRO)
         {
             bonimonstruo = 8;
         }
         else if(skills==SkillsPersonaje.BUSCADOR)
         {
             bonimonstruo = 3;
         }
         else if(skills==SkillsPersonaje.ESCURRIDIZO)
         {
             bonimonstruo = 9;
         }
         else if(skills==SkillsPersonaje.FORTACHON)
         {
             bonimonstruo = 7;
         }
         
          int calculo = 10 * bonimonstruo + aleatorio;
          return calculo;
    }
    
    public boolean zarpazo()
    {
        System.out.println("Este no se ejecuta");
        return false;
    }
}
