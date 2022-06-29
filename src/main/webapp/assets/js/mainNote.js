var xhr = instanciation();
var matricule, value, ue_id,examen;




function addNote() {
	matricule = document.getElementById("matricule").value;
	value = document.getElementById("note").value;
	ue_id = document.getElementById("ue").value;
	examen = document.getElementById("examen").value;

	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
	if (matricule != "" && value != "" && ue_id != "" ) {
		xhr.onreadystatechange = status;
		data = `matricule=${matricule}&note=${value}&ue=${ue_id}&examen=${examen}`;
		xhr.open("POST", "note", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(data);
	}
}
	
function status() {
	var msg;
	var info = document.getElementById("info");
	if (xhr.readyState == 4) {

		document.getElementById("matricule").value="";
		document.getElementById("note").value="";
		document.getElementById("ue").value="";
		document.getElementById("examen").value="";

		info.innerHTML = "Note ajouté avec succès";
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



