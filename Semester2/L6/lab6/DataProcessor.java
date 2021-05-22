package lab6;

import java.util.ArrayList;
import java.util.HashMap;

public class DataProcessor {

    public static void count(Task task, HashMap<String, Double> par, ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, ArrayList<Double> d, ArrayList<Double> results) {

        for (double i = par.get("fromA"); i <= par.get("toA"); i += par.get("stepA")) {
            for (double j = par.get("fromB"); j <= par.get("toB"); j += par.get("stepB")) {
                for (double k = par.get("fromC"); k <= par.get("toC"); k += par.get("stepC")) {
                    for (double l = par.get("fromD"); l <= par.get("toD"); l += par.get("stepD")) {
                        a.add(i);
                        b.add(j);
                        c.add(k);
                        d.add(l);
                        results.add(task.getResult(i, j, k, l));
                    }
                }
            }
        }

    }

}
