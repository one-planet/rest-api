<?php
  header('Content-Type: application/json');
  if ($_SERVER['REQUEST_URI'] == '/hello') {
    $data = array('message' => 'Hello, world!');
    echo json_encode($data);
  } else {
    $data = array('message' => 'Not found');
    echo json_encode($data);
  }
?>