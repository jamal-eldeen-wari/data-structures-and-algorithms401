package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JoinLeft {

    public List<String> joinLeft(HashMap hashMap1, HashMap hashMap2){
        List<String> table = new ArrayList<>();

        for(Object str: hashMap1.keySet()){
            if (hashMap1.containsKey(str)){
                table.add(str+": "+hashMap1.get(str)+" "+ hashMap2.get(str));
            }else{
                table.add(str+": "+hashMap1.get(str)+" "+ null);
            }
        }
        return table;

    }
}
