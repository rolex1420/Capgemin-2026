package AbFactory;
public  class AbsFactory {
    static public Factory getFactory(String s){
        if(s.equalsIgnoreCase("tata")){
            return new Tata();
        }else if(s.equalsIgnoreCase("Toyota")){
            return new Toyota();
        }
        return null;
    }
}
