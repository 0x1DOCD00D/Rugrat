mkdir "WebContent\WEB-INF\classes"
"%JAVA_HOME%\javac" -classpath "WebContent\WEB-INF\lib\javax.servlet.jar" -d ".\WebContent\WEB-INF\classes" src\ObjectType.java src\DynamicallyFittedPage.java src\Generator.java src\AjaxJspServlet.java
mkdir tomcatApp
rmdir tomcatApp\AjaxWebGen
mkdir tomcatApp\AjaxWebGen
xcopy /Y /E WebContent tomcatApp\AjaxWebGen