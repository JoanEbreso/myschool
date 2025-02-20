#!/bin/bash

# Check if the .env file exists
if [ -f .env ]; then
  echo "Loading environment variables from .env file..."
  export $(cat .env | grep -v '#')

  # Check if the PROFILE environment variable is set in .env
  if [ -n "$ACTIVE_PROFILE" ]; then
    echo "Using profile: $ACTIVE_PROFILE"
    mvn spring-boot:run -Dspring-boot.run.profiles="$ACTIVE_PROFILE"
  else
    echo "PROFILE not found in .env. Using default profile."
    mvn spring-boot:run
  fi
else
  echo "No .env file found. Using existing environment variables."
  mvn spring-boot:run
fi