package AbFactory;

public class Tata implements Factory{
    public Car getCar(String s){
        if(s.equalsIgnoreCase("Safari")){
            return new Safari();
        }else if(s.equalsIgnoreCase("ponch")){
            return new Ponch();
        }
        return null;
    }
}
