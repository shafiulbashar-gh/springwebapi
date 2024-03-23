FROM ubuntu:latest
LABEL authors="shafi"

ENTRYPOINT ["top", "-b"]