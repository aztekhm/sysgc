$(document).ready(function(){
	$("#crud").jqGrid({
		width:600,
		height:480,
		url:"crudLoad.html",
		datatype:"json",
		colNames:["Id", "Nombre", "Descripcion", "Estatus"],
		colModel:[
          {name:"id", index:"id"},
          {name:"nombre", index:"nombre"},
          {name:"descripcion", index:"descripcion"},
          {name:"estatus", index:"estatus"}],
        caption:"Crud test",
        viewrecords:true,
        jsonReader:{repeatitems:false},
		pager:"#pager"
	});
	$("#crud").jqGrid("navGrid", "#pager", {add:true, edit:true, del:true, search:false, refresh:false});
});