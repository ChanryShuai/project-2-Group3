FROM tomcat:8-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
COPY project2.war /usr/local/tomcat/webapps/project2.war
CMD ["catalina.sh", "run"]