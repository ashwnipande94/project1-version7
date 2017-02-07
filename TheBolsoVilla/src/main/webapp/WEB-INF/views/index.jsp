<%@ include file="header.jsp" %>

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/bags1.jpg" width="480" height="345">
      </div>
      
       <div class="item">
        <img src="resources/images/poster1.jpg" width="480" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/bags2.jpg"  width="480" height="345">
      </div>

      <div class="item">
        <img src="resources/images/bbags.jpg"  width="480" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

 <div class="container-fluid">
    <div class="row">
        <div class="row">
            <div class="col-md-9">
                <h2>
                 New Arrivals</h2>
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
                        <div class="col-md-4" ng-repeat="p in jsonData">
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
                                    
                                    
<!--                                     slider -->
                             
                             
                             <!-- We will make a simple accordian with hover effects 
The markup will have a list with images and the titles-->
<div class="container-fluid">
<div class="accordian">
    <ul>
		<li>
			<div class="image_title">
				<a href="#">Men Bags</a>
			</div>
			<a href="#">
				<img src="resources/images/bags2.jpg"/>
			</a>
		</li>
		<li>
			<div class="image_title">
				<a href="#">Handbags</a>
			</div>
			<a href="#">
				<img src="resources/images/handbags2.3.jpg"/>
			</a>
		</li>
		<li>
			<div class="image_title">
				<a href="#">Wall-E</a>
			</div>
			<a href="#">
				<img src="resources/images/handbags3.4.jpg"/>
			</a>
		</li>
		<li>
			<div class="image_title">
				<a href="#">Up</a>
			</div>
			<a href="#">
				<img src="resources/images/handbags2.jpg"/>
			</a>
		</li>
		<li>
			<div class="image_title">
				<a href="#">Cars 2</a>
			</div>
			<a href="#">
				<img src="resources/images/handbags3.5.jpg"/>
			</a>
		</li>
	</ul>
</div>
          </div>                   
                             
     <script type="text/javascript" src="resources/js/angular.min.js"></script>
    <script type="text/javascript">
    var app=angular.module('app',[]);
    app.controller("myCtrl",function ($scope){
   $scope.jsonData=${jsonProductList};
    });

  </script>
  
             

</div></div></div>

<%@ include file="footer.jsp" %>

