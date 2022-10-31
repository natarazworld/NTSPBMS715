<%@ page isELIgnored="false"  contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"   %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"   %>



<h1 style="color:blue;text-align:center"><spring:message code="cust.registration.title"/> </h1>

      <frm:form modelAttribute="cust">
         <table border="0" align="center">
           <tr>
              <td><spring:message code="cust.registration.name"/>  </td>
              <td><frm:input path="cname"/>  </td>
           </tr>
             <tr>
              <td><spring:message code="cust.registration.addrs"/>  </td>
              <td><frm:input path="caddrs"/>  </td>
           </tr>
           <tr>
              <td><spring:message code="cust.registration.billAmount"/>  </td>
              <td><frm:input path="billAmount"/>  </td>
           </tr>
           
           <tr>
              <td colspan="2"><input type="submit" value="<spring:message code="cust.registration.submit.caption"/>">  </td>
           </tr>
           
         
         </table>
      
      </frm:form>
   
   <br><br>
   <a href="?lang=fr_FR">French</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="?lang=en_US">English</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="?lang=de_DE">Germany</a>  &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="?lang=hi_IN">  हिन्दी</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="?lang=zh_CN">chinese</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   
