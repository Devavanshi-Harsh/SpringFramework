<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Complex Form</title>
<style>
body {
	font-size: larger;
	font-weight: 900;
}

#address-fields {
	width: 400px;
	display: block;
	margin: auto;
	background-color: rgb(202, 202, 202);
	border-radius: 10px;
}

#Address {
	margin: 10px;
	padding: 20px;
}

.container {
	border: 2px solid black;
	display: block;
	margin: auto;
	padding: 10px;
	width: 30%;
}

label {
	
}

input {
	margin: 5px;
	padding: 8px;
	border-radius: 5px;
	align-items: center;
}
</style>
</head>
<body>
	<div class="container">
		<form action="complexFormProcess" method="post" class="form-control">
			<label for="FirstName">First Name : </label> <input type="text"
				name="FirstName" id="FirstName" placeholder="Enter here" /> <br>
			<label for="LastName">Last Name : </label> <input type="text"
				name="LastName" id="LastName" placeholder="Enter here" /> <br>
			<label for="Email">Email ID : </label> <input type="email"
				name="Email" id="Email" placeholder="Enter here" /> <br> <label
				for="dob">Date of Birth : </label> <input type="type" name="dob"
				id="dob" placeholder="dd/mm/yyyy" /> <br> <label
				for="dropDown">Your Highest Education</label> <select name="Course"
				name="Course" id="dropDown">
				<Option value="B.Sc.">Bachelor of Science</Option>
				<Option value="B.A">Bachelor of Arts</Option>
				<Option value="Masters">Masters</Option>
				<Option value="Phd">PHD</Option>
				<Option value="Diploma">Diploma</Option>
			</select> <br> <label for="Gender"><b>Gender</b></label> <input
				type="radio" name="Gender" value="Male">Male</input> <input
				type="radio" name="Gender" value="Female">Female</input> <input
				type="radio" name="Gender">Transgender</input> <br>
			<div id="address-fields">
				<div id="Address">
					<input type="text" placeholder="Enter Street Name "
						name="address.StreetName" /> <br /> <input type="text"
						placeholder="Address Line 1" name="address.AddressLineOne"
						/> <br /> <input type="text"
						placeholder="Address Line 2" name="address.AddressLineTwo"
						/> <br /> 
						<input type="text"
						placeholder="Enter AreaCode" name="address.AreaCode"  />
					<br /> <select name="address.State" >
						<option value="">Select state</option>
						<option value="AN">Andaman and Nicobar Islands</option>
						<option value="AP">Andhra Pradesh</option>
						<option value="AR">Arunachal Pradesh</option>
						<option value="AS">Assam</option>
						<option value="BR">Bihar</option>
						<option value="CH">Chandigarh</option>
						<option value="CT">Chhattisgarh</option>
						<option value="DN">Dadra and Nagar Haveli</option>
						<option value="DD">Daman and Diu</option>
						<option value="DL">Delhi</option>
						<option value="GA">Goa</option>
						<option value="GJ">Gujarat</option>
						<option value="HR">Haryana</option>
					</select> <br /> <input type="text" placeholder="Enter Country Name "
						name="address.Country" />
				</div>
			</div>
			<%-- <select name="Hobbies" name="Hobbies" id="dropDown" multiple>
            <Option value="Sketching">Sketching</Option>
            <Option value="Driving">Driving</Option>
            <Option value="Photography">Photography</Option>
            <Option value="Videography">Videography</Option>
            <Option value="Adventure">Adventure</Option>
        </select>
        --%>
			<button class="button" type="submit" id="submit">Submit</button>
			<button class="button" type="reset" id="reset">Reset</button>
		</form>
	</div>
</body>
</html>
