window.onload=function(){
	console.log("window");
	getVillain();
}

function getVillain(){
	let xhttp = new XMLHttpRequest();
	
	xhttp.onreadystatechange = function(){
		console.log("the ready state has changed");
		if(xhttp.readyState==4 && xhttp.status==200){
			let vill = JSON.parse(xhttp.responseText);
			console.log(vill);
		}
	}
	xhttp.open("GET","http://localhost:8085/HelloFrontController/getsession.json");
	
	xhttp.send();
}