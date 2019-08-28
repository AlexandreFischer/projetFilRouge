<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Panier</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
        <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/monStyle.css">
        <!--===============================================================================================-->

        <!-- Pour l'affichage pup-up des conditions générales lors du click sur "conditions générales" (créer un compte) -->
        <link rel="stylesheet" href="css/scroll_ConditionsUtilisation.css">
        <script type="text/javascript" src="texte_conditions_generales_fr.txt"></script>  <!-- contenu du texte qui s'affichera dans le modal-body -->
        <!--===============================================================================================-->

    </head>

    <body class="animsition">

        <!-- Header -->

        <header class="header-v2">
            <!-- Header desktop -->
            <div class="container-menu-desktop trans-03">
                <div class="wrap-menu-desktop">
                    <nav class="limiter-menu-desktop p-l-45">
                        <!-- Logo desktop -->
                        <a href="accueil" class="logo"><img src="images/logo_javazon.png" alt="IMG-LOGO"></a>
                        <!-- Menu desktop -->
                        <div class="menu-desktop">
                            <ul class="main-menu">
                                <li><a href="accueil">Accueil</a></li>
                                <li><a href="catalogue">Catalogue</a></li>
                                <c:if test="${empty clientConnecte}"><li><a data-toggle="modal" href="#modalRegister">Créer son compte</a></li></c:if>
                                <c:if test="${empty clientConnecte}"><li><a data-toggle="modal" href="#modalLogin">S'identifier</a></li></c:if>
                                <li><a href="contact">Contact</a></li>
                            </ul>
                        </div>

                        <!--- Modal Inscription --->
                        <%@include file="modalInscription.jsp" %>
                        <!------------------------->

                        <!--- Modal Conditions générales --->
                        <%@include file="conditionsGenerales.jsp" %>
                        <!---------------------------------->

                        <!--- Modal Login --->
                        <%@include file="modalLogin.jsp" %>
                        <!------------------->

                        <!--- Icon header --->
                        <%@include file="iconeheader.jsp" %>
                        <!------------------->
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
                        <div class="icon-header-item cl2 hov-cl1 trans-04 p-lr-11 js-show-modal-search"><i
                                class="zmdi zmdi-search"></i></div>
                    </div>
                    <div class="flex-c-m h-full p-lr-10 bor5">
                        <div class="icon-header-item cl2 hov-cl1 trans-04 p-lr-11 icon-header-noti js-show-cart"
                             data-notify="3"><i class="zmdi zmdi-shopping-cart"></i></div>
                    </div>
                </div>
                <!-- Button show menu -->
                <div class="btn-show-menu-mobile hamburger hamburger--squeeze"><span class="hamburger-box"><span
                            class="hamburger-inner"></span></span></div>
            </div>

            <!-- Menu Mobile -->
            <div class="menu-mobile">
                <ul class="main-menu-m">
                    <li><a href="index.html">Accueil</a></li>
                    <li><a href="produits.html">Catalogue</a></li>
                    <li><a href="inscriptionMobile.html">Créer son compte</a></li>
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
                                    1 x 19.00€
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
                                    1 x 39.00€
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
                                    1 x 17.00€
                                </span>
                            </div>
                        </li>
                    </ul>

                    <div class="w-full">
                        <div class="header-cart-total w-full p-tb-40 couleurElementCart">
                            Total: 75.00€
                        </div>

                        <div class="header-cart-buttons flex-w w-full">
                            <a href="panier"
                               class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10">
                                Voir commande
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- Panier -->
        <form class="bg0 p-t-75 p-b-85">
            <div class="container">
                <div class="row">
                    <div class="col-lg-10 col-xl-7 m-lr-auto m-b-50">
                        <div class="m-l-25 m-r--38 m-lr-0-xl">
                            <div class="wrap-table-shopping-cart">
                                <table class="table-shopping-cart">
                                    <tr class="table_head">
                                        <th class="column-1">Produit</th>
                                        <th class="column-2"></th>
                                        <th class="column-3">Prix</th>
                                        <th class="column-4" style="text-align: center;">Quantitée</th>
                                        <th class="column-5">Total</th>
                                        <th class="column-6"></th>
                                    </tr>

                                    <tr class="table_row">
                                        <td class="column-1">
                                            <div class="how-itemcart1">
                                                <img src="images/item-cart-04.jpg" alt="IMG">
                                            </div>
                                        </td>
                                        <td class="column-2">Fresh Strawberries</td>
                                        <td class="column-3">36.00 €</td>
                                        <td class="column-4">
                                            <div class="wrap-num-product flex-w m-l-auto m-r-0">
                                                <div class="btn-num-product-down cl8 hov-btn3 trans-04 flex-c-m">
                                                    <i class="fs-16 zmdi zmdi-minus"></i>
                                                </div>

                                                <input class="mtext-104 cl3 txt-center num-product" type="number"
                                                       name="num-product1" value="1">

                                                <div class="btn-num-product-up cl8 hov-btn3 trans-04 flex-c-m">
                                                    <i class="fs-16 zmdi zmdi-plus"></i>
                                                </div>
                                            </div>
                                        </td>
                                        <td class="column-5">36.00 €</td>
                                        <td class="column-6" style="padding-right: 20px;"><button type="button" class="btn btn-danger">Supprimer</button></td>
                                    </tr>

                                    <tr class="table_row">
                                        <td class="column-1">
                                            <div class="how-itemcart1">
                                                <img src="images/item-cart-05.jpg" alt="IMG">
                                            </div>
                                        </td>
                                        <td class="column-2">Lightweight Jacket</td>
                                        <td class="column-3">16.00 €</td>
                                        <td class="column-4">
                                            <div class="wrap-num-product flex-w m-l-auto m-r-0">
                                                <div class="btn-num-product-down cl8 hov-btn3 trans-04 flex-c-m">
                                                    <i class="fs-16 zmdi zmdi-minus"></i>
                                                </div>

                                                <input class="mtext-104 cl3 txt-center num-product" type="number"
                                                       name="num-product2" value="1">

                                                <div class="btn-num-product-up cl8 hov-btn3 trans-04 flex-c-m">
                                                    <i class="fs-16 zmdi zmdi-plus"></i>
                                                </div>
                                            </div>
                                        </td>
                                        <td class="column-5">16.00 €</td>
                                        <td class="column-6"><button type="button" class="btn btn-danger">Supprimer</button></td>
                                    </tr>
                                </table>
                            </div>

                            <div class="flex-w flex-sb-m bor15 p-t-18 p-b-15 p-lr-40 p-lr-15-sm">
                                <div class="flex-w flex-m m-r-20 m-tb-5">
                                    <input class="stext-104 cl2 plh4 size-117 bor13 p-lr-20 m-r-10 m-tb-5" type="text"
                                           name="coupon" placeholder="Code réduction">

                                    <div
                                        class="flex-c-m stext-101 cl2 size-118 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-5">
                                        Appliquer réduction
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-sm-10 col-lg-7 col-xl-5 m-lr-auto m-b-50">
                        <div class="bor10 p-lr-40 p-t-30 p-b-40 m-l-63 m-r-40 m-lr-0-xl p-lr-15-sm">
                            <h4 class="mtext-109 cl2 p-b-30"> TOTAL COMMANDE</h4>

                            <div class="flex-w flex-t bor12 p-t-15 p-b-30">
                                <div class="flex-w">
                                    <div
                                        class="flex-c-m stext-101 cl2 size-115 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer">
                                        MAJ TOTAL </div>
                                </div>
                            </div>

                            <div class="flex-w flex-t p-t-27 p-b-33">
                                <div class="size-208">
                                    <span class="mtext-101 cl2">
                                        Total:
                                    </span>
                                </div>

                                <div class="size-209 p-t-1"><span class="mtext-110 cl2">79.65 €</span></div>
                            </div>

                            <button class="flex-c-m stext-101 cl0 size-116 bg3 bor14 hov-btn3 p-lr-15 trans-04 pointer" onclick="paiement()"> PROCEDER AU PAIEMENT</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>

        <!-- Footer -->
        <%@include file="footer.jsp" %>
        <!------------>

        <!-- Back to top -->
        <div class="btn-back-to-top" id="myBtn">
            <span class="symbol-btn-back-to-top">
                <i class="zmdi zmdi-chevron-up"></i>
            </span>
        </div>

        <!--===============================================================================================-->
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script>
                                function paiement() {
                                    alert('Paiement effectué !');
                                    window.location.href = "index.html";

                                }
        </script>
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
        <script src="vendor/sweetalert/sweetalert.min.js"></script>
        <script>
                                $('.js-addwish-b2, .js-addwish-detail').on('click', function (e) {
                                    e.preventDefault();
                                });

                                /*---------------------------------------------*/

                                $('.js-addcart-detail').each(function () {
                                    var nameProduct = $(this).parent().parent().parent().parent().find('.js-name-detail').html();
                                    $(this).on('click', function () {
                                        swal(nameProduct, "est ajouté à  la commande !", "success");
                                    });
                                });
        </script>
        <!--===============================================================================================-->
        <script src="vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
        <!--===============================================================================================-->

        <!--===============================================================================================-->
        <script src="js/main.js"></script>

    </body>

</html>