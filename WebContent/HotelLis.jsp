<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


 <style type="text/css">    
           
           table {
 border-width:1px; 
 border-style:solid; 
 border-color:blue;
 width:60%;
 
 }


            
        </style>

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
	
	
<script type="text/javascript">
function envoie(formulaire) {
if ( (document.getElementById('nom').value.length>0)
&&(document.getElementById('ville').value.length>0)
&&(document.getElementById('nbChambres').value.length>0)

 ){
formulaire.submit();
} else
alert('IMPOSSIBLE D\' ENVOER LE FORMULAIRE, VOUS AVEZ OUBLIEZ DE REMPLIRE DES CHAMPS OBLIGATOIRS');
}

</script>
</head>
<body>

<a href="#" id="dialog-link" > <button>new hotel</button></a>
	<hr>



      <div class="cart_table">
	<table class="data-table cart-table"  width="100%" id="results" border="1">
        <thead  >
            <tr>
           
                <th><font size="3" color="#0099cc">Nom Hotel</font></th>
                <th><font size="3" color="#0099cc">Ville Hotel</font></th>
                <th><font size="3" color="#0099cc">Grade </font></th>
                 <th><font size="3" color="#0099cc">Nombre des chambres</font></th>
              <th><font size="3" color="#0099cc">modifier</font></th>
              <th><font size="3" color="#0099cc">supprimer</font></th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="hotels" items="${l}">
<tr>
<td><c:out value="${hotels.nom}"/></td>
<td><c:out value="${hotels.ville}"/></td>
<td><c:out value="${hotels.grade}"/></td>
<td><c:out value="${hotels.nbrChambres}"/></td>
<%String sup="m";
%>
<td><a href="preModif?id=${hotels.nom}<%request.setAttribute("sup",sup);%>" ><span class="ui-icon ui-icon-wrench"></span></a></td>
<td><a href="SuppHotel?id=${hotels.nom}"><span class="ui-icon ui-icon-trash"></span></a></td>

</tr>
</c:forEach>
        </tbody>
</table>
</div>
		
	
		
		
	
	



	<div id="dialog" title="New Hotel">
	
	
	     <div id="form_wrapper"  class="form_wrapper">
	            <form action="gestion" method="post" class="login active">
                 <br>
                <table>
              
                 <tr><td> <label>nom:</label></td><td><input type="text" size=30 id="nom" name="nom" />
                 
                 </td></tr>
	
	         <tr><td> <label>ville:</label></td><td> <input type="text" size=30  id="ville "name="ville"  >
	         
	         </td></tr>
	
             <tr><td>  <label>grade:</label></td><td><select name="grade">
                    <option value="1" selected="selected">1</option>
                    <option value="2" >2</option>
                    <option value="3" >3</option>
                    <option value="4" >4</option>
                    <option value="5" >5</option></select></td></tr>

	        <tr><td> <label>Nombre des chambres:</label></td><td><input type="text" size=30 name="nbrch" id="nbrchambres" />
	        
	          <span>${validateur.erreurs['nbrChambres']}</span>
	        </td></tr>
	
            <tr><td><input type="submit" name="valider" onClick="envoie(this.form)" > </td><td>    <input type="reset" name="annuler" ></td></tr>
            </table>


	</form>
	</div>

</div>


<script type="text/javascript"><!--
        var pager = new Pager('results', 5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script>
</body>
</html>