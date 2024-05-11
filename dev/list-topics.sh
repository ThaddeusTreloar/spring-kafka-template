#!/bin/sh

kafka-topics --bootstrap-server=broker:9092 --list | grep --color=never "^[^_]"