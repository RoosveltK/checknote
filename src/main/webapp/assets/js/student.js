

$(function () {
    $("#check_note_form").steps({
      headerTag: "h3",
      bodyTag: "fieldset",
      transitionEffect: "slide",

    onStepChanging: function(e, currentIndex, newIndex) {
        // console.log(currentIndex, newIndex);
        if (currentIndex == 0) {
            getUe();
            return true;
        }

        if (currentIndex == 1) {
            getNote();
            return true;
        }

        if (newIndex > currentIndex) {
            return false;
        }
        
        // return true;
    },

autoFocus: true
    });
  });


var xhr = instanciation();

function getUe() {
	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
	if (id_matricule.value != "" && id_examen.value != "") {
		xhr.onreadystatechange = status;
		data = `matricule=${id_matricule.value}&type=${id_examen.value}`;

        localStorage.setItem('matricule', id_matricule.value);
        localStorage.setItem('examen', id_examen.value);
		
		xhr.open("POST", "check?action=ue", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(data);
	}
}

function status() {
	var msg;
	var info = document.getElementById("info");
	if (xhr.readyState == 4 && xhr.status == 200) {

        let data = JSON.parse(xhr.responseText);
        let select = document.getElementById("id_ue");
        select.innerHTML = "";
        data.forEach(function(value) {  
            select.innerHTML += "<option value="+value["id"]+">"+value["code"]+" - "+value["intitule"]+"</option>";
        });
        

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




var xhrNote = instanciationNote();

function instanciationNote() {
	var xhr = new Object();

	xhr = new XMLHttpRequest();
	if (!xhr) {
		alert("Ajax not supported");
	} else {
		xhr.onreadystatechange = statusNote;
	}
	return xhr;
}

function statusNote() {
	if (xhrNote.readyState == 4 && xhrNote.status == 200) {

        let data = JSON.parse(xhrNote.responseText);
        console.log(data);
        let select = document.getElementById("recpet_accuse");
        select.innerText = data["message"];
	}
}

function getNote() {
	// Assurez vous que les valeurs r�cup�r�es ne sont pas des chaines vides
    let matricule = localStorage.getItem('matricule');
    let examen = localStorage.getItem('examen');
    let ue = id_ue.value;

	if (matricule != "" && examen != "" && ue != "") {
		xhrNote.onreadystatechange = statusNote;
		data = `matricule=${matricule}&type=${examen}&ue=${ue}`;

        xhrNote.open("POST", "check?action=get", true);
		xhrNote.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhrNote.send(data);
	}
}
