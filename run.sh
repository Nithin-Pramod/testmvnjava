sudo apt-get -y update

sudo apt-get install -y default-jdk

sudo apt install -y maven

sudo apt-get install unzip


wget https://chromedriver.storage.googleapis.com/113.0.5672.63/chromedriver_linux64.zip

unzip chromedriver_linux64.zip

sudo mv chromedriver /usr/local/bin/

sudo apt-get install -y libappindicator1 fonts-liberation

sudo apt-get install -f

wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb


sudo dpkg -i google-chrome*.deb

sudo apt-get install -y libgbm-dev

sudo apt --fix-broken -y install

google-chrome-stable -version

cd testmvnjava

mvn clean install

mvn exec:java -Dexec.mainClass="org.example.App"

 



