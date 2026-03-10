package M1;

import java.util.*;

public class Duplicate {
    static void main(String[] args) {
        int arr[]=new int[]{11,11,22,33,33,44,44,55,5,5};
        Set<Integer> st=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])){
                ans.add(arr[i]);
            }
            st.add(arr[i]);
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
