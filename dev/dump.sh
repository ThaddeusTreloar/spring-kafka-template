#!/bin/sh

kafka-console-consumer --bootstrap-server broker:9092 --topic $1 --from-beginning --property print.key=true --property print.offset=true --property print.timestamp=true