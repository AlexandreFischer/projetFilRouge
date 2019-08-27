<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscription</title>
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
	<link rel="stylesheet" href="css/style_inscription_site_web.css">
	<link rel="stylesheet" href="vendor/bootstrap4-fs-modal-master/dist/css/bootstrap-fs-modal.min.css">
	<style type="text/css">
		.animsition .bg3.p-t-75.p-b-32 {
			color: #e0a800;
		}
	</style>
</head>
<body>
    <!-- Modal Inscription -->
    <h5 class="modal-title" id="exampleModalLabel">Ajouter un article</h5>
    <form role="form">
                    <div class="form-group">
                      <label for="name" class="cols-sm-2 control-label">Nom Article</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-user fa"
                                        aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="name" id="name"
                                    placeholder="Nom de l'article" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                      <label for="email2" class="cols-sm-2 control-label">Description</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-envelope fa"
                                        aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="email" id="email"
                                    placeholder="DÃ©crivez votre article" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                      <label for="password2" class="cols-sm-2 control-label">CatÃ©gorie</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                                <input type="password" class="form-control" name="password"
                                    id="password" placeholder="HOMME / FEMME / SAC" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                      <label for="confirm3" class="cols-sm-2 control-label">DÃ©lais Appro</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                                <input type="password" class="form-control" name="confirm"
                                    id="confirm" placeholder="Quel dÃ©lais d'approvisionnement ?" />
                            </div>
                        </div>
                    </div>
      <div class="form-group">
        <label for="confirm6" class="cols-sm-2 control-label">DÃ©lais Livraison</label>
        <div class="cols-sm-10">
                        <div class="input-group"> <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                          <input type="password" class="form-control" name="confirm2"
                                    id="confirm2" placeholder="Quel dÃ©lais de livraison ?" />
                        </div>
                      </div>
                    </div>
      <div class="form-group">
        <label for="confirm7" class="cols-sm-2 control-label">Image source</label>
        <div class="cols-sm-10">
                        <div class="input-group"> <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                          <input type="password" class="form-control" name="confirm2"
                                    id="confirm3" placeholder="RÃ©fÃ©rence emplacement dans le dossier image..." />
                        </div>
                      </div>
                    </div>
</form>
                <a href="index.html"><button type="button" class="btn btn-secondary">Fermer</button></a>
                <button type="button" class="btn btn-primary">Ajouter article</button>

<!--===============================================================================================-->
<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/bootstrap/js/popper.js"></script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/daterangepicker/moment.min.js"></script>
<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="vendor/slick/slick.min.js"></script>
<script src="js/slick-custom.js"></script>
<!--===============================================================================================-->
<script src="js/main.js"></script> 
</body>
</html>