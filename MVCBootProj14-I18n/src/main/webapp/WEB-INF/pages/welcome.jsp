<%@ page isELIgnored="false"  contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"   %>


<h1 style="color:blue;text-align:center"><spring:message code="home.title"/> </h1>

      <a href="register"><h3 style="text-align:center"><spring:message code="home.link"/></h3></a>
   <br>
   <b> current active Locale is :: ${pageContext.response.locale}</b>
   
   <fmt:setLocale value="${pageContext.response.locale}"/>
   
   <jsp:useBean id="dt"  class="java.util.Date"/>
   <fmt:formatDate value="${dt}"  var="fdt"  type="date"  dateStyle="FULL"/>
    <br> <b> Formatted date :: ${fdt}</b>
    
    <fmt:formatDate value="${dt}"  var="ftime"  type="time"  timeStyle="FULL"/>
    <br> <b> Formatted time :: ${ftime}</b>
    
    
    <fmt:formatNumber value="100000000"  var="fnumber"  type="number"/>
    <br> <b> Formatted Number :: ${fnumber}</b>
    
    <fmt:formatNumber value="100000000"  var="fcurrency"  type="currency"/>
    <br> <b> Formatted currency :: ${fcurrency}</b>
    
    <fmt:formatNumber value="0.75"  var="fpercent"  type="percent"/>
    <br> <b> Formatted percent :: ${fpercent}</b>
    
    
    
   
   
   <br><br>
   <a href="?lang=fr_FR">French</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="?lang=en_US">English</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="?lang=de_DE">Germany</a>  &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="?lang=hi_IN">  हिन्दी</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="?lang=zh_CN">chinese</a>  &nbsp;&nbsp;&nbsp;&nbsp;
   
