#!/usr/bin bash

gradle -v
gradle bootjar

sudo docker build -t namimono/second-cloud-user-provider:0.0.2 .