let loginLabel = document.getElementById("login-label");
let registerLabel = document.getElementById("register-label");
const passwordRegex = /[a-z|A-Z]+[0-9]+[!@#$%^&]+/;

const validateLogin = () => {
	
	let uname = loginForm["uname"].value.trim();
	let pass = loginForm["pass"].value.trim();
	
	if (uname === "" || pass === "") {
		loginLabel.innerHTML = "Username or Password field cannot be left blank.";
		return false;
	} else if (!passwordRegex.test(pass)) {
		loginLabel.innerHTML =
			"Password should start with an alphabet, followed by digits and then special characters.";
		return false;
	} else {
		return true;
	}
}

const validateRegister = () => {

	let uname = regForm["uname"].value.trim();
	let pass = regForm["pass"].value.trim();
	let confpass = regForm["confpass"].value.trim();
	
	if (
		uname === "" ||
		pass === "" ||
		confpass === ""
	) {
		registerLabel.innerHTML = "Invalid Data";
		return false;
	} else if (pass != confpass) {
		registerLabel.innerHTML = "The password and confirm password fields are not matching.";
		return false;
	} else if (!passwordRegex.test(pass)) {
		registerLabel.innerHTML =
			"Password should start with an alphabet, followed by digits and then special characters.";
		return false;
	} else {
		return true;
	}

}