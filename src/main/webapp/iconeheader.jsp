<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="wrap-icon-header flex-w flex-r-m h-full">

    <style>
        p {margin-left: 5px;}
    </style>
    <c:if test="${not empty clientConnecte}">
        Vous êtes connecté en tant que <p><strong>${clientConnecte.nom}</strong></p>
        <form action="deconnexion" method="post">
            <button type="submit" class="btn btn-danger" style="margin-left: 15px;">Déconnexion</button>
        </form>
    </c:if>


    <div class="flex-c-m h-full p-r-24">
        <div class="icon-header-item cl2 hov-cl1 trans-04 p-lr-11 js-show-modal-search">
            <i class="zmdi zmdi-search"></i>
        </div>
    </div>


    <c:if test="${not empty clientConnecte}">
        <div class="flex-c-m h-full p-l-18 p-r-25 bor5">
            <div class="icon-header-item cl2 hov-cl1 trans-04 p-lr-11 icon-header-noti js-show-cart" data-notify="*">
                <i class="zmdi zmdi-shopping-cart"></i>
            </div>
        </div>
    </c:if>

</div>

