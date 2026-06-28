1. Java Persistence API 
-> It is used in ORM(Object Relation Mapping)
-> Does not provide implementation and need Hibernate

Features:
-> Database independent and defines annotations like @Table, @Entity, @Id, @Column

2. Hibernate
-> ORM framework and implementation of JPA
-> Converts Java objects to database automatically

Features:
-> Reduces boilerplate code and provides caching and performance optimization

3. Spring Data JPA
-> Spring framework module built on top of JPA
-> Does not implement JPA and removes boilerplate code

Features:
-> Less code and easier maintenance and built on top of JPA


Final Comparison:


Java Persistence API (JPA)
•	JSR 338 Specification for persisting, reading and managing data from Java objects
•	Does not contain concrete implementation of the specification
•	Hibernate is one of the implementation of JPA
Hibernate
•	ORM Tool that implements JPA
Spring Data JPA
•	Does not have JPA implementation, but reduces boiler plate code
•	This is another level of abstraction over JPA implementation provider like Hibernate
•	Manages transactions
