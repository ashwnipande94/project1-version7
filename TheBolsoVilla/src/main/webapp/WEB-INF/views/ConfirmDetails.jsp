
<%@ include file="header.jsp" %>
    <title>Registration</title>
    
 
 <div class = "container">
	<div class="wrapper">
		     
 <form:form method="POST"  modelAttribute="userDetail" class="signin" >   
		       
   <h3 class="form-signin-heading"> Registration </h3>
   <hr class="colorgraph"><br>
  	
	
  
  		  
 Username :   ${userDetail.username}<br>

 
 
 Password : ${userDetail.password}<br>
  
  
 Fname    :  ${userDetail.fname}<br>
  
  
 Lname   :    ${userDetail.lname}<br>
  
  
 EmailId  :     ${userDetail.emailId}<br>


  Contact No:    ${userDetail.contactNo}<br>


   
			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" name="_eventId_edit" value="edit" class="btn btn-primary"/>
                   <input type="submit" name="_eventId_submit" value="Submit" class="btn btn-primary"/>
   </div>      			

</form:form>
</div>
</div>



