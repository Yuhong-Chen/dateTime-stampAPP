dateTime-stampAPP
===================


This is an assignment to implement a simple web application, which can insert date-time entries to a DB. To ease the endpoint testing with curl command, simple web pages were constructed using JSP so that you can see the outcome in your browser. Automation was enabled using AWS Elastic Beanstalk.

----------
Run locally 
-------------

Clone the repo into your IDE, make sure you have the JDK environment and application server Tomcat. Then press the green triangle button and run the application. 

![enter image description here](https://elasticbeanstalk-eu-west-2-644719600789.s3.eu-west-2.amazonaws.com/readme/run.PNG)

The index page will give you instruction to change the URL path to /app.jsp to create a time stamp.
![](https://elasticbeanstalk-eu-west-2-644719600789.s3.eu-west-2.amazonaws.com/readme/index.PNG)

![enter image description here](https://elasticbeanstalk-eu-west-2-644719600789.s3.eu-west-2.amazonaws.com/readme/create+stamp.PNG)

![enter image description here](https://elasticbeanstalk-eu-west-2-644719600789.s3.eu-west-2.amazonaws.com/readme/response.PNG)

> **Database:**

> - The database used is an AWS RDS instance, the credentials were put in the connection string already for you to use. To see the DB table update after new stamps are inserted successfully, you can connect to the DB using the hostname and credentials   **aws-rds-stampapp.cxtpq9s3htbt.eu-west-2.rds.amazonaws.comm:3306, user&password: dateAppAdmin **

![enter image description here](https://elasticbeanstalk-eu-west-2-644719600789.s3.eu-west-2.amazonaws.com/readme/db.PNG)

----------
Deploy on AWS Elastic Beanstalk
-------------
Conscious of cost, I deployed the app once on AWS to test the process and below I document the steps for you to try as well. 
#### <i class="icon-file"></i> Upload War file

The WAR file was provided in the code: dateTime-stampAPP/out/artifacts/dateTime_stampAPP_war/dateTime-stampAPP_war.war. Go to Elastic Beanstalk service in AWS console, start the deployment by simply upload the WAR file.
#### <i class="icon-pencil"></i> Configure
In 'configure more options', choose the suitable EC2 instance , ELB and RDS with multi-AZ enabled.  Then the elastic beanstalk will provision the service on your behalf.
![enter image description here](https://elasticbeanstalk-eu-west-2-644719600789.s3.eu-west-2.amazonaws.com/readme/e.png)
