<?php include ("conexion.php")?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="carritoCompras.css"/> 
    </head>

    <body>
        
        <div class="menu">Menu</div>
        <!--Menu para las categorias, dependiendo de la seleccione es la que va a funcionar-->
        <div class="lateral"> 
            
            <form id="formulario" name="formulario" method="POST" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>">
                <select name="cat" id="cat" class="cat">
                    <option value="general" name="general" id="general" >Todos los productos</option>
                    <option value="Arte y Manualidades" name="arte" id="arte" >Arte y manualidades</option>
                    <option value="Articulos escolares" name="escolares" id="escolares">Articulos escolares</option>
                    <option value="Oficina" name="Oficina" id="Oficina">Oficina</option>
                    <option value="Regalos y fiesta" name="regalos" id="regalos">Regalos y fiesta</option>
                </select>
                <input type="submit" class="categoria" name="categoria" value="Buscar categoria"/>
            </form>
            <?php
                $busqueda=  mysqli_query($connection,"SELECT * FROM inventario ");
                $numero=mysqli_num_rows($busqueda);
                if(isset($_REQUEST['cat'])){
                    
                    if($_POST['cat']=="general"){
                        $busqueda=  mysqli_query($connection,"SELECT * FROM inventario");
                        $numero=mysqli_num_rows($busqueda);
                        echo $_POST['cat'];
                    }else{
                        $busqueda=  mysqli_query($connection,"SELECT * FROM inventario WHERE categoria='$_POST[cat]'");
                        $numero=mysqli_num_rows($busqueda);
                        echo $_POST['cat'];
                    }
                }else{
                    $busqueda=  mysqli_query($connection,"SELECT * FROM inventario ");
                    $numero=mysqli_num_rows($busqueda);
                    

                    
                }
            ?>
        </div>
        <div class="cuerpo">
            <!--Envia los datos de la compra a la base de datos y si se envia correctamente imprimie agregado al carrito-->
            <?php
            if(isset($_POST['enviar'])){
                $bus=mysqli_query($connection,"SELECT * FROM factura");
            if(!$bus){
                echo "No se registro venta";
            }else{
                while ($resul=mysqli_fetch_array($bus)){
                    $idFactura=$resul['idFactura']+1;
                }
                $nomProducto=$_POST["nombre"];
                
                $idCliente=1;
                $idProducto=$_POST["idProducto"];
                $cantidad=$_POST["cantidad"];
                $precio=$_POST["precio"];
                $total=$precio*$cantidad;
                $fecha=date('Y-m-d h:i:s ',time());
                $instrucction_SQL="INSERT INTO factura(idFactura,idCliente,idProducto,cantidad,precio,total,fecha)VALUES ('$idFactura','$idCliente','$idProducto','$cantidad','$precio','$total','$fecha')";
                $resultado=  mysqli_query($connection, $instrucction_SQL);
                echo 'agregado al carrito '. $nomProducto;
            }
            }
            ?>
            
            <!--Impreme los objetos del inventario con un ciclo while-->
            <h5>Resultados (<?php echo $numero?>)</h5>
            <?php while ($resultado =  mysqli_fetch_array($busqueda)){ ?>
            <div class="cuadro">
                $<?php echo $resultado['precioVenta'];?>
                <img class="imagen" src="data:image/jpg;base64,<?php echo base64_encode($resultado['imagen']);?>">
                
                <form id="formulario" name="formulario" method="POST" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>">
                <div class='descripcion'>
                    <input name="precio" type="hidden" id="precio" value="<?php echo $resultado['precioVenta'];?>"/>
                    <input name="idProducto" type="hidden" id="idProducto" value="<?php echo $resultado['idProducto'];?>"/>
                    <?php echo $resultado['nomProducto'];?><input name="nombre" type="hidden" id="nombre" value="<?php echo $resultado['nomProducto'];?>"/><br>
                    <input name="categoria" type="hidden" id="categoria" value="<?php echo $resultado['categoria'];?>"/><br>
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
