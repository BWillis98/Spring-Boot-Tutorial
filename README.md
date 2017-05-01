# Spring-Boot-Tutorial
This is where I learned how to create applications using the Spring Framework. I'm super excited for what I'm going to be able to do with this power!

Tutorial Followed: https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x

# How to Run:
(I run this through the Eclipse IDE so I will explain how I run it there).
The first thing you need to do is open up eclipse, go to: help -> Eclipse Marketplace and install "Spring Tool Suite (STS)" followed by the Spring version (mine was 3.8.4).
Create a Maven project with the Group ID being "io.javabrains" and the Artifact ID being "course-api-data"
Then, set the pom.xml in this repo as the pom.xml for your project.
Then, place this src folder in the same directory and run CourseApiDataApplication.java from src\main\java\io\javabrains

The API should now be up and running. However, it starts up with an empty DB so don't be surprised when it doesn't return anything. It's configured to run out of localhost and port 8080 as of right now. I don't suspect anybody will ever see this since I clearly stated it was a tutorial, so I won't go into much more detail. I highly recommend following the tutorial. I placed a link in this file for anyone interested.