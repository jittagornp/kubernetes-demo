#!/bin/bash
rm -rf target

#build source code (.jar file)
docker run --rm -v $(pwd):/app -v /root/.m2:/root/.m2 maven:3.6.2-jdk-11 mvn install -f /app/pom.xml

# remove container and images
docker rmi registry.whereis.store/whereis-store-video || true

# build docker image
docker build -t registry.whereis.store/whereis-store-video .
