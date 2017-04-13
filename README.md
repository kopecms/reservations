Wymagania:
	maven
	npm
	java 8


Oracle JDBC Driver shenanigans

    Download the JDBC driver: http://www.oracle.com/technetwork/database/features/jdbc/index-091264.html
    Here's where things get interesting. Apparently gradle can't load this jar from a flatFile repository. So the workaround is to create a local maven repository and load this 1 jar into it.
    cd to the directory where the ojdbc jar is located
    mvn install:install-file -Dfile=ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.4 -Dpackaging=jar
    In the above command make sure to adjust the file, artifactId, and version to match the driver you downloaded.
	
Angular2
	npm install -g @angular/cli
	ng new projectFolder creates a new application
	ng init from projectFolder if it is an existing application
	npm start 
	localhost:4200
	
	deployment :ng b -prod 
	http://tattoocoder.com/angular-cli-using-the-environment-option/
moze byc koniecznosc wylaczenia firewalla 
