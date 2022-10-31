
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page isELIgnored="false" %>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
<div  class="container">
<c:choose>
   <c:when test="${!empty empsData.getContent()}">
       <h1 style="color:red;text-align:center"> Employees Report </h1>
       <!--  <table border="1" align="center" bgcolor="cyan"  class="table  table-hover"> -->\
        <table border="1" align="center" bgcolor="cyan"  class="table  table-stripped">
            <tr  class="font-weight-bold" style="color: red"><th>empno </th><th> emp name</th><th> Job </th> <th>salary </th><th> deptno</th><th> status </th> <th> operations</th>    </tr>
            <c:forEach var="emp" items="${empsData.getContent()}">
               <tr style="color: blue"  class="">
                <td>${emp.empno }</td>
                <td>${emp.ename }</td>
                 <td>${emp.job }</td>
                 <td>${emp.sal }</td>
                  <td>${emp.deptno }</td>
                  <td>${emp.status }</td>
                  <td><a href="emp_edit?no=${emp.empno}"><img src="images/edit.png" width="30px" height="30px"></a>    
                   <a href="emp_delete?no=${emp.empno}"  onclick="return confirm('Do u want to delete the employee')"><img src="images/delete.png" width="30px" height="30px"></a>    </td>
               
               </tr>
            
            </c:forEach>
        </table>
        <center>
       <c:if test="${!empsData.isFirst() }">
          <a href="emp_report?page=0">first</a>  &nbsp;  
        </c:if>
        
        <c:if test="${empsData.hasNext() }">
        
            <a href="emp_report?page=${empsData.getPageable().getPageNumber()+1}">next</a>  &nbsp;
          </c:if>  
            
            <c:forEach  var="i" begin="0" end="${empsData.getTotalPages()-1}" step="1">
                          [<a href="emp_report?page=${i}">${i+1}</a>      ]
            
            </c:forEach>
            
          <c:if test="${empsData.hasPrevious() }">
            <a href="emp_report?page=${empsData.getPageable().getPageNumber()-1}">previous</a>  &nbsp;
            </c:if>
            
            <c:if test="${!empsData.isLast() }">
                 <a href="emp_report?page=${empsData.getTotalPages()-1}">last</a>  &nbsp;  
              
        </c:if>
              
              </center>
            <h1>  Current Page Number is :: ${empsData.getPageable().getPageNumber()+1}/${empsData.getTotalPages() }</h1>
            
        
   </c:when>
   <c:otherwise>
              <h1 style="color:red;text-align:center"> Employees Not found </h1>
   </c:otherwise>
</c:choose>
                                 <h2 style="color:green;text-align:center">${resultMsg}</h2>

 <br>
 <center>
 
       <a href="emp_add"><img src="images/add.png" width="40px" height="50px"> Add Employee</a> &nbsp;&nbsp;&nbsp;
       <a href="./"><img src="images/home.png" width="40px" height="50px"> Home</a>
       
 </center>
</div>