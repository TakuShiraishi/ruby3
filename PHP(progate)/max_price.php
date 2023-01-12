<?php
$manus = array(
  array('name' => 'CURRY','price' => 900),
  array('name' => 'PASTA','price' => 1200),
  array('name' => 'COFFEE','price' => 600)
);

$totalPrice = 0;
$maxPrice = 0;
$maxPriceMenuName = '';

foreach ($manus as $menu) {
  $name = $menu['name'];
  $price = $menu['price'];
  echo $name.'は'.$price.'円です';
  echo '<br>'
  $totalPrice += $price;
  if ($price > $maxPrice) {
    $maxPrice = $price;
    $maxPriceMenuName = $name;
  }
}
echo '合計金額は'.$totalPrice.'円です';
echo '<br>';
echo $maxPriceMenuName.'が最高価格で'.$maxPrice.'円です';
?>