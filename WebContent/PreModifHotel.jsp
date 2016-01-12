<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

	<link href="css/custem/jquery-ui-1.10.4.custom.css" rel="stylesheet">
		<script src="js/jquery-1.10.2.js"></script>
	<script src="js/jquery-ui-1.10.4.custom.js"></script>
	
	
	
		<script>
	$(function() {
		
		$( "#accordion" ).accordion();
		

		
		var availableTags = [
			"ActionScript",
			"AppleScript",
			"Asp",
			"BASIC",
			"C",
			"C++",
			"Clojure",
			"COBOL",
			"ColdFusion",
			"Erlang",
			"Fortran",
			"Groovy",
			"Haskell",
			"Java",
			"JavaScript",
			"Lisp",
			"Perl",
			"PHP",
			"Python",
			"Ruby",
			"Scala",
			"Scheme"
		];
		$( "#autocomplete" ).autocomplete({
			source: availableTags
		});
		

		
		$( "#button" ).button();
		$( "#radioset" ).buttonset();
		

		
		$( "#tabs" ).tabs();
		

		
		$( "#dialog" ).dialog({
			autoOpen: false,
			width: 600,
		
		});

		// Link to open the dialog
		$( "#dialog-link" ).click(function( event ) {
			$( "#dialog" ).dialog( "open" );
			event.preventDefault();
		});
		

		
		$( "#datepicker" ).datepicker({
			inline: true
		});
		

		
		$( "#slider" ).slider({
			range: true,
			values: [ 17, 67 ]
		});
		

		
		$( "#progressbar" ).progressbar({
			value: 20
		});
		

		// Hover states on the static widgets
		$( "#dialog-link, #icons li" ).hover(
			function() {
				$( this ).addClass( "ui-state-hover" );
			},
			function() {
				$( this ).removeClass( "ui-state-hover" );
			}
		);
	});
	</script>
</head>
<body>




<div class="ui-widget">
	<div class="ui-state-highlight ui-corner-all" style="margin-top: 20px; padding: 0 .7em;">
		<p><span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em;"></span>
		<strong>Formulaire de modification d'Hotel</strong> <c:out value="${l.nom}"></c:out>.</p>

<br>
	     <div id="form_wrapper"  class="form_wrapper">
	            <form action="gestion" method="get" class="login active">
                
                <table>
              
              <tr><td>Nom:</td><td><input type="text" id="nom" name="nom" value='<c:out value="${l.nom}"></c:out>' readonly/> </td></tr>
	
	         <tr><td>Ville:</td><td> <input type="text" id="ville" name="ville" value='<c:out value="${l.ville}"></c:out>' /> </td></tr>
	
              <tr><td>Grade:</td><td><input type="text" id="grade" name="grade" value='<c:out value="${l.grade}"></c:out>' /> </td></tr>
              <tr><td>Nombre des chambres:</td><td><input type="text" id="nbrChambres" name="nbrChambres" value='<c:out value="${l.nbrChambres}"></c:out>' /> </td></tr>
	
	
	
	
            <tr><td>
            
            <%String sup="valider";%>
            <%request.setAttribute("sup",sup);%>
            <input type="submit" name="valider" > </td><td>    <input type="reset" name="annuler" ></td></tr>
            </table>


	</form>
	</div>

	</div>
</div>


</body>
</html>