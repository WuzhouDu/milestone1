#!/bin/bash

input_file="j_caesar.xml"

for i in {1..2}
do
    query_dir="test/m$i/query"
    output_dir="test/m$i/output"

    for j in {1..10}
    do
        query_file="$query_dir/q$j.txt"
        output_file="$output_dir/q$j.xml"
        
        java Main $input_file $query_file $output_file
    done
done