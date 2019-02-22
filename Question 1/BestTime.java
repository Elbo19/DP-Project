package final_project_exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class BestTime extends Container{
    
    static ArrayList<Swimmer> allSwimmers = new ArrayList<>();
    static ArrayList<Swimmer> swimmersAge18_25 = new ArrayList<>();
    static ArrayList<Swimmer> swimmersAge25_32 = new ArrayList<>();
    static ArrayList<Swimmer> swimmersAge32_39 = new ArrayList<>();
    
    ArrayList<Swimmer> bestSwimmerListAge18_25;
    ArrayList<Swimmer> bestSwimmerListAge25_32;
    ArrayList<Swimmer> bestSwimmerListAge32_39;
    
    double max18_25, max25_32, max32_39;
    int index18_25, index25_32, index32_39;
    static{
        allSwimmers = Container.getCloneOfSwimmerList();
    }
    static{
        for(int i =0; i < allSwimmers.size(); i++){
            if(allSwimmers.get(i).getAge() >= 32 && allSwimmers.get(i).getAge() < 39){
                swimmersAge32_39.add(allSwimmers.get(i));
            }
            else if(allSwimmers.get(i).getAge() >= 25 && allSwimmers.get(i).getAge() < 32){
                swimmersAge25_32.add(allSwimmers.get(i));
            }
            else if(allSwimmers.get(i).getAge() >= 18 && allSwimmers.get(i).getAge() < 25){
                swimmersAge18_25.add(allSwimmers.get(i));
            }
        }
    
    }
    public ArrayList<Swimmer> getListAge18_25(){
        return this.swimmersAge18_25;
    }
    public ArrayList<Swimmer> getListAge25_32(){
        return this.swimmersAge25_32;
    }
    public ArrayList<Swimmer> getListAge32_39(){
        return this.swimmersAge32_39;
    }
    public ArrayList<Swimmer> getBestAge18_25(){
        bestSwimmerListAge18_25 = new ArrayList<>();
        max18_25 = swimmersAge18_25.get(0).getMaxTime();    
        index18_25 = 0;
        for(int i = 1; i < swimmersAge18_25.size() - 1; i++){
            if(swimmersAge18_25.get(i).getMaxTime() < max18_25){
                max18_25 = swimmersAge18_25.get(i).getMaxTime();
                index18_25 = i;
            }
            else if(swimmersAge18_25.get(i).getMaxTime() == max18_25){
                bestSwimmerListAge18_25.add(swimmersAge18_25.get(i));
            }
        }       
        bestSwimmerListAge18_25.add(swimmersAge18_25.get(index18_25));
        return bestSwimmerListAge18_25;
    }
    public ArrayList<Swimmer> getBestAge25_32(){
        bestSwimmerListAge25_32 = new ArrayList<>();
        max25_32 = swimmersAge25_32.get(0).getMaxTime();
        index25_32 = 0;
        for(int i = 1; i < swimmersAge25_32.size() - 1; i++){
            if(swimmersAge25_32.get(i).getMaxTime() < max25_32){
                max25_32 = swimmersAge25_32.get(i).getMaxTime();
                index25_32 = i;
            }
            else if(swimmersAge25_32.get(i).getMaxTime() == max25_32){
                bestSwimmerListAge25_32.add(swimmersAge25_32.get(i));
            }
            
        }
        bestSwimmerListAge25_32.add(swimmersAge25_32.get(index25_32));
        return bestSwimmerListAge25_32;
    }
    public ArrayList<Swimmer> getBestAge32_39(){
        bestSwimmerListAge32_39 = new ArrayList<>();
        max32_39 = swimmersAge32_39.get(0).getMaxTime();
        index32_39 = 0;
        for(int i = 1; i < swimmersAge32_39.size() - 1; i++){
            if(swimmersAge32_39.get(i).getMaxTime() < max32_39){
                max32_39 = swimmersAge32_39.get(i).getMaxTime();
                index32_39 = i;
            }
            else if(swimmersAge32_39.get(i).getMaxTime() == max32_39){
                bestSwimmerListAge32_39.add(swimmersAge32_39.get(i));
            }
        }
        bestSwimmerListAge32_39.add(swimmersAge32_39.get(index32_39));
        return bestSwimmerListAge32_39;
    }
    
}
