cd testmvnjava

echo "------------------performing maven operations----------------------"

mvn clean install

mvn exec:java -Dexec.mainClass="org.example.App"

echo "------------------Done excecution----------------------"

 



