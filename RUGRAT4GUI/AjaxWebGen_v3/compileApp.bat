rmdir /S /Q "WebContent\WEB-INF\classes"
mkdir "WebContent\WEB-INF\classes"
"%JAVA_HOME%\bin\javac" -classpath "WebContent\WEB-INF\lib\javax.servlet.jar" -d ".\WebContent\WEB-INF\classes" src\ObjectType.java src\DynamicallyFittedPage.java src\Generator.java src\AjaxJspServlet.java
rmdir /S /Q tomcatApp
mkdir tomcatApp
mkdir tomcatApp\AjaxWebGen
xcopy /Y /E WebContent tomcatApp\AjaxWebGen