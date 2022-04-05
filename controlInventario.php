<?php include ("conexion.php")?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="Control.css"/> 
    </head>
    <body>
        
        <div class="menu">Menu</div>
       
        <div class="lateral">LATERAL </div>
        <div class="cuerpo">CUERPO
        <?php
            $consulta="SELECT *FROM inventario";
            $result=  mysqli_query($connection, $consulta);
            
            if(isset($_REQUEST["Enviar"])){
                $categoria=$_POST["categoria"];
                $nomProducto=$_POST["nomProducto"];
                $precioProveedor=$_POST["precioProveedor"];
                $precioVenta=$_POST["precioVenta"];
                $cantidad=$_POST["cantidad"];
                $imagen=addslashes(file_get_contents($_FILES['imagen']['tmp_name']));


                $instrucction_SQL="INSERT INTO inventario(idProducto,categoria,nomProducto,precioProveedor,precioVenta,cantidad,imagen)VALUES (null,'$categoria','$nomProducto','$precioProveedor','$precioVenta','$cantidad','$imagen')";
                $resultado=  mysqli_query($connection, $instrucction_SQL);

            }
            
            
            if(isset($_REQUEST["btnBuscar"])){
                
                $buscar= mysqli_query($connection,"SELECT *FROM inventario WHERE idProducto='$_POST[opc]'");
                while($b=  mysqli_fetch_array($buscar)){
                    
                ?>
                <form action='"<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>"' name='registro' method='POST'  enctype='multipart/form-data'>
                 <?php   
                    echo "idProducto<input type='text' REQUIRED name='idProducto' id='idProducto' value='".$b['idProducto']."'";
                    echo "categoria<input type='text' REQUIRED name='categoria' id='categoria' value='".$b['categoria']."'/>";
                    echo "nombre del producto<input type='text' REQUIRED  name='nomProducto' id='nomProducto' value='".$b['nomProducto']."' /><br>";
                    echo "precio proveedor<input type='text' REQUIRED name='precioProveedor' id='precioProveedor' value='".$b['precioProveedor']."'/>";
                    echo "precio venta <input type='text' REQUIRED name='precioVenta' id='precioVenta' value='".$b['precioVenta']."'/>";
                    echo "cantidad<input type='text' REQUIRED name='cantidad' id='cantidad' value='".$b['cantidad']."'/><br>";
                    echo "imagen<input type='file' name='imagen' id='imagen' />";
                    echo "<input type='submit'  name='Enviar' id='Enviar' value='hacer registro'/>";
                    echo "<input type='submit'  name='actualizar' id='actualizar'value='actualizar registro'/>";
                    echo "<input type='submit'  name='eliminar' id='eliminar' value='actualizar registro'/>";
                echo "</form>";
                }
            }else{
                ?>
                <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" name="" method="POST"  enctype="multipart/form-data">
                    idProducto<input type="text" REQUIRED name="idProducto" id="idProducto" >
                    categoria<input type="text" REQUIRED name="categoria" id="categoria" >
                    nombre del producto<input type="text" REQUIRED  name="nomProducto" id="nomProducto"  ><br>
                    precio proveedor<input type="text" REQUIRED name="precioProveedor" id="precioProveedor"  >
                    precio venta <input type="text" REQUIRED name="precioVenta" id="precioVenta"  >
                    cantidad<input type="text" REQUIRED name="cantidad" id="cantidad"  ><br>
                    imagen<input type="file" name="imagen" id="imagen"><br>
                    <input type="submit"  name="Enviar" id="enviar" value='hacer registro'>
                    <input type='submit'  name='actualizar' id='actualizar'value='actualizar registro'/>
                    <input type='submit'  name='eliminar' id='eliminar' value='actualizar registro'/>
                </form>
                    
            <?php } ?>
        
        
        <form id="bus" name="bus" method="POST" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>">
           <input type="submit" class="btnBuscar" name="btnBuscar" value="Buscar elemento"/>
            <?php
            
                echo "<table border='2' class='tabla'>";
                    echo "<tr>";
                    echo "<th><h2>idProducto</th></h2>";
                    echo "<th><h2>categoria</th></h2>";
                    echo "<th><h2>nombre producto</th></h2>";
                    echo "<th><h2>precio proveedor</th></h2>";
                    echo "<th><h2>precio venta</th></h2>";
                    echo "<th><h2>cantidad</th></h2>";
                    echo "<th><h2>imagen</th></h2>";
                echo "</tr>";

                while($colum=  mysqli_fetch_array($result)){
                    echo "<tr onClick='seleccionar(this,".$colum['idProducto'].")'>";
                        echo "<td>".$colum['idProducto']."<input type='radio' name='opc' value='".$colum['idProducto']."' id='id".$colum['idProducto']."'/></td>";
                        echo "<td>".$colum['categoria']."</td>";
                        echo "<td>".$colum['nomProducto']."</td>";
                        echo "<td>".$colum['precioProveedor']."</td>";
                        echo "<td>".$colum['precioVenta']."</td>";
                    echo "<td>".$colum['cantidad']."</td>";
                    ?>
                <td><img src="data:image/jpg;base64,<?php echo base64_encode($colum['imagen']);?>"></td>
                <?php
                    echo "</tr>";
                }
                echo "</table>";          
             ?> 
                 
        </form>
        </div>

    </body>
    <?php
    if(isset($_REQUEST["Enviar"])){
                $categoria=$_POST["categoria"];
                $nomProducto=$_POST["nomProducto"];
                $precioProveedor=$_POST["precioProveedor"];
                $precioVenta=$_POST["precioVenta"];
                $cantidad=$_POST["cantidad"];
                $imagen=addslashes(file_get_contents($_FILES['imagen']['tmp_name']));


                $instrucction_SQL="INSERT INTO inventario(idProducto,categoria,nomProducto,precioProveedor,precioVenta,cantidad,imagen)VALUES (null,'$categoria','$nomProducto','$precioProveedor','$precioVenta','$cantidad','$imagen')";
                $resultado=  mysqli_query($connection, $instrucction_SQL);

            }
    if(isset($_REQUEST["actualizar"])){
                $id=$_POST["idProducto"];
                $categoria=$_POST["categoria"];
                $nomProducto=$_POST["nomProducto"];
                $precioProveedor=$_POST["precioProveedor"];
                $precioVenta=$_POST["precioVenta"];
                $cantidad=$_POST["cantidad"];
                        
                $instrucction_SQL="UPDATE inventario SET categoria = '$categoria', nomProducto = '$nomProducto', precioProveedor='$precioProveedor', precioVenta='$precioVenta', cantidad='$cantidad'   WHERE idProducto='$id' ";
                $actualizacion=  mysqli_query($connection, $instrucction_SQL);
            }
    if (isset($_REQUEST["eliminar"])){
                $id=$_POST["idProducto"];
                $instrucction_SQL="DELETE FROM inventario  WHERE idProducto='$id' ";
                $actualizacion=  mysqli_query($connection, $instrucction_SQL);
    }
            
            
 mysqli_close($connection); ?>
</html>
