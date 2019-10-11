# [install 3rd party JARs into local repository](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html)  
```
$ rm -rf /home/ubuntu/.m2/repository/org/apache/spark/spark-core_2.11/2.4.3/*
$ ls -als /home/ubuntu/.m2/repository/org/apache/spark/spark-core_2.11/2.4.3/
total 8
4 drwxrwxr-x 2 ubuntu ubuntu 4096 10월 11 15:33 .
4 drwxrwxr-x 5 ubuntu ubuntu 4096 10월  9 02:20 ..

$ mvn install:install-file \
-Dfile=spark-core_2.11-2.4.3.jar \
-DgroupId=org.apache.spark \
-DartifactId=spark-core_2.11 \
-Dversion=2.4.3 \
-Dpackaging=jar \
-DgeneratePom=true

[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.4:install-file (default-cli) @ standalone-pom ---
[INFO] Installing /home/ubuntu/Documents/tmp/01_spark_on_docker/spark-core_2.11-2.4.3.jar to /home/ubuntu/.m2/repository/org/apache/spark/spark-core_2.11/2.4.3/spark-core_2.11-2.4.3.jar
[INFO] Installing /tmp/mvninstall8658478254143088384.pom to /home/ubuntu/.m2/repository/org/apache/spark/spark-core_2.11/2.4.3/spark-core_2.11-2.4.3.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.270 s
[INFO] Finished at: 2019-10-11T15:33:59+09:00
[INFO] ------------------------------------------------------------------------

$ ls -als /home/ubuntu/.m2/repository/org/apache/spark/spark-core_2.11/2.4.3/
total 13216
    4 drwxrwxr-x 2 ubuntu ubuntu     4096 10월 11 15:33 .
    4 drwxrwxr-x 5 ubuntu ubuntu     4096 10월  9 02:20 ..
    4 -rw-rw-r-- 1 ubuntu ubuntu      196 10월 11 15:33 _remote.repositories
13200 -rw-rw-r-- 1 ubuntu ubuntu 13513957 10월  8 23:19 spark-core_2.11-2.4.3.jar
    4 -rw-rw-r-- 1 ubuntu ubuntu      475 10월 11 15:33 spark-core_2.11-2.4.3.pom
```

[Scala Library 2.11.12 on MVN Repository](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.11.12)  
