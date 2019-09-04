#!/bin/sh
#
#cd /opt/hellowolrd-jsp/

#case ${PROFILE} in
#"lardi")
#JAVA_OPTS="-Dspring.profiles.active=lardi"
#echo "Running in dev mode. JAVA_OPTS: $JAVA_OPTS"
#;;
#"home")
#JAVA_OPTS="-Dspring.profiles.active=home"
#echo "Running in local mode. JAVA_OPTS: $JAVA_OPTS"
#;;
#"prod")
#JAVA_OPTS="-Dspring.profiles.active=prod"
#echo "Running in prod mode. JAVA_OPTS: $JAVA_OPTS"
#;;
#esac
#
#exec java -jar ${JAVA_OPTS} hellowolrd-jsp-1.0.jar

CAT /usr/local/tomcat/conf/tomcat-users.xml
