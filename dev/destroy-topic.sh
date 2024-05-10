#!/bin/sh

kafka-topics --bootstrap-server=broker:9092 --delete --topic $1