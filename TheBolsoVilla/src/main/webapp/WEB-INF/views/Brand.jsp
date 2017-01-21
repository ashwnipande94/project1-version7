<%@ include file="header.jsp" %>
    <title>Brand</title>

 
  
<div ng-app="app" ng-controller="myCtrl">

 <form:form  method="POST" modelAttribute="brand" class="form-signin"  action="addBrand">        
		       
   <h3 class="form-signin-heading"> Brand </h3>
   <hr class="colorgraph"><br>
  	
	
  
  		  
 Brand Id  :        <form:input  class="form-control" path="brandId" placeholder="brandId"  /><br><br>
 Brand Name :       <form:input type="text" class="form-control" path="brandName" placeholder="brandName" /> <br><br>
 <form:errors path="brandName"  class="form-control" id="inputError"></form:errors>    		  
   
      

<div class="alert alert-info">
<p>Search Query:{{searchBrand}}</p>
<input type="text" placeholder="Search the brand" ng-model="searchBrand">
</div>

			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" value="addBrand" class="btn btn-primary"/>
  </div>      			

 </form:form>
 
 
 <div class="table-responsive">
    <table class="table">  
    <caption>Brand List</caption>
    <thead class="thead-default">
        <th>brand</th>  
        <th>brand Name</th>  
        <th >Edit </th>  
        <th>Delete </th>  
        </thead>
         
     <tbody>
   
        
        <br>
        <tr ng-repeat="blist in jsonData|orderBy:sortType:sortReverse|filter:searchBrand">  
            <td>{{blist.brandId}}</td>  
            <td>{{blist.brandName}}</td> 
            <td><a href="editBrand-{{blist.brandId}}">Edit</a></td>  
            <td><a href="deleteBrand{{blist.brandId}}">Delete</a></td> 
</tr>  
</tbody>
    </table> 
    </div>
    
    <script type="text/javascript" src="resources/js/angular.min.js"></script>
    <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myCtrl",function ($scope){
    	$scope.sortType      = 'brandName';
    	$scope.sortReverse   = false;
    	$scope.searchBrand  ='';
   $scope.jsonData=${brandList};
    });

  </script>
    </div>
    
<%@ include file="footer.jsp" %>

