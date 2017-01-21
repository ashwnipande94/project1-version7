<%@ include file="header.jsp" %>
    <title>Shipping</title>
    
 
 <div class = "container">
	<div class="wrapper">
		     
 <form:form method="POST"   class="signin" >   
		       
   <h3 class="form-signin-heading"> Shipping Details </h3>
   <hr class="colorgraph"><br>
  	
	
  
  		  
 Flat No :   ${shippingAddress.flatNo}<br>

 
 
 Building Name : ${shippingAddress.buildingName}<br>
  
  
 Street    :  ${shippingAddress.street}<br>
  
  
 City   :    ${shippingAddress.city}<br>
  
  
 State  :     ${shippingAddress.state}<br>


  Pincode:    ${shippingAddress.pincode}<br>


   
			
		
    		
   
			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" name="_eventId_edit" value="edit" class="btn btn-primary"/>
                   <input type="submit" name="_eventId_submit" value="Submit" class="btn btn-primary"/>
   </div>      			

</form:form>
</div>
</div>



<%@ include file="footer.jsp" %>