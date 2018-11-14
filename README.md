# Lihtne Java Servlet rakendus

Antud rakendus loob maven-i abil war faili, mida saab Tomcat-i üles laadida.

## Mida on vaja

* Installitud Tomcat
* Installitud Maven

## Maven-i installimine ja üles seadmine

* Tõmba `Binary zip archive` järgnevalt lehelt: https://maven.apache.org/download.cgi
* Paki see lahti C:\ kettale
* Nimeta apache-maven-3.6.0 kaust lihtsalt "maven"-ks
* Nii et nüüd on sul olemas fail `C:\maven\bin\mvn.cmd`
* Nüüd pead lisama Maven-i asukoha Windows-i PATH-i, et käsurealt saaks maven-t kasutada
* Järgi pilte, aga C:\opt... koha asemel pane `C:\maven`

![](http://www.mkyong.com/wp-content/uploads/2009/11/install-maven-windows-1.png)
![](http://www.mkyong.com/wp-content/uploads/2009/11/install-maven-windows-2-1.png)
![](http://www.mkyong.com/wp-content/uploads/2009/11/install-maven-windows-2-2.png)
![](http://www.mkyong.com/wp-content/uploads/2009/11/install-maven-windows-3.png)

* Nüüd käivita käsurida ja vaata kas `mvn -version` jooksutamisel tuleb kiri `Apache Maven 3.6.0`

## Nüüd tõmba antud projekt alla

* Kuskil lehel üleval paremal nurgas on nupp "Clone or download" -> "Download ZIP"
* Paki zip fail kuhugi kausta lahti

## Ehita projekt maven-ga war failiks

* Ava käsurida lahti kaustas kuhu pakkisid selle projekti lahti
* Jooksuta käsku `mvn clean package`
  * clean ütleb, et kustuta varasemalt ehitatud pakid
  * package ütleb, et ehita uus pakk
* Kontrolli kas tekkis kaust `target`, mille sees fail `servlet-sample-1.0.war`
* Võid huvi pärast antud faili avada WinRAR-ga.
* Seal sees on 2 kausta: META-INF ja WEB-INF
* META-INF-i sees on maveni enda info, et vajadusel teada kes ja kuidas antud paki ehitas ja mis seal sees on
* WEB-INF kausta pannakse minu kirjutatud web.xml ja HelloServlet klass.

## Lae war fail Tomcati üles (Deploy war to Tomcat)

* Leia üles oma tomcat-i kataloog
* Seal on kaust `webapps`, kui pole, siis loo selline kaust
* Copy-paste oma war fail sinna kausta
* Mine tomcati kausta, mine kausta bin ja jooksuta fail `startup`
* Mine lehele [http://localhost:8080/servlet-sample-1.0/hello](http://localhost:8080/servlet-sample-1.0/hello)
* Välja lülitamiseks jooksuta käsku `shutdown`