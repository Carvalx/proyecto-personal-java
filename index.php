<?php
function sumar($a, $b) {return $a + $b;}
function restar($a, $b) {return $a - $b;}
function multiplicar($a, $b) {return $a * $b;}
function dividir($a, $b) {return $a / $b;}

$resultado = null;

if($_SERVER['REQUEST_METHOD']=="POST"){
    $numero1 = floatval($_POST["numero1"]);
    $numero2 = floatval($_POST["numero2"]);
    $operacion = $_POST["operacion"];

    if($operacion == "dividir" && $numero2 == 0) {
        $resultado = "Error: no se puede dividir entre 0";
    }else{
        $resultado = $operacion($numero1, $numero2);
    }
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>
<body>
    <h1>Calculadora</h1>

    <form action="" method="POST">
        <input type="number" name="numero1" placeholder="Primer numero">
        <input type="number" name="numero2" placeholder="Segundo numero">

        <select name="operacion">
            <option value="sumar">Sumar</option>
            <option value="restar">Restar</option>
            <option value="multiplicar">Multiplicar</option>
            <option value="dividir">Dividir</option>
        </select>

        <button type="submit">Calcular</button>
    </form>

    <?php if($resultado !== null): ?>
        <h2>Resultado: <?= $resultado ?></h2>   
    <?php endif; ?>
</body>
</html>

