#!/bin/sh

kafka-topics --bootstrap-server=broker:9092 --create --topic $1 --partitions 6