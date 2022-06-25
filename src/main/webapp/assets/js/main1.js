var xhr = instanciation();
var matricule, nom, prenom, telephone;



window.onload = function() {
	
	let myDropzone = new Dropzone("#my-form");
	myDropzone.autoDiscover = false;
	myDropzone.on("addedfile", file => {
		console.log(`File added: ${file.name}`);
	});
};







function addStudent() {
	matricule = document.getElementById("matricule").value;
	nom = document.getElementById("nom").value;
	prenom = document.getElementById("prenom").value;
	telephone = document.getElementById("telephone").value;

	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
	if (matricule != "" && nom != "" && prenom != "" && telephone != "") {
		xhr.onreadystatechange = status;
		data = `matricule=${matricule}&nom=${nom}&prenom=${prenom}&telephone=${telephone}`;
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

