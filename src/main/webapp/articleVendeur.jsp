<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">

<head>
	<title>Catalogue</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
     <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    .menu-desktopVendeur {
}
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.png" />
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/linearicons-v1.0.0/icon-font.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/slick/slick.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/MagnificPopup/magnific-popup.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<link rel="stylesheet" type="text/css" href="css/monStyle.css">
	<!--===============================================================================================-->
</head>
<header class="header-v2">
	<!-- Header desktop -->
	<div class="container-menu-desktop trans-03">
		<div class="wrap-menu-desktop">
			<nav class="limiter-menu-desktop p-l-45">
				<!-- Logo desktop -->
				<a href="index.html" class="logo"><img src="images/logo_javazon.png" alt="IMG-LOGO"></a>
				<!-- Menu desktop -->
				<div class="menu-desktopVendeur">
					<ul class="main-menu">
						<li><a href="accueil">Accueil</a></li>
						<li class="active-menu"><a href="articleVendeur">Gérer les articles</a></li>
						<li><a href="commentairesVendeur">Gérer les commentaires</a></li>
						<li><a href="reclamationsVendeur">Gérer les réclamations</a></li>
						<li> <a data-toggle="modal" href="#modalAjouterArticle">Ajouter article</a> </li>
					</ul>
				</div>

			<!-- Modal Ajout Article -->
                        <%@include file="modalAjouterArticle.jsp" %>
		
				

				<!-- Icon header -->
				<div class="wrap-icon-header flex-w flex-r-m h-full">
					<div class="flex-c-m h-full p-r-24">
						<div class="icon-header-item cl2 hov-cl1 trans-04 p-lr-11 js-show-modal-search"><i
								class="zmdi zmdi-search"></i></div>
					</div>
				</div>
			</nav>
		</div>
	</div>

	<!-- Header Mobile -->
	<div class="wrap-header-mobile">
		<!-- Logo moblie -->
		<div class="logo-mobile"><a href="index.html"><img src="images/logo_javazon.png" alt="IMG-LOGO"></a></div>
		<!-- Icon header -->
		<div class="wrap-icon-header flex-w flex-r-m h-full m-r-15">
			<div class="flex-c-m h-full p-r-10">
				<div class="icon-header-item cl2 hov-cl1 trans-04 p-lr-11 js-show-modal-search"><iclass="zmdi zmdi-search"></i></div>
			</div>
			<div class="flex-c-m h-full p-lr-10 bor5">
				<div class="icon-header-item cl2 hov-cl1 trans-04 p-lr-11 icon-header-noti js-show-cart"data-notify="3"><i class="zmdi zmdi-shopping-cart"></i></div>
			</div>
		</div>
		<!-- Button show menu -->
		<div class="btn-show-menu-mobile hamburger hamburger--squeeze">
			<span class="hamburger-box">
				<span class="hamburger-inner"></span>
			</span>
		</div>
	</div>

		<!-- Menu Mobile -->
		<div class="menu-mobile">
			<ul class="main-menu-m">
				<li><a href="index.html">Accueil</a></li>
				<li><a href="produits.html">Catalogue</a></li>
				<li><a href="inscriptionMobile.html">CrÃ©er son compte</a></li>
				<li><a href="loginMobile.html">S'identifier</a></li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
		</div>

	<!-- Modal Search -->
	<div class="modal-search-header flex-c-m trans-04 js-hide-modal-search">
		<div class="container-search-header">
			<button class="flex-c-m btn-hide-modal-search trans-04 js-hide-modal-search"><img
					src="images/icons/icon-close2.png" alt="CLOSE"></button>
			<form class="wrap-search-header flex-w p-l-15">
				<button class="flex-c-m trans-04"><i class="zmdi zmdi-search"></i></button>
				<input class="plh3" type="text" name="search2" placeholder="Recherche...">
			</form>
		</div>
	</div>
</header>

<body class="animsition">

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>

<!-- Cart -->
	<div class="wrap-header-cart js-panel-cart">
		<div class="s-full js-hide-cart"></div>

		<div class="header-cart flex-col-l p-l-65 p-r-25">
			<div class="header-cart-title flex-w flex-sb-m p-b-8">
				<span class="mtext-103 cl2">
					Votre commande
				</span>

				<div class="fs-35 lh-10 cl2 p-lr-5 pointer hov-cl1 trans-04 js-hide-cart">
					<i class="zmdi zmdi-close"></i>
				</div>
			</div>

			<div class="header-cart-content flex-w js-pscroll">
				<ul class="header-cart-wrapitem w-full">
					<li class="header-cart-item flex-w flex-t m-b-12">
						<div class="header-cart-item-img">
							<img src="images/item-cart-01.jpg" alt="IMG">
						</div>

						<div class="header-cart-item-txt p-t-8">
							<a href="#" class="header-cart-item-name m-b-18 hov-cl1 trans-04 couleurElementCart">
								White Shirt Pleat
							</a>

							<span class="header-cart-item-info couleurElementCart">
								1 x 19.00â¬
							</span>
						</div>
					</li>

					<li class="header-cart-item flex-w flex-t m-b-12">
						<div class="header-cart-item-img">
							<img src="images/item-cart-02.jpg" alt="IMG">
						</div>

						<div class="header-cart-item-txt p-t-8">
							<a href="#" class="header-cart-item-name m-b-18 hov-cl1 trans-04 couleurElementCart">
								Converse All Star
							</a>

							<span class="header-cart-item-info couleurElementCart">
								1 x 39.00â¬
							</span>
						</div>
					</li>

					<li class="header-cart-item flex-w flex-t m-b-12">
						<div class="header-cart-item-img">
							<img src="images/item-cart-03.jpg" alt="IMG">
						</div>

						<div class="header-cart-item-txt p-t-8">
							<a href="#" class="header-cart-item-name m-b-18 hov-cl1 trans-04 couleurElementCart">
								Nixon Porter Leather
							</a>

							<span class="header-cart-item-info couleurElementCart">
								1 x 17.00â¬
							</span>
						</div>
					</li>
				</ul>

				<div class="w-full">
					<div class="header-cart-total w-full p-tb-40 couleurElementCart">
						Total: 75.00â¬
					</div>

					<div class="header-cart-buttons flex-w w-full">
						<a href="panier.html"
							class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10">
							Voir commande
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Product --> <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>
	<div class="container">
	  <div class="row">
	    <div class="col-md-12">
	      <h4>Liste des articles</h4>
	      <div class="table-responsive">
	        <table id="mytable" class="table table-bordred table-striped">
	          <thead>
              <th><input type="checkbox" id="checkall" /></th>
	              <th>idArticle</th>
	              <th>Categorie</th>
	              <th>Nom</th>
	              <th>Description</th>
	              <th>prixHT</th>
	              <th>DelaisAppro</th>
	              <th>Delaislivraison</th>
	              <th>QteStock</th>
	              <th>Delete</th>
	                </thead>
	                            <tbody>
	                              <tr>
	                                <td><input type="checkbox" class="checkthis" /></td>
	                                <td>00002</td>
	                                <td>Homme</td>
	                                <td>Robe NafNaf</td>
	                                <td>Robe bleue cintrée</td>
	                                <td>32,90 €</td>
	                                <td>+ 3 jours</td>
	                                <td>+ 4 jours</td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Edit">
	                                  <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button>
	                                  </p></td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Delete">
	                                  <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button>
	                                  </p></td>
	                                <div>Placez ici le contenu de la nouvelle balise div</div>
                                  </tr>
	                              <tr>
	                                <td><input type="checkbox" class="checkthis" /></td>
	                                <td>00016</td>
	                                <td>Homme</td>
	                                <td>Jean's Noir Levi's</td>
	                                <td>Jean's taille basse noir</td>
	                                <td>34,90 €</td>
	                                <td>+ 3 jours</td>
	                                <td>+ 1 jours</td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Edit">
	                                  <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button>
	                                  </p></td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Delete">
	                                  <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button>
	                                  </p></td>
                                  </tr>
	                              <tr>
	                                <td><input type="checkbox" class="checkthis" /></td>
	                                <td>00232</td>
	                                <td>Femme</td>
	                                <td>Chemisier habillé</td>
	                                <td>Chemisier bouton vert </td>
	                                <td>124,90 €</td>
	                                <td>+ 4 jours</td>
	                                <td>+ 4 jours</td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Edit">
	                                  <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button>
	                                  </p></td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Delete">
	                                  <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button>
	                                  </p></td>
                                  </tr>
	                              <tr>
	                                <td><input type="checkbox" class="checkthis" /></td>
	                                <td>05002</td>
	                                <td>Sac</td>
	                                <td>Sac paille</td>
	                                <td>Sac de plage paille</td>
	                                <td>72,90 €</td>
	                                <td>+ 3 jours</td>
	                                <td>+ 3 jours</td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Edit">
	                                  <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button>
	                                  </p></td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Delete">
	                                  <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button>
	                                  </p></td>
                                  </tr>
	                              <tr>
	                                <td><input type="checkbox" class="checkthis" /></td>
	                                <td>21002</td>
	                                <td>Homme</td>
	                                <td>Baskets de marque</td>
	                                <td> Baskets Nike</td>
	                                <td>99,90 €</td>
	                                <td>+ 2 jours</td>
	                                <td>+ 4 jours</td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Edit">
	                                  <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button>
	                                  </p></td>
	                                <td><p data-placement="top" data-toggle="tooltip" title="Delete">
	                                  <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button>
	                                  </p></td>
                                  </tr>
              </tbody>
            </table>
	        <div class="clearfix"></div>
	        <ul class="pagination pull-right">
	          <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
	          <li class="active"><a href="#">1</a></li>
	          <li><a href="#">2</a></li>
	          <li><a href="#">3</a></li>
	          <li><a href="#">4</a></li>
	          <li><a href="#">5</a></li>
	          <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
	<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
	        <h4 class="modal-title custom_align" id="Heading">Edit Your Detail</h4>
          </div>
	      <div class="modal-body">
	        <div class="form-group">
	          <input class="form-control " type="text" placeholder="Mohsin">
            </div>
	        <div class="form-group">
	          <input class="form-control " type="text" placeholder="Irshad">
            </div>
	        <div class="form-group">
	          <textarea name="textarea" rows="2" class="form-control" placeholder="CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan"></textarea>
            </div>
          </div>
	      <div class="modal-footer ">
	        <button type="button" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span>Â Update</button>
          </div>
        </div>
	    <!-- /.modal-content -->
      </div>
	  <!-- /.modal-dialog -->
    </div>
	<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
	        <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4>
          </div>
	      <div class="modal-body">
	        <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are you sure you want to delete this Record?</div>
          </div>
	      <div class="modal-footer ">
	        <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span>Â Yes</button>
	        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span>Â No</button>
          </div>
        </div>
	    <!-- /.modal-content -->
      </div>
	  <!-- /.modal-dialog -->
    </div>
<script type="text/javascript">
$(document).ready(function(){
$("#mytable #checkall").click(function () {
        if ($("#mytable #checkall").is(':checked')) {
            $("#mytable input[type=checkbox]").each(function () {
                $(this).prop("checked", true);
            });

        } else {
            $("#mytable input[type=checkbox]").each(function () {
                $(this).prop("checked", false);
            });
        }
    });
    
    $("[data-toggle=tooltip]").tooltip();
});


    </script>
	
	<!-- Footer -->
	<footer class="bg3 p-t-75 p-b-32">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-lg-4 p-b-50">
						<h4 class="stext-301 cl0 p-b-30">
							Categories
						</h4>
						<ul>
							<li class="p-b-10"> <a href="#" class="stext-107  hov-cl1 trans-04 couleurElementFooter"> Femme</a></li>
							<li class="p-b-10"> <a href="#" class="stext-107  hov-cl1 trans-04 couleurElementFooter"> Homme</a></li>
							<li class="p-b-10"> <a href="#" class="stext-107  hov-cl1 trans-04 couleurElementFooter"> Sacs</a></li>
						</ul>
					</div>
	
					<div class="col-sm-6 col-lg-4 p-b-50">
						<h4 class="stext-301 cl0 p-b-30">AIDE</h4>
						<ul>
							<li class="p-b-10"> <a href="panier.html" class="stext-107  hov-cl1 trans-04 couleurElementFooter"> Suivi de commandes</a>
							</li>
							<li class="p-b-10"> <a href="#" class="stext-107  hov-cl1 trans-04 couleurElementFooter"> Retours / RÃ©clamations</a></li>
						</ul>
					</div>
	
					<div class="col-sm-6 col-lg-4 p-b-50">
						<h4 class="stext-301 cl0 p-b-30"> <a href="contact.html" style="color: white;">CONTACT / SUIVI</a></h4>
						<p class="stext-107 size-201 couleurElementFooter"> N'hÃ©sitez pas Ã  nous<a href="contact.html"> contacter</a> directement par mail pour toutes
							questions. Laissez nous vos commentaires sur les articles.</p>
						<div class="p-t-27">
							<a href="#" class="fs-18 hov-cl1 trans-04 m-r-16">
								<i class="fa fa-facebook"></i>
							</a>
							<a href="#" class="fs-18 hov-cl1 trans-04 m-r-16">
								<i class="fa fa-instagram"></i>
							</a>
							<a href="#" class="fs-18 hov-cl1 trans-04 m-r-16">
								<i class="fa fa-pinterest-p"></i>
							</a>
						</div>
					</div>
				</div>
	
				<div class="p-t-40">
					<div class="flex-c-m flex-w p-b-18">
						<a href="#" class="m-all-1">
							<img src="images/icons/icon-pay-01.png" alt="ICON-PAY">
						</a>
	
						<a href="#" class="m-all-1">
							<img src="images/icons/icon-pay-02.png" alt="ICON-PAY">
						</a>
	
						<a href="#" class="m-all-1">
							<img src="images/icons/icon-pay-03.png" alt="ICON-PAY">
						</a>
	
						<a href="#" class="m-all-1">
							<img src="images/icons/icon-pay-04.png" alt="ICON-PAY">
						</a>
	
						<a href="#" class="m-all-1">
							<img src="images/icons/icon-pay-05.png" alt="ICON-PAY">
						</a>
					</div>
					<p class="stext-107 cl6 txt-center couleurElementFooter"> Site vente en ligne javazon - Projet formation iForm JAVA JEE</p>
				</div>
			</div>
		</footer>


	<!-- Back to top -->
	<div class="btn-back-to-top" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="zmdi zmdi-chevron-up"></i>
		</span>
	</div>

	<!-- Modal1 -->
	<div class="wrap-modal1 js-modal1 p-t-60 p-b-20">
		<div class="overlay-modal1 js-hide-modal1"></div>

		<div class="container">
			<div class="bg0 p-t-60 p-b-30 p-lr-15-lg how-pos3-parent">
				<button class="how-pos3 hov3 trans-04 js-hide-modal1">
					<img src="images/icons/icon-close.png" alt="CLOSE">
				</button>

				<div class="row">
					<div class="col-md-6 col-lg-7 p-b-30">
						<div class="p-l-25 p-r-30 p-lr-0-lg">
							<div class="wrap-slick3 flex-sb flex-w">
								<div class="wrap-slick3-dots"></div>
								<div class="wrap-slick3-arrows flex-sb-m flex-w"></div>

								<div class="slick3 gallery-lb">
									<div class="item-slick3" data-thumb="images/product-detail-01.jpg">
										<div class="wrap-pic-w pos-relative">
											<img src="images/product-detail-01.jpg" alt="IMG-PRODUCT">

											<a class="flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04"
												href="images/product-detail-01.jpg">
												<i class="fa fa-expand"></i>
											</a>
										</div>
									</div>

									<div class="item-slick3" data-thumb="images/product-detail-02.jpg">
										<div class="wrap-pic-w pos-relative">
											<img src="images/product-detail-02.jpg" alt="IMG-PRODUCT">

											<a class="flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04"
												href="images/product-detail-02.jpg">
												<i class="fa fa-expand"></i>
											</a>
										</div>
									</div>

									<div class="item-slick3" data-thumb="images/product-detail-03.jpg">
										<div class="wrap-pic-w pos-relative">
											<img src="images/product-detail-03.jpg" alt="IMG-PRODUCT">

											<a class="flex-c-m size-108 how-pos1 bor0 fs-16 cl10 bg0 hov-btn3 trans-04"
												href="images/product-detail-03.jpg">
												<i class="fa fa-expand"></i>
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-6 col-lg-5 p-b-30">
						<div class="p-r-50 p-t-5 p-lr-0-lg">
							<h4 class="mtext-105 cl2 js-name-detail p-b-14">
								Lightweight Jacket
							</h4>

							<span class="mtext-106 cl2">
								â¬58.79
							</span>

							<a href="produit-seul.html" class="alignerCommentaire mtext-105"> DÃ©tails produit</a>

							<p class="stext-102 cl3 p-t-23">
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
								Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat
								ornare feugiat.
							</p>

							<!--  -->
							<div class="p-t-33">
								<div class="flex-w flex-r-m p-b-10 alignerStock">
									<div class="size-203 flex-c-m respon6">
										DisponibilitÃ©
									</div>
									<div class="size-204 respon6-next">
										<strong>En stock</strong>
									</div>
								</div>

								<div class="flex-w flex-r-m p-b-10">
									<div class="size-204 flex-w flex-m respon6-next">
										<span style="padding-right:10%;">QuantitÃ©</span>
										<div class="wrap-num-product flex-w m-r-20 m-tb-10">
											<div class="btn-num-product-down cl8 hov-btn3 trans-04 flex-c-m">
												<i class="fs-16 zmdi zmdi-minus"></i>
											</div>

											<input class="mtext-104 cl3 txt-center num-product" type="number"
												name="num-product" value="1">

											<div class="btn-num-product-up cl8 hov-btn3 trans-04 flex-c-m">
												<i class="fs-16 zmdi zmdi-plus"></i>
											</div>
										</div>

										<button class="flex-c-m stext-101 cl0 size-101 bg1 bor1 hov-btn1 p-lr-15 trans-04 js-addcart-detail">
											Ajouter Ã  la commande
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<script>
		$(".js-select2").each(function () {
			$(this).select2({
				minimumResultsForSearch: 20,
				dropdownParent: $(this).next('.dropDownSelect2')
			});
		})
	</script>
	<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/slick/slick.min.js"></script>
	<script src="js/slick-custom.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/parallax100/parallax100.js"></script>
	<script>
		$('.parallax100').parallax100();
	</script>
	<!--===============================================================================================-->
	<script src="vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
	<script>
		$('.gallery-lb').each(function () { // the containers for all your galleries
			$(this).magnificPopup({
				delegate: 'a', // the selector for gallery item
				type: 'image',
				gallery: {
					enabled: true
				},
				mainClass: 'mfp-fade'
			});
		});
	</script>
	<!--===============================================================================================-->
	<script src="vendor/isotope/isotope.pkgd.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/sweetalert/sweetalert.min.js"></script>
	<script>
		$('.js-addwish-b2, .js-addwish-detail').on('click', function (e) {
			e.preventDefault();
		});

		/*---------------------------------------------*/

		$('.js-addcart-detail').each(function () {
			var nameProduct = $(this).parent().parent().parent().parent().find('.js-name-detail').html();
			$(this).on('click', function () {
				swal(nameProduct, "est ajoutÃ© Ã  la commande !", "success");
			});
		});

	</script>
	<!--===============================================================================================-->

	<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>

</html>