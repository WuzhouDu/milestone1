#!/bin/bash

java_files="$(find src -name "*.java")"
javac -sourcepath src -d classes $java_files

input_file="data/j_caesar.xml"

# debug
# for i in {3..3}
# do
#     query_file="test/m3/query/debug$i.txt"
#     output_file="test/m3/result/debug$i.xml"

#     java -cp "classes:$ANTLR_JAR" main.Main $input_file $query_file $output_file
# done

# test
for i in {1..1}
do
    query_file="test/m3/query/q$i.txt"
    output_file="test/m3/result/q$i.xml"

    java -cp "classes:$ANTLR_JAR" main.Main $input_file $query_file $output_file
done