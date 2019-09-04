FROM tomcat:8.0-jre8 AS server
ADD target/*.war /opt/helloworld-jsp/

RUN chmod 755 /opt/helloworld-jsp/helloworld-jsp-1.0-SNAPSHOT.war
RUN chmod 755 /opt/helloworld-jsp/tomcat-users.xml

#CMD exec /opt/helloworld-jsp/start.sh

ADD target/helloworld-jsp-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
ADD start/tomcat-users.xml /usr/local/tomcat/conf

WORKDIR /usr/local/tomcat/bin
CMD ["catalina.sh", "run"]
EXPOSE 8080