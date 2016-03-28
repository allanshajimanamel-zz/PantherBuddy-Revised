# PantherBuddy
This the implementation of my Advanced Software Engineering Project (Fall 2016) named "PantherBuddy" using : 

a) JSF 2.1 <br>
b) EJB 3.1 <br>
c) JPA 2 <br>

The original prject can be found at https://github.com/allanshajimanamel/PantherBuddy-JSP.<br>
This is my personal effort to migrate the project to newer more stable, secure and feature rich platform.

<b>This is still a work in progress.</b>

The main project here is "pantherbuddy" which will build all the other projects and update the ear.<br>
The project "pantherbuddy-web" is the web project where all the frontend code is present.<br>
The project "pantherbuddy-api" is the interface between "pantherbuddy-web" and "pantherbuddy-server".<br>
The project "pantherbuddy-server" contains the application logic and server and database code.<br>
The project "pantherbuddy-ear" is the ear for the project to be deployed.<br>

The project uses MySQL 5 as its backened database.<br>
The project was configured to use JBoss Wildfly 8.2.1.<br>

Major Parts of the project:<br>
1. Maven build integration. (done) <br>
2. Backend migration to EJB 3 (done) <br>
3. JPA implementation (partial - 75%) <br>
4. Session management (done) <br>
5. Back button security against no session (done) <br>
6. Configure remote email server to get email session from JNDI (done) <br>
7. XHTML view developed using JSF 2.0, Omnifaces, MyFaces, Bootstrap integration (partial - 50%) <br>


