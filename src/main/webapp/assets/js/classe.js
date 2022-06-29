var xhr = instanciation();
var dept, cycle, level;


/*window.onload = function() {
	console.log("Application Started");
	xhr.onreadystatechange = save;
	data = "page=json"
	xhr.open("GET", "classe?" + data, true);
	xhr.send(null);
};*/

function addClasse() {
	dept = departement_id.value;
	cycle = cycle_id.value;
	level = level_id.value;
	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
	if (dept != "" && cycle != "" && level != "") {
		xhr.onreadystatechange = status;
		data = `departement=${dept}&cycle=${cycle}&level=${level}`;
		xhr.open("POST", "classe", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(data);
	}
}

function status() {
	var msg;
	var info = document.getElementById("info");
	if (xhr.readyState == 4 && xhr.status == 200) {

		document.getElementById("id_close_modal").click();
        let data = JSON.parse(xhr.responseText);
        document.getElementById("table_id").innerHTML = document.getElementById("table_id").innerHTML + "<tr><td> "+data['departement']+"</td><td> "+data['level']+"</td><td> "+data['cycle']+"</td></tr>"
		// info.innerHTML = "Etudiant ajouté avec succès";
		// setTimeout(function() {
		// 	info.innerHTML = "";
		// }, 3000);

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

