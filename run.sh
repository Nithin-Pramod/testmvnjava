cd testmvnjava

echo "------------------performing maven operations----------------------"

mvn clean install

mvn exec:java -Dexec.mainClass="org.example.App"

echo "------------------Done excecution----------------------"


sudo apt install -y nodejs

sudo DEBIAN_FRONTEND=noninteractive apt-get dist-upgrade -y

sudo apt-get remove needrestart

DEBIAN_FRONTEND=noninteractive sudo apt install npm -y

 



