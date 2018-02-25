
var checklist = document.getElementById("checklist");
var checkList = document.getElementById("Trail")
var jsonArray = [];
var y="";

var items = document.querySelectorAll("li");
var inputs = document.querySelectorAll("input");
for(var i = 0; i< items.length; i++ ){
	items[i].addEventListener("click",editItems);
	inputs[i].addEventListener("blur", updateItems);
}
function editItems(){
	this.className = "edit";
	var input = this.querySelector("input");
	input.focus();
	console.log(input.value);
	input.setSelectionRange(0, input.value.length);
} 

function updateItems(){
	this.previousElementSibling.innerHTML = this.value;
	this.parentNode.className="";
}
function getData() {

    var xobj = new XMLHttpRequest();
    xobj.overrideMimeType("application/json");
    xobj.open('GET','todo.json' ,true, 'jsonp');
    xobj.onreadystatechange = function() {
        if (xobj.readyState == 4 && xobj.status == 200) {
        	  // .open will NOT return a value but simply returns undefined in async mode so use a callback
           var callback = (xobj.responseText);
           jsonResponse = JSON.parse(callback);
           console.log(jsonResponse.length);
           jsonResponse.forEach(function(data){
			   //if(jsonResponse.length == jsonArray.length)
   		   jsonArray.push(data);   		
           });
         	for(var x=0; x < jsonArray.length; x++)
	{
		y+=`
			<ul class="JSON" >				 
				<li>Author: ${jsonResponse[x].author}</li>
				<li>Title: ${jsonResponse[x].title}</li>
				<li>Items: ${jsonResponse[x].todo_item}</li>
				<li>Date: ${jsonResponse[x].date}</li>
			</ul>
		`;
	 } 
	document.getElementById("div2").innerHTML =y;
    }
    };
     xobj.send(null);
}

function addNew()
{
	var title = prompt("Enter new title");
	var author = prompt("Enter new Author");
	var todo_item = prompt("Enter new Task, separated by comma");
	var date = new Date();
	if(title != null && author != null && todo_item != null){
		var newObj = {title, todo_item, author, date};
		jsonArray.push(newObj);
	}
	else{
		alert("Enter Valid Values");
	}
	console.log(jsonArray);
	var v = ""; 
	for(var x=0; x < jsonArray.length; x++)
	{
		//document.getElementById("div2").innerHTML =  jsonArray[x];
		v+=`
			<ul class = "Trail">
				<li>
					Author: <span>${jsonArray[x].author}</span>
					<input value="${jsonArray[x].author}" />
				</li>
				<li>
					Title: <span>${jsonArray[x].title}</span>
					<input value="${jsonArray[x].title}" /> 
				</li>
				<li>
					Items: <span>${jsonArray[x].todo_item}</span>
					<input value="${jsonArray[x].todo_item}" />
				</li>
				
				<li>
					Date: <span>${jsonArray[x].date}</span>
					<input value="${jsonArray[x].date}" />
				</li>
			</ul>
		`;
	}
	document.getElementById("div2").innerHTML =  v;
}
