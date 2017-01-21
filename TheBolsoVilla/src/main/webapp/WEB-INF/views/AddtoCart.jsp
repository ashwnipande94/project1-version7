<%@ include file="header.jsp" %>



<link href="resources/css/font-awesome.min.css" rel="stylesheet">

<div ng-app="app" ng-controller="myCtrl">

<div class="container-fluid" >


	<table id="cart" class="table table-hover table-condensed" >
	
	
    				<thead>
    				
    
						<tr >
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody >
						<tr ng-repeat= "p in productdata">
						  
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="resources/images/{{p.productId}}-1.jpg" alt="..." class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">{{p.productName}}</h4>
										<p>{{p.productDescription}}</p>
									</div>
								</div>
							</td>
							<td data-th="Price">{{p.productPrice}}</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="1">
							</td>
							<td data-th="Subtotal" class="text-center">1.99</td>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><a href="deleteCartItem-{{p.cartItemId}}"> Delete </a></button>
								
</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong>Total 1.99</strong></td>
						</tr>
						<tr>
							<td><a href="#" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total $1.99</strong></td>
							<td><a href="checkout?userId=${sessionScope.userId}" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
				
		</div>
	
 </div>
				
	 <script type="text/javascript" src="resources/js/angular.min.js"></script>
    <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myCtrl",function ($scope){
    $scope.productdata=${cartList};
    });

  </script>
  		    

  
  		  
