# Java Web App Deployment on Apache Tomcat (Manual)

## ✅ Overview

Simple deployment of a Java `.war` application to Apache Tomcat 9 on Ubuntu.

## 📦 Used Technologies

- Ubuntu 22.04
- Apache Tomcat 9.0.88
- Java JDK
- sample.war (Tomcat Hello World app)

## 🔧 Steps

1. Installed Java:
   ```bash
   sudo apt install default-jdk -y


wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.88/bin/apache-tomcat-9.0.88.tar.gz
tar -xvzf apache-tomcat-9.0.88.tar.gz

Then we started the tomcat servise with 
cd /opt/tomcat9/bin
./startup.sh


..and we did a simple deployed sample.war

wget https://tomcat.apache.org/tomcat-7.0-doc/appdev/sample/sample.war
sudo cp sample.war /opt/tomcat9/webapps/

