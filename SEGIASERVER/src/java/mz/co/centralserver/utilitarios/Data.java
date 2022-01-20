package mz.co.centralserver.utilitarios;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Data
{
   private String mes, dia, ano, horaActual, hora, minuto, segundo;
   private int dia_semana;
   
   public Data()
   {
   
   }
   
   public void le_hora()
   {
     Date data = new Date();
     SimpleDateFormat horas = new SimpleDateFormat ("HH:mm:ss");
     
     mes = (data.getMonth()+1)+"";
     dia = data.getDate()+"";
     ano = (1900+ data.getYear())+"";
     dia_semana = data.getDay();
     hora = data.getHours()+"";
     minuto = data.getMinutes()+"";
     segundo = data.getSeconds()+"";
     
     horaActual = horas.format(data); 
   }
   
   public String getMes()
   {
     return mes;
   }
   
   public String getDia()
   {
     return dia;
   }
   
   public String getAno()
   {
     return ano;
   }
   
   public String getDiaSemana()
   {
      String diaSem = "";
      
      switch(dia_semana)
      {
          case 1: diaSem = "Segunda-Feira";break;
          case 2: diaSem = "Terça-Feira";break;
          case 3: diaSem = "Quarta-Feira";break;
          case 4: diaSem = "Quinta-Feira";break;
          case 5: diaSem = "Sexta-Feira";break;
          case 6: diaSem = "Sabádo";break;
          case 7: diaSem = "Domingo";break;
      }
      
      return diaSem;
   }
   
   public String getHora()
   {
     return hora;
   }
   
   public String getMesString()
   {
       String mesString = "";
       
       switch(Integer.parseInt(mes))
       {
           case 1: mesString = "Janeiro";break;
           case 2: mesString = "Fevereiro";break;
           case 3: mesString = "Marco";break;
           case 4: mesString = "Abril";break;
           case 5: mesString = "Maio";break;
           case 6: mesString = "Junho";break;
           case 7: mesString = "Julho";break;
           case 8: mesString = "Agosto";break;
           case 9: mesString = "Setembro";break;
           case 10: mesString = "Outubro";break;
           case 11: mesString = "Novembro";break;
           case 12: mesString = "Dezembro";break;
       }
       
       return mesString;
   }

    public String getHoraActual() {
        return horaActual;
    }

    public String getMinuto() {
        return minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public int getDia_semana() {
        return dia_semana;
    }
}