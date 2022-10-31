<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page isELIgnored="false" %>

<c:choose>
   <c:when test="${!empty empsList}">
       <h1 style="color:red;text-align:center"> Employees Report </h1>
        <table border="1" align="center" bgcolor="cyan">
            <tr style="color: red"><th>empno </th><th> emp name</th><th> Job </th> <th>salary </th><th> deptno</th> <th> operations</th>    </tr>
            <c:forEach var="emp" items="${empsList}">
               <tr style="color: blue">
                <td>${emp.empno }</td>
                <td>${emp.ename }</td>
                 <td>${emp.job }</td>
                 <td>${emp.sal }</td>
                  <td>${emp.deptno }</td>
                  <td><a href="emp_edit?no=${emp.empno}"><img src="images/edit.png" width="30px" height="30px"></a>    
                   <a href="emp_delete?no=${emp.empno}"  onclick="return confirm('Do u want to delete the employee')"><img src="images/delete.png" width="30px" height="30px"></a>    </td>
               
               </tr>
            
            </c:forEach>
        </table>
   </c:when>
   <c:otherwise>
              <h1 style="color:red;text-align:center"> Employees Not found </h1>
   </c:otherwise>
</c:choose>
                                 <h2 style="color:green;text-align:center">${resultMsg}</h2>

 <center>
       <a href="emp_add"><img src="images/add.png" width="40px" height="50px"> Add Employee</a> &nbsp;&nbsp;&nbsp;
       <a href="./"><img src="images/home.png" width="40px" height="50px"> Home</a>
       
 </center>
