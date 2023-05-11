cd testmvnjava

echo "------------------performing maven operations----------------------"

mvn clean install

mvn exec:java -Dexec.mainClass="org.example.App"

echo "------------------Done excecution----------------------"


sudo apt install -y nodejs

echo -e '\n' | sudo apt install -y npm

 



