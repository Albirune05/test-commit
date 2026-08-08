FROM ubuntu:latest
LABEL authors="albirune"

ENTRYPOINT ["top", "-b"]