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
public class Gordo extends Zombie {
    private static int marcador;
    public Gordo(int danyo, int movimiento)
    {
        super(danyo,movimiento);
        setMuere(2);
    }
    
    public Gordo()
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
    
    @Override
    public void CalcularGolpeo(SkillsPersonaje skills) 
    {
       System.out.println("Calculando golpeo");
       int calculo = calcula(skills);   
          //Por ser gordo
          calculo+=2;     
          if(calculo>getMaxGolpeo())
          {
              setmarcador(calculo);
          }    
          
    }
}
