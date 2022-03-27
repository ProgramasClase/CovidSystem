<?php include ("conexion.php")?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="carritoCompras.css"/> 
    </head>

    <body>
        <?php 
        $db = mysqli_select_db($connection, $datab);
        if(!$db){
            echo "no se ha encontrado la tabla";
        }
        $busqueda=  mysqli_query($connection,"SELECT * FROM inventario");
        $numero=mysqli_num_rows($busqueda);
        ?>
        <div class="menu">Menu</div>
        <div class="lateral">Laterial </div>
        <div class="cuerpo">
            <?php
            if(isset($_POST['enviar'])){
                $bus=mysqli_query($connection,"SELECT * FROM pedido_datos");
            if(!$bus){
                echo "No se registro venta";
            }else{
                while ($resul=mysqli_fetch_array($bus)){
                    $idpedidoDatos=$resul['idpedido_Datos']+1;
                    $idReferencia=$resul['idReferencia']+1;
                }
                $cantidad=$_POST["cantidad"];
                $idProducto=$_POST["idProducto"];
                $nomProducto=$_POST["nombre"];
                $precio=$_POST["precio"];
                $total=$precio*$cantidad;
                $fecha=date('Y-m-d h:i:s ',time());
                $instrucction_SQL="INSERT INTO pedido_datos(idpedido_Datos,idReferencia,cantidad,idProducto,nomProducto,precio,total,fecha)VALUES ('$idpedidoDatos','$idReferencia','$cantidad','$idProducto','$nomProducto','$precio','$total','$fecha')";
                $resultado=  mysqli_query($connection, $instrucction_SQL);
                echo 'agregado al carrito';
            }
            
            }
            ?>
            <h5>Resultados (<?php echo $numero?>)</h5>
            <?php while ($resultado =  mysqli_fetch_array($busqueda)){ ?>
            <div class="cuadro">
                $<?php echo $resultado['precioVenta'];?>
                <img class="imagen" src="data:image/jpg;base64,<?php echo base64_encode($resultado['imagen']);?>">
                
                <form id="formulario" name="formulario" method="POST" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>">
                <div class='descripcion'>descripcion
                    <input name="precio" type="hidden" id="precio" value="<?php echo $resultado['precioVenta'];?>"/>
                    <input name="idProducto" type="hidden" id="idProducto" value="<?php echo $resultado['idProducto'];?>"/>
                    <?php echo $resultado['nomProducto'];?><input name="nombre" type="hidden" id="nombre" value="<?php echo $resultado['nomProducto'];?>"/><br>
                    <?php echo $resultado['categoria'];?><input name="categoria" type="hidden" id="categoria" value="<?php echo $resultado['categoria'];?>"/><br>
                    cantidad:<input value="1" type="number" min="0" max="100" name="cantidad" id="cantidad"   /><br>
                    <input type="submit" class="enviar" name="enviar" value="Añadir a carrito"/>
                    
                </div>
            </form>
            </div>
            <?php }?>
            
        </div>

    </body>
    <?php mysqli_close($connection); ?>
</html>
