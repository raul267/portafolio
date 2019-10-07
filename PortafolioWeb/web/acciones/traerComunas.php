<?php 
   $conn = oci_connect('portafolio', 'portafolio', 'localhost/XE');
if (!$conn) {
    $e = oci_error();
    trigger_error(htmlentities($e['message'], ENT_QUOTES), E_USER_ERROR);
}

$stid = oci_parse($conn, 'SELECT * FROM comuna');
oci_execute($stid);

while (($row = oci_fetch_object($stid)) != false) {
    // Use nombres de atributo en mayúsculas para cada columna estándar de Oracle
    echo $row->NOMBRE;
}
?>