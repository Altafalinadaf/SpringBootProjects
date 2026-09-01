<%@ page language="java" %>

<html>
<head>
    <title>Calculator Result</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
            width: 350px;
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
        }

        .result {
            font-size: 22px;
            margin: 20px 0;
        }

        a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        a:hover {
            background-color: #45a049;
        }
    </style>
</head>

<body>

<div class="container">

   <!-- <h2>Calculator Result : <%= session.getAttribute("result")%></h2>-->
   <h2>Calculator Result  = ${result}</h2>

</div>

</body>
</html>