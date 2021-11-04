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
public class Unknown extends Zombie {
    private static int marcador;
    int dandozarpazo;
    public Unknown(int danyo, int movimiento)
    {
        super(danyo,movimiento);
        setMuere(2);
        
    }
    
    public Unknown()
    {
        super(1,2);
        setMuere(2);
    } 
    
    public int getMaxGolpeo()
    {
        return marcador;
    }
    
    public void setmarcador(int marcador)
    {
        this.marcador = marcador;
    }
    
    public boolean zarpazo()
    {
        System.out.println("Dando zarpazo.");
      int aleatorio = 1 + (int)(Math.random() * ((10 - 1) + 1)); 
      if (aleatorio>7)
      { 
          return true;
      }
      else
      {
          return false;
      }
    }
    
    @Override
    public void CalcularGolpeo(SkillsPersonaje skills) 
    {
       System.out.println("Calculando golpeo");
       int calculo = calcula(skills);   
          //Por ser unknown
          calculo*=getDanyo();    
          if(calculo>getMaxGolpeo())
          {
              setmarcador(calculo);
          }         
    }
           
    
}
