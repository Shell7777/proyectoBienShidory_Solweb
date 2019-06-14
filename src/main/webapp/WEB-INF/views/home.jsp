<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Iniciar Session</title>
	<link href="/resources/css/boostrap.css" rel="stylesheet">
	<script src="/resources/js/boostrap.js"></script>
</head>
<body>

    <div class="container body-content"> 
        <br /> 
        <br /> 
        <h1>Ingreso a al aplicativo</h1>

        <form action="login.jsp" method="post">

            <div class="form-group">
                <label> Ingrese su usuario </label>
                <input type="text" class="form-control" placeholder="User" name="@UserAttrInfo.UserObjNames.USER" value="@user.User">
                <label class="alert-danger"> </label>
            </div>

            <div class="form-group">
                <label >Password</label>
                <input type="password" name="@UserAttrInfo.UserObjNames.PASS" class="form-control" placeholder="Password">
            </div>

            <label class="alert-danger">  </label> <br />

            <button type="submit" class="btn btn-default">Iniciar sesión</button>

        </form>

    </div>

<P>  The time on the server is ${serverTime}. </P>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js">
</body>
</html>
