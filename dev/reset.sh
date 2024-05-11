#!/bin/sh

docker-compose -f dev/compose/docker-compose.yml down
docker-compose -f dev/compose/docker-compose.yml up -d
