<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="modal fade" id="modalRegister" tabindex="-1" role="dialog"
     aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog " role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Créer mon compte</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>

            <div class="modal-body">
                <form role="form" method="POST" action="inscription">
                    <div class="form-group">
                        <label for="name" class="cols-sm-2 control-label">Nom</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-user fa"
                                                                   aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="nom" id="name"
                                       placeholder="Entrer votre nom" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="email" class="cols-sm-2 control-label">Email</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-envelope fa"
                                                                   aria-hidden="true"></i></span>
                                <input type="text" class="form-control" name="email" id="email"
                                       placeholder="Entrer votre Email" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password" class="cols-sm-2 control-label">Mot de passe</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                                                   aria-hidden="true"></i></span>
                                <input type="password" class="form-control" name="password"
                                       id="password" placeholder="Entrer un mot de passe" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="confirm" class="cols-sm-2 control-label">Confirmer le mot de
                            passe</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock fa-lg"
                                                                   aria-hidden="true"></i></span>
                                <input type="password" class="form-control" name="confirmPassword"
                                       id="confirm" placeholder="Confirmer votre mot de passe" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <input type="checkbox" id="checkboxRegister" name="checkbox" value="checked">
                        <label for="checkboxRegister" class="white-text form-check-label">Accepter les
                            <a href="#" class="green-text font-weight-bold" data-toggle="modal"  data-target="#myModal"> Conditions générales</a>
                        </label>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                        <button type="submit" class="btn btn-primary">Créer compte</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

