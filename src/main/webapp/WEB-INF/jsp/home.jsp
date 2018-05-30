<!DOCTYPE html>
<html xmlns="" lang="en" xml:lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

<title>Bottle Day Helper</title>


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>



<link rel="stylesheet" href="css/style.css">

</head>

<body>



	<!-- Left Side Area -->
	<div id="framecontent">
		<div class="innertube">

			<!--   Make these hyperlinks
	<h3>Login</h3>
	<h4>Save Current Configuration</h3>
	<h4>View Saved Configuration</h3>	
	<h3>Bottles To Display</h3>
	<h3>Add Custom Bottle</h3>
	-->
			<p>
				<a href="login">Login</a>
			</p>
			<p>
				<a href="www.">Save Current Configuration</a>
			</p>
			<p>
				<a href="www.">View Saved Configuration</a>
			</p>
			<p>
				<a href="www.">Bottles To Display</a>
			</p>
			<p>
				<a href="www.">Add Custom Bottle</a>
			</p>

		</div>
	</div>

	<div id="maincontent">
		<div class="innertube">

			<!-- Main Area (white screen)-->
			<h1 style="text-align: center">Bottle Day Helper</h1>

			<!-- Batch Info Table -->
			<form action="dashboard" method="post" modelAttribute="bottleSize">
				
			<H4>Enter batch size in gallons:</H4>
			<!-- <div class="divTable" style="border: 1px solid #000;">     TEST Style -->
			<div class="divTable">
				<div class="divTableBody">
					<div class="divTableRow">
						<div class="divTableCell">&nbsp;</div>
						<div class="divTableCell">In Gallons</div>
						<div class="divTableCell">&nbsp;</div>
						<div class="divTableCell">In Ounces</div>
						<div class="divTableCell">&nbsp;</div>
					</div>
					<div class="divTableRow">
						<div class="divTableCell">Batch Size</div>
						<div class="divTableCell">
							<div id=field1 class="input">
								<input type="text" name="batchSizeInGallons" class=field>
							</div>
						</div>
						<div class="divTableCellCenter">gal</div>
						<div class="divTableCell">${batchSizeInGallons}</div>
						<div class="divTableCellCenter">oz&nbsp;</div>
					</div>
					<div class="divTableRow">
						<div class="divTableCell">Bottled</div>
						<div class="divTableCell">&nbsp;</div>
						<div class="divTableCellCenter">gal</div>
						<div class="divTableCell">&nbsp;</div>
						<div class="divTableCellCenter">oz&nbsp;</div>
					</div>
					<div class="divTableRow">
						<div class="divTableCell">Remaining</div>
						<div class="divTableCell">&nbsp;</div>
						<div class="divTableCellCenter">gal</div>
						<div class="divTableCell">&nbsp;</div>
						<div class="divTableCellCenter">oz&nbsp;</div>
					</div>
				</div>
				<input type="submit">
			</form>
			</div>
			
			<h4>Select quantity of bottles you would like to use:</h4>

				<!--  DEMO Button Increment  
	<div id=field1 class="incrementer">
	  <input type="text" id="1" value=0 class=field>
	  <button type="button" id="add" class=add>+</button>
	  <button type="button" id="sub" class=sub>-</button>
	</div>
	
	<div id=field1>
	  field 1
	  <button type="button" id="sub" class=sub>-</button>
	  <input type="text" id="1" value=0 class=field>
	  <button type="button" id="add" class=add>+</button>
	</div>
	<div id=field2>
	  field 2
	  <button type="button" id="sub2" class=sub>-</button>
	  <input type="text" id="2" value=0 class=field>
	  <button type="button" id="add2" class=add>+</button>
	</div>
	-->


				<!-- Configuration Table -->
				
				<div class="divTable" style="border: 1px solid #000;">
					<div class="divTableBody">
						<div class="divTableRow">
							<div class="divTableCell">Bottle Type</div>
							<div class="divTableCell">In Gallons</div>
							<div class="divTableCell">Quantity of Bottles</div>
							<div class="divTableCell">Total Ounces</div>
							<div class="divTableCell">&nbsp;</div>
						</div>
						<div class="divTableRow">
							<div class="divTableCell">12 oz</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCell">
								<div id=field1 class="incrementer">
									<input type="text" id="1" value=0 class=field>
									<button type="button" id="add" class=add>+</button>
									<button type="button" id="sub" class=sub>-</button>
								</div>
							</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCellCenter">oz&nbsp;</div>
						</div>
						<div class="divTableRow">
							<div class="divTableCell">22 oz</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCell">
								<div id=field1 class="incrementer">
									<input type="text" id="1" value=0 class=field>
									<button type="button" id="add" class=add>+</button>
									<button type="button" id="sub" class=sub>-</button>
								</div>
							</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCellCenter">oz&nbsp;</div>
						</div>
						<div class="divTableRow">
							<div class="divTableCell">1 liter</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCell">
								<div id=field1 class="incrementer">
									<input type="text" id="1" value=0 class=field>
									<button type="button" id="add" class=add>+</button>
									<button type="button" id="sub" class=sub>-</button>
								</div>
							</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCellCenter">oz&nbsp;</div>
						</div>
						<div class="divTableRow">
							<div class="divTableCell">2 liter</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCell">
								<div id=field1 class="incrementer">
									<input type="text" id="1" value=0 class=field>
									<button type="button" id="add" class=add>+</button>
									<button type="button" id="sub" class=sub>-</button>
								</div>
							</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCellCenter">oz&nbsp;</div>
						</div>
						<div class="divTableRow">
							<div class="divTableCell">750 ml</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCell">
								<div id=field1 class="incrementer">
									<input type="text" id="1" value=0 class=field>
									<button type="button" id="add" class=add>+</button>
									<button type="button" id="sub" class=sub>-</button>
								</div>
							</div>
							<div class="divTableCell">&nbsp;</div>
							<div class="divTableCellCenter">oz&nbsp;</div>
						</div>
					</div>
				</div>
				
		</div>
	</div>
	<script src="js/scripts.js"></script>
</body>

</html>
