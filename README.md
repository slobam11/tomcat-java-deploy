# Java Web App Deployment on Apache Tomcat (Manual)

## ✅ Overview

Simple deployment of a Java `.war` application to Apache Tomcat 9 on Ubuntu.

## 📦 Used Technologies

- Ubuntu 22.04
- Apache Tomcat 9.0.88
- Java JDK
- sample.war (Tomcat Hello World app)

Apache Tomcat is important for production environments because it's a robust, reliable, and efficient Java web server and servlet container. Here are some key reasons why Tomcat is essential for production:

🔧 1. Hosts Java Web Applications
Tomcat enables running Java applications that use:
Servlets
JavaServer Pages (JSP)
Spring (Spring Boot, Spring MVC, etc.)

Without Tomcat (or another compatible server like Jetty or WildFly), a Java web application cannot be executed.
⚙️ 2. Stability and Performance
Tomcat is well-optimized for production use:
Stable and scalable
Can handle a large number of concurrent requests
Efficiently uses system resources

Sturcture repo : 
tomcat-flink-setup/
├── README.md
├── LICENSE
├── .gitignore
├── setup/
│   ├── tomcat/
│   │   ├── install_tomcat.sh
│   │   ├── tomcat.service
│   │   └── README.md
│   ├── flink/
│   │   ├── install_flink.sh
│   │   ├── flink-conf-example.yaml
│   │   └── README.md
├── docs/
│   ├── tomcat-setup.md
│   ├── flink-setup.md
│   └── architecture-diagram.png
├── scripts/
│   ├── start_all.sh
│   ├── stop_all.sh
│   └── check_status.sh
└── assets/
    └── screenshots/
        ├── tomcat-ui.png
        └── flink-ui.png

# Author # 
Slobodan Milojevic 








