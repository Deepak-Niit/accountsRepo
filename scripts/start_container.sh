#!/bin/bash
set -e

# Pull the Docker image from Docker Hub
docker pull deepakmaurya301/accountrepo:latest

# Run the Docker image as a container
echo
docker run -d -p 5000:5000 deepakmaurya301/accountrepo:latest