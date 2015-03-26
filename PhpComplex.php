<?php
$start = substr(microtime()*1000,0,10);
function integral($coeff, $power, $min, $max) {
        echo ($coeff/($power+1))*pow($max,$power+1) - ($coeff/($power+1))*pow($min,$power+1);
        echo "\n";
}

for ($i = 1; $i <= 100; $i++) {
        integral(4,3,$i,$i+1);
}
echo  substr(microtime()*1000,0,10) - $start;
?>
