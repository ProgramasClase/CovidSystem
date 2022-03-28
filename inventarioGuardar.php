<?php
include("conexion.php");
//input del formulario 
$categoria=$_POST["categoria"];
$nomProducto=$_POST["nomProducto"];
$precioProveedor=$_POST["precioProveedor"];
$precioVenta=$_POST["precioVenta"];
$cantidad=$_POST["cantidad"];
$imagen=addslashes(file_get_contents($_FILES['imagen']['tmp_name']));


$instrucction_SQL="INSERT INTO inventario(idProducto,categoria,nomProducto,precioProveedor,precioVenta,cantidad,imagen)VALUES (null,'$categoria','$nomProducto','$precioProveedor','$precioVenta','$cantidad','$imagen')";
$resultado=  mysqli_query($connection, $instrucction_SQL);


$consulta="SELECT *FROM inventario";
$result=  mysqli_query($connection, $consulta);
if(!$resultado){
    echo"No se pudo hacer la consulta";
}
echo "<table border='2'>";
echo "<tr>";
echo "<th><h1>idProducto</th></h1>";
echo "<th><h1>categoria</th></h1>";
echo "<th><h1>nombre producto</th></h1>";
echo "<th><h1>precio proveedor</th></h1>";
echo "<th><h1>precio venta</th></h1>";
echo "<th><h1>cantidad</th></h1>";
echo "<th><h1>imagen</th></h1>";
echo "</tr>";

while($colum=  mysqli_fetch_array($result)){
    echo "<tr>";
    echo "<td><h2>".$colum['idProducto']."</td></h2>";
    echo "<td><h2>".$colum['categoria']."</td></h2>";
    echo "<td><h2>".$colum['nomProducto']."</td></h2>";
    echo "<td><h2>".$colum['precioProveedor']."</td></h2>";
    echo "<td><h2>".$colum['precioVenta']."</td></h2>";
    echo "<td><h2>".$colum['cantidad']."</td></h2>";
    ?>
<td><img src="data:image/jpg;base64,<?php echo base64_encode($colum['imagen']);?>"></td>
<?php
    echo "</tr>";
}
echo "</table>";
mysqli_close($connection);
echo '<a href="pruebaRegistro.html">volver atrás</a>';

?>