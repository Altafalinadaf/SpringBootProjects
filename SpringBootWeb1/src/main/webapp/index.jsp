<%@ page language="java" %>

<html>
<head>
    <title>Calculator</title>

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
            margin-bottom: 25px;
        }

        label {
            display: block;
            text-align: left;
            margin-bottom: 5px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
            border: 1px solid gray;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

    </style>
</head>

<body>

<div class="container">

    <h2>Calculator</h2>

    <form action="add">

        <label for="num1">Enter Number 1 :</label>
        <input type="text" id="num1" name="num1">

        <label for="num2">Enter Number 2 :</label>
        <input type="text" id="num2" name="num2">

        <input type="submit" value="Submit">

    </form>

</div>

</body>
</html>