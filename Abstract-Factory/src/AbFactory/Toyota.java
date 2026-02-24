package AbFactory;
public class Toyota implements Factory {
    public Car getCar(String s){
        if(s.equalsIgnoreCase("Camry")){
            return new Camry();
        }else if(s.equalsIgnoreCase("Inova")){
            return new Inova();
        }
        return null;
    }
}
