<%@ include file="header.jsp" %>
    <title>Billing</title>
    
 
 <div class = "container">
	<div class="wrapper">
		     
 <form:form modelAttribute="billingAddress"  class="signin" >   
		       
   <h3 class="form-signin-heading"> Billing Details </h3>
   <hr class="colorgraph"><br>
  	
	
  
  		  
 Flat No :   ${billingAddress.flatNo}<br>

 
 
 Building Name : ${billingAddress.buildingName}<br>
  
  
 Street    :  ${billingAddress.street}<br>
  
  
 City   :    ${billingAddress.city}<br>
  
  
 State  :     ${billingAddress.state}<br>


  Pincode:    ${billingAddress.pincode}<br>


   
			
		
    		
   
			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" name="_eventId_edit" value="edit" class="btn btn-primary"/>
                   <input type="submit" name="_eventId_submit" value="Confirm" class="btn btn-primary"/>
   </div>      			

</form:form>
</div>
</div>



<%@ include file="footer.jsp" %>