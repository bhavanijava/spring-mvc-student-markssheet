 <%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
   prefix="c"%> <html>
    <head>
        <title>student</title>
        <style>
            body{
                background-color: beige;
            }
        </style>
    </head>
    <body>
        <center>
        <h1> Student Results </h1>
            <form action="/savemarks" method="POST">
                StudentId: <input type="text"name="studentid"><p></p>
                StudentName:<input type="text"name="name"><p></p>
                Sub1:<input type="text"name="sub1"><p></p>
                Sub2:<input type="text"name="sub2"><p></p>
                Sub3:<input type="text"name="sub3"><p></p>
                <input type="reset">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit">

            </form>
            <h3><a href="/showresults"> Show Results</a></h3>
          
        </center>
        <center>
  
<table border="2" width="90%" cellpadding="2">  
<tr>
    <th>Student Id</th>
    <th>Student Name</th>
    <th>sub 1</th>
    <th>sub 2 </th>
     <th>sub 3</th>
      <th>Total</th>
      <th>Avearage</th>
      <th>Grade</th>
            <th>Delete</th>
      <th>Edit</th>
    </tr>
   <c:forEach var="StudentModel" items="${StudentModels}">   
   <tr>  
    <td>${StudentModel.studentid}</td>  
    <td>${StudentModel.name}</td> 
    <td>${StudentModel.sub1}</td> 
    <td>${StudentModel.sub2}</td> 
    <td>${StudentModel.sub3}</td> 
    <td>${StudentModel.total}</td>
    <td>${StudentModel.avearage}</td> 
    <td>${StudentModel.grade}</td> 
    
   
   <td><a href="deletestudent/${StudentModel.studentid}">Delete</a></td> 
   
   <td><a href="editstudent/${StudentModel.studentid}">Update</a></td>   
    </tr>  
   </c:forEach>  
   </table>  
    </body>
</html>