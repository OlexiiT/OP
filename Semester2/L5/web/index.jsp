<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab5</title>
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
        <br>
        <form action="Calculator" method="GET">
            a: <input type="text" name="a" value="<%=(request.getSession().getAttribute("a"))%>">  
            b: <input type="text" name="b" value="<%=(request.getSession().getAttribute("b"))%>">  
            c: <input type="text" name="c" value="<%=(request.getSession().getAttribute("c"))%>">  
            d: <input type="text" name="d" value="<%=(request.getSession().getAttribute("d"))%>">  <br>
            Choose the task: 
            <input type="radio" name="taskNumber" value="task19"> 19
            <input type="radio" name="taskNumber" value="task20"> 20
            <input type="radio" name="taskNumber" value="task21"> 21
            <input type="submit" value="Execute">
        </form>
    </body>
</html>
