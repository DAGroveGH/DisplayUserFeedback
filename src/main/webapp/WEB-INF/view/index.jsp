<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Feedback</title>
</head>
<body>
    <div id="container">
        <h1>Retrieve all feedback</h1>
        <a href="/allFeedback">
            View ALL Feedback
        </a>

        <br>


        <h1>Get specific feedback</h1>
        <form action="feedback" method="GET">
            ID : <input type="text" id="feedback_id">
            <input type="submit" value="submit">
        </form>

        <br>

        <h1>Submit Feedback</h1>
        <form action="send" method="POST">
            Feedback : <textarea name="feedback" rows="10" cols="50" id="feedbackTextArea" placeholder="Enter your feedback"></textarea>
            <input type="submit" value="Submit">
        </form>

    </div>
</body>

</html>
