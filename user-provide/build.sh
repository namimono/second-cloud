#!/usr/bin bash

gradle -v
sudo gradle bootjar

sudo docker build -t namimono/second-cloud-user-provider:latest .