import java.util.Scanner;
public class burc {
    public static void main(String[] args) throws Exception {
        int day,month;
        String burc = "";

        Scanner inp = new Scanner (System.in);

        System.out.print("Kaçıncı Ayda Doğdunuz : ");
        month = inp.nextInt();

        System.out.print("Kaçıncı Günde doğdunuz : ");
        day = inp.nextInt();

        if (month == 1 && (day >= 1 && day <=31)){
            if(day < 22){
                burc = "Oğlak";
            }else{
                burc = "Kova";
            }
        }
        else if(month == 2 && (day >= 1 && day <= 28)){
            if(day < 20){
                burc ="Kova";
            }else{
                burc ="Balık";
            }
        }
        else if(month == 3 && (day >= 1 && day <= 31)){
            if(day < 21){
                burc = "Balık";
            }
            else{
                burc = "Kova";
            }
        }
        else if(month == 4 && (day >= 1 && day <=30)){
            if(day < 21){
                burc = "Kova";
            }
            else {
                burc = "Boğa";
            }
        }
        else if(month == 5 && (day >= 1 && day <=31)){
            if(day < 22){
                burc = "Boğa";
            }
            else {
                burc = "İkizler";
            }
        }
        else if(month == 6 && (day >= 1 && day <=30)){
            if(day < 23){
                burc = "İkizler";
            }
            else {
                burc = "Yengeç";
            }
        }
        else if(month == 7 && (day >= 1 && day <=31)){
            if(day < 23){
                burc = "Yengeç";
            }
            else {
                burc = "Aslan";
            }
        }
        else if(month == 8 && (day >= 1 && day <=31)){
            if(day < 23){
                burc = "Aslan";
            }
            else {
                burc = "Başak";
            }
        }
        else if(month == 9 && (day >= 1 && day <=30)){
            if(day < 23){
                burc = "Başak";
            }
            else {
                burc = "Terazi";
            }
        }
        else if(month == 10 && (day >= 1 && day <=31)){
            if(day < 23){
                burc = "Terazi";
            }
            else {
                burc = "AKREP";
            }
        }
        else if(month == 11 && (day >= 1 && day <=30)){
            if(day < 22){
                burc = "AKREP";
            }
            else {
                burc = "Yay";
            }
        }
        else if(month == 12 && (day >= 1 && day <=31)){
            if(day < 22){
                burc = "Yay";
            }
            else {
                burc = "Oğlak";
            }
        } 
        else {
            System.out.println("Hatalı ay veya gün girdiniz.");
        } 
        System.out.print("Burcunuz : " + burc);
        }
}