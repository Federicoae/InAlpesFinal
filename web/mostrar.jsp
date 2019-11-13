<%@page import="controlador.persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>GUARDAR CAMBIOS</title>
        <!--ESTILO DE BOOSTRAP-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <!--ESTILO PROPIO-->
        <link rel="stylesheet" href="estilo.css">
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="tcal.css" />
        <link href="./css/misEstilos.css" rel="stylesheet">
        <script type="text/javascript" src="tcal.js"></script>
    </head>
    <body class="body2">
        <%persona perso = (persona) request.getAttribute("usuario");%>
        <div id="content">
            <form action="modificarPersona" method="post">
                <table class="table1" id="registroDatos">
                    <tr>
                        <td><p>No. Documento</p></td>
                        <td><p>Tipo Documento</p></td>
                        <td><p>Nombre completo</p></td>
                    </tr>
                    <tr>
                        <td><input class="caja" type ="text" name="id" value="<%=perso.getDocumento()%>" id="ced" readonly="readonly"></td>
                        <td><input class="caja" type ="text" name="tdoc" value="<%=perso.getTipoDocumento()%>" id="tipo" readonly="readonly"></td>
                        <td><input class="caja" type ="text" name="nom" value="<%=perso.getNombre()%>" id="name" onkeypress="return soloLetras(event)" ></td>
                    </tr>
                    <tr>
                        <td><p>Apellidos</p></td>
                        <td><p>Correo</p></td>
                        <td><p>Celular<p></td>  
                    </tr>
                    <tr>
                        <td><input class="caja" type ="text" name="ape" value="<%=perso.getApellido()%>" id="lastname" onkeypress="return soloLetras(event)"></td>
                        <td><input class="caja" type ="text" name="cor" value="<%=perso.getCorreo()%>" id="mail"></td>
                        <td><input class="caja" type ="text" name="cel" value="<%=perso.getCelular()%>" id="tel" onkeypress="return soloNumeros(event)"></td>
                    </tr>
                    <tr>
                        <td><p>Contraseña</p></td>
                        <td colspan="2"><input class="caja" type="text" name="pass" value="<%=perso.getContra()%>" class="tcal" id="pass"/></td>    
                    </tr>
                    <tr>
                        <td colspan="3">
                            <input class="button" type="submit" id="submit" value="GUARDAR CAMBIOS"/>
                        </td>
                    </tr>
                </table>
            </form>

        </div>
        <!-- jQuery CDN - Slim version (=without AJAX) -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <!-- Popper.JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <!-- Bootstrap JS -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>  
        <script type="text/javascript" src="validar.js"></script>
    </body>
</html>
