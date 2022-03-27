<?php
include("conexion.php");
$db = mysqli_select_db($connection, $datab);
if(!$db){
            echo "no se ha encontrado la tabla";
        }
$bus=mysqli_query($connection,"SELECT * FROM pedido_datos");

if(!$bus){
    echo "No se pudo hacer la consulta";
}else{
    while ($resul=mysqli_fetch_array($bus)){
        $idpedidoDatos=$resul['idpedido_Datos']+1;
        $idReferencia=$resul['idReferencia']+1;
    }
    $cantidad=$_POST["cantidad"];
    $idProducto=$_POST["idProducto"];
    $idNombreProducto=$_POST["nombre"];
    $precio=$_POST["precio"];
    $total=$precio*$cantidad;
    $fecha=date('Y-m-d h:i ',time());
    echo $idpedidoDatos.",".$idReferencia."<br>";
    echo "nombre del producto:".$idNombreProducto."<br>";
    echo "precio:".$precio."<br>";
    echo "total:"."precio".$total."<br>";
    echo $fecha;
}
mysqli_close($connection);
    

?>