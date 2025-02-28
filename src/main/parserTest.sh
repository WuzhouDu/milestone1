#!/bin/bash

query_dir="test/m2/query"

for j in {1..10}
do
    query_file="$query_dir/q$j.txt"
    
    java antlr.XPathParserTest $query_file
done