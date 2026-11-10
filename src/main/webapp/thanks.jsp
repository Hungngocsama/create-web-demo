<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    <style>
        label {
            width: 10em;
            font-weight: 600;
        }
        span {
            display: inline-block;
            margin-left: 0.5em;
            margin-bottom: 0.5em;
        }
    </style>
</head>

<body>
    <h1>Thanks for taking our survey</h1>
    <p>Here is the information that you entered:</p>

    <label>First Name:</label>
    <span>${survey.user.firstName}</span><br>

    <label>Last Name:</label>
    <span>${survey.user.lastName}</span><br>

    <label>Email:</label>
    <span>${survey.user.email}</span><br>

    <label>Date Of Birth:</label>
    <span>${survey.user.dateOfBirth}</span><br>

    <label>Hear From:</label>
    <span>${survey.hearSource}</span><br>

    <label>Receive Updates:</label>
    <span>${survey.receiveAnnouncements ? 'Yes' : 'No'}</span><br>

    <label>Receive Email:</label>
    <span>${survey.receiveSpecialOffers ? 'Yes' : 'No'}</span><br>

    <label>Contact Via:</label>
    <span>${survey.contactMethod}</span><br>

    <p>To enter another survey, click on the Back button in your browser or the Return button shown below.</p>

    <!-- Đã bổ sung action="index.html" -->
    <form action="index.html" method="get">
        <input type="submit" value="Return">
    </form>
</body>
</html>