<%@ include file="header.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ page isELIgnored="false" %>
    
    
    <div ng-app="app" ng-controller="myCtrl">
    
    <form:form  method="POST" modelAttribute="subcategory" class="form-signin"  action="addSubcategory">        
		       
   <h3 class="form-signin-heading"> Subcategory </h3>
   <hr class="colorgraph"><br>
  	
	
 
  		  
 Subcategory Id  :        <form:input class="form-control" path="subcategoryId" placeholder="subcategoryId"  /><br><br>
 Subcategory Name :       <form:input type="text" class="form-control" path="subcategoryName" placeholder="subcategoryName" /> <br><br>
 <form:errors path="subcategoryName" ></form:errors>    		  
 Subcategory Description : <form:input type="text" class="form-control" path="subcategoryDescription" placeholder="subcategoryDescription" /><br><br>
 <form:errors path="subcategoryDescription"  class="form-control" id="inputError"></form:errors>
 Category : <form:select path="category.categoryName" items="${categoryList}" itemValue="categoryName" itemLabel="categoryName" class="form-control"></form:select>
      <br><br>


<div class="alert alert-info">
<p>Search Query:{{searchSubcategory}}</p>
<input type="text" placeholder="Search the subcategory" ng-model="searchSubcategory">
</div>
   
			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" value="addSubcategory" class="btn btn-primary"/>
  </div>      			


 </form:form>
 

 
 <div class="table-responsive">
    <table class="table">  
    <caption>Subcategory List</caption>
    <thead class="thead-default">
        <th>Subcategory Id</th>  
        <th>Subcategory Name</th>  
        <th>Subcategory description</th>  
        <th >Edit </th>  
        <th>Delete </th>  
        </thead>
         
     <tbody>
   
        
        <br>
        <tr ng-repeat="slist in jsonData|orderBy:sortType:sortReverse|filter:searchBrand">  
            <td>{{slist.subcategoryId}}</td>  
            <td>{{slist.subcategoryName}}</td>  
            <td>{{slist.subcategoryDescription}}</td>  
            <td><a href="editSubcategory-{{slist.subcategoryId}}">Edit</a></td>  
            <td><a href="deleteSubcategory-{{slist.subcategoryId}}">Delete</a></td> 
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
    	$scope.searchSubcategory  ='';
   $scope.jsonData=${subcategoryList};
    });

  </script>
    
</div>

<%@ include file="footer.jsp" %>