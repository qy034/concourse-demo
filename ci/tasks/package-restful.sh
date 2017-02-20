#!/bin/bash

cd source-code/concourse-demo-restful/
./mvnw package

cp target/concourse-demo-restful*.jar target-restful/concourse-demo-restful.jar