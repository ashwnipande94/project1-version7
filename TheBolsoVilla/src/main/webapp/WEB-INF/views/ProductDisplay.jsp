
<%@ include file="header.jsp" %>



<div class="container-fluid">
    <div class="row">
        <div class="row">
            <div class="col-md-9">
                <h2>
                All Products</h2>
            </div>
  
            <div class="col-md-3">
                <!-- Controls -->
                <div class="controls pull-right hidden-xs">
                    <a class="left fa fa-chevron-left btn btn-success" href="#carousel-example"
                        data-slide="prev"></a><a class="right fa fa-chevron-right btn btn-success" href="#carousel-example"
                            data-slide="next"></a>
                </div>
            </div>
        </div>
                  <div ng-app="app" ng-controller="myCtrl">
                  <div id="carousel-example" class="carousel slide hidden-xs" data-ride="carousel">
            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <div class="row">
                        <div class="col-sm-4" ng-repeat="p in jsonData">
                            <div class="col-item">
                            <a href="viewDetail-{{p.productId}}">
                                <div class="photo">
                                    <img src="resources/images/{{p.productId}}-1.jpg" height="400px" width="400px" class="img-responsive" alt="a" />
                                </div> </a>
                                
                                
                                
                                <div class="info">
                                    <div class="row">
                                        <div class="price col-md-6">
                                            <h5>
                                                {{p.productName}}</h5>
                                            <h5 class="price-text-color">
                                                {{p.productPrice}}</h5>
                                        </div>
                                        <div class="rating hidden-sm col-md-6">
                                            <i class="price-text-color fa fa-star"></i><i class="price-text-color fa fa-star">
                                            </i><i class="price-text-color fa fa-star"></i><i class="price-text-color fa fa-star">
                                            </i><i class="fa fa-star"></i>
                                        </div>
                                    </div>
                                    <div class="separator clear-left">
                                        <p class="btn-add">
                                            <i class="fa fa-shopping-cart"></i><a href="addtocart-{{p.productId}}?userId=1" class="hidden-sm">Add to cart</a></p>
                                        <p class="btn-details">
                                            <i class="fa fa-list"></i><a href="" class="hidden-sm">More details</a></p>
                                    </div>
                                    <div class="clearfix">
                                    </div></div></div></div></div></div></div></div>
                                    
 <script type="text/javascript" src="resources/js/angular.min.js"></script>
    <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myCtrl",function ($scope){
   $scope.jsonData=${productList};
    });

  </script>
  </div></div></div>                                    
                                    
                                    
                                    <%@ include file="footer.jsp" %>