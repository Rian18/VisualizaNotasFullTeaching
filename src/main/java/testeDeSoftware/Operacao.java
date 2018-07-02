package testeDeSoftware;


import java.util.ArrayList;
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
 
   public int NumeroAprovados(int quantidade)
   {
       return quantidade; 
   }
   
   public int NumeroReprovados(int quantidade)
   {
       return quantidade; 
   }
}
