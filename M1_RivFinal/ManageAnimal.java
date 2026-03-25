package M1_RivFinal;

import java.util.*;

class Animal{
    int id;
    String species="";
    String name="";
    int age;
    Animal(int id,String species,String name,int age){
        this.id=id;
        this.species=species;
        this.name=name;
        this.age=age;
    }
    Animal(){

    }
}
class Zoo{
    List<Animal> arr=new ArrayList<>();
    void Addanimal(Animal a){
        arr.add(a);
    }
    void RemoveAnimal(int id){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).id==id){
                arr.remove(arr.get(i));
            }
        }
    }
    void PrintAnimal(){
        Collections.sort(arr,(a,b)->{
            return b.age-a.age;
        });
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).id+" "+arr.get(i).age+" "+arr.get(i).name+" "+arr.get(i).species);
        }
    }
    void FilterSpecies(String s){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).species.equals(s))
            System.out.println(arr.get(i).id+" "+arr.get(i).age+" "+arr.get(i).name+" "+arr.get(i).species);
        }
    }

}

public class ManageAnimal {
    static void main(String[] args) {

    }
}
