<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>canvas-nest</title>
	</head>
	<body style="background-color: antiquewhite">
		<script type="text/javascript" src="/demo/canvas-nest.min.js"></script>
		<canvas  height="926" width="1920" style="position: fixed; top: 0px; left: 0px; z-index: -1; opacity: 0.5;" id="c_n1" ></canvas>
	<script>
        var cv = document.getElementById('c_n1');
        var g = cv.getContext('2d');
        g.beginPath(); //看这行
        g.lineWidth=5;
        g.moveTo(x1,y1);
        g.lineTo(x2,y2);
        g.stroke();

	</script>
	</body>
</html>