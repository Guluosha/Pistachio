#!/bin/bash
file="images.properties"
if [ -f "$file" ]; then
  echo "$file 存在."
  while IFS='=' read -r key value; do
    echo "${key}=${value}"
    docker pull "${value}"
    docker tag "${value}" "${key}"
    docker rmi "${value}"
  done <"$file"
else
  echo "$file not found."
  exit 0
fi