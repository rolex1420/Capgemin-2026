package M1_RivFinal;

import java.util.*;

interface Bank{
    List<Integer> pcount=new ArrayList<>();
    List<Integer> bcount=new ArrayList<>();
    int minimum_loan();
    int maximum_loan();
    int average_loan();
}
class PersonalLoanDept implements Bank{
    private List<Integer> pcount=new ArrayList<>();

    void GetLone(int v){
        pcount.add(v);
    }
    PersonalLoanDept(int v){
        pcount.add(v);
        System.out.println("Your PersonalLoanDept");
    }
    public int average_loan(){
        int sum=0;
        for(int i=0;i<pcount.size();i++){
            sum+=pcount.get(i);
        }
        return sum/pcount.size();
    }
    public int maximum_loan(){
        int sum=Integer.MIN_VALUE;
        for (Integer v : pcount) {
            if (v > sum) {
                sum = v;
            }
        }
        return sum;
    }
    public int minimum_loan(){
        int sum=Integer.MAX_VALUE;
        for (Integer integer : pcount) {
            if (integer < sum) {
                sum = integer;
            }
        }
        return sum;
    }
}
class BuisnessLoanDept implements Bank{
    private List<Integer> bcount=new ArrayList<>();

    BuisnessLoanDept(int v){
        bcount.add(v);
        System.out.println("Your BuisnessLoanDept");
    }
    void GetLone(int v){
        pcount.add(v);
    }
    public int average_loan(){
        int sum=0;
        for(int i=0;i<bcount.size();i++){
            sum+=bcount.get(i);
        }
        return sum/bcount.size();
    }
    public int maximum_loan(){
        int sum=Integer.MIN_VALUE;
        for (Integer integer : bcount) {
            if (integer > sum) {
                sum = integer;
            }
        }
        return sum;
    }
    public int minimum_loan(){
        int sum=Integer.MAX_VALUE;
        for (Integer integer : bcount) {
            if (integer < sum) {
                sum = integer;
            }
        }
        return sum;
    }
}

public class BankImplement {
    static void main(String[] args) {
        PersonalLoanDept p=new PersonalLoanDept(50000);
        p.GetLone(70000);
        p.GetLone(30000);

        PersonalLoanDept p1=new PersonalLoanDept(10000);

        System.out.println("Average Loan: "+p.average_loan());
        System.out.println("Maximum Loan: "+p.maximum_loan());
        System.out.println("Minimum Loan: "+p.minimum_loan());
    }
}
