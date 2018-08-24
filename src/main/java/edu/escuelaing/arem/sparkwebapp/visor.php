<!DOCTYPE html>
<html>
	<head>
		<?php
			$lista = $_POST["lista"];
			
			$archivo =fopen("sparkwebapp/$prueba.txt","w");
			fwrite($archivo,$lista);
			
			
		?>
	</head>
        <body>
            <h2>sus datos se cargaron</h2>
        </body>
	
<body>
	