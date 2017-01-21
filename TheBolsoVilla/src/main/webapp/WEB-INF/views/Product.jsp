<%@ include file="header.jsp" %>  


    <div ng-app="app" ng-controller="myCtrl">

 <form:form  method="POST" modelAttribute="product" class="form-signin"  action="addProduct" enctype="multipart/form-data">        
		       
   <h3 class="form-signin-heading"> Product </h3>
   <hr class="colorgraph"><br>
  	
	
  
  		  
 Product Id :      <form:input type="hidden" class="form-control" path="productId" placeholder="productId"  /><br><br>
 Product Name :       <form:input type="text" class="form-control" path="productName" placeholder="productName" /> <br><br>
 <form:errors path="productName"  class="form-control" id="inputError"></form:errors>    		  
 Product Description : <form:input type="text" class="form-control" path="productDescription" placeholder="productDescription" /><br><br>
 <form:errors path="productDescription"  class="form-control" id="inputError"></form:errors>
  Product Quantity : <form:input type="text" class="form-control" path="productQuantity" placeholder="productQuantity" /><br><br>
  Product Discount : <form:input type="text" class="form-control" path="productDiscount" placeholder="productDiscount" /><br><br>
  Product Price : <form:input type="text" class="form-control" path="productPrice" placeholder="productPrice" /><br><br>  
 Product Image : <form:input type="file" multiple="multiple" name="file" class="form-control" path="productImage" placeholder="productImage" /><br><br>
 
	
Category :<form:select path="category.categoryName" items ="${categoryList}" itemValue="categoryName" itemLabel="categoryName"></form:select><br><br>
Subcategory : <form:select path="subcategory.subcategoryName" items ="${subcategoryList}" itemValue="subcategoryName" itemLabel="subcategoryName"></form:select><br><br>
Brand : <form:select path="brand.brandName" items ="${brandList}" itemValue="brandName" itemLabel="brandName"></form:select><br><br>

Supplier : <form:select path="supplier.SupplierName" items ="${supplierList}" itemValue="SupplierName" itemLabel="SupplierName"></form:select><br><br>

<br>
			

<div class="alert alert-info">
<p>Search Query:{{searchProduct}}</p>
<input type="text" placeholder="Search the Product" ng-model="searchProduct">
</div>
		
			
<div class="offset-sm-2 col-sm-10">
                  <input type="submit" value="addProduct" class="btn btn-primary"/>
  </div>      			

 </form:form>
 
 
 
 <div class="table-responsive">
    <table class="table">  
    <caption>Product List</caption>
    <thead class="thead-default">
       <th>Product Id</th>  
        <th>Product Name</th>  
        <th>Product Description</th>  
        <th>Product Quantity</th>  
        <th>Product Discount</th>  
        <th>Product Price</th> 
        <th>Edit</th>  
        <th>Delete</th>    
        </thead>
         
     <tbody>
   
        
        <br>
          <tr ng-repeat="plist in jsonData|orderBy:sortType:sortReverse|filter:searchProduct"> 
         
            <td>{{plist.productId}}</td>  
            <td>{{plist.productName}}</td>  
            <td>{{plist.productDescription}}</td>
            <td>{{plist.productQuantity}}</td>
            <td>{{plist.productDiscount}}</td>
            <td>{{plist.productPrice}}</td>
    
            <td><a href="editProduct-{{plist.productId}}">Edit</a></td>  
            <td><a href="deleteProduct-{{plist.productId}}">Delete</a></td> 
</tr>  
 
</tbody>
    </table> 
    </div>
    
    <script type="text/javascript" src="resources/JS/angular.min.js"></script>
    <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myCtrl",function ($scope){
    	$scope.sortType      = 'productName';
    	$scope.sortReverse   = false;
    	$scope.searchProduct  ='';
   $scope.jsonData=${productList};
    });

  </script>
    </div>
    
    <%@ include file="footer.jsp" %>