#!/bin/bash

java_files="$(find src -name "*.java")"
javac -sourcepath src -d classes $java_files



for i in {3..3}
do
    input_file="test/m3/query/debug$i.txt"
    java -cp "classes:$ANTLR_JAR" main.antlr.XPathParserTest $input_file
done