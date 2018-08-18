<html>
<body>
<h2>Hello World!</h2>
<div>
        <div>
            <h1>Addition of two numbers</h1>
        </div>
        <form action="helloServlet" method="post">
            Enter First Number : <br>
            <input type="text" id="Text1" name="TextBox1">
            <br>
            Enter Second Number : <br>
            <input type="text" id="Text2" name="TextBox2">
            <br>
            Result : <br>
              <label name="anslabel" id="txtresult"></label> 
       
            <br>
         <input type="submit" name="clickbtn" value="Display Result" onclick="add_number()">
         </form>>
          <br>
        <script type="text/javascript">
            function add_number(){
            	var first_number = parseFloat(document.getElementById("Text1").value);
                var second_number = parseFloat(document.getElementById("Text2").value);
                var result;
                if(!isNaN(first_number)&&!isNaN(second_number)){
                	result = first_number + second_number;
                	document.getElementById("txtresult").innerHTML = result;	
                }
                else{
                result = "Invalid input given please check";
                document.getElementById("txtresult").innerHTML = result;
                }
                    }
        </script>
        </div>


</body>
</html>
