/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_project_exercise1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author hanun
 */
public class Container{
    
    static final Swimmer s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    static final ArrayList<Swimmer> swimmerList;
    static int date, month;
    static Calendar  cal;
    static{
        s1 = new Swimmer("Abebe", 31, "male", 2.60,22,3);
        s2 = new Swimmer("Kebede", 29, "male", 1.88,6,1);
        s3 = new Swimmer("Derartu", 36, "female", 2.00,18,5);
        s4 = new Swimmer("Abel", 19, "male", 1.79,25,10);
        s5 = new Swimmer("Melat", 21, "female", 1.35,11,9);
        s6 = new Swimmer("fate", 35, "female", 2.67,23,5);
        s7 = new Swimmer("Ali", 27, "male", 1.88,13,6);
        s8 = new Swimmer("Haile", 31, "male", 1.90,8,6);
        s9 = new Swimmer("Beza", 22, "female", 1.92,5,6);
        s10 = new Swimmer("Samrawit", 26, "female", 2.60,26,6);
      
    }
    
    static{
        swimmerList = new ArrayList<>();
        swimmerList.add(s1);
        swimmerList.add(s2);
        swimmerList.add(s3);
        swimmerList.add(s4);
        swimmerList.add(s5);
        swimmerList.add(s6);
        swimmerList.add(s7);
        swimmerList.add(s8);
        swimmerList.add(s9);
        swimmerList.add(s10);
        
        s1.addTime(2.13);
        s4.addTime(1.65);
        
        cal = Calendar.getInstance();
        date = cal.get(Calendar.DAY_OF_MONTH);
        month = cal.get(Calendar.MONTH);
        for(int i = 0; i < swimmerList.size(); i++){
            if(date - swimmerList.get(i).getbDate() == 0 && month - swimmerList.get(i).getbMonth() == 0){
                swimmerList.get(i).setAge(swimmerList.get(i).getAge() + 1);
            } 
        }
    }
    public void printer(){
        for(int i = 0; i < swimmerList.size(); i++){
            System.out.println(swimmerList.get(i).getName());
        }
        Calendar  cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
    }
    public static ArrayList<Swimmer> getOriginalSwimmersList(){
        return swimmerList;
    }
    
   public static ArrayList<Swimmer> getCloneOfSwimmerList(){
       ArrayList<Swimmer> clonedSwimmersList = new ArrayList<>();
       for(int i = 0; i < swimmerList.size(); i++){
           clonedSwimmersList.add((Swimmer)swimmerList.get(i).clone());
           //System.out.println(clonedSwimmersList.get(i).getName());
       }
        return clonedSwimmersList;
   }
   
}
