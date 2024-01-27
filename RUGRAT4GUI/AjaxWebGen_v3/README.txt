README
-------

In order to run the application AjaxWebGen, you need the following:

Java 1.6 ( java 1.5 won't work with tomcat 7)
Apache tomcat 7 ( i have not tested with versions lower than 7 though i think the application will probably work correctly)
Eclipse Java EE version 3.4.2 (optional)


Steps to run the application without eclipse:
---------------------------------------------

1. Set system environment variable JAVA_HOME to point to your java jdk installation
2. In the AjaxWebGen folder, run compileApp.bat
3. Copy tomcatApp\AjaxWebGen into <tomcat folder>\webapps folder
4. Start tomcat by running <tomcat folder>\bin\startup.bat
5. In your browser, browse to the address "http://localhost:8080/AjaxWebGen/" to view the application
6. Enter the values for the various criteria and click submit
7. You can find the list of perturbation changes in the file <tomcat folder>\webapps\AjaxWebGen\WEB-INF\perturbation
8. The original generated jsp pages are usually named <pageno>.jsp while the perturbation jsp files are nanmed <pageno>_1.jsp

Example: 1.jsp , perturbation is 1_1.jsp

Steps to run the application within eclipse:
--------------------------------------------

1. Start eclipse
2. Import the AjaxWebGen project into eclipse
3. Right click on the project, select Run As -> Run on Server to open the server wizard
4. Select Apache Tomcat 7.0 server, provide the path to the location where tomcat is installed on your machine and complete the wizard.
5. In your browser, browse to the address "http://localhost:8080/AjaxWebGen/" to view the application
6. Enter the values for the various criteria and click submit
7. You can find the list of perturbation changes in the file <eclipse workspace>\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\AjaxWebGen\WEB-INF\perturbation
8. The original generated jsp pages are usually named <pageno>.jsp while the perturbation jsp files are nanmed <pageno>_1.jsp

Example: 1.jsp , perturbation is 1_1.jsp