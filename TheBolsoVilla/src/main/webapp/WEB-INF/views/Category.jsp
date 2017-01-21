<%@ include file="header.jsp" %>

   
  
   
 

<div ng-app="app" ng-controller="myCtrl">
		     
 <form:form  method="POST" modelAttribute="category" class="form-signin"  action="addCategory">        
		       
   <h3 class="form-signin-heading"> Category </h3>
   <hr class="colorgraph"><br>
  	
  	
  	
	
  		  
 Category Id  :        <form:input type="hidden" class="form-control" path="categoryId" placeholder="categoryId"  /><br><br>
 Category Name :       <form:input type="text" class="form-control" path="categoryName" placeholder="categoryName" /> <br><br>
 <form:errors path="categoryName"  class="form-control" id="inputError"></form:errors>    		  
 Category Description : <form:input type="text" class="form-control" path="categoryDescription" placeholder="categoryDescription" /><br><br>
 <form:errors path="categoryDescription"  class="form-control" id="inputError"></form:errors>
   

<div class="alert alert-info">
<p>Search Query:{{searchCategory}}</p>
<input type="text" placeholder="Search the category" ng-model="searchCategory">
</div>

<br>

  				
			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" value="addCategory" class="btn btn-primary"/>
  </div>      		
  
  </form:form>
 

 <div class="table-responsive">
    <table class="table">  
    <caption><h2>Category List</h2></caption>
    <thead class="thead-default">
        <th>Category Id</th>  
        <th>Category Name</th>  
        <th>Category Description</th>  
        <th >Edit</th>  
        <th>Delete </th>  
        </thead>
         
     <tbody>
   
        
        <br>
        <tr ng-repeat="clist in jsonData | orderBy:sortType:sortReverse | filter:searchCategory">  
            <td>{{clist.categoryId}}</td>  
            <td>{{clist.categoryName}}</td>  
            <td>{{clist.categoryDescription}}</td>  
            <td><a href="editCategory-{{clist.categoryId}}">Edit</a></td>  
            <td><a href="deleteCategory-{{clist.categoryId}}">Delete</a></td> 
</tr>  
</tbody>
    </table> 
    </div>
    
    
   <script type="text/javascript" src="resources/js/angular.min.js"></script>
    <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myCtrl",function ($scope){
    	$scope.sortType      = 'categoryName';
    	$scope.sortReverse   = false;
    	$scope.searchCategory  ='';
   $scope.jsonData=${categoryList};
    });

  </script>
  
   
    
</div>


<%@ include file="footer.jsp" %>