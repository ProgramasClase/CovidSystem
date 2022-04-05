<?php

$host='localhost';
$user='root';
$pass='';
$datab="papeleria";

$connection= mysqli_connect($host,$user,$pass);
//verificar conexion con bd
if(!$connection){
    echo "No se pudo conectar con bd".mysql_error();
}

$db = mysqli_select_db($connection, $datab);
        if(!$db){
            echo "no se ha encontrado la tabla";
        }
?>