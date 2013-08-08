#!/bin/bash
java -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=4096M -jar `dirname $0`/sbt-launch.jar "$@"
