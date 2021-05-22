<%@page import="java.util.ArrayList, java.util.HashMap, lab6.Task19, lab6.Task20, lab6.Task21, lab6.DataProcessor" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Lab 6</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td>Task 19</td><td><img src="19.jpg"></td>
            </tr>
            <tr>
                <td>Task 20</td><td><img src="20.jpg"></td>
            </tr>
            <tr>
                <td>Task 21</td><td><img src="21.jpg"></td>
            </tr>
        </table>
        <%!
            boolean f = false;
            HashMap<String, Double> par = new HashMap();

            ArrayList<Double> a = new ArrayList();
            ArrayList<Double> b = new ArrayList();
            ArrayList<Double> c = new ArrayList();
            ArrayList<Double> d = new ArrayList();
            ArrayList<Double> results = new ArrayList();
        %>

        <%
            if (f) {
                try {

                    par.put("fromA", Double.parseDouble(request.getParameter("fromA")));
                    par.put("toA", Double.parseDouble(request.getParameter("toA")));
                    par.put("stepA", Double.parseDouble(request.getParameter("stepA")));

                    par.put("fromB", Double.parseDouble(request.getParameter("fromB")));
                    par.put("toB", Double.parseDouble(request.getParameter("toB")));
                    par.put("stepB", Double.parseDouble(request.getParameter("stepB")));

                    par.put("fromC", Double.parseDouble(request.getParameter("fromC")));
                    par.put("toC", Double.parseDouble(request.getParameter("toC")));
                    par.put("stepC", Double.parseDouble(request.getParameter("stepC")));

                    par.put("fromD", Double.parseDouble(request.getParameter("fromD")));
                    par.put("toD", Double.parseDouble(request.getParameter("toD")));
                    par.put("stepD", Double.parseDouble(request.getParameter("stepD")));
                    
                    a.clear();
                    b.clear();
                    c.clear();
                    d.clear();
                    results.clear();

                    String task = request.getParameter("task");
                    if ("task19".equals(task)) {
                        DataProcessor.count(new Task19(), par, a, b, c, d, results);
                    } else if ("task20".equals(task)) {
                        DataProcessor.count(new Task20(), par, a, b, c, d, results);
                    } else {
                        DataProcessor.count(new Task21(), par, a, b, c, d, results);
                    }

                } catch (NumberFormatException ex) {
                    out.write("Sorry, parameters are incorrect! NFE");
                } catch (NullPointerException ex) {
                    out.write("Sorry, parameters are incorrect! NPE");
                }
            } else {

                f = true;

                par.put("fromA", 4.0);
                par.put("toA", 5.0);
                par.put("stepA", 1.0);

                par.put("fromB", 4.0);
                par.put("toB", 5.0);
                par.put("stepB", 1.0);

                par.put("fromC", 4.0);
                par.put("toC", 5.0);
                par.put("stepC", 1.0);

                par.put("fromD", 4.0);
                par.put("toD", 5.0);
                par.put("stepD", 1.0);

                a.add(0.0);
                b.add(0.0);
                c.add(0.0);
                d.add(0.0);
                results.add(0.0);

            }

        %>
        <form action="index.jsp" method="GET">
            <p>a: from: <input type="text" name="fromA" value="<%=par.get("fromA")%>">
                to: <input type="text" name="toA" value="<%=par.get("toA")%>">
                step: <input type="text" name="stepA" value="<%=par.get("stepA")%>"></p>
            <p>b: from: <input type="text" name="fromB" value="<%=par.get("fromB")%>"> 
                to: <input type="text" name="toB" value="<%=par.get("toB")%>"> 
                step: <input type="text" name="stepB" value="<%=par.get("stepB")%>"></p>
            <p>c: from: <input type="text" name="fromC" value="<%=par.get("fromC")%>"> 
                to: <input type="text" name="toC" value="<%=par.get("toC")%>"> 
                step: <input type="text" name="stepC" value="<%=par.get("stepC")%>"></p>
            <p>d: from: <input type="text" name="fromD" value="<%=par.get("fromD")%>"> 
                to: <input type="text" name="toD" value="<%=par.get("toD")%>"> 
                step: <input type="text" name="stepD" value="<%=par.get("stepD")%>"></p>
            <p>Choose task:
                <input type="radio" name="task" value="task19" checked="checked">19
                <input type="radio" name="task" value="task20">20
                <input type="radio" name="task" value="task21">21</p>
            <p><input type="submit" value=" Calculate "></p>
        </form>


        <table border="1">
            <tr><th>Par A</th><th>Par B</th><th>Par C</th><th>Par D</th><th>Result</th></tr>
                    <%
                        for (int i = 0; i < a.size(); i++) {%>
            <tr><td><%= a.get(i)%></td><td><%= b.get(i)%></td><td><%= c.get(i)%></td><td><%= d.get(i)%></td><td><%= results.get(i)%></td></tr>
            <%}%>
        </table>
    </body>
</html>
