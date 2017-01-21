<%@ include file="header.jsp" %>  


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ page isELIgnored="false" %>
   
   
    <div ng-app="app" ng-controller="myCtrl">
   
 <form:form  method="POST" modelAttribute="supplier" class="form-signin"  action="addSupplier">        
		       
   <h3 class="form-signin-heading"> Supplier </h3>
   <hr class="colorgraph"><br>
  	
	
  
  		  
 Supplier Id  :        <form:input class="form-control" path="supplierId" placeholder="supplierId"  /><br><br>
 Supplier Name :       <form:input type="text" class="form-control" path="supplierName" placeholder="supplierName" /> <br><br>
 <form:errors path="supplierName"  class="form-control" id="inputError"></form:errors>    		  
 Supplier Contact : <form:input type="text" class="form-control" path="supplierContact" placeholder="supplierContact" /><br><br>
 <form:errors path="supplierContact"  class="form-control" id="inputError"></form:errors> 
 Supplier Address : <form:input type="text" class="form-control" path="supplierAddress" placeholder="supplierAddress" /><br><br>
 
 
<div class="alert alert-info">
<p>Search Query:{{searchSupplier}}</p>
<input type="text" placeholder="Search the category" ng-model="searchSupplier">
</div>

			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" value="addSupplier" class="btn btn-primary"/>
  </div>      			

 </form:form>>
 
 
 
 <div class="table-responsive">
    <table class="table">  
    <caption>Supplier List</caption>
    <thead class="thead-default">
        <th>Supplier Id</th>  
        <th>Supplier Name</th>  
        <th>Supplier Contact</th>
        <th>Supplier Address</th>  
        <th >Edit </th>  
        <th>Delete </th>  
        </thead>
         
     <tbody>
   
        
        <br>
        <tr ng-repeat="slist in jsonData|orderBy:sortType:sortReverse|filter:searchBrand">  
            <td>{{slist.supplierId}}</td>  
            <td>{{slist.supplierName}}</td>  
            <td>{{slist.supplierContact}}</td>  
            <td>{{slist.supplierAddress}}</td>
            <td><a href="editSupplier-{{clist.supplierId}}">Edit</a></td>  
            <td><a href="deleteSupplier-{{clist.supplierId}}">Delete</a></td> 
</tr>  
</tbody>
    </table> 
    </div>
    
    <script type="text/javascript" src="resources/js/angular.min.js"></script>
    <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myCtrl",function ($scope){
    	$scope.sortType      = 'supplierName';
    	$scope.sortReverse   = false;
    	$scope.searchSupplier  ='';
   $scope.jsonData=${supplierList};
    });

  </script>
    
</div>


<%@ include file="footer.jsp" %>