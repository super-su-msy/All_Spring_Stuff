# Hibernate One to One Mapping Example Annotation

Working Example to demonstrate how to work with mappings with Hibernate ORM.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 
### Prerequisites

MySQL

Configure Maven

Head here for a complete guide to [journaldev](https://www.journaldev.com/2916/hibernate-one-to-one-mapping-example-annotation) 



```
Give examples
```

### Errors encountered while working with this project

MySQl if already registered with another project and facing issues while connecting to DB

HEAD here [stackoverflow](https://www.journaldev.com/2916/hibernate-one-to-one-mapping-example-annotation)

or READ HERE


>JDBC drivers register themselves in the JVM-wide singleton DriverManager which is shared by all web apps. If you have the same (as in class name) JDBC driver register twice from two different web apps, this might cause your problem. This is even more problematic if your web apps use different versions of the same JDBC driver.

>Also, putting JDBC drivers into Tomcat's lib folder will help prevent memory leaks when you redeploy your web app without restarting Tomcat, e.g. if you just put a new WAR file into Tomcat's webapps folder:

>The class DriverManager gets loaded by the bootstrap classloader and thereby "lives" globally in the JVM, while Tomcat loads all web apps in their own classloaders. So if a JDBC driver from a web app's WEB-INF/lib folder registers itself in DriverManager, it pins that web app's classloader in memory (and thereby all the classes of that web app), preventing its garbage collection.

>If instead both DriverManager and JDBC drivers come from non-web app classloaders, you can freely redeploy your web apps without any web app classes pinning themselves in classes loaded from other classloaders.

>Current versions of Tomcat (probably 6.x and definitely 7.x) will log warnings on undeployment of a web app if a memory leak is detected, among other things by JDBC drivers.



## Built With

* [Hibernate](https://mvnrepository.com/artifact/org.hibernate) - The ORM framework used
* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

* **Karan** - *Initial work* 


## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
