<%@ page language="java" %>
<!DOCTYPE html>

<html>
<head>
    <title>Employee Form</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            width: 350px;
            margin: 100px auto;
            padding: 25px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h2 {
            text-align: center;
        }

        label {
            display: block;
            margin-top: 15px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            margin-top: 20px;
            background-color: blue;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Employee Details</h2>

    <form action="/employee" method="get">

        <label>Enter ID:</label>
        <input type="number" name="id" required>

        <label>Enter Name:</label>
        <input type="text" name="name" required>

        <input type="submit" value="Submit">

    </form>

</div>

</body>
</html>