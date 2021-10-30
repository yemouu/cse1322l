#!/bin/sh

rm -f output.txt
javac ./*.java || exit 1

{
	date +%F
	java -version
	printf '%s\n\n' "--- Output ---"
	printf '%s\n' "This assignment contains randomly generated parts, no output is available"
} > output.txt 2>&1
