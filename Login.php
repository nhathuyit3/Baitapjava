<!DOCTYPE html>
<html>
<head>
	<title>Login Instructor</title>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
</head>
<body>
	<div class="jumbotron jumbotron-fluid">
		<div class="container text-center">
			<center><h1 class="display-3">INSTRUCTOR</h1></center>
		</div>
	</div>
	<form action="" method="POST">
		<div class="form-group">
			<label>Ma Giang Vien </label>
			<input type="text" name="idGV" class="form-control" >
		</div>
		<div class="form-group">
			<label>Password</label>
			<input type="Password " name="MK" class="form-control">
		</div>
		<input type="submit" name="submit1" id = "button1" class="btn btn-outline-primary form-control" value="Login">
		<script language="JavaScript">
			var button = document.getElementById("button1");
			button.onclick = function(){
				alert("Welcome Back");
			}
		</script>
		<!-- form chi ddây -->
	</form> 
		<?php
		 include('../Quanlydaotao/Connect/connect.php'); 
		if(isset($_POST['submit1'])) {
			$idGV = $_POST['idGV'];
			$MK = ($_POST['MK']);
			$sql = "SELECT IDGV, Password FROM lopgiangvien WHERE IDGV = '$idGV'"; //dư dấu nháy
			// var_dump($sql);
			echo $sql;
			$result = $conn->query($sql);
			if($result->num_rows > 0){
				while ($row = $result->fetch_assoc()) {
					if($row['IDGV'] == $idGV && $row['Password'] == $MK) {
						session_start();
						$_SESSION['IDGV'] = $idGV;
						header('Location: Instructors/showinformation.php');
					}
				}
			}else{
				echo'Rất tiếc đã hack không thành công ^^';
			}
		}
	?>
</body>
</html>