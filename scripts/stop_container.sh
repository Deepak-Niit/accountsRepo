#!/bin/bash
set -e

# Stop the running container (if any)
echo 'hi'
#it will stop the container if any is running 
docker ps -q | xargs -r docker stop
