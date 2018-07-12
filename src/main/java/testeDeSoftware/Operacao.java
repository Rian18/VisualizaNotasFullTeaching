package testeDeSoftware;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Rian Alves
 */
public class Operacao {
   
    public Double Media(List<AlunoNota> lstNotas)
    {
        Double soma = 0.0;
        for(int i=0;i< lstNotas.size();i++)
        {
            soma = soma +lstNotas.get(i).getNota();
        }
        return soma/lstNotas.size();
    
    }
    
    
    public AlunoNota Menor(List<AlunoNota> lstNotas)
    {
        AlunoNota menor;
        menor = lstNotas.get(0);
        for(int i=1;i< lstNotas.size();i++)
        {
          if(lstNotas.get(i).getNota().compareTo(lstNotas.get(i-1).getNota())<0)
           menor = lstNotas.get(i);
        }
        return menor;
    
    }
    public AlunoNota Maior(List<AlunoNota> lstNotas)
    {
        AlunoNota menor;
        menor = lstNotas.get(0);
        for(int i=1;i< lstNotas.size();i++)
        {
          if(lstNotas.get(i).getNota().compareTo(lstNotas.get(i-1).getNota())>0)
           menor = lstNotas.get(i);
        }
        return menor;
    
    }
    
   public List<AlunoNota> Aprovados(List<AlunoNota> lstNotas)
    {
        List<AlunoNota> lstAprovados =new ArrayList<>();
        for(int i=0;i< lstNotas.size();i++)
        {
          if(lstNotas.get(i).getNota()>60)
           lstAprovados.add(lstNotas.get(i));
        }
        NumeroAprovados(lstAprovados.size());
        return lstAprovados;
    
    }
    
    public List<AlunoNota> Reprovados(List<AlunoNota> lstNotas)
    {
        List<AlunoNota> lstReprovados = new ArrayList<>();
        for(int i=0;i< lstNotas.size();i++)
        {
          if(lstNotas.get(i).getNota()<60)
           lstReprovados.add(lstNotas.get(i));
        }
        NumeroReprovados(lstReprovados.size());
        return lstReprovados;
    
    }
 
    public double mediana(List<AlunoNota> lstNotas){
        
       List<Double> listNotas = new ArrayList<Double>();
        
        AlunoNota mediana = null;
        AlunoNota aux = null;
        List<AlunoNota> lstNotasOrdenada;
        int sizeList = lstNotas.size();
        double medianaNota;
        
        
        for(int i = 0; i<lstNotas.size(); i++){
        
            listNotas.add(lstNotas.get(i).getNota());
        }
        
        Collections.sort(listNotas);
        
        if(listNotas.size()%2==0){
            double medianaNota1 = listNotas.get(listNotas.size()/2);
            double medianaNota2 = listNotas.get(listNotas.size()/2 - 1);
            medianaNota = (medianaNota1 + medianaNota2)*0.5;
        }else{
          medianaNota = listNotas.get(listNotas.size()/2);
        }
                
          
        return medianaNota;
    }

   public double getDesvioPadrao(List<AlunoNota> lstNotas){
       
    double[] vet = new double [lstNotas.size()];
     for(int i = 0; i<lstNotas.size(); i++){
        
            vet[i] = lstNotas.get(i).getNota();
        }
        double soma = 0;
        
        for (int n = 0; n<lstNotas.size(); n++ )
            soma = soma + vet[n];
        double media = soma /11;
      
        double dife[] = new double[11];
        for (int n = 0; n<lstNotas.size(); n++ )
            dife[n] = vet[n]-media;
      
        double quad[] = new double[11];
        for (int n = 0; n<lstNotas.size(); n++ )
            quad[n] = Math.pow(dife[n], 2);
        double somaquad = 0;
        for (int n = 0; n<lstNotas.size(); n++ )
            somaquad = somaquad + quad[n];
        double desvio = Math.pow(somaquad/11, 0.5);
        
    return desvio;
}
    
    
    
   public int NumeroAprovados(int quantidade)
   {
       return quantidade; 
   }
   
   public int NumeroReprovados(int quantidade)
   {
       return quantidade; 
   }
}
