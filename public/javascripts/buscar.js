var BASE_URI= "http://localhost:8080/dsaApp"
$(document).ready(function(){

   $("#button").click(function(){
       var user = $("usr").val();
       var repository;
       var description;
       var followers;

       $.ajax({
           headers: {
               'Accept': 'application/json',
               'Content-Type': 'application/json'
               },
               url: BASE_URI.concat("/buscar/buscarInfo"),
               type: "GET",
               data: JSON.stringify({"usr": usr}),
               dataType:'json',

               success: function (data) {
                   alert("3333");
                   myStorage.setItem("repository",response.repository);
                   myStorage.setItem("description",response.description);
                   myStorage.setItem("followers",response.followers);

                   message = '"Estos son sus repositorios"';

               },
                error: function(error){

                   alert("Error: "+ error);
                   message = '"Usuario no encontrado"';

               },
        });
    });
});

