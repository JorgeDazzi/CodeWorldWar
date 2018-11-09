package de.dazzi.tasks.Honey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySorting {



    public static int countOnes(String b){
        int sum = 0;

        for(int i = 0; i < b.length(); i++)
            if(b.charAt(i) == '1') sum++;

        return sum;
    }


    public static int[] getAscBinSorting(int[] seq){

        HashMap<String, List<Integer> > db = new HashMap<>();
        String nTemp;

        for(int n : seq){

            nTemp = countOnes( Integer.toBinaryString(n) ) + "";

             if( db.containsKey(nTemp) )
                 db.get(nTemp).add(n);

             else{
                 db.put(nTemp, new ArrayList<>());
                 db.get(nTemp).add(n);
             }

        }

        List<Integer> result = new ArrayList<>();

        db.forEach( (key, arr) -> {
            Collections.sort(arr);
            result.addAll(arr);
        });

        return result
                .stream()
                    .distinct()
                    .collect(Collectors.toList())
                .stream()
                    .mapToInt(i -> i)
                    .toArray();
    }

}
