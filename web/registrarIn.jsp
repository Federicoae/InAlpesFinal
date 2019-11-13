<!DOCTYPE html>
<html lang="en">
<head>
<title>Inmueble</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Bluesky template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./styles/misEstilos.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">
</head>
<body>

<div class="super_container">

	<!-- Header -->

	<header class="header">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="header_content d-flex flex-row align-items-center justify-content-start">
						<div class="logo">
							<a href="#"><img src="https://jwh.uniandes.edu.co/wp-content/uploads/2016/09/logos-01-392x178.png" alt=""></a>
						</div>
						<nav class="main_nav">
							<ul>
								<li class="active"><a href="index.html">Inicio</a></li>
								<li><a href="about.html">Acerca de nosotros</a></li>
								<li><a><form action="listarInmuebles" method="post"><button class="butto1" type="submit">Inmuebles</button></form></a></li>
							</ul>
						</nav>
						<div class="phone_num ml-auto">
							<div class="phone_num_inner">
								<a href="./registrar.jsp">Perfil de Usuario</a>
							</div>
                                                        
						</div>
                                            <div class="phone_num ml-auto">
                                                        <div class="phone_num_inner">
								<a href="./registrarIn.jsp">Registrar Inmueble</a>
							</div>
                                                </div>
						<div class="hamburger ml-auto"><i class="fa fa-bars" aria-hidden="true"></i></div>
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- Menu -->

	<div class="menu trans_500">
		<div class="menu_content d-flex flex-column align-items-center justify-content-center text-center">
			<div class="menu_close_container"><div class="menu_close"></div></div>
			<div class="logo menu_logo">
				<a href="#">
					<div class="logo_container d-flex flex-row align-items-start justify-content-start">
						<div class="logo_image"><div><img src="images/logo.png" alt=""></div></div>
					</div>
				</a>
			</div>
			<ul>
				<li class="menu_item"><a href="index.html">Home</a></li>
				<li class="menu_item"><a href="about.html">About us</a></li>
				<li class="menu_item"><a href="#">Speakers</a></li>
				<li class="menu_item"><a href="#">Tickets</a></li>
				<li class="menu_item"><a href="news.html">News</a></li>
				<li class="menu_item"><a href="contact.html">Contact</a></li>
			</ul>
		</div>
		<div class="menu_phone"><span>call us: </span>652 345 3222 11</div>
	</div>
	
	<!-- Home -->

	<div class="home">

		<!-- Home Slider -->
		<div class="home_slider_container">
			<div class="owl-carousel owl-theme home_slider">
				
				<!-- Slide -->
				<div class="owl-item">
					<div class="home_slider_background" style="background-image:url(images/home_slider_1.jpg)"></div>
					<div class="slide_container">
						<div class="container">
							<div class="row">
								<div class="col">
									<div class="slide_content">										
										<div class="home_title">Creación de Inmueble</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Testimonials -->

	<div class="testimonials">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="section_title">Bienvenido a InAlpes</div>
                                        <div class="section_subtitle">Vincula tu inmueble</div>
<div class="testimonials">                                    
    <section class="section visit-section" id="next-section">
     <form action="registrarInmueble" method="post">
            <table class="table1"><tr><td>
            <div >
                <p class="form"><select class="button" name="ubi" id="ubi">
                    <option>Seleccionar ciudad</option>
                    <option value="1">Bogota</option> 
                    <option value="2">Cali</option> 
                    <option value="3">Medellin</option>
                    </optgroup></select><select class="button" name="con" id="con">
                    <option>Tipo de oferta</option>
                    <option value="1">Venta</option> 
                    <option value="2">Arriendo</option> 
                    <option value="3">Venta/Arriendo</option>
                    </optgroup></select>DIRECCION:<input class="button" type="text" name="dir" id="dir"></p></td></tr>
                    <tr><td><p class="form">DESCRIPCION:<input class="button" type="text" name="desc" id="desc">
                    PRECIO:<input class="button" type="text" name="pre" id="pre"></p></td></tr>
                <tr><td><input class="button" type="submit" id="submit" value="REGISTRAR"/></p></tr></td>
                </table>
            </div> 
        </form>
    </section>
    
    <div class="testimonials">
                            <form action="listarInmuebles" method="post"><button class="button" type="submit"><a>Lista de Inmuebles</a></button></form>
                            <a href="./eliminarIn.jsp"><button class="button" >Eliminar</button></a>
                            <a href="./modificarIn.jsp"><button class="button" >Modificar</button></a>
                                </div>
    <!-- END section -->
 
</div>                                    
					
				</div>
			</div>
			<div class="row testimonials_row">
			
			</div>
		</div>
	</div>

	<!-- Footer -->

	<footer class="footer">
		<div class="footer_main">
			<div class="container">
				<div class="row">
					<div class="col-lg-3">
						<div class="footer_logo"><a href="#"><img src="https://jwh.uniandes.edu.co/wp-content/uploads/2016/09/logos-01-392x178.png" alt=""></a></div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer_bar">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="footer_bar_content d-flex flex-row align-items-center justify-content-start">
							<div class="cr"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
</div>
							<div class="footer_nav">
								<ul>
									<li><a href="index.html">Home</a></li>
									<li><a href="#">About us</a></li>
									<li><a href="properties.html">Properties</a></li>
									<li><a href="news.html">News</a></li>
									<li><a href="contact.html">Contact</a></li>
								</ul>
							</div>
							<div class="footer_phone ml-auto"><span>call us: </span>652 345 3222 11</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
</div>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="styles/bootstrap4/popper.js"></script>
<script src="styles/bootstrap4/bootstrap.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="plugins/parallax-js-master/parallax.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>