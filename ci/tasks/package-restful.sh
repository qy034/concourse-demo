#!/bin/bash

cd source-code/concourse-demo-restful/
./mvnw package

cp target/concourse-demo-restful*.jar target-web/concourse-demo-restful.jar