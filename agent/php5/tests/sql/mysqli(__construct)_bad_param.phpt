--TEST--
hook mysqli::__construct bad param
--SKIPIF--
<?php
$conf = <<<CONF
security.enforce_policy: true
CONF;
include(__DIR__.'/../skipif.inc');
if (!extension_loaded("mysqli")) die("Skipped: mysqli extension required.");
?>
--INI--
openrasp.root_dir=/tmp/openrasp
--FILE--
<?php
new mysqli(array());
?>
--EXPECTREGEX--
Warning: mysqli::(__construct|mysqli)\(\) expects.*