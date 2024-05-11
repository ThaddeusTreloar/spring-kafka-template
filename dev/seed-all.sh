#!/bin/sh

for n in $( ls ./dev/seed ); do
    kafka-topics --bootstrap-server=broker:9092 --create --topic $( basename $n .txt ) --partitions 6
    cat dev/seed/$n | kafka-console-producer --bootstrap-server broker:9092 --topic $( basename $n .txt ) --property parse.key=true --property key.separator=:
done
