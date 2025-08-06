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

Basic part <img width="1304" height="958" alt="image" src="https://github.com/user-attachments/assets/ce09cd53-6852-4c42-bef7-c0be0624f6e9" /> I am not doing port forwarding so you cannot see from outside mu ip :D 

With command systemctl status tomcat.service we are seeing if the app is running or not , i mean basic things <img width="1265" height="288" alt="image" src="https://github.com/user-attachments/assets/86b8e1ae-7d4e-4a06-9bec-0e0dc6ea4297" />


#Author# 
#!/bin/bash
Slobodan Milojevic :) 




