#!/usr/bin bash

gradle -v
gradle bootjar

sudo docker build -t namimono/second-cloud-consumer:0.0.2 .