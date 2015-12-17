/**
 * 
 */
$(document).ready(function  (){
	alert("Dom ready");
	
	$("#hideButton").click(function  (){
		$("p").hide();
	});
	$("#showButton").click(function (){
		$("p").show();
	});
});