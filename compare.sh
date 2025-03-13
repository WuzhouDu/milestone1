#!/bin/bash

for i in {1..2}
do
    output_dir="test/m$i/result"
    sample_dir="test/m$i/sample"

    for j in {1..10}
    do
        output_file="$output_dir/q$j.xml"
        expected_file="$sample_dir/q$j.xml"
        
        # omit the whitespace; stop the comparison if the files are different
        if ! diff -w $output_file $expected_file; then
            echo "mismatch found: $output_file $expected_file"
            exit 1
        fi
    done
done