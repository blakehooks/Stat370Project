<?php
$start = substr(microtime()*1000,0,10);
function quadratic($a, $b, $c) {
        $positive = ((-1*$b)+sqrt(pow($b,2)-(4*$a*$c)))/(2*$a);
        echo $positive;
        $negative = ((-1*$b)-sqrt(pow($b,2)-(4*$a*$c)))/(2*$a);
        echo $negative;
        echo "\n";
}
for ($i = 1; $i <= 100; $i++) {
        quadratic(1,1,-$i);
}
echo  substr(microtime()*1000,0,10) - $start;
?>
