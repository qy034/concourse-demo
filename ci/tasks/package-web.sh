#!/bin/bash

cd source-code/concourse-demo-web/
./mvnw package

cp target/concourse-demo-web*.jar ../../target-web/concourse-demo-web.jar
