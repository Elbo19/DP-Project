package final_project_exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort extends Container {
    
    static ArrayList<Swimmer> allSwimmers = new ArrayList<>(); 
    ArrayList<Integer> ages;
    ArrayList<Swimmer> sortedByAgeList;
    
    ArrayList<Swimmer> femaleSwimmers;
    ArrayList<Swimmer> maleSwimmers;
    
    ArrayList<Double> times;
    ArrayList<Swimmer> sortedByTimeList;
    
    static{
        allSwimmers = Container.getCloneOfSwimmerList();
    }
    public ArrayList<Swimmer> sortByAge(){
        int flag = 0;
        ages = new ArrayList<>();
        sortedByAgeList = new ArrayList<>();
        for(int i = 0; i < allSwimmers.size(); i++){
            allSwimmers.get(i).setFlag(0);
            ages.add(allSwimmers.get(i).getAge());
        }
        Collections.sort(ages);
        for(int i = 0; i < ages.size(); i++){
            for(int j = 0; j < allSwimmers.size(); j++){
                if(ages.get(i) == allSwimmers.get(j).getAge() && allSwimmers.get(j).getFlag() == 0){
                    allSwimmers.get(j).setFlag(1);
                    sortedByAgeList.add(allSwimmers.get(j));
                    break;
                }
            }
            
        }
        return sortedByAgeList;
    }
    
    
    /*******************************************************************************/
    public void sortBysex(){ 
        femaleSwimmers = new ArrayList<>();
        maleSwimmers = new ArrayList<>();
        for(int i = 0; i < allSwimmers.size(); i++){
            if(allSwimmers.get(i).getSex() == "female"){
                this.femaleSwimmers.add(allSwimmers.get(i));  
            }
            else if(allSwimmers.get(i).getSex() == "male"){
                this.maleSwimmers.add(allSwimmers.get(i));
            }
        }
    }
    public ArrayList<Swimmer> getFemaleSwimmers(){
        return this.femaleSwimmers;
    }
    
    public ArrayList<Swimmer> getMaleSwimmers(){
        return this.maleSwimmers;
    }
    
    
    /******************************************************************************/
    public ArrayList<Swimmer> sortByTime(){
        times = new ArrayList<>();
        sortedByTimeList = new ArrayList<>();
        for(int i = 0; i < allSwimmers.size(); i++){
            allSwimmers.get(i).setFlag(0);
            times.add(allSwimmers.get(i).getMaxTime());
        }
        Collections.sort(times);
        for(int i = 0; i < times.size(); i++){
            for(int j = 0; j < allSwimmers.size(); j++){
                if(times.get(i) == allSwimmers.get(j).getMaxTime() && allSwimmers.get(j).getFlag() == 0){
                    allSwimmers.get(j).setFlag(1);
                    sortedByTimeList.add(allSwimmers.get(j));
                    break;
                }
            }
            
        }
        return sortedByTimeList;

    }
}
