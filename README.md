# TaskProject
Task Project: Using Spring Boot and Thymeleaf
I utilized Spring Boot to complete this project, which also includes Thymeleaf, JPA, MVC, Hibernate, MySQL database, HTML, and CSS-Bootstrap.
Firstly, I started with adding project dependencies, which include JPA, MySQL, DevTools, Spring-Web, and Thymeleaf.

I've tried with the H2 database, but for every single refresh, I had to add details, which doesn't look productive for me. Later, I chose MySQL as the preferred database.

Problems I've faced are- Many em of, TBH
1. Restcontroller: The MVC endpoint doesn't load at all. I've tried different ways but the index.html page doesn't load on the homepage. I was struggling to find the mistake I'd made.
Then later on, The Best Place for Coders Platform-Stack Overflow helped me. I shouldn't use RestController because it's a combination of response body.
Learning of the day: " When you use annotation @ResponseBody, you actually tell spring to not try to find a view with the returned name."

2. Using Bootstrap: I'm not very familiar with Bootstrap but I still found some help from Youtube.
3. Pagination: After successfully creating CRUD operations with a clean interface and all working code, I wanted to add Pagination but after hours of struggle, I realised my working code was messed up.
and I found multiple errors and with time ticking away soon, I decided to hold pagination and push the code to GITHUB.

Instructions for Running My Code:
1. Pull or download the project from GIT.
2. Add it to Spring boot application. The minimum version is 3
3. There should be a MySQL database on your local machine. As I used MySQL as a database, my credentials are saved on the application.properties, "Please, change the password as per your database."
4. Make sure your spring boot application has Thymeleaf installed. If not, install it from the market place at STS.(Just in case.)
5. Then, you are good to run the code if the database connection is successful.
6. Then, go to the browser and paste this URL: http://localhost:8080/.
7. The interface occurs, as I'll be attaching screenshots of it.
8. If you find any difficulty executing this, feel free to ping me.
9. Thank you.
   
