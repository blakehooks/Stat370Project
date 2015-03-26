<?php
$start = substr(microtime()*1000,0,10);
echo "<br/>";
for ($i = 1; $i <= 100; $i++) {
        echo  $i+$i;
        echo  $i*$i;
        echo $i/$i;
        echo $i-$i;
        echo "\n";
}
echo  substr(microtime()*1000,0,10) - $start;
?>
