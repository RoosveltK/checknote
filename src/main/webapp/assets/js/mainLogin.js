
var username, password;

function login() {
	username = document.getElementById("username").value;
	password = document.getElementById("userpassword").value;
	var info = document.getElementById("info");
	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
	if (username != "" && password != "") {
		if (username == 'admin' && password == 'admin12345')
			window.location.href = 'etudiant';
		else {
			document.getElementById("userpassword").value = "";
			info.innerHTML = "Informations incorrectes";

		}


	}
}


