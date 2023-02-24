# Employee_Management_CRUD

Overview of Spring Boot JPA Rest CRUD API example
We will build a Spring Boot JPA Rest CRUD API for a Employee application in that:

Each Tutorial has id, title, description, published status.
Apis help to create, retrieve, update, delete Tutorials.
Apis also support custom finder methods such as find by published status or by title.
These are APIs that we need to provide:

Methods	Urls	Actions
POST	/api/Employee	create new Employee
GET	/api/Employee	retrieve all Employee
GET	/api/Employee/:id	retrieve a Employee by :id
PUT	/api/Employee/:id	update a Employee by :id
DELETE	/api/Employee/:id	delete a Employee by :id
DELETE	/api/Employee	delete all Employee
