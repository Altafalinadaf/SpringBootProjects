<%@ page language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Subtraction Calculator</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: white;
            width: 350px;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px gray;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-top: 15px;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="number"] {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 100%;
            margin-top: 20px;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #333;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #555;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Subtraction Calculator</h2>

    <form action="/subtract" method="get">

        <label>Enter Number 1:</label>
        <input type="number" name="num1" required>

        <label>Enter Number 2:</label>
        <input type="number" name="num2" required>

        <input type="submit" value="Subtract">

    </form>

</div>

</body>
</html>