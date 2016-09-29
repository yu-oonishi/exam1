# Dropwizard exam1-application
[![Build Status](https://travis-ci.org/edge-learning/exam1.svg?branch=master)](https://travis-ci.org/edge-learning/exam1)
[![Coverage Status](https://coveralls.io/repos/github/edge-learning/exam1/badge.svg?branch=master)](https://coveralls.io/github/edge-learning/exam1?branch=master)
[![Code Climate](https://codeclimate.com/github/edge-learning/exam1/badges/gpa.svg)](https://codeclimate.com/github/edge-learning/exam1)

## Running The Application

How to start the application.

1. Run `mvn package` to build your application
1. Start application with `java -jar target/exam1-application.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

## Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`
