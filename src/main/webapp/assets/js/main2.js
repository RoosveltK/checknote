var xhr = instanciation();
var matricule, nom, prenom, telephone;



window.onload = function() {
	
};







function getStudent() {
	xhr.onreadystatechange = status;
	xhr.open("GET", "etudiantServlet", true);
	xhr.send(null)
}

function status() {
	if (xhr.readyState == 4) {


	}
}

function instanciation() {
	var xhr = new Object();

	xhr = new XMLHttpRequest();
	if (!xhr) {
		alert("Ajax not supported");
	} else {
		xhr.onreadystatechange = status;
	}
	return xhr;
}

