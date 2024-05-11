#!/bin/sh

for n in $( ls ./dev/seed ); do
    basename $n .txt
done