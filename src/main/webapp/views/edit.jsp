<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body >
  <center>
        <h1>Edit student data</h1>  
       <form:form method="POST" action="/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="studentid" /></td>  
         </tr>  
         <tr>    
            <td>Student Name:</td>    
            <td><form:input path="name" /></td>  
           </tr>  
         <tr>    
          <td>sub 1: </td>   
          <td><form:input path="sub1"  /></td>  
         </tr>    
         <tr>    
          <td> sub 2</td>    
          <td><form:input path="sub2" /></td>  
         </tr>   
         <tr>    
            <td>sub 3:</td>    
            <td><form:input path="sub3" /></td>  
           </tr> 
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="EditSave" /></td>    
         </tr>    
        </table>    
       </form:form>  
        
       </center>
       </body>