sudo apt-get -y update

sudo apt-get install -y default-jdk

sudo apt install -y maven

sudo apt-get install -y xvfb

sudo apt-get install -y firefox

Xvfb :99 -ac &

export DISPLAY=:99

firefox --version


wget https://github.com/mozilla/geckodriver/releases/download/v0.33.0/geckodriver-v0.33.0-linux64.tar.gz

tar -xvf geckodriver-v0.33.0-linux-aarch64.tar.gz

sudo mv geckodriver /usr/local/bin/

sudo apt-get install -y xdg-utils

sudo mvn exec:java -Dexec.mainClass="org.example.App"

 



