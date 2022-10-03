<%@ page isELIgnored="false"  import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
   <c:when  test="${!empty empsListInfo }">
      <table border="1"  bgcolor="cyan" align="center">
         <tr><th>eno </th> <th>ename </th> <th>salary </th> <th>IsVaccinated </th>  </tr>
         
         <c:forEach var="emp" items="${empsListInfo}"  >
            <tr>
               <td>${emp.eno } </td>
                <td>${emp.ename } </td>
                 <td>${emp.salary } </td>
                  <td>${emp.vaccinated } </td>
            </tr>
         </c:forEach>
         </table>
   </c:when>
   <c:otherwise>
            <h1 style="color:red;text-align:center"> Employee not found </h1>
   </c:otherwise>

</c:choose>

 


<%-- <h1> model attributes data is </h1>
   <b> fav colors are :: </b> <br>
             <c:forEach var="color" items="${favColors}">
                      ${color},
             </c:forEach>
             
             <br>
             <b> nickNames are :: </b> <br>
             <c:forEach var="name" items="${nickNames}">
                      ${name},
             </c:forEach>
             
                  <br>
             <b> phoneNumbers are :: </b> <br>
             <c:forEach var="ph" items="${phoneNumbers}">
                      ${ph},
             </c:forEach>
             
               <br>
             <b> idDetails :: </b> <br>
             <c:forEach var="id" items="${idDetails}">
                      ${id.key}, ${id.value} <br>
             </c:forEach> --%>
             




<%-- <h1> model attributes data is </h1>
   <b> fav colors are :: <%=Arrays.toString(((String[])request.getAttribute("favColors"))) %></b> <br>
   <b> nick names are :: ${nickNames}</b> <br>
   <b> PhoneNumbers are :: ${phoneNumbers}</b> <br>
   <b> idDetails are :: ${idDetails}</b> <br>
       --%>

 
