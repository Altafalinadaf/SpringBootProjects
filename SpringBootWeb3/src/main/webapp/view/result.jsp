<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>

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
            width: 350px;
            padding: 30px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 15px gray;
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
        }

        .details {
            font-size: 18px;
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }

        .details b {
            display: inline-block;
            width: 80px;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Employee Details</h2>

    <div class="details">
        <b>ID:</b> ${employee.id}
    </div>

    <div class="details">
        <b>Name:</b> ${employee.name}
    </div>

</div>

</body>
</html>