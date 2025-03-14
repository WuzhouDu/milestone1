#!/bin/bash

java_files="$(find src -name "*.java")"
javac -sourcepath src -d classes $java_files

input_file="data/j_caesar.xml"

for i in {1..2}
do
    query_dir="test/m$i/query"
    output_dir="test/m$i/result"

    for j in {1..10}
    do
        query_file="$query_dir/q$j.txt"
        output_file="$output_dir/q$j.xml"
        
        java -cp "classes:$ANTLR_JAR" main.Main $input_file $query_file $output_file
    done
done

