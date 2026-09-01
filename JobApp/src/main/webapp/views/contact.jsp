<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Contact - Job Portal</title>

    <link rel="stylesheet" type="text/css" href="contact.css">
</head>

<body>

<!-- Navigation Bar -->
<nav class="navbar">

    <div class="logo">
        Job Portal Web App
    </div>

    <div class="nav-links">
        <a href="home">Home</a>
        <a href="viewalljobs">All Jobs</a>
        <a href="contact">Contact</a>
    </div>

</nav>


<!-- Contact Section -->
<div class="contact-container">

    <div class="contact-header">
        <h1>Contact Us</h1>
        <p>
            Have any questions or need help?
            Feel free to contact us.
        </p>
    </div>


    <div class="contact-content">

        <!-- Contact Information -->
        <div class="contact-info">

            <h2>Get In Touch</h2>

            <p>
                We are here to help you with any questions
                regarding jobs and applications.
            </p>

            <div class="info-box">
                <h3>Email</h3>
                <p>support@jobportal.com</p>
            </div>

            <div class="info-box">
                <h3>Phone</h3>
                <p>+91 73378 52362</p>
            </div>

            <div class="info-box">
                <h3>Address</h3>
                <p>Nashik, Maharashtra, India</p>
            </div>

        </div>


        <!-- Contact Form -->
        <div class="contact-form">

            <h2>Send Us a Message</h2>

            <form action="#" method="post">

                <label for="name">Name</label>
                <input
                    type="text"
                    id="name"
                    name="name"
                    placeholder="Enter your name"
                    required
                >

                <label for="email">Email</label>
                <input
                    type="email"
                    id="email"
                    name="email"
                    placeholder="Enter your email"
                    required
                >

                <label for="subject">Subject</label>
                <input
                    type="text"
                    id="subject"
                    name="subject"
                    placeholder="Enter subject"
                    required
                >

                <label for="message">Message</label>
                <textarea
                    id="message"
                    name="message"
                    rows="5"
                    placeholder="Enter your message"
                    required
                ></textarea>

                <button type="submit">Send Message</button>

            </form>

        </div>

    </div>

</div>

</body>
</html>