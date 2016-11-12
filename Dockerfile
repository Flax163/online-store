FROM jboss/wildfly

ADD /online-store-web/build/libs/online-store-web-next-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/