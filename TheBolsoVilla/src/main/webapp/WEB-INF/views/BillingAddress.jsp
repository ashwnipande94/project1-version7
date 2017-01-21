<%@ include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Registration</title>
    <style>
        
     .wrapper {    
	margin-top: 80px;
	margin-bottom: 20px;
}

.form-signin {
  max-width: 620px;
  padding: 30px 38px 66px;
  margin: 0 auto;
  background-color: #eee;
  border: 3px dotted rgba(0,0,0,0.1);  
  }

.form-signin-heading {
  text-align:center;
  margin-bottom: 30px;
}

.form-control {
  position: relative;
  font-size: 16px;
  height: auto;
  padding: 10px;
}

input[type="text"] {
  margin-bottom: 0px;
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
}

input[type="password"] {
  margin-bottom: 20px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

.colorgraph {
  height: 7px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
}   
        
        
</style>
    </head>
    
   <body>
   
   
 <div class = "container">
	<div class="wrapper">
		     
 <form:form  method="POST" modelAttribute="billingAddress" class="form-signin" >        
  		  



 
  
 
   <h3 class="form-signin-heading"> Billing Address </h3>
   <hr class="colorgraph"><br>
  	
  	
  	
	
  		  
 

 Flat No :       <form:input type="number" class="form-control" path="flatNo" placeholder="flatNo" /> 
 				<form:errors path="flatNo"></form:errors><br><br>
 Building Name: <form:input type="text" class="form-control" path="buildingName" placeholder="buildingName" />
 				<form:errors path="buildingName"></form:errors><br><br>
 Street    :     <form:input type="text" class="form-control" path="street" placeholder="street"  />
                 <form:errors path="street"></form:errors><br><br>
 City   :        <form:input type="text" class="form-control" path="city" placeholder="city"  />
                 <form:errors path="city"></form:errors><br><br>
 State  :        <form:input type="text" class="form-control" path="state" placeholder="state"  />
                <form:errors path="state"></form:errors><br><br>
  Pincode:        <form:input class="form-control" path="pincode" placeholder="pincode"  />
                    <form:errors path="pincode"></form:errors><br><br>


   
			
			



 <div class="offset-sm-2 col-sm-10">
                  <input type="submit" value="Submit" class="btn btn-primary" name="_eventId_submit"/>
  </div>      			
 
 

 
</form:form>
</div>
</div>
</body>
</html>