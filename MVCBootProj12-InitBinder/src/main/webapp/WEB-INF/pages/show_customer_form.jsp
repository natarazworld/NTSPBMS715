<%@page isELIgnored="false"  %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:green;text-align:center">Register the customer </h1>

<frm:form  modelAttribute="cust">
    <frm:errors path="*"/>
   <table border="1" bgcolor="cyan"  align="center">
       <tr>
          <td>CustomerName::  </td>
          <td> <frm:input   path="cname"/></td>
       </tr>
        <tr>
          <td>Customer DOB::  </td>
          <td> <frm:input  type="date" path="dob"/></td>
       </tr>
       
         <tr>
          <td>Customer Date of Purchase(DOP)::  </td>
          <td> <frm:input type="date"  path="dop"/></td>
       </tr>
       
         <tr>
          <td>Is Customer Member </td>
          <td> <frm:checkbox path="isHavingMembership"  value="true" /> Member </td>
       </tr>
   
       <tr>
           <td> <input type="submit" value="register"> </td>
           <td> <input type="reset" value="cancel"> </td>
       </tr>
       
   </table>

</frm:form>


