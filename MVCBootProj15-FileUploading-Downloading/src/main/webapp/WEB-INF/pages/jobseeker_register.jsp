
<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm" %>

<link rel="stylesheet" type="text/css" href="css/style.css">  



<h1  style="color:red;text-align:center">Register  JobSeeker</h1>

  <frm:form modelAttribute="js"  enctype="multipart/form-data" >
  
    <table align="center" bgcolor="cyan">
      <tr>
        <td>Job Seeker Name:: </td>
        <td> <frm:input path="jsName"/>  </td>
      </tr>
       <tr>
        <td> JobSeeker Address:: </td>
        <td> <frm:input path="jsAddrs"/>  </td>
      </tr>
      
       <tr>
        <td> Select JobSeeker's resume </td>
        <td> <frm:input type="file"  path="resume"/>  </td>
      </tr>
      
        <tr>
        <td> Select JobSeeker's Photo </td>
        <td> <frm:input type="file"  path="photo"/>  </td>
      </tr>
      
       
      <tr>
        <td> <input type="submit" value="register"></td>
        <td> <input type="reset" value="cancel">  </td>
      </tr>
    
    </table>
        
  </frm:form>

