#!/usr/bin/env groovy

def call(Map config = [:]) {
   echo "Hello, ${config.name}. Today is ${config.dayOfWeek}"
}
