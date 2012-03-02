package lp2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 30854172
 */
public class impostoDeRenda {
    
    private String nomeContribuinte;
    private long cpf;
    private double rendaLiquida;
    public static final double rendaIsenta = 10799;
    public static final double renda15PorCento = 21799;
    
 public impostoDeRenda(String nomeContribuinte,long cpf,double rendaLiquida){
     this.nomeContribuinte = nomeContribuinte;
     this.cpf = cpf;
     this.rendaLiquida = rendaLiquida;
 }
 
 public boolean isento(){
     if(rendaLiquida <= rendaIsenta)
        return true;
     return false;
 }
 public boolean quinzePorCentoRenda(){
     if(rendaLiquida < renda15PorCento)
         return true;
     return false;
 }
 public double calcularImposto(){
     double imposto = 0;
     if(isento())
         return imposto;
     if (quinzePorCentoRenda())
        return imposto = rendaLiquida*0.15;
     return imposto = rendaLiquida*0.25;
     
 }
 
}
