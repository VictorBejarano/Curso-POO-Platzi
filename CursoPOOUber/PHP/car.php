<?php
require_once('account.php');
class Car {
    private $id;
    private $license;
    private $driver;
    private $passenger;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        echo "Licencia: $this->license Driver: ".$this->driver->name;
    }
}
?>