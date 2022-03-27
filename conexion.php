<?php

$host='localhost';
$user='root';
$pass='123456';
$datab="papeleria";


$connection= mysqli_connect($host,$user,$pass);


//verificar conexion con bd
if(!$connection){
    echo "No se pudo conectar con bd".mysql_error();
}

?>