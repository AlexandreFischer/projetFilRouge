<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="modal fade" id="modalAjouterArticle" tabindex="-1" role="dialog"
     aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog " role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ajouter article</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
   <!-- Modal Ajout article -->
            <div class="modal-body">
                <form role="form" method="POST" action="ajoutArticleVendeur">
                    <div class="form-group">
                      <label for="nom" class="cols-sm-2 control-label">Nom Article</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-user fa"
                                        aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="nom" id="nom"
                                    placeholder="Nom de l'article" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                      <label for="description" class="cols-sm-2 control-label">Description</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-envelope fa"
                                        aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="description" id="description"
                                    placeholder="Décrivez votre article" />
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-group">
                      <label for="prixHT" class="cols-sm-2 control-label">Prix HT</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-envelope fa"
                                        aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="prixHT" id="prixHT"
                                    placeholder="Prix HT ex 19.90" />
                            </div>
                        </div>
                    </div>
                    

                    <div class="form-group">
                      <label for="categorie" class="cols-sm-2 control-label">Catégorie</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                                <select class="form-control" id="categorie">
                                    <option>HOMME</option>
                                    <option>FEMME</option>
                                    <option>SAC</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                      <label for="delaisAppros" class="cols-sm-2 control-label">Délais Appro</label>
                      <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="delaisAppros"
                                    id="delaisAppros" placeholder="Quel délais d'approvisionnement ?" />
                            </div>
                        </div>
                    </div>
      <div class="form-group">
        <label for="delaisDeLivraisonArt" class="cols-sm-2 control-label">Délais Livraison</label>
        <div class="cols-sm-10">
                        <div class="input-group"> <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                          <input type="text" class="form-control" name="delaisDeLivraisonArt"
                                    id="delaisDeLivraisonArt" placeholder="Quel délais de livraison ?" />
                        </div>
                      </div>
                    </div>
      <div class="form-group">
        <label for="lienImage" class="cols-sm-2 control-label">Image source</label>
        <div class="cols-sm-10">
                        <div class="input-group"> <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                        aria-hidden="true"></i></span>
                          <input type="text" class="form-control" name="lienImage"
                                    id="lienImage" placeholder="Référence emplacement dans le dossier image..." />
                        </div>
                      </div>
                    </div>
                        <a href="accueilVendeur"><button type="button" class="btn btn-secondary">Fermer</button></a>
                <button type="submit" class="btn btn-primary">Ajouter article</button>
    </form>


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