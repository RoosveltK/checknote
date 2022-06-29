var xhr = instanciation();
var matricule, nom, prenom, telephone, classe_id;


/*window.onload = function() {
	console.log("Application Started");
	xhr.onreadystatechange = save;
	data = "page=json"
	xhr.open("GET", "classe?" + data, true);
	xhr.send(null);
};*/


function addStudent() {
	matricule = document.getElementById("matricule").value;
	nom = document.getElementById("nom").value;
	prenom = document.getElementById("prenom").value;
	telephone = document.getElementById("telephone").value;
	classe_id = document.getElementById("classe").value;
	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
	if (matricule != "" && nom != "" && prenom != "" && telephone != "" && classe_id != "") {
		xhr.onreadystatechange = status;
		data = `matricule=${matricule}&nom=${nom}&prenom=${prenom}&telephone=${telephone}&classe=${classe_id}`;
		xhr.open("POST", "etudiant", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(data);
	}
}

function status() {
	var msg;
	var info = document.getElementById("info");
	if (xhr.readyState == 4) {

		document.getElementById("matricule").value = "";
		document.getElementById("nom").value = "";
		document.getElementById("prenom").value = "";
		document.getElementById("telephone").value = "";
		document.getElementById("classe").value = "";

		info.innerHTML = "Etudiant ajouté avec succès";
		setTimeout(function() {
			info.innerHTML = "";
		}, 3000);

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


function save() {
	if (xhr.readyState == 4) {
		console.log(xhr)
	}
}

