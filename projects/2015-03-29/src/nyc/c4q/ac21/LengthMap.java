package nyc.c4q.ac21;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alvin2 on 3/29/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class LengthMap {


    public static HashMap<String, Integer> getLengths(ArrayList<String> strings) {
        HashMap<String, Integer> fruitLength = new HashMap<String, Integer>();

        for(int i=0; i < strings.size(); i++) {
            fruitLength.put(strings.get(i), strings.get(i).length());
        }


        return fruitLength;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("banana");
        words.add("pineapple");
        words.add("cantaloupe");

        System.out.println(getLengths(words).get("banana"));
    }
}
