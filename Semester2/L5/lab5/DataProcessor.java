/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author LioshaT
 */
public class DataProcessor {
    
    static HashMap count(HttpServletRequest request) throws NumberFormatException, TaskNotFoundException{
        HashMap ans = new HashMap();
        double a = Double.parseDouble(request.getParameter("a"));
        ans.put("a", a);
        double b = Double.parseDouble(request.getParameter("b"));
        ans.put("b", b);
        double c = Double.parseDouble(request.getParameter("c"));
        ans.put("c", c);
        double d = Double.parseDouble(request.getParameter("d"));
        ans.put("d", d);
        request.getSession().setAttribute("a", a);
        request.getSession().setAttribute("b", b);
        request.getSession().setAttribute("c", c);
        request.getSession().setAttribute("d", d);
        int taskNumber;
        double res;
        String s = request.getParameter("taskNumber");
        if ("task19".equals(s)) {
            taskNumber = 19;
            res = Task19.getResult(a, b, c, d);
        } else if ("task20".equals(s)) {
            taskNumber = 20;
            res = Task20.getResult(a, b, c, d);
        } else if ("task21".equals(s)) {
            taskNumber = 21;
            res = Task21.getResult(a, b, c, d);
        } else {
            throw new TaskNotFoundException("Task is not definied!");
        }
        ans.put("task", taskNumber);
        ans.put("answer", res);
        return ans;
    }
    
}
