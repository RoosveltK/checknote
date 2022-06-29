var xhr = instanciation();
var intutile, code, classe_id;



function addNote() {
	code = document.getElementById("code").value;
	intutile = document.getElementById("intitule").value ;
	classe_id = document.getElementById("classe").value;
	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
	if (intutile != "" && code != "" && classe_id != "") {
		xhr.onreadystatechange = status;
		data = `code=${code}&intutile=${intutile}&classe=${classe_id}`;
		xhr.open("POST", "ue", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(data);
	}
}

function status() {
	var msg;
	var info = document.getElementById("info");
	if (xhr.readyState == 4) {

		document.getElementById("code").value = "";
		document.getElementById("intitule").value = "";
		document.getElementById("classe").value = "";

		info.innerHTML = "Ue ajoutée avec succès";
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


