<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .result-box {
            background-color: white;
            width: 350px;
            padding: 30px;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 0 15px gray;
        }

        h2 {
            color: #333;
        }

        .result {
            font-size: 25px;
            font-weight: bold;
            margin-top: 20px;
        }
    </style>
</head>

<body>

<div class="result-box">

    <h2>Subtraction Result</h2>

    <div class="result">
        Result : ${res}
    </div>

</div>

</body>
</html>