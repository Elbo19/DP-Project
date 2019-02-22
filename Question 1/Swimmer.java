/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_project_exercise1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hanun
 */
public class Swimmer  implements Cloneable{
    private String name;
    private int age;
    private String sex;
    private double time;
    private int flag;
    private int bDate;
    private int bMonth;
    private ArrayList<Double> timeList = new ArrayList<>();

    public Swimmer(String name, int age, String sex, double time, int bDate,int bMonth) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.time = time;
        this.bDate = bDate;
        this.bMonth = bMonth;
        this.timeList.add(time);
    }
    
    public String getName(){
        return this.name;
    }
    public String getSex(){
        return this.sex;
    }
    public int getbDate(){
        return this.bDate;
    }
    public int getbMonth(){
        return this.bMonth;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public ArrayList<Double> getAllTime(){
        return this.timeList;
    }
    
    public double getMaxTime(){
        return Collections.min(timeList);
    }
    
    public void addTime(double newTime){
        this.timeList.add(newTime);
    }
    public void setFlag(int flag){
        this.flag = flag;
    }
    public int getFlag(){
        return this.flag;
    }
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
