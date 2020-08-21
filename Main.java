package com.company;

import java.util.*;

public class Main {

       public static void main(String[] args)
    {
        Map<String, Integer> uniqueString = new LinkedHashMap<String, Integer>();

        String Names = "alok, amit, suresh , amit, vidya, sindhu, vidya, vidya, alok";

        for (String string : Names.split(", ")) {
            if(uniqueString.get(string) == null)
                uniqueString.put(string, 1);
            else
                uniqueString.put(string, uniqueString.get(string) + 1);
        }
        String StringUnique = join(uniqueString.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(uniqueString.values());

        System.out.println("Output = " + StringUnique + " --> "+ value);


    }

    public static String join(Collection<String> s, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }
}
