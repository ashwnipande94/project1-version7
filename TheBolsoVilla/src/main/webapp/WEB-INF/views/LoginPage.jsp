	     
 <%@ include file="header.jsp" %>
		       
   
   
   
   <div class = "container">
	<div class="wrapper">
		<form method="POST" class="form-signin"  action="perform_login">        
		    <h3 class="form-signin-heading"> Please Sign In</h3>
			  <hr class="colorgraph"><br>
			  
			  <input type="text" class="form-control" name="username" placeholder="Username" required="" autofocus="" />
			  <input type="password" class="form-control" name="password" placeholder="Password" required=""/>     		  
			 
			  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  			
		</form>			
	</div>
</div>




<%@ include file="footer.jsp" %>