#!/bin/sh

kafka-topics --bootstrap-server=broker:9092 --create --topic $1 --partitions 6
cat dev/seed/$1.txt | kafka-console-producer --bootstrap-server broker:9092 --topic $1 --property parse.key=true --property key.separator=: