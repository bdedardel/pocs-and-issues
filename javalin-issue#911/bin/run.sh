#!/bin/bash
export JAVA_HOME=/opt/jdk-13
export PATH=$JAVA_HOME/bin:$PATH
java -jar target/javalin-issue911-0.1.0-SNAPSHOT-jar-with-dependencies.jar