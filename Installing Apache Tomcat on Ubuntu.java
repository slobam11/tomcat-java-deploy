Installing Apache Tomcat on Ubuntu

Tomcat is an open-source Java application server.

Steps:

Update system packages

sudo apt update && sudo apt upgrade -y


Install OpenJDK (if not already installed)

Tomcat requires a Java runtime. You can install OpenJDK 11:

sudo apt install openjdk-11-jdk -y


Check the version:

java -version


Download Apache Tomcat

cd /opt
sudo wget https://downloads.apache.org/tomcat/tomcat-10/v10.1.18/bin/apache-tomcat-10.1.18.tar.gz


Extract the archive and rename the folder

sudo tar -xvzf apache-tomcat-10.1.18.tar.gz
sudo mv apache-tomcat-10.1.18 tomcat


Give execute permissions to scripts

sudo chmod +x /opt/tomcat/bin/*.sh


Create a Tomcat service

sudo nano /etc/systemd/system/tomcat.service


Insert the following content:
[Unit]
Description=Apache Tomcat Web Application Server
After=network.target

[Service]
Type=forking

User=root
Group=root

Environment="JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64"
Environment="CATALINA_PID=/opt/tomcat/temp/tomcat.pid"
Environment="CATALINA_HOME=/opt/tomcat"
Environment="CATALINA_BASE=/opt/tomcat"
ExecStart=/opt/tomcat/bin/startup.sh
ExecStop=/opt/tomcat/bin/shutdown.sh

[Install]
WantedBy=multi-user.target

Save the file (CTRL+X, then Y, then ENTER).

Start the Tomcat service and enable it on boot
sudo systemctl daemon-reload
sudo systemctl start tomcat
sudo systemctl enable tomcat


Check Tomcat server status
sudo systemctl status tomcat


Access the Tomcat web interface
Open your browser and navigate to:
http://<server-ip>:8080

2. Installing Apache Flink on Ubuntu
Flink is a framework for real-time data processing.

Steps:

Download Apache Flink
cd /opt
sudo wget https://dlcdn.apache.org/flink/flink-1.17.1/flink-1.17.1-bin-scala_2.12.tgz


Extract the archive and rename the folder
sudo tar -xvzf flink-1.17.1-bin-scala_2.12.tgz
sudo mv flink-1.17.1 flink


Configure Flink
Navigate to the Flink directory:

cd /opt/flink
Open conf/flink-conf.yaml:
sudo nano conf/flink-conf.yaml


Find and update these lines:
jobmanager.rpc.address: localhost
taskmanager.memory.process.size: 1024m


Start Flink JobManager and TaskManager
./bin/start-cluster.sh


Check Flink status
./bin/flink info

Access the Flink web interface
Open your browser and go to:
http://<server-ip>:8081


Stop Flink when you're done

./bin/stop-cluster.sh

That is it ....