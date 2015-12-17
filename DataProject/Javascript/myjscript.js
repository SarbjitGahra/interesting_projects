/**
 * 
 */
document.write((" hr /><br /> Date Objects"));
var date = new Date ();
document.write(" <br /> Date : "  + date.toLoacaleDateString());
var date2 = new Date(2009,09,09);
document.write(" <br /> Date : "  + date.toLoacaleDateString());
document.write ( "< br/> Month : " + date2.toMonth());
document.write ( "< br/> Month : " + date2.toMonth());
document.write("<br/> Math Pi Value : " + Math.PI);
docment.write ("<br />  Max of 10, 5 : "+ Math.max(10,5));
document.write(" <br /> 5 raise to 3 : "+ Math.pow(5,3));
document.write(" <br /> round (123.7862) : " + Math.round(123.7862));
document.write("<br /> Number with 2 digits : " + (642.7839).toFixed(2));
var a = parseInt("123");
var b = parseInt("5");
var m;
document.write ("<br /> a+b" + a + b);
doucment.write("<br /> m= " + m);
var player = new Object();
player.Id = 1;
 player.Name = "John Doe";
 player.Rank = 3;
 player.show = display;
 function.display(){
document.write("<br/> Player id = " + this.Id);
document.write("<br/> Player name = " + this.Name);
document.write("<br/> Player rank = " + this.Rank);
 }
 player.show();
 player2.show();
var player2 = new Object();
player.Id = 2;
player.Name = "Jane Doe";
player.Rank = 1;

function addInt(){
	var x =parseInt( document.f1.no1.value);
	var y= parseInt(document.f1.no2.value);
	var z = 0;
	z = x+y;
	document.f1.ans.value = z;
	alert ("Ans  :" + z);
}
function ValidateFrom(){
	var userID = document.f2.userId.value;
	var password = document.f2.password.value;
	
	if (userId.trim()== " " ){
		
		alert(" userId cannot be blank");
	return false;
}
	if (password.trim() == " "){
		alert(" password cannot be blank");
		return false;
	}
	
	
	return false;
	
}


